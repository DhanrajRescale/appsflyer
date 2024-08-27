package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.s;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\u0006X\u0086\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0012\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "Lorg/json/JSONObject;", "AFKeystoreWrapper", "()Lorg/json/JSONObject;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "valueOf", "I", "AFInAppEventParameterName", "values", "Ljava/lang/String;", "AFInAppEventType", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFd1fSDK {

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final String AFInAppEventType;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final String values;

    /* renamed from: valueOf, reason: from kotlin metadata */
    int AFInAppEventParameterName;

    /* renamed from: values, reason: from kotlin metadata */
    @NotNull
    final String AFKeystoreWrapper;

    public AFd1fSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.values = str;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventType = str3;
        this.AFInAppEventParameterName = i10;
    }

    @NotNull
    public final JSONObject AFKeystoreWrapper() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.values);
        jSONObject.put("hash_name", this.AFKeystoreWrapper);
        jSONObject.put("st", this.AFInAppEventType);
        jSONObject.put("c", String.valueOf(this.AFInAppEventParameterName));
        return jSONObject;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFd1fSDK)) {
            return false;
        }
        AFd1fSDK aFd1fSDK = (AFd1fSDK) p02;
        return Intrinsics.a(this.values, aFd1fSDK.values) && Intrinsics.a(this.AFKeystoreWrapper, aFd1fSDK.AFKeystoreWrapper) && Intrinsics.a(this.AFInAppEventType, aFd1fSDK.AFInAppEventType) && this.AFInAppEventParameterName == aFd1fSDK.AFInAppEventParameterName;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFInAppEventParameterName) + ((this.AFInAppEventType.hashCode() + ((this.AFKeystoreWrapper.hashCode() + (this.values.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFd1fSDK(values=");
        sb2.append(this.values);
        sb2.append(", AFKeystoreWrapper=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", AFInAppEventType=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK$AFa1vSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFd1fSDK;", "valueOf", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1fSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1fSDK$AFa1vSDK, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean AFInAppEventType(Integer p02, String... p12) {
            boolean z10 = p02 == null;
            int length = p12.length;
            for (int i10 = 0; i10 < 3; i10++) {
                String str = p12[i10];
                z10 = z10 || str == null || str.length() == 0;
            }
            return z10;
        }

        public static AFd1fSDK valueOf(@NotNull String p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            List<String> P = w.P(p02, new String[]{"\n"}, 0, 6);
            if (P.size() != 4) {
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            for (String str4 : P) {
                if (s.r(str4, "label=", false)) {
                    str = AFInAppEventType(str4, "label=");
                } else if (s.r(str4, "hashName=", false)) {
                    str2 = AFInAppEventType(str4, "hashName=");
                } else if (s.r(str4, "stackTrace=", false)) {
                    str3 = AFInAppEventType(str4, "stackTrace=");
                } else {
                    if (!s.r(str4, "c=", false)) {
                        break;
                    }
                    String substring = str4.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(w.X(substring).toString()));
                }
            }
            if (AFInAppEventType(num, str, str2, str3)) {
                return null;
            }
            Intrinsics.c(str);
            Intrinsics.c(str2);
            Intrinsics.c(str3);
            Intrinsics.c(num);
            return new AFd1fSDK(str, str2, str3, num.intValue());
        }

        private static String AFInAppEventType(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = w.X(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }
    }

    public /* synthetic */ AFd1fSDK(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? 1 : i10);
    }
}
