package com.yidiankt.bean.basicBean;

/*手机所在位置信息*/
public class Position {
    private Long            cellId;                            //小区编号
    private Long            tac;                               //跟踪区编号

    public Long getCellId() {
        return cellId;
    }

    public void setCellId(Long cellId) {
        this.cellId = cellId;
    }

    public Long getTac() {
        return tac;
    }

    public void setTac(Long tac) {
        this.tac = tac;
    }
}
