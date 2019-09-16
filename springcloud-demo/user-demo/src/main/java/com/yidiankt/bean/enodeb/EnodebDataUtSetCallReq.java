package com.yidiankt.bean.enodeb;

import com.yidiankt.bean.basicBean.UeInfo;

/*Ut 接口设置呼叫转移参数*/
public class EnodebDataUtSetCallReq extends EnodebCommonReq{
    private UeInfo ueInfo;                            //手机用户信息
    private String              ipType;                            //采用激活地址的 IP 类型
    private String              cfdType;                           //呼叫转移类型
    private String              phoneNumber;                       //呼转号码

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
