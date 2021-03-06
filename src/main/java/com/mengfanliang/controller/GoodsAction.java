package com.mengfanliang.controller;

import com.mengfanliang.entity.Goods;
import com.mengfanliang.result.R;
import com.mengfanliang.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("goods")
@CrossOrigin
@Api("商品操作类")
public class GoodsAction {
    @Autowired
    GoodsService service;
    @GetMapping("")

    public R getGoodsList(String goodsname,Integer pagenum,Integer pagesize){
        System.out.println(goodsname+pagenum+""+pagesize);


                return R.ok().data("goodslist",service.select(goodsname,pagenum,pagesize));

    }
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return R.ok().data("商品信息",service.findById(id));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value="删除指定id用户信息",notes = "根据id删除")
    @ApiImplicitParam(name="id",value = "用户id",required = true,dataType = "Integer")
    public R remove(@PathVariable Integer id){

        return R.ok().data("删除成功",service.delete(id));

    }
    @PostMapping("")
    public R add(@RequestBody Goods goods){
        System.out.println(goods);
        return R.ok().data("添加成功",service.add(goods));

    }
    @PutMapping("/{id}")
    public R update(@PathVariable Integer id,@RequestBody Goods goods){
        goods.setGoodsId(id);
        int i = service.update(goods);
        return R.ok().data("修改成功",i);

    }

}
