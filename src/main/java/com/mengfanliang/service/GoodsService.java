package com.mengfanliang.service;

import com.mengfanliang.entity.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> select(String goodsName,Integer pagenum,Integer pagesize);

    Goods findById(Integer id);

    int delete(Integer id);

    int add(Goods goods);

    int update(Goods goods);
}
