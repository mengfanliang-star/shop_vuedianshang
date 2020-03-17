package com.mengfanliang.controller;

import com.mengfanliang.entity.Order;
import com.mengfanliang.result.R;
import com.mengfanliang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
@CrossOrigin
public class OrderAction {
    @Autowired
    OrderService service;
    @GetMapping("")
    public R getOrderList(String ordernumber,Integer pagenum,Integer pagesize){

        return R.ok().data("orderlist",service.selectList(ordernumber,pagenum,pagesize));

    }

    @GetMapping("{id}")
    public R getOrderById(@PathVariable Integer id){
        return R.ok().data("order",service.selectById(id));
    }
    @PutMapping("{id}")
    public R update(@PathVariable Integer id, @RequestBody Order order){
        System.out.println(id);
        order.setOrderId(id);

        return R.ok().data("修改成功",service.updateById(order));

    }


}
