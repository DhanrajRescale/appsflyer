package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\tR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "AFKeystoreWrapper", "(Ljava/lang/String;)Z", "p1", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/Object;)V", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventParameterName", "Ljava/util/Map;", "AFInAppEventType", "Lcom/appsflyer/internal/AFc1kSDK;", "values", "Lcom/appsflyer/internal/AFc1kSDK;", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFc1kSDK;)V", "AFa1uSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFc1oSDK {

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> AFInAppEventType;

    /* renamed from: values, reason: from kotlin metadata */
    public final AFc1kSDK AFInAppEventParameterName;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK$AFa1uSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFa1qSDK;", "p0", "Lcom/appsflyer/internal/AFc1oSDK;", "valueOf", "(Lcom/appsflyer/internal/AFa1qSDK;)Lcom/appsflyer/internal/AFc1oSDK;", "Lcom/appsflyer/internal/AFc1kSDK;", "values", "(Lcom/appsflyer/internal/AFc1kSDK;)Lcom/appsflyer/internal/AFc1oSDK;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1oSDK$AFa1uSDK, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static AFc1oSDK valueOf(@NotNull AFa1qSDK p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            Map<String, Object> AFInAppEventParameterName = p02.AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            return new AFc1oSDK(AFInAppEventParameterName, null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public static AFc1oSDK values(@NotNull AFc1kSDK p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            return new AFc1oSDK(new LinkedHashMap(), p02, null);
        }
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1kSDK aFc1kSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1kSDK);
    }

    @NotNull
    public static final AFc1oSDK AFInAppEventParameterName(@NotNull AFa1qSDK aFa1qSDK) {
        return Companion.valueOf(aFa1qSDK);
    }

    @NotNull
    public static final AFc1oSDK AFKeystoreWrapper(@NotNull AFc1kSDK aFc1kSDK) {
        return Companion.values(aFc1kSDK);
    }

    private AFc1oSDK(Map<String, Object> map, AFc1kSDK aFc1kSDK) {
        this.AFInAppEventType = map;
        this.AFInAppEventParameterName = aFc1kSDK;
    }

    public final void AFKeystoreWrapper(@NotNull String p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        this.AFInAppEventType.put(p02, p12);
        AFc1kSDK aFc1kSDK = this.AFInAppEventParameterName;
        if (aFc1kSDK != null) {
            aFc1kSDK.values(this.AFInAppEventType);
        }
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1kSDK aFc1kSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? null : aFc1kSDK);
    }

    public final boolean AFKeystoreWrapper(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        return this.AFInAppEventType.containsKey(p02);
    }
}
