package com.yidiankt.bean.enodeb;

/*事件订阅接口参数*/
public class EnodebSubscribeEventReq {
    private String      invokerId;                         //调用者识别符
    private Long        route;                             //路由编码
    private Long        timeout;                           //等待订阅事件的超时时间
    private String      msisdn;                            //手机号码
    private String      imsi;                              //国际移动用户识别码
    private String      event;                             //订阅的事件名称

    public String getInvokerId() {
        return invokerId;
    }

    public void setInvokerId(String invokerId) {
        this.invokerId = invokerId;
    }

    public Long getRoute() {
        return route;
    }

    public void setRoute(Long route) {
        this.route = route;
    }

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
