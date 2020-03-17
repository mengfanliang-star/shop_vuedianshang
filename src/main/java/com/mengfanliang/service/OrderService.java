package com.mengfanliang.service;

import com.mengfanliang.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> selectList(String ordernumber,Integer pagenum,Integer pagesize);

    Order selectById(Integer id);

    int updateById(Order order);
}
