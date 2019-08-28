package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsProjectPic;
import com.sdsoon.modular.system.po.SsProjectPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SsProjectPicMapper {
    long countByExample(SsProjectPicExample example);

    int deleteByExample(SsProjectPicExample example);

    int deleteByPrimaryKey(String projectPicId);

    int insert(SsProjectPic record);

    int insertSelective(SsProjectPic record);

    List<SsProjectPic> selectByExample(SsProjectPicExample example);

    SsProjectPic selectByPrimaryKey(String projectPicId);

    int updateByExampleSelective(@Param("record") SsProjectPic record, @Param("example") SsProjectPicExample example);

    int updateByExample(@Param("record") SsProjectPic record, @Param("example") SsProjectPicExample example);

    int updateByPrimaryKeySelective(SsProjectPic record);

    int updateByPrimaryKey(SsProjectPic record);
}