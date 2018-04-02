package com.jay.spring.boot.service;
import com.jay.spring.boot.model.ShDepartment;
import com.jay.spring.boot.pagehelper.PageInfo;

/**
*
* @author generator.wei
*
*/
public interface ShDepartmentService {
	/**
	* 分页查询
	* @param pageInfo
	* @return
	*/
    PageInfo<ShDepartment> queryPageList(PageInfo<ShDepartment> pageInfo);

	/**
	* 新增数据
	* @param shDepartment
	* @return
	*/
	int  saveShDepartment(ShDepartment shDepartment);

	/**
	* 修改数据
	* @param shDepartment
	* @return
	*/
	int  modifyShDepartment(ShDepartment shDepartment);
	


}
