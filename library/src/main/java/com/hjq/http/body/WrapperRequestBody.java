package com.hjq.http.body;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2022/09/17
 *    desc   : RequestBody 包装类
 */
public class WrapperRequestBody extends RequestBody {

    @NonNull
    private final RequestBody mRealRequestBody;

    public WrapperRequestBody(@NonNull RequestBody realRequestBody) {
        mRealRequestBody = realRequestBody;
    }

    @Override
    public long contentLength() throws IOException {
        return mRealRequestBody.contentLength();
    }

    @Nullable
    @Override
    public MediaType contentType() {
        return mRealRequestBody.contentType();
    }

    @Override
    public void writeTo(@NonNull BufferedSink sink) throws IOException {
        mRealRequestBody.writeTo(sink);
    }

    /**
     * 获取当前的 RequestBody
     */
    @NonNull
    public RequestBody getRealRequestBody() {
        return mRealRequestBody;
    }
}