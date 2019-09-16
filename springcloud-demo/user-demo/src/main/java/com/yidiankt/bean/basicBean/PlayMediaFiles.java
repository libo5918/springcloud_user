package com.yidiankt.bean.basicBean;

/*播放媒体语音文件或视频文件对象。*/
public class PlayMediaFiles {
    private String          enabledFlag;                      //功能启用标志
    private String          callStatus;                       //呼叫状态
    private String          filename;                         //语音或视频文件名
    private Long            playTimes;                        //播放次数
    private Long            playInterval;                     //播放间隔

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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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
}
