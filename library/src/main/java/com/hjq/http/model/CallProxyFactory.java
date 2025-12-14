package com.hjq.http.model;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/12/14
 *    desc   : 请求对象代理工程
 */
public interface CallProxyFactory {

    /**
     * 创建请求对象代理
     */
    @NonNull
    CallProxy create();
}