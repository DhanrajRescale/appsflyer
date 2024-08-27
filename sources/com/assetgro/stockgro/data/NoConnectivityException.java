package com.assetgro.stockgro.data;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/data/NoConnectivityException;", "Ljava/io/IOException;", "()V", "message", HttpUrl.FRAGMENT_ENCODE_SET, "getMessage", "()Ljava/lang/String;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoConnectivityException extends IOException {
    public static final int $stable = 0;

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return "No network available, please check your WiFi or Data connection";
    }
}
