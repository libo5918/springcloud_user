package com.yidiankt.bean.enodeb.response;

public class EnodebSubscribeEventResp {
    private String          invokerId;                         //调用者识别符
    private String          msisdn;                            //手机号码
    private String          imsi;                              //国际移动用户识别码
    private String          event;                             //订阅的事件名称
    private String          returnResult;                      //返回结果

    public String getInvokerId() {
        return invokerId;
    }

    public void setInvokerId(String invokerId) {
        this.invokerId = invokerId;
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

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult;
    }
}
