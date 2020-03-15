package com.mengfanliang.result;

public enum ResultCode {

    OK(200,"请求成功"),
    CREATED(201,"创建成功"),
    DELETED(204,"删除成功"),
    BAD_REQUEST(400,"请求失败"),
    UNAUTHORIZED(401,"未授权"),
    FORBIDDEN(403,"禁止访问"),
    NOT_FOUND(404,"未授权"),
    UN(422,"验证错误"),
    SERVER_ERROR(500,"内部错误");




    private Integer status;
    private String msg;

    ResultCode(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }


}
