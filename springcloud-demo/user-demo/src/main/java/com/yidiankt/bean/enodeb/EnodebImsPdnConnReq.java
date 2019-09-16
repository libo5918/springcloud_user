package com.yidiankt.bean.enodeb;

/*VoLTE或VoNR默认承载参数servicems*/
public class EnodebImsPdnConnReq extends EnodebCommonReq {
    private String      imsi;                              //国际移动用户识别码
    private String      apn="ims";                         //接入点名称
    private String      pdnType="IPv6";                    //激活地址IP类型

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String getPdnType() {
        return pdnType;
    }

    public void setPdnType(String pdnType) {
        this.pdnType = pdnType;
    }
}
