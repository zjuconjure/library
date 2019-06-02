package cn.edu.zucc.library.ssm.pojo;

import java.util.Date;

public class Record extends RecordKey {
    private Integer recorddetialid;

    private Integer userid;

    private Date time;

    public Integer getRecorddetialid() {
        return recorddetialid;
    }

    public void setRecorddetialid(Integer recorddetialid) {
        this.recorddetialid = recorddetialid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}