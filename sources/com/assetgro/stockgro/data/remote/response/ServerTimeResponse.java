package com.assetgro.stockgro.data.remote.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/ServerTimeResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "datetime", HttpUrl.FRAGMENT_ENCODE_SET, "unixtime", HttpUrl.FRAGMENT_ENCODE_SET, "utc_datetime", "(Ljava/lang/String;JLjava/lang/String;)V", "getDatetime", "()Ljava/lang/String;", "getUnixtime", "()J", "getUtc_datetime", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServerTimeResponse {
    public static final int $stable = 0;

    @SerializedName("datetime")
    @NotNull
    private final String datetime;

    @SerializedName("unixtime")
    private final long unixtime;

    @SerializedName("utc_datetime")
    @NotNull
    private final String utc_datetime;

    public ServerTimeResponse(@NotNull String datetime, long j10, @NotNull String utc_datetime) {
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        Intrinsics.checkNotNullParameter(utc_datetime, "utc_datetime");
        this.datetime = datetime;
        this.unixtime = j10;
        this.utc_datetime = utc_datetime;
    }

    @NotNull
    public final String getDatetime() {
        return this.datetime;
    }

    public final long getUnixtime() {
        return this.unixtime;
    }

    @NotNull
    public final String getUtc_datetime() {
        return this.utc_datetime;
    }
}
