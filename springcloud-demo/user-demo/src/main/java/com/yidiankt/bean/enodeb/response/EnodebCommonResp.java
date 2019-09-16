package com.yidiankt.bean.enodeb.response;

public class EnodebCommonResp {
    private String          invokerId;                         //调用者识别符
    private String          spanId;                            //跨度ID
    private String          msisdn;                            //手机号码
    private String          imsi;                              //国际移动用户识别码
    private String          returnResult;                      //返回结果

    public String getInvokerId() {
        return invokerId;
    }

    public void setInvokerId(String invokerId) {
        this.invokerId = invokerId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
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

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult;
    }
}
