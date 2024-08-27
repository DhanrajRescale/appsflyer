package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.y;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\f\u001a\u00020\tX\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\r\u001a\u00020\tX\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFd1sSDK;", "valueOf", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1qSDK;", "values", "Lcom/appsflyer/internal/AFd1qSDK;", "e", HttpUrl.FRAGMENT_ENCODE_SET, "registerClient", "Lut/g;", "AFKeystoreWrapper", "AFInAppEventParameterName", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "AFInAppEventType", "()Ljava/lang/String;", "unregisterClient", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFd1qSDK;)V", "AFa1zSDK"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AFe1gSDK {

    /* renamed from: e, reason: collision with root package name */
    private static AFe1kSDK f8430e;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final ut.g AFInAppEventParameterName;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final ut.g AFKeystoreWrapper;

    @NotNull
    private final AFd1sSDK valueOf;

    /* renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final AFd1qSDK e;

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String AFInAppEventType = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String AFInAppEventParameterName = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final List<String> f8429d = y.g("googleplay", "playstore", "googleplaystore");

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends iu.k implements Function0<String> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final String mo2invoke() {
            String AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper(AFe1gSDK.this.e, AFe1gSDK.this.valueOf.d());
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (AFKeystoreWrapper != null && !w.C(AFKeystoreWrapper)) {
                String obj = w.X(AFKeystoreWrapper).toString();
                List<String> AFInAppEventParameterName = Companion.AFInAppEventParameterName();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = obj.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (!AFInAppEventParameterName.contains(lowerCase)) {
                    AFKeystoreWrapper = "-".concat(obj);
                } else {
                    String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "");
                    AFLogger.afWarnLog(format);
                    AFKeystoreWrapper = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
            if (AFKeystoreWrapper != null) {
                str = AFKeystoreWrapper;
            }
            return w.X(str).toString();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventParameterName", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends iu.k implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final String mo2invoke() {
            String packageName = AFe1gSDK.this.valueOf.valueOf.AFKeystoreWrapper.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1gSDK.valueOf(packageName, AFe1gSDK.AFKeystoreWrapper(AFe1gSDK.this));
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFe1eSDK.values().length];
            iArr[AFe1eSDK.DEFAULT.ordinal()] = 1;
            iArr[AFe1eSDK.API.ordinal()] = 2;
            iArr[AFe1eSDK.RC.ordinal()] = 3;
            AFInAppEventType = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b@\u0007X\u0087\n¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u0006\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK$AFa1zSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "d", "Ljava/util/List;", "AFInAppEventParameterName", "()Ljava/util/List;", "AFInAppEventType", "Ljava/lang/String;", "valueOf", "Lcom/appsflyer/internal/AFe1kSDK;", "e", "Lcom/appsflyer/internal/AFe1kSDK;", "(Lcom/appsflyer/internal/AFe1kSDK;)V", "values", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1gSDK$AFa1zSDK, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static List<String> AFInAppEventParameterName() {
            return AFe1gSDK.f8429d;
        }

        public static void AFInAppEventParameterName(AFe1kSDK aFe1kSDK) {
            AFe1gSDK.f8430e = aFe1kSDK;
        }
    }

    public AFe1gSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.valueOf = aFd1sSDK;
        this.e = aFd1qSDK;
        this.AFKeystoreWrapper = ut.h.a(new AnonymousClass3());
        this.AFInAppEventParameterName = ut.h.a(new AnonymousClass5());
    }

    public static final /* synthetic */ String AFKeystoreWrapper(AFe1gSDK aFe1gSDK) {
        return (String) aFe1gSDK.AFKeystoreWrapper.getValue();
    }

    public static final void valueOf(AFe1kSDK aFe1kSDK) {
        Companion.AFInAppEventParameterName(aFe1kSDK);
    }

    @NotNull
    public final String AFInAppEventType() {
        AFe1eSDK aFe1eSDK;
        String str;
        if (valueOf()) {
            aFe1eSDK = AFe1eSDK.DEFAULT;
        } else {
            aFe1eSDK = AFe1eSDK.API;
        }
        int i10 = AFa1ySDK.AFInAppEventType[aFe1eSDK.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                throw new NoWhenBranchMatchedException();
            }
            AFe1kSDK aFe1kSDK = f8430e;
            if (aFe1kSDK != null) {
                str = aFe1kSDK.valueOf;
            } else {
                str = null;
            }
            if (str == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return str;
        }
        return (String) this.AFInAppEventParameterName.getValue();
    }

    public static boolean valueOf() {
        return f8430e == null;
    }

    @NotNull
    public final String AFInAppEventParameterName() {
        AFe1eSDK aFe1eSDK;
        if (valueOf()) {
            aFe1eSDK = AFe1eSDK.DEFAULT;
        } else {
            aFe1eSDK = AFe1eSDK.API;
        }
        int i10 = AFa1ySDK.AFInAppEventType[aFe1eSDK.ordinal()];
        if (i10 == 1) {
            return "appsflyersdk.com";
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1kSDK aFe1kSDK = f8430e;
        String str = aFe1kSDK != null ? aFe1kSDK.values : null;
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    public static final /* synthetic */ String valueOf(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str2);
        String obj = sb3.toString();
        Intrinsics.checkNotNullParameter(obj, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = obj.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, HttpUrl.FRAGMENT_ENCODE_SET).substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        sb2.append(substring);
        sb2.append('-');
        return sb2.toString();
    }
}
