package com.jay.spring.boot.service;

import com.jay.spring.boot.pagehelper.PageInfo;
import com.jay.spring.boot.model.ShEmployee;

/**
*
* @author generator.wei
*
*/
public interface ShEmployeeService {
	/**
	* 分页查询
	* @param pageInfo
	* @return
	*/
    PageInfo<ShEmployee> queryPageList(PageInfo<ShEmployee> pageInfo);

	/**
	* 新增数据
	* @param shEmployee
	* @return
	*/
	int  saveShEmployee(ShEmployee shEmployee);

	/**
	* 修改数据
	* @param shEmployee
	* @return
	*/
	int  modifyShEmployee(ShEmployee shEmployee);
	


}
