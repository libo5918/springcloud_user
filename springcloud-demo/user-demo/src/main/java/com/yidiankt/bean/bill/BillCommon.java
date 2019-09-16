package com.yidiankt.bean.bill;

public class BillCommon {
    private String          invokerId;                         //调用者识别符
    private String          traceId;                           //跟踪ID，全局唯一编号
    private String          fatherSpanId;                      //父跨度ID，全局唯一编号
    private String          spanId;                            //跨度ID，当前模块产生
    private String          billType;                          //本次话单类型
    private String          ueRole;                            //手机用户角色类型

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

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getUeRole() {
        return ueRole;
    }

    public void setUeRole(String ueRole) {
        this.ueRole = ueRole;
    }
}
