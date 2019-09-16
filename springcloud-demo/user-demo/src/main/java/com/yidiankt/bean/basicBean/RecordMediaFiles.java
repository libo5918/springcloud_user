package com.yidiankt.bean.basicBean;

/*录制媒体语音文件或视频文件对象。*/
public class RecordMediaFiles {
    private String          enabledFlag;                      //功能启用标志
    private String          callStatus;                       //呼叫状态
    private String          filename;                         //语音或视频文件名
    private String          recordFormat;                     //录制的文件格式
    private String          recordDuration;                   //录音持续时间，单位：毫秒

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

    public String getRecordFormat() {
        return recordFormat;
    }

    public void setRecordFormat(String recordFormat) {
        this.recordFormat = recordFormat;
    }

    public String getRecordDuration() {
        return recordDuration;
    }

    public void setRecordDuration(String recordDuration) {
        this.recordDuration = recordDuration;
    }
}
