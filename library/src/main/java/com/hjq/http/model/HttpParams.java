package com.hjq.http.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hjq.http.EasyConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/07/20
 *    desc   : 请求参数封装
 */
public final class HttpParams {

    /** 请求参数存放集合 */
    @NonNull
    private final Map<String, Object> mParams = new HashMap<>(EasyConfig.getInstance().getParams());

    /** 是否有流参数 */
    private boolean mMultipart;

    public void put(@Nullable String key, @Nullable Object value) {
        if (key == null || value == null) {
            return;
        }
        mParams.put(key, value);
    }

    public void remove(@Nullable String key) {
        if (key == null) {
            return;
        }
        mParams.remove(key);
    }

    @Nullable
    public Object get(@Nullable String key) {
        return mParams.get(key);
    }

    public void clear() {
        mParams.clear();
    }

    public boolean isEmpty() {
        return mParams.isEmpty();
    }

    @NonNull
    public Set<String> getKeys() {
        return mParams.keySet();
    }

    @NonNull
    public Map<String, Object> getMap() {
        return mParams;
    }

    public boolean isMultipart() {
        return mMultipart;
    }

    public void setMultipart(boolean multipart) {
        mMultipart = multipart;
    }
}