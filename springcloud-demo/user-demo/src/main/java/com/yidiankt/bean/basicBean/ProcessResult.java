package com.yidiankt.bean.basicBean;
/*过程执行结果信息。*/
public class ProcessResult {
    //时间格式:YYYY-MM-DD HH:MI:SS.xyz
    private String          startTime;                         //过程开始时间
    private String          endTime;                           //过程结束时间
    private Long            delay;                             //过程时延，毫秒
    private String          result;                            //过程结果

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Long getDelay() {
        return delay;
    }

    public void setDelay(Long delay) {
        this.delay = delay;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
