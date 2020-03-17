package com.mengfanliang.service;

import com.mengfanliang.entity.Attribute;

import java.util.List;

public interface AttributeService {

    List<Attribute> findList(Integer catid,String sel);

    int add(Attribute attribute);
    int delete(Integer attrId);

    Attribute findByAttrId(Integer attrId);

    int update(Attribute attribute);

}
