package com.yidiankt.bean.enodeb;

public class EnodebCommonReq {
    private String      invokerId;                         //调用者识别符
    private String      traceId;                          //跟踪ID，全局唯一编号
    private String      fatherSpanId;                      //父跨度ID，全局唯一编号
    private Long        route;                             //路由编码
    private String      msisdn;                            //手机号码
    private String      ueRole;                            //手机用户角色类型

    public String getInvokerId() {
        return invokerId;
    }

    public void setInvokerId(String invokerId) {
        this.invokerId = invokerId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getFatherSpanId() {
        return fatherSpanId;
    }

    public void setFatherSpanId(String fatherSpanId) {
        this.fatherSpanId = fatherSpanId;
    }

    public Long getRoute() {
        return route;
    }

    public void setRoute(Long route) {
        this.route = route;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getUeRole() {
        return ueRole;
    }

    public void setUeRole(String ueRole) {
        this.ueRole = ueRole;
    }
}
