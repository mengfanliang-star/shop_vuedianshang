package com.mengfanliang.mapper;

import com.mengfanliang.entity.Attribute;
import com.mengfanliang.entity.AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeMapper {
    long countByExample(AttributeExample example);

    int deleteByExample(AttributeExample example);

    int deleteByPrimaryKey(Integer attrId);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    List<Attribute> selectByExample(AttributeExample example);

    Attribute selectByPrimaryKey(Integer attrId);

    int updateByExampleSelective(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExample(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKey(Attribute record);
}