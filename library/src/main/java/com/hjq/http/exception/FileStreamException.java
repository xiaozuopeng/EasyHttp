package com.hjq.http.exception;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2025/12/14
 *    desc   : 文件流异常
 */
public final class FileStreamException extends HttpException {

    public FileStreamException(@NonNull String message) {
        super(message);
    }

    public FileStreamException(@NonNull String message, @NonNull Throwable cause) {
        super(message, cause);
    }
}