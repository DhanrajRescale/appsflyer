package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.io.Serializable;
import java.lang.reflect.Field;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.l;

/* loaded from: classes.dex */
public final class AFj1wSDK implements AFj1zSDK {
    @Override // com.appsflyer.internal.AFj1zSDK
    @NotNull
    public final String AFInAppEventType() {
        Serializable a10;
        Object obj;
        try {
            l.Companion companion = ut.l.INSTANCE;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        if (obj != null) {
            a10 = (String) obj;
            if (ut.l.b(a10)) {
                a10 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return (String) a10;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
