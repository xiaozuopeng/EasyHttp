package com.hjq.http.exception;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/06/25
 *    desc   : 网络连接异常
 */
public final class NetworkException extends HttpException {

    public NetworkException(@NonNull String message) {
        super(message);
    }

    public NetworkException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
    }
}