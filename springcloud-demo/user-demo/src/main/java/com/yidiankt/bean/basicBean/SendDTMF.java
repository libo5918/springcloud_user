package com.yidiankt.bean.basicBean;

/*发送多音双频DTMF码*/
public class SendDTMF {
    private String          enabledFlag;                      //功能启用标志
    private String          callStatus;                       //呼叫状态
    private String          dtmfType;                         //DTMF码类型
    private String          dtmfs;                            //DTMF码串
    private Long            playTimes;                        //播放次数
    private Long            playInterval;                     //播放间隔
    private Long            dtmfInterval;                     //DTMF码串相邻两个码间隔，单位：毫秒

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

    public String getDtmfType() {
        return dtmfType;
    }

    public void setDtmfType(String dtmfType) {
        this.dtmfType = dtmfType;
    }

    public String getDtmfs() {
        return dtmfs;
    }

    public void setDtmfs(String dtmfs) {
        this.dtmfs = dtmfs;
    }

    public Long getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
    }

    public Long getPlayInterval() {
        return playInterval;
    }

    public void setPlayInterval(Long playInterval) {
        this.playInterval = playInterval;
    }

    public Long getDtmfInterval() {
        return dtmfInterval;
    }

    public void setDtmfInterval(Long dtmfInterval) {
        this.dtmfInterval = dtmfInterval;
    }
}
