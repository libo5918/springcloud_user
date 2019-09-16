package com.yidiankt.bean.bill;

/*话单返回结果*/
public class BillResp {

    private String          invokerId;                         //调用者识别符
    /*
      returnResult:
        无	success	成功
        10001	failure	失败
        10002	systemError	系统内部原因导致失败
        10003	illegalParameters	接口参数非法
     */
    private String          returnResult;                      //话单结果


    public String getInvokerId() {
        return invokerId;
    }

    public void setInvokerId(String invokerId) {
        this.invokerId = invokerId;
    }

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult;
    }
}
