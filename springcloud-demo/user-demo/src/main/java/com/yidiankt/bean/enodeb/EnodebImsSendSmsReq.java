package com.yidiankt.bean.enodeb;

/*发送 VoLTE 短信参数*/
public class EnodebImsSendSmsReq extends EnodebCommonReq{
    private String              imsi;                              //国际移动用户识别码
    private String              smsc;                              //短信中心号码
    private String              callee;                            //被叫号码
    private String              sms;                               //短信内容
    private String              smsDcs="auto";                      //短信信息编码方式
    private String              smsReportFlag="No";                 //是否需要状态报告（默认为不需要）
    private Long                smsReportTimeout=60L;               //状态报告等待超时时间

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getSmsc() {
        return smsc;
    }

    public void setSmsc(String smsc) {
        this.smsc = smsc;
    }

    public String getCallee() {
        return callee;
    }

    public void setCallee(String callee) {
        this.callee = callee;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getSmsDcs() {
        return smsDcs;
    }

    public void setSmsDcs(String smsDcs) {
        this.smsDcs = smsDcs;
    }

    public String getSmsReportFlag() {
        return smsReportFlag;
    }

    public void setSmsReportFlag(String smsReportFlag) {
        this.smsReportFlag = smsReportFlag;
    }

    public Long getSmsReportTimeout() {
        return smsReportTimeout;
    }

    public void setSmsReportTimeout(Long smsReportTimeout) {
        this.smsReportTimeout = smsReportTimeout;
    }
}
