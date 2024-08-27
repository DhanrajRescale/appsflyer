package com.assetgro.stockgro.data.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/assetgro/stockgro/data/model/FileMetaData;", HttpUrl.FRAGMENT_ENCODE_SET, "uri", HttpUrl.FRAGMENT_ENCODE_SET, "filename", "path", "size", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getFilename", "()Ljava/lang/String;", "getPath", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUri", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileMetaData {
    public static final int $stable = 0;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String filename;

    @SerializedName("path")
    private final String path;

    @SerializedName("size")
    private final Integer size;

    @SerializedName("uri")
    private final String uri;

    public FileMetaData(String str, String str2, String str3, Integer num) {
        this.uri = str;
        this.filename = str2;
        this.path = str3;
        this.size = num;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getUri() {
        return this.uri;
    }
}
