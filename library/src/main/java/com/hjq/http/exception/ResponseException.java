package com.hjq.http.exception;

import androidx.annotation.NonNull;
import okhttp3.Response;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/06/25
 *    desc   : 服务器响应异常
 */
public final class ResponseException extends HttpException {

    @NonNull
    private final Response mResponse;

    public ResponseException(@NonNull String message, @NonNull Response response) {
        super(message);
        mResponse = response;
    }

    public ResponseException(@NonNull String message, @NonNull Throwable cause, @NonNull Response response) {
        super(message, cause);
        mResponse = response;
    }

    @NonNull
    public Response getResponse() {
        return mResponse;
    }
}