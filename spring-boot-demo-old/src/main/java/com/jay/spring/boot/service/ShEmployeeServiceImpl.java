package com.jay.spring.boot.service;

import com.jay.spring.boot.pagehelper.PageInfo;
import com.jay.spring.boot.mapper.ShEmployeeMapper;
import com.jay.spring.boot.model.ShEmployee;
import com.jay.spring.boot.service.ShEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("shEmployeeService")
public class ShEmployeeServiceImpl implements ShEmployeeService {

    @Autowired
    private ShEmployeeMapper shEmployeeMapper;

    @Override
    public PageInfo<ShEmployee> queryPageList(PageInfo<ShEmployee> pageInfo) {
        try {
            int total = shEmployeeMapper.countList();
            if (total > 0) {
                List<ShEmployee> list = shEmployeeMapper.queryPageList((pageInfo.getPageNum() - 1) * pageInfo.getPageSize(), pageInfo.getPageSize());
                pageInfo.setList(list);
                pageInfo.setTotal(total);
            }
        } catch (Exception e) {

            return null;
        }
        return pageInfo;
    }

    @Override
    public int saveShEmployee(ShEmployee shEmployee) {
        int result = shEmployeeMapper.insert(shEmployee);
        return result;
    }

    @Override
    public int modifyShEmployee(ShEmployee shEmployee) {
        int result = shEmployeeMapper.updateByPrimaryKey(shEmployee);
        return result;
    }

}
