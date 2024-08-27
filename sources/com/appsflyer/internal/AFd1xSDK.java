package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFd1xSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "values", "()Z", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFd1xSDK$AFa1zSDK;", "p1", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "(Landroid/content/Context;Lcom/appsflyer/internal/AFd1xSDK$AFa1zSDK;)V", "()V", "AFa1uSDK", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AFd1xSDK {

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.AFInAppEventType;

    /* renamed from: com.appsflyer.internal.AFd1xSDK$AFa1uSDK, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion AFInAppEventType = new Companion();
        private static long AFKeystoreWrapper = 500;

        private Companion() {
        }

        public static long AFInAppEventParameterName() {
            return AFKeystoreWrapper;
        }
    }

    /* loaded from: classes.dex */
    public interface AFa1zSDK {
        void valueOf();

        void values(@NotNull AFh1xSDK aFh1xSDK);
    }

    void AFInAppEventType();

    void AFInAppEventType(@NotNull Context p02, @NotNull AFa1zSDK p12);

    boolean values();
}
