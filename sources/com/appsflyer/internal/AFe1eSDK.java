package com.appsflyer.internal;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "Ljava/lang/String;", "AFKeystoreWrapper", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "valueOf", "AFInAppEventParameterName"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public enum AFe1eSDK {
    API("api"),
    RC("rc"),
    DEFAULT(HttpUrl.FRAGMENT_ENCODE_SET);


    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    public final String AFKeystoreWrapper;

    AFe1eSDK(String str) {
        this.AFKeystoreWrapper = str;
    }
}
