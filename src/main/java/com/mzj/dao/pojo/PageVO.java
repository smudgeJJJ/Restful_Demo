package com.mzj.dao.pojo;

/**
 * Created by Administrator on 2017/11/22.
 */
public class PageVO {
    private Integer startindex;
    private Integer size;

    public Integer getStartindex() {
        return startindex;
    }

    public void setStartindex(Integer startindex) {
        this.startindex = startindex;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PageVO() {

    }

    public PageVO(Integer startindex, Integer size) {

        this.startindex = startindex;
        this.size = size;
    }
}
