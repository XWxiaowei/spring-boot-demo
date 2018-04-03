package com.jay.spring.boot;

import com.jay.spring.boot.pagehelper.PageInfo;
import com.jay.spring.boot.model.ShEmployee;
import com.jay.spring.boot.service.ShEmployeeService;
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
@RequestMapping("/shEmployee")
public class ShEmployeeController {
	
	@Autowired
	private ShEmployeeService shEmployeeService;

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
			PageInfo<ShEmployee> pageInfo =new PageInfo<ShEmployee>();
				if (pageNum != null && pageNum > 0) {
				pageInfo.setPageNum(pageNum);
				}
				if (pageSize != null && pageSize > 0) {
				pageInfo.setPageSize(pageSize);
				}
			pageInfo = shEmployeeService.queryPageList(pageInfo);
		    return "";
	}

	/**
	* 新增数据
	* @param shEmployee
	* @return
	*/
	@RequestMapping(value="/add",method= RequestMethod.POST)
    @ResponseBody
	public int  saveShEmployee(ShEmployee shEmployee){
		  int result = shEmployeeService.saveShEmployee(shEmployee);
		  return result;
	}

	/**
	* 修改数据
	* @param shEmployee
	* @return
	*/
	@RequestMapping("/mod")
	@ResponseBody
	public int modifyShEmployee(ShEmployee shEmployee){
		  int result = shEmployeeService.modifyShEmployee(shEmployee);
		  return result;
	}
}
