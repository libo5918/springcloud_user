package com.yidiankt.bean.basicBean;

/*发DTMF参数*/
public class ReceiveDTMF {
    private String          enabledFlag;                      //功能启用标志
    private String          callStatus;                       //呼叫状态

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }
}
