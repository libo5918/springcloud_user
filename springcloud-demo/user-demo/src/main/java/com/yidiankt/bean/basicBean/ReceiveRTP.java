package com.yidiankt.bean.basicBean;

/*接收IP承载网检测RTP数据包*/
public class ReceiveRTP {
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
