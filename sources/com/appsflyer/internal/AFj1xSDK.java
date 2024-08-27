package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\fJ'\u0010\u0007\u001a\u00020\r*\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFj1xSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFh1kSDK;", "p0", "AFInAppEventParameterName", "(Lcom/appsflyer/internal/AFh1kSDK;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "(Ljava/lang/String;Z)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri$Builder;", "p1", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFj1uSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFj1uSDK;", "values", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFj1uSDK;)V", "AFa1tSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFj1xSDK {

    @NotNull
    public static final String AFInAppEventParameterName;

    @NotNull
    public static final String AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f8523d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f8524e;

    @NotNull
    public static final String registerClient;

    @NotNull
    public static String unregisterClient;

    @NotNull
    public static final String valueOf;

    @NotNull
    public static final String values;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f8525w;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    public final AFd1sSDK valueOf;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final AFj1uSDK values;

    static {
        StringBuilder sb2 = new StringBuilder();
        String str = AFb1vSDK.AFInAppEventParameterName;
        sb2.append(str);
        sb2.append("/androidevent?app_id=");
        String obj = sb2.toString();
        f8525w = obj;
        StringBuilder sb3 = new StringBuilder("https://%sattr.%s/api/v");
        sb3.append(obj);
        values = sb3.toString();
        AFInAppEventParameterName = "https://%sadrevenue.%s/api/v2/generic/v6.14.0/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.14.0/android?app_id=";
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        AFLogger = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        f8524e = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        registerClient = sb6.toString();
        f8523d = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        StringBuilder sb7 = new StringBuilder("https://%svalidate.%s/api/v");
        sb7.append(str);
        sb7.append("/androidevent?buildnumber=6.14.0&app_id=");
        unregisterClient = sb7.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFj1xSDK(@NotNull AFd1sSDK aFd1sSDK) {
        this(aFd1sSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
    }

    public static Uri.Builder AFInAppEventParameterName(Uri.Builder builder, String str, String str2) {
        if (str != null && str2 != null) {
            builder.appendQueryParameter("af_sig", AFb1lSDK.AFKeystoreWrapper(str2.concat(str), str));
            return builder;
        }
        String str3 = str == null ? "devKey" : PaymentConstants.TIMESTAMP;
        AFLogger.afErrorLog(str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")));
        return builder;
    }

    public static String AFInAppEventType(String str, boolean z10) {
        String str2;
        StringBuilder p10 = da.e.p(str);
        if (!z10) {
            str2 = "&buildnumber=6.14.0";
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        p10.append(str2);
        return p10.toString();
    }

    public static String valueOf() {
        return "https://aps-webhandler.appsflyer.com/api/trigger";
    }

    private AFj1xSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFj1uSDK aFj1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFj1uSDK, "");
        this.valueOf = aFd1sSDK;
        this.values = aFj1uSDK;
    }

    public final String valueOf(String str) {
        StringBuilder p10 = da.e.p(str);
        String d10 = this.valueOf.d();
        String concat = d10 != null ? "&channel=".concat(d10) : null;
        if (concat == null) {
            concat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        p10.append(concat);
        return p10.toString();
    }

    public /* synthetic */ AFj1xSDK(AFd1sSDK aFd1sSDK, AFj1uSDK aFj1uSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, (i10 & 2) != 0 ? new AFj1tSDK() : aFj1uSDK);
    }

    @NotNull
    public final String AFInAppEventParameterName(@NotNull AFh1kSDK p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        if (p02 instanceof AFh1nSDK) {
            return this.values.AFInAppEventParameterName("https://%ssdk-services.%s/validate-android-signature");
        }
        if (p02 instanceof AFh1lSDK) {
            StringBuilder p10 = da.e.p(this.values.AFInAppEventParameterName(unregisterClient));
            p10.append(this.valueOf.valueOf.AFKeystoreWrapper.getPackageName());
            return p10.toString();
        }
        throw new UnsupportedOperationException();
    }
}
