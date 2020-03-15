package com.mengfanliang.mapper;

import com.mengfanliang.entity.SpRole;
import com.mengfanliang.entity.SpRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpRoleMapper {
    long countByExample(SpRoleExample example);

    int deleteByExample(SpRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(SpRole record);

    int insertSelective(SpRole record);

    List<SpRole> selectByExample(SpRoleExample example);

    SpRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") SpRole record, @Param("example") SpRoleExample example);

    int updateByExample(@Param("record") SpRole record, @Param("example") SpRoleExample example);

    int updateByPrimaryKeySelective(SpRole record);

    int updateByPrimaryKey(SpRole record);
}