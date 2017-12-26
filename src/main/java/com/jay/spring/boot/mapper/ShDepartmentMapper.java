package com.jay.spring.boot.mapper;

import com.jay.spring.boot.model.ShDepartment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShDepartmentMapper {
    /**
     * insert
     * @param record
     * @return int
     */
    int insert(ShDepartment record);

    /**
     * selectByPrimaryKey
     * @param did
     * @return com.jay.spring.boot.model.ShDepartment
     */
    ShDepartment selectByPrimaryKey(Integer did);

    /**
     * selectAll
     * @return java.util.List<com.jay.spring.boot.model.ShDepartment>
     */
    List<ShDepartment> selectAll();

    /**
     * updateByPrimaryKey
     * @param record
     * @return int
     */
    int updateByPrimaryKey(ShDepartment record);

    /**
     * countList
     * @return int
     */
    int countList();

    /**
     * queryPageList
     * @param current
     * @param pageSize
     * @return java.util.List<com.jay.spring.boot.model.ShDepartment>
     */
    List<ShDepartment> queryPageList(@Param(value = "current") Integer current, @Param(value = "pageSize") Integer pageSize);
}