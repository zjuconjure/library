package cn.edu.zucc.library.ssm.mapper;

import cn.edu.zucc.library.ssm.pojo.User;
import cn.edu.zucc.library.ssm.pojo.UserExample;
import cn.edu.zucc.library.ssm.pojo.UserKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(UserKey key);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByUsername(String username);
    
    User selectByPrimaryKey(UserKey key);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}