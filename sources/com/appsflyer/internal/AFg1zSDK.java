package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001b\u0010\u0006\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0007R\u001b\u0010\t\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFg1zSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "()J", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventParameterName", "()Z", "Lcom/appsflyer/internal/AFd1sSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFd1sSDK;", "valueOf", "Lcom/appsflyer/internal/AFg1xSDK;", "Lcom/appsflyer/internal/AFg1xSDK;", "values", "Lut/g;", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFg1xSDK;)V", "AFa1ySDK"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AFg1zSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    private final AFg1xSDK AFInAppEventType;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private final ut.g AFKeystoreWrapper;

    /* renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final ut.g AFInAppEventParameterName;
    private static final long AFInAppEventType = TimeUnit.HOURS.toSeconds(24);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "values", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1zSDK$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends iu.k implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Boolean mo2invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1zSDK.this.valueOf.AFInAppEventType("com.appsflyer.rc.staging")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "AFKeystoreWrapper", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1zSDK$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends iu.k implements Function0<Boolean> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final Boolean mo2invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1zSDK.this.valueOf.AFInAppEventType("com.appsflyer.rc.sandbox")));
        }
    }

    public AFg1zSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFg1xSDK aFg1xSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        this.valueOf = aFd1sSDK;
        this.AFInAppEventType = aFg1xSDK;
        this.AFInAppEventParameterName = ut.h.a(new AnonymousClass3());
        this.AFKeystoreWrapper = ut.h.a(new AnonymousClass1());
    }

    public final long AFInAppEventType() {
        Object a10;
        String AFInAppEventType2 = this.valueOf.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
        if (AFInAppEventType2 != null) {
            try {
                l.Companion companion = ut.l.INSTANCE;
                a10 = Long.valueOf(Long.parseLong(AFInAppEventType2));
            } catch (Throwable th2) {
                l.Companion companion2 = ut.l.INSTANCE;
                a10 = ut.n.a(th2);
            }
            Throwable a11 = ut.l.a(a10);
            if (a11 != null) {
                StringBuilder sb2 = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
                sb2.append(a11.getMessage());
                AFLogger.afErrorLog(sb2.toString(), a11);
                a10 = Long.valueOf(AFInAppEventType);
            }
            return ((Number) a10).longValue();
        }
        return AFInAppEventType;
    }

    public final boolean AFKeystoreWrapper() {
        return ((Boolean) this.AFKeystoreWrapper.getValue()).booleanValue();
    }

    public final boolean values() {
        return ((Boolean) this.AFInAppEventParameterName.getValue()).booleanValue();
    }

    public final boolean AFInAppEventParameterName() {
        AFh1hSDK aFh1hSDK;
        AFi1zSDK aFi1zSDK = this.AFInAppEventType.valueOf;
        if (aFi1zSDK == null) {
            AFg1fSDK.i$default(AFLogger.INSTANCE, AFg1aSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1gSDK aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
        boolean AFInAppEventParameterName = (aFh1gSDK == null || (aFh1hSDK = aFh1gSDK.AFInAppEventType) == null) ? false : aFh1hSDK.AFInAppEventParameterName();
        long currentTimeMillis = System.currentTimeMillis();
        AFg1xSDK aFg1xSDK = this.AFInAppEventType;
        return AFInAppEventParameterName || currentTimeMillis - aFg1xSDK.AFInAppEventType > TimeUnit.SECONDS.toMillis(aFg1xSDK.AFInAppEventParameterName);
    }
}
