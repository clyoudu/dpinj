package github.clyoudu.dpinj.state;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/3/15 17:44
 * @description DeployContext
 */
public class DeployContext {

    private String email = "aaa@bbb.com";

    private String eventId;

    private int retry = 0;

    private int maxRetry = 2;

    private State state;

    public DeployContext() {}

    public void setState(State state) {
        this.state = state;
        handle();
    }

    public void handle() {
        state.handle(this);
    }

    public String getEmail() {
        return email;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public int getRetry() {
        return retry;
    }

    public void setRetry(int retry) {
        this.retry = retry;
    }

    public int getMaxRetry() {
        return maxRetry;
    }
}
