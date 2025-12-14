package com.hjq.http.exception;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/06/25
 *    desc   : 数据解析异常
 */
public final class DataException extends HttpException {

    public DataException(@NonNull String message) {
        super(message);
    }

    public DataException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
    }
}