package com.yidiankt.bean.enodeb;

import com.yidiankt.bean.basicBean.UeInfo;

/*Ut 接口取消呼叫转移参数*/
public class EnodebDataUtResetCallReq extends EnodebCommonReq {
    private UeInfo ueInfo;                            //手机用户信息
    private String              ipType;                            //采用激活地址的 IP 类型
    private String              cfdType;                           //需要取消的呼叫转移类型

    public UeInfo getUeInfo() {
        return ueInfo;
    }

    public void setUeInfo(UeInfo ueInfo) {
        this.ueInfo = ueInfo;
    }

    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public String getCfdType() {
        return cfdType;
    }

    public void setCfdType(String cfdType) {
        this.cfdType = cfdType;
    }
}
