package com.hjq.http.exception;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/06/25
 *    desc   : 请求取消异常
 */
public final class CancelException extends HttpException {

    public CancelException(@NonNull String message) {
        super(message);
    }

    public CancelException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
    }
}