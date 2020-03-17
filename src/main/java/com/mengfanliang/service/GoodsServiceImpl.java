package com.mengfanliang.service;

import com.github.pagehelper.PageHelper;
import com.mengfanliang.entity.Goods;
import com.mengfanliang.entity.GoodsExample;
import com.mengfanliang.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper mapper;
    @Override
    public List<Goods> select(String goodsname,Integer pagenum,Integer pagesize) {
        PageHelper.startPage(pagenum,pagesize);
        GoodsExample example=new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsNameLike("%"+goodsname+"%");
        //criteria.andGoodsNameEqualTo(goodsname);
        return mapper.selectByExample(example);
    }

    @Override
    public Goods findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(Goods goods) {
        return mapper.insert(goods);
    }

    @Override
    public int update(Goods goods) {
        return mapper.updateByPrimaryKey(goods);
    }
}
