package com.atguigu.cloudalibaba.myHandler;

import com.atguitu.springcloud.entities.CommonResult;
import com.atguitu.springcloud.entities.Payment;
import com.sun.deploy.security.BlockedException;

public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockedException exception){
        return new CommonResult(4444,"按客戶自定义,global-----handlerException----1");
    }

    public static CommonResult handlerException2(BlockedException exception){
        return new CommonResult(4444,"按客戶自定义,global-----handlerException----2");
    }
}

