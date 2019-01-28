package github.clyoudu.dpinj.factory.abstractfactory.entity;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/1/28 16:17
 * @description HostConfig
 */
public class HostConfig {

    private String ip;

    private Integer port;

    private String username;

    private String password;


    private HostConfig() {
    }

    private HostConfig(HostConfig hostConfig) {
        this.ip = hostConfig.getIp();
        this.port = hostConfig.getPort();
        this.username = hostConfig.getUsername();
        this.password = hostConfig.getPassword();
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class HostConfigBuilder {
        private HostConfig hostConfig;

        public HostConfigBuilder() {
            this.hostConfig = new HostConfig();
        }

        public HostConfigBuilder ip(String ip) {
            this.hostConfig.setIp(ip);
            return this;
        }

        public HostConfigBuilder port(Integer port) {
            this.hostConfig.setPort(port);
            return this;
        }

        public HostConfigBuilder username(String username) {
            this.hostConfig.setUsername(username);
            return this;
        }

        public HostConfigBuilder password(String password) {
            this.hostConfig.setPassword(password);
            return this;
        }

        public HostConfig build() {
            return new HostConfig(this.hostConfig);
        }
    }
}
