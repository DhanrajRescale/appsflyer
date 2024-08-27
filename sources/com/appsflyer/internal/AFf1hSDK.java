package com.appsflyer.internal;

import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFf1hSDK extends AFf1nSDK<Map<String, String>> {
    private final UUID afErrorLog;
    private String afInfoLog;
    private final AFe1ySDK force;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8448i;
    public AFa1uSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private String f8449v;

    /* renamed from: w, reason: collision with root package name */
    private String f8450w;

    /* loaded from: classes.dex */
    public interface AFa1uSDK {
        void AFKeystoreWrapper(String str);

        void valueOf(Map<String, String> map);
    }

    public AFf1hSDK(@NonNull AFd1kSDK aFd1kSDK, @NonNull UUID uuid, @NonNull Uri uri) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.force = aFd1kSDK.AFInAppEventParameterName();
        this.afErrorLog = uuid;
        boolean z10 = false;
        try {
            if (!AFc1tSDK.values(uri.getHost()) && !AFc1tSDK.values(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1kSDK.afRDLog()};
                    Map<Integer, Object> map = AFc1fSDK.afDebugLog;
                    Object obj = map.get(-1014334364);
                    if (obj == null) {
                        obj = ((Class) AFc1fSDK.valueOf(36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-1) - TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0', 0, 0), (char) TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0))).getDeclaredConstructor(Uri.class, AFc1vSDK.class);
                        map.put(-1014334364, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = map.get(-1905680101);
                        if (obj2 == null) {
                            obj2 = ((Class) AFc1fSDK.valueOf(37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("AFInAppEventType", null);
                            map.put(-1905680101, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = map.get(611290704);
                            if (obj3 == null) {
                                obj3 = ((Class) AFc1fSDK.valueOf(52 - Color.blue(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, (char) (3794 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("AFInAppEventParameterName", null);
                                map.put(611290704, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = map.get(574725959);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFc1fSDK.valueOf((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51, AndroidCharacter.getMirror('0') - 11, (char) (3794 - (TypedValue.complexToFraction(0, s0.g.f34069a, s0.g.f34069a) > s0.g.f34069a ? 1 : (TypedValue.complexToFraction(0, s0.g.f34069a, s0.g.f34069a) == s0.g.f34069a ? 0 : -1))))).getMethod("values", null);
                                    map.put(574725959, obj4);
                                }
                                z10 = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.afInfoLog = split[1];
                                    this.f8449v = split[2];
                                    this.f8450w = uri.toString();
                                }
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    Throwable cause4 = th5.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th5;
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e10);
        }
        this.f8448i = z10;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        AFa1uSDK aFa1uSDK = this.unregisterClient;
        if (aFa1uSDK != null) {
            if (this.values == AFe1bSDK.SUCCESS && (responseNetwork = ((AFf1nSDK) this).registerClient) != null) {
                aFa1uSDK.valueOf((Map) responseNetwork.getBody());
                return;
            }
            Throwable unregisterClient = unregisterClient();
            String str = "Can't get OneLink data";
            if (unregisterClient instanceof ParsingException) {
                if (((ParsingException) unregisterClient).getRawResponse().isSuccessful()) {
                    aFa1uSDK.AFKeystoreWrapper("Can't parse one link data");
                    return;
                }
                String str2 = this.f8450w;
                if (str2 != null) {
                    str = str2;
                }
                aFa1uSDK.AFKeystoreWrapper(str);
                return;
            }
            String str3 = this.f8450w;
            if (str3 != null) {
                str = str3;
            }
            aFa1uSDK.AFKeystoreWrapper(str);
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<Map<String, String>> AFKeystoreWrapper(@NonNull String str) {
        return this.force.AFKeystoreWrapper(this.afInfoLog, this.f8449v, this.afErrorLog, str);
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    public final boolean afInfoLog() {
        return this.f8448i;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    public final boolean v() {
        if (!TextUtils.isEmpty(this.afInfoLog) && !TextUtils.isEmpty(this.f8449v) && !this.afInfoLog.equals("app")) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }
}
