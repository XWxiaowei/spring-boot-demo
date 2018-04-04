package com.jay.spring.boot.service;

import com.jay.spring.boot.pagehelper.PageInfo;
import com.jay.spring.boot.mapper.ShDepartmentMapper;
import com.jay.spring.boot.model.ShDepartment;
import com.jay.spring.boot.service.ShDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("shDepartmentService")
public class ShDepartmentServiceImpl implements ShDepartmentService {

    @Autowired
    private ShDepartmentMapper shDepartmentMapper;

    @Override
    public PageInfo<ShDepartment> queryPageList(PageInfo<ShDepartment> pageInfo) {
        try {
            int total = shDepartmentMapper.countList();
            if (total > 0) {
                List<ShDepartment> list = shDepartmentMapper.queryPageList((pageInfo.getPageNum() - 1) * pageInfo.getPageSize(), pageInfo.getPageSize());
                pageInfo.setList(list);
                pageInfo.setTotal(total);
            }
        } catch (Exception e) {

            return null;
        }
        return pageInfo;
    }

    @Override
    public int saveShDepartment(ShDepartment shDepartment) {
        int result = shDepartmentMapper.insert(shDepartment);
        return result;
    }

    @Override
    public int modifyShDepartment(ShDepartment shDepartment) {
        int result = shDepartmentMapper.updateByPrimaryKey(shDepartment);
        return result;
    }

}
