package com.hjq.http.model;

import com.hjq.http.config.IHttpBodyStrategy;
import com.hjq.http.config.impl.HttpFormBodyStrategy;
import com.hjq.http.config.impl.HttpJsonBodyStrategy;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/12/18
 *    desc   : 参数提交方式
 */
public class RequestBodyType {

    /**
     * 表单提交
     */
    public static final IHttpBodyStrategy FORM = new HttpFormBodyStrategy();

    /**
     * JSON 提交
     */
    public static final IHttpBodyStrategy JSON = new HttpJsonBodyStrategy();
}