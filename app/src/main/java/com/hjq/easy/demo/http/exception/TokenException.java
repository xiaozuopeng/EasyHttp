package com.hjq.easy.demo.http.exception;

import androidx.annotation.NonNull;
import com.hjq.http.exception.HttpException;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/05/19
 *    desc   : Token 失效异常
 */
public final class TokenException extends HttpException {

    public TokenException(@NonNull String message) {
        super(message);
    }

    public TokenException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
    }
}