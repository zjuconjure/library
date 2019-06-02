package cn.edu.zucc.library.ssm.pojo;

public class RecordDetail extends RecordDetailKey {
    private Integer userid;

    private Integer bookid;

    private Integer borrowstatus;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getBorrowstatus() {
        return borrowstatus;
    }

    public void setBorrowstatus(Integer borrowstatus) {
        this.borrowstatus = borrowstatus;
    }
}