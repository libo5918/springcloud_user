package com.yidiankt.bean.enodeb;

/*VoLTE注销servicems参数*/
public class EnodebImsDeregisterReq extends EnodebCommonReq {
    private String      imsi;                              //国际移动用户识别码

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }
}
