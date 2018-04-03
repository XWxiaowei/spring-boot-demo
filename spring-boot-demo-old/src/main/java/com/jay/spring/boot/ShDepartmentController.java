package com.jay.spring.boot;

import com.jay.spring.boot.pagehelper.PageInfo;
import com.jay.spring.boot.model.ShDepartment;
import com.jay.spring.boot.service.ShDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*
* @author generator.wei
*
*/
@Controller
@RequestMapping("/shDepartment")
public class ShDepartmentController {
	
	@Autowired
	private ShDepartmentService shDepartmentService;

	/**
	* 分页查询
	* @param model
	* @param pageNum
	* @param pageSize
	* @return
	*/
	@RequestMapping("/query")
	@ResponseBody
	public String queryPageList(Model model, Integer pageNum, Integer pageSize){
			PageInfo<ShDepartment> pageInfo =new PageInfo<ShDepartment>();
				if (pageNum != null && pageNum > 0) {
				pageInfo.setPageNum(pageNum);
				}
				if (pageSize != null && pageSize > 0) {
				pageInfo.setPageSize(pageSize);
				}
			pageInfo = shDepartmentService.queryPageList(pageInfo);
		    return "";
	}

	/**
	* 新增数据
	* @param shDepartment
	* @return
	*/
	@RequestMapping(value="/add",method= RequestMethod.POST)
    @ResponseBody
	public int  saveShDepartment(ShDepartment shDepartment){
		  int result = shDepartmentService.saveShDepartment(shDepartment);
		  return result;
	}

	/**
	* 修改数据
	* @param shDepartment
	* @return
	*/
	@RequestMapping("/mod")
	@ResponseBody
	public int modifyShDepartment(ShDepartment shDepartment){
		  int result = shDepartmentService.modifyShDepartment(shDepartment);
		  return result;
	}
}
