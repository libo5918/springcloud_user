package com.yidiankt.bean.enodeb;

/*接收 VoLTE 短信参数*/
public class EnodebImsReceiveSmsReq extends EnodebCommonReq {
    private Long                timeout;                           //等待短信的超时时间
    private String              imsi;                              //国际移动用户识别码
    private String              caller;                            //短信主叫号码
    private String              callerCheckFlag;                   //主叫来显检查标志（默认全匹配）
    private String              contentCheckFlag="No";             //短信内容检查标志（默认不检查）
    private String              contentKey;                        //短信内容关键字

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCallerCheckFlag() {
        return callerCheckFlag;
    }

    public void setCallerCheckFlag(String callerCheckFlag) {
        this.callerCheckFlag = callerCheckFlag;
    }

    public String getContentCheckFlag() {
        return contentCheckFlag;
    }

    public void setContentCheckFlag(String contentCheckFlag) {
        this.contentCheckFlag = contentCheckFlag;
    }

    public String getContentKey() {
        return contentKey;
    }

    public void setContentKey(String contentKey) {
        this.contentKey = contentKey;
    }
}
