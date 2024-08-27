package pl;

import android.os.Build;
import bl.j;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f31158a;

    /* renamed from: b, reason: collision with root package name */
    public a f31159b;

    /* renamed from: c, reason: collision with root package name */
    public JSONArray f31160c;

    /* renamed from: d, reason: collision with root package name */
    public String f31161d;

    /* renamed from: e, reason: collision with root package name */
    public String f31162e;

    /* renamed from: f, reason: collision with root package name */
    public String f31163f;

    /* renamed from: g, reason: collision with root package name */
    public Long f31164g;

    public final boolean a() {
        int i10;
        a aVar = this.f31159b;
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = b.f31157a[aVar.ordinal()];
        }
        Long l10 = this.f31164g;
        if (i10 != 1) {
            String str = this.f31163f;
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || str == null || l10 == null) {
                    return false;
                }
            } else if (str == null || this.f31162e == null || l10 == null) {
                return false;
            }
        } else if (this.f31160c == null || l10 == null) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (!a()) {
            return;
        }
        j.Z(this.f31158a, toString());
    }

    public final String toString() {
        int i10;
        a aVar = this.f31159b;
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = b.f31157a[aVar.ordinal()];
        }
        Long l10 = this.f31164g;
        JSONObject jSONObject = null;
        try {
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("device_os_version", Build.VERSION.RELEASE);
                    jSONObject2.put("device_model", Build.MODEL);
                    String str = this.f31161d;
                    if (str != null) {
                        jSONObject2.put("app_version", str);
                    }
                    if (l10 != null) {
                        jSONObject2.put(PaymentConstants.TIMESTAMP, l10);
                    }
                    String str2 = this.f31162e;
                    if (str2 != null) {
                        jSONObject2.put("reason", str2);
                    }
                    String str3 = this.f31163f;
                    if (str3 != null) {
                        jSONObject2.put("callstack", str3);
                    }
                    if (aVar != null) {
                        jSONObject2.put("type", aVar);
                    }
                    jSONObject = jSONObject2;
                }
            } else {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = this.f31160c;
                if (jSONArray != null) {
                    jSONObject3.put("feature_names", jSONArray);
                }
                if (l10 != null) {
                    jSONObject3.put(PaymentConstants.TIMESTAMP, l10);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String jSONObject4 = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject4, "JSONObject().toString()");
            return jSONObject4;
        }
        String jSONObject5 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject5, "params.toString()");
        return jSONObject5;
    }
}
