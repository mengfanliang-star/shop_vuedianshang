package com.mengfanliang.exception;

import com.mengfanliang.result.R;
import com.mengfanliang.result.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class MyException {

    @ExceptionHandler(Exception.class)
    public R error(Exception e){
        e.printStackTrace();
        return R.unauthor();

    }
    @ExceptionHandler(ArithmeticException.class)
    public R error(ArithmeticException e){
        e.printStackTrace();
        return R.result(ResultCode.BAD_REQUEST);

    }

    @ExceptionHandler(SpRoleException.class)
    public R error(SpRoleException e){
        e.printStackTrace();
        return R.ok().meta(e.getStatus(),e.getMessage());

    }


}
