package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 \u00122\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004:\u0001\u0012B#\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1oSDK$29914;", "Ljava/util/HashMap;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/collections/HashMap;", "d", "()Ljava/lang/String;", "Landroid/content/Context;", "AFKeystoreWrapper", "Landroid/content/Context;", "valueOf", HttpUrl.FRAGMENT_ENCODE_SET, "values", "Ljava/util/Map;", "p0", "p1", "<init>", "(Ljava/util/Map;Landroid/content/Context;)V", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\Admin\appsflyer\classes14.dex */
public final class AFd1oSDK$29914 extends HashMap<String, Object> {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    private final Context valueOf;

    @NotNull
    private final Map<String, Object> values;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"com/appsflyer/internal/AFd1oSDK$29914$AFa1zSDK", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "AFKeystoreWrapper", "()Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.appsflyer.internal.AFd1oSDK$29914$AFa1zSDK, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static String AFKeystoreWrapper() {
            return "6.14.0";
        }
    }

    public final Object AFInAppEventParameterName(String str) {
        return super.get(str);
    }

    public final Object AFInAppEventParameterName(String str, Object obj) {
        return super.getOrDefault(str, obj);
    }

    public final Set<String> AFInAppEventParameterName() {
        return super.keySet();
    }

    public final Set<Map.Entry<String, Object>> AFInAppEventType() {
        return super.entrySet();
    }

    public final Collection<Object> AFKeystoreWrapper() {
        return super.values();
    }

    public final boolean AFKeystoreWrapper(String str) {
        return super.containsKey(str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return AFKeystoreWrapper((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return AFInAppEventType();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            return AFInAppEventParameterName((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : AFInAppEventParameterName((String) obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        return AFInAppEventParameterName();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            return values((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && obj2 != null) {
            return values((String) obj, obj2);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return valueOf();
    }

    public final int valueOf() {
        return super.size();
    }

    public final Object values(String str) {
        return super.remove(str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<Object> values() {
        return AFKeystoreWrapper();
    }

    public final boolean values(String str, Object obj) {
        return super.remove(str, obj);
    }

    public AFd1oSDK$29914(@NotNull Map<String, ? extends Object> map, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.values = map;
        this.valueOf = context;
        put("cksm_v3", d());
    }

    private final String d() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(new Regex("-rc.*").replace(Companion.AFKeystoreWrapper(), HttpUrl.FRAGMENT_ENCODE_SET));
            sb2.append((char) 8291);
            sb2.append(this.values.get("appsflyerKey"));
            sb2.append((char) 8291);
            sb2.append(this.values.get("af_timestamp"));
            sb2.append((char) 8291);
            sb2.append("af");
            sb2.append(this.valueOf.getPackageName());
            String obj = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset defaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(defaultCharset, "");
            byte[] bytes = obj.getBytes(defaultCharset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            messageDigest.update(bytes);
            StringBuilder sb3 = new StringBuilder();
            byte[] digest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(digest, "");
            for (byte b10 : digest) {
                String num = Integer.toString((b10 & 255) + 256, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "");
                String substring = num.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "");
                sb3.append(substring);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(HttpUrl.FRAGMENT_ENCODE_SET);
            sb4.append(sb3.substring(0, 16));
            return sb4.toString();
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("getCksmV3Value failed generating value", e10);
            AFLogger.afRDLog("failed generating getCksmV3Value with exception: ".concat(String.valueOf(e10)));
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }
}
