package com.hjq.http.exception;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/12/01
 *    desc   : 服务器连接异常
 */
public final class ServerException extends HttpException {

    public ServerException(@NonNull String message) {
        super(message);
    }

    public ServerException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
    }
}