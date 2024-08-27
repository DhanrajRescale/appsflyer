package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ut.l;
import vt.i0;

/* loaded from: classes.dex */
public final class AFh1gSDK {
    public AFh1hSDK AFInAppEventType;
    public final AFh1eSDK AFKeystoreWrapper;
    public final AFh1fSDK valueOf;

    public AFh1gSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.AFInAppEventType = AFKeystoreWrapper(jSONObject);
        this.valueOf = valueOf(jSONObject);
        this.AFKeystoreWrapper = AFInAppEventType(jSONObject);
    }

    private static AFh1eSDK AFInAppEventType(JSONObject jSONObject) {
        Object a10;
        Object obj = null;
        try {
            l.Companion companion = ut.l.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "meta_data");
            if (AFKeystoreWrapper != null) {
                a10 = new AFh1eSDK(AFKeystoreWrapper.optDouble("send_rate", 1.0d));
            } else {
                a10 = null;
            }
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        if (!(a10 instanceof ut.m)) {
            obj = a10;
        }
        return (AFh1eSDK) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static AFh1hSDK AFKeystoreWrapper(JSONObject jSONObject) {
        Object a10;
        i0 i0Var;
        try {
            l.Companion companion = ut.l.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "r_debugger");
            if (AFKeystoreWrapper != null) {
                long j10 = AFKeystoreWrapper.getLong("ttl");
                int i10 = AFKeystoreWrapper.getInt("counter");
                String optString = AFKeystoreWrapper.optString("app_ver", HttpUrl.FRAGMENT_ENCODE_SET);
                String optString2 = AFKeystoreWrapper.optString("sdk_ver", HttpUrl.FRAGMENT_ENCODE_SET);
                float optDouble = (float) AFKeystoreWrapper.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFKeystoreWrapper.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = optJSONArray.getString(i11);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                    i0Var = arrayList;
                } else {
                    i0Var = i0.f38321a;
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                a10 = new AFh1hSDK(j10, optDouble, i0Var, i10, optString, optString2);
            } else {
                a10 = null;
            }
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        l.Companion companion3 = ut.l.INSTANCE;
        return (AFh1hSDK) (a10 instanceof ut.m ? null : a10);
    }

    private static AFh1fSDK valueOf(JSONObject jSONObject) {
        Object a10;
        Object obj = null;
        try {
            l.Companion companion = ut.l.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "exc_mngr");
            if (AFKeystoreWrapper != null) {
                a10 = new AFh1fSDK(AFKeystoreWrapper.getString("sdk_ver"), AFKeystoreWrapper.optInt("min", -1), AFKeystoreWrapper.optInt("expire", -1), AFKeystoreWrapper.optLong("ttl", -1L));
            } else {
                a10 = null;
            }
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        if (!(a10 instanceof ut.m)) {
            obj = a10;
        }
        return (AFh1fSDK) obj;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.a(AFh1gSDK.class, cls)) {
            return false;
        }
        if (obj != null) {
            AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
            if (Intrinsics.a(this.valueOf, aFh1gSDK.valueOf) && Intrinsics.a(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.a(this.AFInAppEventType, aFh1gSDK.AFInAppEventType)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
    }

    public final int hashCode() {
        int i10;
        int i11;
        AFh1fSDK aFh1fSDK = this.valueOf;
        int i12 = 0;
        if (aFh1fSDK != null) {
            i10 = aFh1fSDK.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        AFh1eSDK aFh1eSDK = this.AFKeystoreWrapper;
        if (aFh1eSDK != null) {
            i11 = aFh1eSDK.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        AFh1hSDK aFh1hSDK = this.AFInAppEventType;
        if (aFh1hSDK != null) {
            i12 = aFh1hSDK.hashCode();
        }
        return i14 + i12;
    }

    private static JSONObject AFKeystoreWrapper(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
