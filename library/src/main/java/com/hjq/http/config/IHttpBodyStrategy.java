package com.hjq.http.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hjq.http.model.HttpParams;
import com.hjq.http.request.HttpRequest;
import okhttp3.RequestBody;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2023/09/23
 *    desc   : 请求 Body 策略接口
 */
public interface IHttpBodyStrategy {

    /**
     * 添加参数
     */
    void addParams(@NonNull HttpParams params, @Nullable String key, @Nullable Object value);

    /**
     * 创建 RequestBody
     */
    @NonNull
    RequestBody createRequestBody(@NonNull HttpRequest<?> httpRequest, @NonNull HttpParams params);
}