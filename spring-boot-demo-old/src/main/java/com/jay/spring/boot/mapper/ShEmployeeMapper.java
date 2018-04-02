package com.jay.spring.boot.mapper;

import com.jay.spring.boot.model.ShEmployee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShEmployeeMapper {
    /**
     * insert
     * @param record
     * @return int
     */
    int insert(ShEmployee record);

    /**
     * selectByPrimaryKey
     * @param eid
     * @return com.jay.spring.boot.model.ShEmployee
     */
    ShEmployee selectByPrimaryKey(Integer eid);

    /**
     * selectAll
     * @return java.util.List<com.jay.spring.boot.model.ShEmployee>
     */
    List<ShEmployee> selectAll();

    /**
     * updateByPrimaryKey
     * @param record
     * @return int
     */
    int updateByPrimaryKey(ShEmployee record);

    /**
     * countList
     * @return int
     */
    int countList();

    /**
     * queryPageList
     * @param current
     * @param pageSize
     * @return java.util.List<com.jay.spring.boot.model.ShEmployee>
     */
    List<ShEmployee> queryPageList(@Param(value = "current") Integer current, @Param(value = "pageSize") Integer pageSize);
}