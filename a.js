var uploadedDataURL = "/asset/get/s/data-1517645039291-B1vgpymUz.json";

$.getJSON(uploadedDataURL, function(geoJson) {
    echarts.registerMap('zhongguo', geoJson);
    myChart.hideLoading();
    var geoCoordMap = {
        "青海湖":[100.43369,36.748446],
        "泸沽湖":[100.782285,27.699263],
        "太湖":[120.175419,31.223322],
        "海南":[110.207668,20.05709],
        "赛里木湖":[81.192908,44.607924],
        "洱海":[100.220871,25.743468],
        "千岛湖":[119.02744,29.565164],
        "邛海":[102.319623,27.826446]
    }
    var data = [
        {
            name: '青海湖',
            value: 1
        },
        {
            name:"泸沽湖",
            value:1
        },
        {
            name:"太湖",
            value:1
        },
        {
            name:"海南",
            value:1
        },
        {
            name:"赛里木湖",
            value:1
        },
        {
            name:"洱海",
            value:1
        },
        {
            name:"千岛湖",
            value:1
        },
        {
            name:"邛海",
            value:1
        }
    ];
    var max = 100000,
        min = 900; // todo
    var maxSize4Pin = 100,
        minSize4Pin = 20;

    var convertData = function(data) {
        var res = [];
        for (var i = 0; i < data.length; i++) {
            var geoCoord = geoCoordMap[data[i].name];
            if (geoCoord) {
                res.push({
                    name: data[i].name,
                    value: geoCoord.concat(data[i].value)
                });
            }
        }
        return res;
    };

    console.log(convertData(data));

    option = {
        title: {
            text: '五湖四海',
            x: 'center',
            textStyle: {
                color: '#444'
            }
        },
        legend: {
            orient: 'vertical',
            y: 'bottom',
            x: 'right',
            data: ['sell_area'],
            textStyle: {
                color: '#fff'
            }
        },
        visualMap: {
            show: false,
            min: 0,
            max: 500,
            left: 'left',
            top: 'bottom',
            text: ['高', '低'], // 文本，默认为数值文本
            calculable: true,
            seriesIndex: [1],
            inRange: {
                color: ['#0f0c29', '#302b63', '#24243e'] // 黑紫黑

            }
        },
        geo: {
            show: true,
            map: 'zhongguo',
            label: {
                normal: {
                    show: false
                },
                emphasis: {
                    show: false,
                }
            },
            roam: true,
            zoom:1.5,
            itemStyle: {
                normal: {
                    areaColor: '#031525',
                    borderColor: '#3B5077',
                },
                emphasis: {
                    areaColor: '#2B91B7',
                }
            }
        },
        series: [{
            name: 'credit_pm2.5',
            type: 'scatter',
            coordinateSystem: 'geo',
            data: convertData(data),
            symbolSize: function(val) {
                return val[2] / 10000;
            },
            label: {
                normal: {
                    formatter: '{b}',
                    position: false ? 'inside' : 'right',
                    show: true
                },
                emphasis: {
                    show: true
                }
            },
            itemStyle: {
                normal: {
                    color: '#05C3F9'
                }
            }
        },
            {
                type: 'map',
                map: 'zhongguo',
                geoIndex: 0,
                aspectScale: 0.75, //长宽比
                showLegendSymbol: false, // 存在legend时显示
                label: {
                    normal: {
                        show: false
                    },
                    emphasis: {
                        show: false,
                        textStyle: {
                            color: '#fff'
                        }
                    }
                },
                roam: true,
                itemStyle: {
                    normal: {
                        areaColor: '#031525',
                        borderColor: '#3B5077',
                    },
                    emphasis: {
                        areaColor: '#2B91B7'
                    }
                },
                animation: false,
                data: data
            },
            {
                name: '点',
                type: 'scatter',
                coordinateSystem: 'geo',
                symbol: 'pin',
                symbolSize: function(val) {
                    var a = (maxSize4Pin - minSize4Pin) / (max - min);
                    var b = minSize4Pin - a * min;
                    b = maxSize4Pin - a * max;
                    return a * val[2] + b;
                },
                label: {
                    normal: {
                        show: true,
                        textStyle: {
                            color: '#fff',
                            fontSize: 9,
                        }
                    }
                },
                itemStyle: {
                    normal: {
                        color: '#F62157', //标志颜色
                    }
                },
                zlevel: 6,
                data: convertData(data),
            },
            {
                name: 'Top 5',
                type: 'effectScatter',
                coordinateSystem: 'geo',
                data: convertData(data.sort(function(a, b) {
                    return b.value - a.value;
                }).slice(0, 5)),
                symbolSize: function(val) {
                    return val[2] / 5000;
                },
                showEffectOn: 'render',
                rippleEffect: {
                    brushType: 'stroke'
                },
                hoverAnimation: true,
                label: {
                    normal: {
                        formatter: '{b}',
                        position: 'right',
                        show: false
                    }
                },
                itemStyle: {
                    normal: {
                        color: '#05C3F9',
                        shadowBlur: 10,
                        shadowColor: '#05C3F9'
                    }
                },
                zlevel: 1
            },

        ]
    };
    myChart.setOption(option);
});