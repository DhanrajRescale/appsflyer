package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final long f11792d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f11793a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11794b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11795c;

    public v(String str, String str2, long j10) {
        this.f11793a = str;
        this.f11794b = str2;
        this.f11795c = j10;
    }

    public static String a(String str, long j10, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(PaymentConstants.TIMESTAMP, j10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    public static v b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(UrlTreeKt.componentParamPrefix)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new v(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(PaymentConstants.TIMESTAMP));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }
        return new v(str, null, 0L);
    }
}
