package com.yidiankt.bean.basicBean;

/*语音或视频媒体数据检测*/
public class MediaDetect {
    private String          enabledFlag="No";                      //功能启用标志
    private String          callStatus="CallConnected";            //呼叫状态

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
