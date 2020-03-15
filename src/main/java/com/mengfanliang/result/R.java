package com.mengfanliang.result;

import java.util.HashMap;
import java.util.Map;

public class R {

//    private Integer status;
//    private String msg;

    private static Map<String,Object> data=new HashMap<String,Object>();
    private static Map<String,Object> meta=new HashMap<String,Object>();

    private R() {

    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, Object> getMeta() {
        return meta;
    }

    public void setMeta(Map<String, Object> meta) {
        this.meta = meta;
    }

    //    public static R ok(){
//        R r=new R();
//        r.setStatus(ResultCode.OK.getStatus());
//        r.setMsg(ResultCode.OK.getMsg());
//        return r;
//    }

//    public static R ok(){
//        R r=new R();
//        meta.put("msg",ResultCode.OK.getMsg());
//        meta.put("status",ResultCode.OK.getStatus());
//        return r;
//
//    }

public static R result(ResultCode resultCode){
        R r=new R();
        meta.put("status",resultCode.getStatus());
        meta.put("msg",resultCode.getMsg());
        return r;

}



public static R forbidden(){
    R r=new R();
    meta.put("status",ResultCode.FORBIDDEN.getStatus());
    meta.put("msg",ResultCode.FORBIDDEN.getStatus());
    return r;
}

public static R notFount(){
    R r=new R();
    meta.put("status",ResultCode.NOT_FOUND.getStatus());
    meta.put("msg",ResultCode.NOT_FOUND.getStatus());
    return r;
}

public static R un(){
    R r=new R();
    meta.put("status",ResultCode.UN.getStatus());
    meta.put("msg",ResultCode.UN.getStatus());
    return r;
}
public static R unauthor(){
    R r=new R();
    meta.put("status",ResultCode.UNAUTHORIZED.getStatus());
    meta.put("msg",ResultCode.UNAUTHORIZED.getStatus());
    return r;
}

public static R serverError(){
    R r=new R();
    meta.put("status",ResultCode.SERVER_ERROR.getStatus());
    meta.put("msg",ResultCode.SERVER_ERROR.getStatus());
    return r;
}

    public static R badRequest(){
        R r=new R();
        meta.put("status",ResultCode.BAD_REQUEST.getStatus());
        meta.put("msg",ResultCode.BAD_REQUEST.getStatus());
        return r;
    }
    public static R deleted(){
        R r=new R();
        meta.put("status",ResultCode.DELETED.getStatus());
        meta.put("msg",ResultCode.DELETED.getMsg());
        return  r;

    }
    public static R created(){
        R r=new R();
        meta.put("status",ResultCode.CREATED.getStatus());
        meta.put("msg",ResultCode.CREATED.getMsg());
        return r;
    }
    public static R ok(){
        R r=new R();
        r.meta.put("msg",ResultCode.OK.getMsg());
        r.meta.put("status",ResultCode.OK.getStatus());
        return r;

    }
    public R meta(int status,String msg){
        meta.put("msg",msg);
        meta.put("status",status);
        return this;
    }

    public R data(String key,Object value){
        data.put(key,value);
        return this;
    }

    public R data(Map<String,Object> map){
        this.setData(map);
        return this;
    }


}
