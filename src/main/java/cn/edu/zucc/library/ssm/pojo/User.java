package cn.edu.zucc.library.ssm.pojo;

import javax.validation.constraints.Pattern;

public class User extends UserKey {
//    private Integer userid;

    @Pattern(regexp = "^[a-zA-Z0-9\\u2E80-\\u9FFF]{2,16}$",message = "用户名是2-16位中英文、数字")
    private String username;

    @Pattern(regexp = "^[a-zA-Z0-9\\u2E80-\\u9FFF]{2,12}$",message = "昵称是2-12位中英文、数字")
    private String nickname;

    @Pattern(regexp = "^[a-zA-Z0-9_-]{6,18}$",message = "密码是6-18位英文、数字")
    private String password;

    private Integer rank;

//    public Integer getUserid() {
//        return userid;
//    }

//    public void setUserid(Integer userid) {
//        this.userid = userid;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}