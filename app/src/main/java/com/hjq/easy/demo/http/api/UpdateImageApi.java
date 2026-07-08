package com.hjq.easy.demo.http.api;

import androidx.annotation.NonNull;
import com.hjq.http.config.IRequestApi;
import com.hjq.http.config.IRequestServer;
import java.io.File;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/12/14
 *    desc   : 上传图片
 */
public final class UpdateImageApi implements IRequestServer, IRequestApi {

    @NonNull
    @Override
    public String getHost() {
        return "https://api.imgbb.com/";
    }

    @NonNull
    @Override
    public String getApi() {
        return "1/upload";
    }

    /** API Key */
    private final String key = "2ff632834724a785861120d76e0980b4";

    /** 图片过期时间，单位：秒，默认 60 秒 */
    private final int expiration = 60;

    /** 本地图片 */
    private File image;

    public UpdateImageApi(File image) {
        this.image = image;
    }

    public UpdateImageApi setImage(File image) {
        this.image = image;
        return this;
    }
}