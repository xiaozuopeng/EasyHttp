package com.hjq.http.exception;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/06/25
 *    desc   : 服务器超时异常
 */
public final class TimeoutException extends HttpException {

    public TimeoutException(@NonNull String message) {
        super(message);
    }

    public TimeoutException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
    }
}