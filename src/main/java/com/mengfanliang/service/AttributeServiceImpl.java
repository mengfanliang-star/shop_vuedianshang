package com.mengfanliang.service;

import com.mengfanliang.entity.Attribute;
import com.mengfanliang.entity.AttributeExample;
import com.mengfanliang.mapper.AttributeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    AttributeMapper mapper;
    @Override
    public List<Attribute> findList(Integer catid,String sel) {
        AttributeExample example=new AttributeExample();
        AttributeExample.Criteria criteria = example.createCriteria();
        criteria.andCatIdEqualTo(catid);
        criteria.andAttrSelEqualTo(sel);
        List<Attribute> attributes = mapper.selectByExample(example);
        return attributes;
    }

    @Override
    public int add(Attribute attribute) {
       int i= mapper.insert(attribute);
        return i;
    }

    @Override
    public int delete(Integer attrId) {
        return mapper.deleteByPrimaryKey(attrId);
    }

    @Override
    public Attribute findByAttrId(Integer attrId) {
        return mapper.selectByPrimaryKey(attrId);
    }

    @Override
    public int update(Attribute attribute) {
        return mapper.updateByPrimaryKey(attribute);
    }
}
