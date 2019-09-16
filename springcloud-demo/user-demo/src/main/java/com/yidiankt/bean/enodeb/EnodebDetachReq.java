package com.yidiankt.bean.enodeb;

/*去附着参数servicems*/
public class EnodebDetachReq extends EnodebCommonReq {
    private String      imsi;                              //国际移动用户识别码

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }



}
