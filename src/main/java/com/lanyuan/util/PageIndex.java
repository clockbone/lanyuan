package com.lanyuan.util;

/**
 * Created by qinjun on 2016/2/2.
 */
public class PageIndex {
    private long startindex;
    private long endindex;

    public PageIndex(long startindex, long endindex) {
        this.startindex = startindex;
        this.endindex = endindex;
    }
    public long getStartindex() {
        return startindex;
    }
    public void setStartindex(long startindex) {
        this.startindex = startindex;
    }
    public long getEndindex() {
        return endindex;
    }
    public void setEndindex(long endindex) {
        this.endindex = endindex;
    }
}
