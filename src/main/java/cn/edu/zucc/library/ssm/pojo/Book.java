package cn.edu.zucc.library.ssm.pojo;

public class Book extends BookKey {
//    private Integer bookid;

    private String bookname;

    private Integer booknum;

    private String author;

    private String publisher;

    private Integer pagenumber;

    private Integer status;

//    public Integer getBookid() {
//        return bookid;
//    }

//    public void setBookid(Integer bookid) {
//        this.bookid = bookid;
//    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getBooknum() {
        return booknum;
    }

    public void setBooknum(Integer booknum) {
        this.booknum = booknum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPagenumber() {
        return pagenumber;
    }

    public void setPagenumber(Integer pagenumber) {
        this.pagenumber = pagenumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}