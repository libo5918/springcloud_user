package com.yidiankt.bean.basicBean;

/*数据/语音业务建立的默认/专用承载信息。*/
public class BearerInfo {
    private Long            bearerQci;                         //承载QCI值
    private Long            qosDelayClass;                     //承载延迟等级
    private Long            qosReliabilityClass;               //承载可靠性等级
    private Long            qosPeakThroughput;                 //承载峰值吞吐量
    private Long            qosPrecedenceClass;                //承载优先等级
    private String          localIp;                           //本端IP地址，地址类型可以是IPv4或IPv6
    private Integer         localTeid;                         //本端承载GTP-TEID值
    private String          remoteIp;                          //远端IP地址，地址类型可以是IPv4或IPv6
    private Integer         remoteTeid;                        //远端承载GTP-TEID值

    public Long getBearerQci() {
        return bearerQci;
    }

    public void setBearerQci(Long bearerQci) {
        this.bearerQci = bearerQci;
    }

    public Long getQosDelayClass() {
        return qosDelayClass;
    }

    public void setQosDelayClass(Long qosDelayClass) {
        this.qosDelayClass = qosDelayClass;
    }

    public Long getQosReliabilityClass() {
        return qosReliabilityClass;
    }

    public void setQosReliabilityClass(Long qosReliabilityClass) {
        this.qosReliabilityClass = qosReliabilityClass;
    }

    public Long getQosPeakThroughput() {
        return qosPeakThroughput;
    }

    public void setQosPeakThroughput(Long qosPeakThroughput) {
        this.qosPeakThroughput = qosPeakThroughput;
    }

    public Long getQosPrecedenceClass() {
        return qosPrecedenceClass;
    }

    public void setQosPrecedenceClass(Long qosPrecedenceClass) {
        this.qosPrecedenceClass = qosPrecedenceClass;
    }

    public String getLocalIp() {
        return localIp;
    }

    public void setLocalIp(String localIp) {
        this.localIp = localIp;
    }

    public Integer getLocalTeid() {
        return localTeid;
    }

    public void setLocalTeid(Integer localTeid) {
        this.localTeid = localTeid;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public Integer getRemoteTeid() {
        return remoteTeid;
    }

    public void setRemoteTeid(Integer remoteTeid) {
        this.remoteTeid = remoteTeid;
    }
}
