package com.yidiankt.bean.basicBean;

/*发送IP承载网检测RTP数据包*/
public class SendRTP {
    private String          enabledFlag;                      //功能启用标志
    private String          callStatus;                       //呼叫状态
    private String          rtpParityFlag;                    //RTP包奇偶长度标志
    private Long            playInterval;                     //发送间隔，单位：毫秒

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

    public String getRtpParityFlag() {
        return rtpParityFlag;
    }

    public void setRtpParityFlag(String rtpParityFlag) {
        this.rtpParityFlag = rtpParityFlag;
    }

    public Long getPlayInterval() {
        return playInterval;
    }

    public void setPlayInterval(Long playInterval) {
        this.playInterval = playInterval;
    }
}
