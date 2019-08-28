package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsProjectDoc;
import com.sdsoon.modular.system.po.SsProjectDocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SsProjectDocMapper {
    long countByExample(SsProjectDocExample example);

    int deleteByExample(SsProjectDocExample example);

    int deleteByPrimaryKey(String projectDocId);

    int insert(SsProjectDoc record);

    int insertSelective(SsProjectDoc record);

    List<SsProjectDoc> selectByExample(SsProjectDocExample example);

    SsProjectDoc selectByPrimaryKey(String projectDocId);

    int updateByExampleSelective(@Param("record") SsProjectDoc record, @Param("example") SsProjectDocExample example);

    int updateByExample(@Param("record") SsProjectDoc record, @Param("example") SsProjectDocExample example);

    int updateByPrimaryKeySelective(SsProjectDoc record);

    int updateByPrimaryKey(SsProjectDoc record);
}