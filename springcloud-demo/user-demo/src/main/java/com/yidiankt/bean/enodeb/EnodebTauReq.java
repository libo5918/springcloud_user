package com.yidiankt.bean.enodeb;

import com.yidiankt.bean.basicBean.Position;
import com.yidiankt.bean.basicBean.UeInfo;

/*跟踪区更新servicems参数*/
public class EnodebTauReq extends EnodebCommonReq {
    private UeInfo          ueInfo;                            //手机用户信息(Object对象ueInfo)
    private String      apn="cmnet";                       //接入点名称
    private Position     position;                          //手机所在位置信息(Object对象uePosition)

    public UeInfo getUeInfo() {
        return ueInfo;
    }

    public void setUeInfo(UeInfo ueInfo) {
        this.ueInfo = ueInfo;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
