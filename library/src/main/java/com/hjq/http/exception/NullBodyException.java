package com.hjq.http.exception;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/12/24
 *    desc   : 空实体异常
 */
public final class NullBodyException extends HttpException {

    public NullBodyException(@NonNull String message) {
        super(message);
    }

    public NullBodyException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
    }
}