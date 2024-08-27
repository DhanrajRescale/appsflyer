package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1mSDK;
import java.io.IOException;

/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFe1mSDK valueOf;

    public HttpException(@NonNull Throwable th2, @NonNull AFe1mSDK aFe1mSDK) {
        super(th2.getMessage(), th2);
        this.valueOf = aFe1mSDK;
    }

    @NonNull
    public AFe1mSDK getMetrics() {
        return this.valueOf;
    }
}
