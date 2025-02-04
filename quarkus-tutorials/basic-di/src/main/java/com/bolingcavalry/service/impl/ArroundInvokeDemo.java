package com.bolingcavalry.service.impl;

import com.bolingcavalry.interceptor.meta.HandleError;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author will
 * @email zq2599@gmail.com
 * @date 2022/3/26 23:52
 * @description 模拟业务逻辑中的异常抛出，这里方法中直接抛出一个异常
 */
@ApplicationScoped
//@HandleError
public class ArroundInvokeDemo {

    public void executeThrowError() {
        throw new IllegalArgumentException("this is business logic exception");
    }
}
