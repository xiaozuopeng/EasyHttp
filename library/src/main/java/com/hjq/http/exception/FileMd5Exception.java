package com.hjq.http.exception;

import androidx.annotation.NonNull;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/11/16
 *    desc   : MD5 校验异常
 */
public final class FileMd5Exception extends HttpException {

    private final String mMd5;

    public FileMd5Exception(@NonNull String message, @NonNull String md5) {
        super(message);
        mMd5 = md5;
    }

    @NonNull
    public String getMd5() {
        return mMd5;
    }
}