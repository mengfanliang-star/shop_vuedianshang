package com.mengfanliang.controller;

import com.mengfanliang.entity.Attribute;
import com.mengfanliang.result.R;
import com.mengfanliang.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class AttributeAction {
    @Autowired
    AttributeService service;
    @GetMapping("{id}/attributes")
    public R attributesList(@PathVariable Integer id,String sel){
        System.out.println(id+sel);
//        if(id==3){
            return R.ok().data("attributes",service.findList(id,sel));
//        }else{
//            return R.badRequest().meta(408,"不是三级分类,没有属性参数");
//        }


    }
    @PostMapping("/{id}/attributes")
    public R add(@PathVariable Integer id, @RequestBody Attribute attribute){
        System.out.println(id);
        attribute.setCatId(id);
        //if(id==3){
            int i=service.add(attribute);
            return R.ok().data("添加成功",i);
//        }else{
//            return R.badRequest().meta(408,"不是三级分类,不能添加属性参数");
//        }

    }

    @DeleteMapping("/{id}/attributes/{attrid}")
    public  R remove(@PathVariable Integer id,@PathVariable Integer attrid){
        System.out.println(id+""+attrid);
        return R.ok().data("删除成功",service.delete(attrid));

    }
    @GetMapping("/{id}/attributes/{attrid}")
    public R getByAttrId(@PathVariable Integer id,@PathVariable Integer attrid){
        System.out.println(id+""+attrid);
        return R.ok().data("attr",service.findByAttrId(attrid));
    }
    @PutMapping("/{id}/attributes/{attrid}")
    public R update(@PathVariable Integer id,@PathVariable Integer attrid, @RequestBody Attribute attribute){
        System.out.println(id+""+attrid);
        attribute.setAttrId(attrid);
        return R.ok().data("修改成功",service.update(attribute));
    }



}
