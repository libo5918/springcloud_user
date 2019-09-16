package com.yidiankt.bean.enodeb;

/*PING参数*/
public class EnodebDataPingReq extends EnodebCommonReq {
    private String              imsi;                              //国际移动用户识别码
    private String              ipType;                            //采用激活地址的 IP 类型
    private String              hostname;                          //目标主机名称
    private Long                packetSize;                        //PING 包大小，单位：字节数
    private Long                testCount;                         //PING 次数

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

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Long getPacketSize() {
        return packetSize;
    }

    public void setPacketSize(Long packetSize) {
        this.packetSize = packetSize;
    }

    public Long getTestCount() {
        return testCount;
    }

    public void setTestCount(Long testCount) {
        this.testCount = testCount;
    }
}
