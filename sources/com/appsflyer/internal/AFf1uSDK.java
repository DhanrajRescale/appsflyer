package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.y;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0007\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0014*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J\u000f\u0010\b\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\b\u0010\u0017J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0012\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0013\u0010\u001b\u001a\u00020\u0016X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b#\u0010&R\u001b\u0010\b\u001a\u00020\u00038CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b!\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0005"}, d2 = {"Lcom/appsflyer/internal/AFf1uSDK;", "Lcom/appsflyer/internal/AFe1dSDK;", "Lcom/appsflyer/internal/AFh1uSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "afInfoLog", "()Z", HttpUrl.FRAGMENT_ENCODE_SET, "p0", "AFInAppEventParameterName", "(I)Z", "Landroid/content/Context;", "values", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFf1uSDK$AFa1zSDK;", "p1", "AFInAppEventType", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1uSDK$AFa1zSDK;)Z", "valueOf", "AFKeystoreWrapper", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/appsflyer/internal/AFh1uSDK;Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "()J", "Lcom/appsflyer/internal/AFe1bSDK;", "()Lcom/appsflyer/internal/AFe1bSDK;", "Lcom/appsflyer/internal/AFd1lSDK;", "d", "Lcom/appsflyer/internal/AFd1lSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "AFLogger", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "registerClient", "Lcom/appsflyer/internal/AFd1pSDK;", "unregisterClient", "e", "Lcom/appsflyer/internal/AFh1uSDK;", "Lut/g;", "force", "Lcom/appsflyer/internal/AFd1kSDK;", "<init>", "(Lcom/appsflyer/internal/AFd1kSDK;)V", "AFa1tSDK", "AFa1zSDK"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AFf1uSDK extends AFe1dSDK<AFh1uSDK> {

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK valueOf;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFd1lSDK AFKeystoreWrapper;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFh1uSDK AFInAppEventType;

    /* renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final ut.g AFInAppEventParameterName;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final AFd1pSDK unregisterClient;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @NotNull
    private final ut.g d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1uSDK$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends iu.k implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final Boolean mo2invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1uSDK.this.valueOf.AFInAppEventType("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1uSDK$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends iu.k implements Function0<Long> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final Long mo2invoke() {
            Long h10;
            String AFInAppEventType = AFf1uSDK.this.valueOf.AFInAppEventType("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((AFInAppEventType == null || (h10 = r.h(AFInAppEventType)) == null) ? 1000L : h10.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", HttpUrl.FRAGMENT_ENCODE_SET, "reason", HttpUrl.FRAGMENT_ENCODE_SET, "onSuccess", "kinds", HttpUrl.FRAGMENT_ENCODE_SET, "SDK_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1zSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1uSDK(AFa1zSDK aFa1zSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1zSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFLogger.afWarnLog("Could not fetch GAID using CloudDevSdk: " + reason);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFLogger.afRDLog("CloudDevCallback received onSuccess");
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\f\b\u0002\u0010\u0011\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\f\u001a\u00060\nj\u0002`\u000bHÇ\u0003¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\f\b\u0002\u0010\u0011\u001a\u00060\nj\u0002`\u000bHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u0004R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0010\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\"R\u001e\u0010\u0011\u001a\u00060\nj\u0002`\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b&\u0010'"}, d2 = {"Lcom/appsflyer/internal/AFf1uSDK$AFa1zSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "component1", "()Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "component4", "()Ljava/lang/StringBuilder;", "advertisingId", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "gaidError", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1uSDK$AFa1zSDK;", "other", "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class AFa1zSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1zSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1zSDK copy$default(AFa1zSDK aFa1zSDK, String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aFa1zSDK.advertisingId;
            }
            if ((i10 & 2) != 0) {
                bool = aFa1zSDK.isLimitAdTrackingEnabled;
            }
            if ((i10 & 4) != 0) {
                z10 = aFa1zSDK.advertisingIdWithGps;
            }
            if ((i10 & 8) != 0) {
                sb2 = aFa1zSDK.gaidError;
            }
            return aFa1zSDK.copy(str, bool, z10, sb2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1zSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1zSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) other;
            return Intrinsics.a(this.advertisingId, aFa1zSDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1zSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1zSDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1zSDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z10 = this.advertisingIdWithGps;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return this.gaidError.hashCode() + ((hashCode2 + i10) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z10) {
            this.advertisingIdWithGps = z10;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "AFa1zSDK(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ')';
        }

        public AFa1zSDK(String str, Boolean bool, boolean z10, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z10;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1zSDK(String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(@NotNull AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        AFd1lSDK w10 = aFd1kSDK.w();
        Intrinsics.checkNotNullExpressionValue(w10, "");
        this.AFKeystoreWrapper = w10;
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.valueOf = AFInAppEventType;
        AFd1pSDK level = aFd1kSDK.getLevel();
        Intrinsics.checkNotNullExpressionValue(level, "");
        this.unregisterClient = level;
        this.AFInAppEventType = new AFh1uSDK(null, null, null, null, null, null, null, null, 255, null);
        this.d = ut.h.a(new AnonymousClass2());
        this.AFInAppEventParameterName = ut.h.a(new AnonymousClass1());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001b, B:8:0x002d, B:13:0x0032, B:14:0x0046, B:16:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean AFInAppEventType(android.content.Context r4, com.appsflyer.internal.AFf1uSDK.AFa1zSDK r5) throws java.lang.IllegalStateException {
        /*
            r3 = this;
            r0 = 1
            com.appsflyer.internal.AFb1ySDK$AFa1uSDK r4 = com.appsflyer.internal.AFb1ySDK.values(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r4.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L22
            r5.setAdvertisingId(r1)     // Catch: java.lang.Throwable -> L22
            boolean r4 = r4.valueOf()     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L22
            r5.setLimitAdTrackingEnabled(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r5.getAdvertisingId()     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L24
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L22
            if (r4 != 0) goto L2d
            goto L24
        L22:
            r4 = move-exception
            goto L47
        L24:
            java.lang.StringBuilder r4 = r5.getGaidError()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "emptyOrNull (bypass) |"
            r4.append(r1)     // Catch: java.lang.Throwable -> L22
        L2d:
            kotlin.Unit r4 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L32
            goto L7f
        L32:
            java.lang.StringBuilder r4 = r5.getGaidError()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "gpsAdInfo-null (bypass) |"
            r4.append(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "GpsAdInfo is null (bypass)"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L22
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L47:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to fetch GAID: "
            r1.<init>(r2)
            java.lang.String r2 = r4.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.appsflyer.AFLogger.afErrorLog(r1, r4, r0, r2, r2)
            java.lang.StringBuilder r5 = r5.getGaidError()
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5.append(r0)
            java.lang.String r0 = " |"
            r5.append(r0)
            java.lang.String r5 = r4.getLocalizedMessage()
            if (r5 != 0) goto L7b
            java.lang.String r5 = r4.toString()
        L7b:
            com.appsflyer.AFLogger.afInfoLog(r5)
            r0 = r2
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1uSDK.AFInAppEventType(android.content.Context, com.appsflyer.internal.AFf1uSDK$AFa1zSDK):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[LOOP:0: B:2:0x0003->B:10:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[EDGE_INSN: B:11:0x0030->B:12:0x0030 BREAK  A[LOOP:0: B:2:0x0003->B:10:0x002d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean afInfoLog() {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = r1
        L3:
            if (r0 <= 0) goto L30
            boolean r2 = r4.registerClient()
            r3 = 1
            if (r2 == 0) goto L19
            boolean r2 = r4.AFKeystoreWrapper(r0)
            if (r2 == 0) goto L19
            java.lang.String r2 = "GAID fetched using Samsung Cloud dev SDK"
            com.appsflyer.AFLogger.afRDLog(r2)
        L17:
            r2 = r3
            goto L2b
        L19:
            boolean r2 = r4.AFInAppEventParameterName(r0)
            if (r2 == 0) goto L25
            java.lang.String r2 = "GAID fetched using GMS"
            com.appsflyer.AFLogger.afRDLog(r2)
            goto L17
        L25:
            java.lang.String r2 = "Failed to fetch GAID"
            com.appsflyer.AFLogger.afRDLog(r2)
            r2 = r1
        L2b:
            if (r2 != 0) goto L30
            int r0 = r0 + (-1)
            goto L3
        L30:
            com.appsflyer.internal.AFd1pSDK r0 = r4.unregisterClient
            com.appsflyer.internal.AFh1uSDK r1 = r4.AFInAppEventType
            r0.AFLogger = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1uSDK.afInfoLog():boolean");
    }

    private static boolean e() {
        String obj;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            if (th2 instanceof ClassNotFoundException) {
                obj = "CloudDevSdk not found";
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected exception while checking if running in cloud environment: ");
                sb2.append(th2.getMessage());
                obj = sb2.toString();
            }
            AFLogger.afErrorLog(obj, th2, true);
            return false;
        }
    }

    private final boolean registerClient() {
        return ((Boolean) this.AFInAppEventParameterName.getValue()).booleanValue();
    }

    private static int values(Context p02) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p02);
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th2);
            return -1;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @NotNull
    public final AFe1bSDK AFKeystoreWrapper() {
        AFe1bSDK aFe1bSDK;
        if (this.unregisterClient.valueOf()) {
            AFLogger.afRDLog("QUEUE: Advertising ID collection is disabled. Skipping fetching... ");
            return AFe1bSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Boolean bool = Boolean.FALSE;
        if (y.g(Boolean.valueOf(afInfoLog()), bool, bool).contains(Boolean.TRUE)) {
            aFe1bSDK = AFe1bSDK.SUCCESS;
        } else {
            aFe1bSDK = AFe1bSDK.FAILURE;
        }
        AFd1pSDK aFd1pSDK = this.unregisterClient;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
        StringBuilder sb2 = new StringBuilder("QUEUE: FetchAdvertisingIdTask: took ");
        sb2.append(aFe1mSDK.AFKeystoreWrapper);
        sb2.append("ms");
        AFLogger.afRDLog(sb2.toString());
        aFd1pSDK.values(aFe1mSDK);
        return aFe1bSDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean AFInAppEventParameterName(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Trying to fetch GAID..."
            com.appsflyer.AFLogger.afInfoLog(r0)
            com.appsflyer.internal.AFf1uSDK$AFa1zSDK r0 = new com.appsflyer.internal.AFf1uSDK$AFa1zSDK
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.appsflyer.internal.AFd1lSDK r1 = r8.AFKeystoreWrapper
            android.content.Context r1 = r1.AFKeystoreWrapper
            kotlin.jvm.internal.Intrinsics.c(r1)
            int r1 = values(r1)
            com.appsflyer.internal.AFd1lSDK r2 = r8.AFKeystoreWrapper
            android.content.Context r2 = r2.AFKeystoreWrapper
            kotlin.jvm.internal.Intrinsics.c(r2)
            boolean r2 = r8.valueOf(r2, r0)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L7d
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = "enableGpsFallback"
            boolean r2 = r2.getBoolean(r5, r4)
            if (r2 == 0) goto L47
            com.appsflyer.internal.AFd1lSDK r2 = r8.AFKeystoreWrapper
            android.content.Context r2 = r2.AFKeystoreWrapper
            kotlin.jvm.internal.Intrinsics.c(r2)
            boolean r2 = r8.AFInAppEventType(r2, r0)
            if (r2 == 0) goto L47
            r2 = r4
            goto L48
        L47:
            r2 = r3
        L48:
            java.lang.StringBuilder r5 = r0.getGaidError()
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L75
            boolean r6 = kotlin.text.w.C(r5)
            if (r6 == 0) goto L59
            goto L75
        L59:
            java.lang.CharSequence r5 = kotlin.text.w.X(r5)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = ": "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L75:
            com.appsflyer.internal.AFh1uSDK r1 = r8.AFInAppEventType
            values(r1, r5)
            if (r2 != 0) goto L7d
            return r3
        L7d:
            com.appsflyer.internal.AFh1uSDK r1 = r8.AFInAppEventType
            java.lang.String r2 = r0.getAdvertisingId()
            r1.values = r2
            java.lang.Boolean r2 = r0.isLimitAdTrackingEnabled()
            r1.registerClient = r2
            java.lang.Boolean r2 = r0.isLimitAdTrackingEnabled()
            if (r2 == 0) goto L9b
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L9c
        L9b:
            r2 = 0
        L9c:
            r1.AFInAppEventParameterName = r2
            boolean r0 = r0.getAdvertisingIdWithGps()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.AFInAppEventType = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.valueOf = r0
            r0 = 2
            if (r9 == r0) goto Lb0
            r3 = r4
        Lb0:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r1.unregisterClient = r9
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1uSDK.AFInAppEventParameterName(int):boolean");
    }

    private final boolean valueOf(Context p02, AFa1zSDK p12) throws IllegalStateException {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p02);
            if (advertisingIdInfo != null) {
                p12.setAdvertisingId(advertisingIdInfo.getId());
                p12.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p12.setAdvertisingIdWithGps(true);
                String advertisingId = p12.getAdvertisingId();
                if (advertisingId != null) {
                    if (advertisingId.length() == 0) {
                    }
                    unit = Unit.f23355a;
                }
                p12.getGaidError().append("emptyOrNull |");
                unit = Unit.f23355a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null".toString());
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Google Play Services is missing ");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
            return false;
        }
    }

    private static void values(AFh1uSDK aFh1uSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1uSDK.AFKeystoreWrapper;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" | ");
            sb2.append(str);
            String obj = sb2.toString();
            if (obj != null) {
                str = obj;
            }
        }
        aFh1uSDK.AFKeystoreWrapper = str;
    }

    private final boolean AFKeystoreWrapper(int p02) {
        return valueOf(p02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        values(r9.AFInAppEventType, r0.getGaidError().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b7, code lost:
    
        r2 = r0.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c1, code lost:
    
        if (r2.length() != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        r2 = r9.AFInAppEventType;
        r2.values = r0.getAdvertisingId();
        r0 = java.lang.Boolean.FALSE;
        r2.registerClient = r0;
        r4 = java.lang.Boolean.TRUE;
        r2.AFInAppEventParameterName = r4;
        r2.AFInAppEventType = r0;
        r2.valueOf = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d9, code lost:
    
        if (r10 == 2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dc, code lost:
    
        r2.unregisterClient = java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r0.getGaidError().length() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
    
        if (r0.getGaidError().length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean valueOf(int r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1uSDK.valueOf(int):boolean");
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return ((Number) this.d.getValue()).longValue();
    }
}
