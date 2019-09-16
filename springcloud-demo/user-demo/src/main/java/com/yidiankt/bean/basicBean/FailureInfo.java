package com.yidiankt.bean.basicBean;

/*失败详细信息*/
public class FailureInfo {
    private Long            code;                              //失败节点
    private String          desc;                              //失败描述
    private String          signal;                            //失败信令消息的名称
    private String          signalReason;                      //失败信令消息中的原因值或原因描述

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSignal() {
        return signal;
    }

    public void setSignal(String signal) {
        this.signal = signal;
    }

    public String getSignalReason() {
        return signalReason;
    }

    public void setSignalReason(String signalReason) {
        this.signalReason = signalReason;
    }
}
