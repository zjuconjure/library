package cn.edu.zucc.library.ssm.mapper;

import cn.edu.zucc.library.ssm.pojo.RecordDetail;
import cn.edu.zucc.library.ssm.pojo.RecordDetailExample;
import cn.edu.zucc.library.ssm.pojo.RecordDetailKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordDetailMapper {
    long countByExample(RecordDetailExample example);

    int deleteByExample(RecordDetailExample example);

    int deleteByPrimaryKey(RecordDetailKey key);

    int insert(RecordDetail record);

    int insertSelective(RecordDetail record);

    List<RecordDetail> selectByExample(RecordDetailExample example);

    RecordDetail selectByPrimaryKey(RecordDetailKey key);

    int updateByExampleSelective(@Param("record") RecordDetail record, @Param("example") RecordDetailExample example);

    int updateByExample(@Param("record") RecordDetail record, @Param("example") RecordDetailExample example);

    int updateByPrimaryKeySelective(RecordDetail record);

    int updateByPrimaryKey(RecordDetail record);
}