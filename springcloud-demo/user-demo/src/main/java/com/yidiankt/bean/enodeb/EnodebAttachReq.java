package com.yidiankt.bean.enodeb;

import com.yidiankt.bean.basicBean.Position;
import com.yidiankt.bean.basicBean.UeInfo;

/*附着参数servicems*/
public class EnodebAttachReq extends EnodebCommonReq {
    private UeInfo       ueInfo;                            //手机用户信息(Object对象ueInfo)
    private String      attachType="OnlyEPCAttach";        //附着类型
    private String      apn="cmnet";                       //接入点名称
    private String      pdnType="IPv4v6";                  //激活地址IP类型
    private Position    position;                          //手机所在位置信息(Object对象uePosition)
    private Long        targetLAC;                         //eSRVCC切换目的位置区编码

    public UeInfo getUeInfo() {
        return ueInfo;
    }

    public void setUeInfo(UeInfo ueInfo) {
        this.ueInfo = ueInfo;
    }

    public String getAttachType() {
        return attachType;
    }

    public void setAttachType(String attachType) {
        this.attachType = attachType;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getTargetLAC() {
        return targetLAC;
    }

    public void setTargetLAC(Long targetLAC) {
        this.targetLAC = targetLAC;
    }
}
