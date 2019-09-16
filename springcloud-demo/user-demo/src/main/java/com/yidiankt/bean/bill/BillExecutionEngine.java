package com.yidiankt.bean.bill;

/*执行引擎话单参数*/
public class BillExecutionEngine extends BillCommon {
    private Long            testCode;                          //任务的测试类型编码
    private Long            taskId;                            //任务的编号
    private String          redo;                              //重做标志
    private String          startTime;                         //任务执行开始时间
    private String          endTime;                           //任务执行结束时间

    public Long getTestCode() {
        return testCode;
    }

    public void setTestCode(Long testCode) {
        this.testCode = testCode;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getRedo() {
        return redo;
    }

    public void setRedo(String redo) {
        this.redo = redo;
    }

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
}
