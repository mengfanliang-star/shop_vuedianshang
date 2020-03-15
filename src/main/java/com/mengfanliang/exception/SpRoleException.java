package com.mengfanliang.exception;

import com.mengfanliang.result.ResultCode;

public class SpRoleException extends Exception {
    Integer status;

    public Integer getStatus() {
        return status;

    }

    public SpRoleException(Integer status, String message) {
        super(message);
        this.status=status;
    }

    public SpRoleException(ResultCode resultCode){
        super(resultCode.getMsg());
        this.status=resultCode.getStatus();

    }


}
