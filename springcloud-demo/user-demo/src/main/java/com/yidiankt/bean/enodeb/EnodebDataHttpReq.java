package com.yidiankt.bean.enodeb;

/*HTTP 网页浏览参数*/
public class EnodebDataHttpReq extends EnodebCommonReq {
    private String              imsi;                              //国际移动用户识别码
    private String              ipType="IPv4";                     //采用激活地址的 IP 类型
    private Long                testDuration;                      //测试时长
    private String              url;                               //网站 URL
    private String              contentCheckFlag="No";             //网页内容检查标志（默认不检查）
    private String              contentKey;                        //网页内容关键字
    private String              agentEnabled="No";                 //代理启用标志

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public Long getTestDuration() {
        return testDuration;
    }

    public void setTestDuration(Long testDuration) {
        this.testDuration = testDuration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getAgentEnabled() {
        return agentEnabled;
    }

    public void setAgentEnabled(String agentEnabled) {
        this.agentEnabled = agentEnabled;
    }
}
