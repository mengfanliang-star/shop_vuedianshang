package com.mengfanliang.service;

import com.github.pagehelper.PageHelper;
import com.mengfanliang.entity.Order;
import com.mengfanliang.entity.OrderExample;
import com.mengfanliang.mapper.OrderMapper;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper mapper;
    @Override
    public List<Order> selectList(String ordernumber, Integer pagenum, Integer pagesize) {
        PageHelper.startPage(pagenum,pagesize);
       // PageHelper.getLocalPage().getTotal();
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andOrderNumberLike("%"+ordernumber+"%");
        return mapper.selectByExample(example);


    }

    @Override
    public Order selectById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Order order) {
        return mapper.updateByPrimaryKey(order);
    }
}
