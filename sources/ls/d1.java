package ls;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hypersdk.analytics.LogConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25175a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25176b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25177c;

    /* renamed from: d, reason: collision with root package name */
    public final Number f25178d;

    /* renamed from: e, reason: collision with root package name */
    public final Number f25179e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25180f;

    public d1(int i10, Object obj, Number number, Number number2, Object obj2, String str) {
        Object obj3;
        Object obj4 = obj2;
        this.f25175a = i10;
        this.f25180f = str;
        this.f25178d = number;
        this.f25179e = number2;
        if (number != null && number2 != null) {
            if (!b(obj)) {
                obj3 = Long.valueOf(Math.min(Math.max(((Number) obj).longValue(), number.longValue()), number2.longValue()));
                el.l.V0("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" with default value " + obj3 + " out of its bounds [" + number + ", " + number2 + "]Tweak \"" + str + "\" new default value: " + obj3 + ".");
            } else {
                obj3 = obj;
            }
            if (!b(obj4)) {
                Long valueOf = Long.valueOf(Math.min(Math.max(((Number) obj4).longValue(), number.longValue()), number2.longValue()));
                el.l.V0("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" with value " + obj3 + " out of its bounds [" + number + ", " + number2 + "]Tweak \"" + str + "\" new value: " + valueOf + ".");
                obj4 = valueOf;
            }
        } else {
            obj3 = obj;
        }
        this.f25177c = obj3;
        this.f25176b = obj4;
    }

    public static d1 a(JSONObject jSONObject) {
        String string;
        String string2;
        Object string3;
        Object string4;
        int i10;
        Object obj;
        Number number;
        Number number2;
        Object obj2;
        int i11;
        Object valueOf;
        Object valueOf2;
        Number number3;
        int i12;
        Number valueOf3;
        try {
            string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            string2 = jSONObject.getString("type");
        } catch (JSONException unused) {
        }
        if ("number".equals(string2)) {
            String string5 = jSONObject.getString("encoding");
            if ("d".equals(string5)) {
                valueOf = Double.valueOf(jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                valueOf2 = Double.valueOf(jSONObject.getDouble(LogConstants.DEFAULT_CHANNEL));
                if (!jSONObject.isNull("minimum")) {
                    number3 = Double.valueOf(jSONObject.getDouble("minimum"));
                } else {
                    number3 = null;
                }
                i12 = 2;
                if (!jSONObject.isNull("maximum")) {
                    valueOf3 = Double.valueOf(jSONObject.getDouble("maximum"));
                    obj2 = valueOf;
                    obj = valueOf2;
                    number = number3;
                    i11 = i12;
                    number2 = valueOf3;
                }
                valueOf3 = null;
                obj2 = valueOf;
                obj = valueOf2;
                number = number3;
                i11 = i12;
                number2 = valueOf3;
            } else {
                if (!"l".equals(string5)) {
                    return null;
                }
                valueOf = Long.valueOf(jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                valueOf2 = Long.valueOf(jSONObject.getLong(LogConstants.DEFAULT_CHANNEL));
                if (!jSONObject.isNull("minimum")) {
                    number3 = Long.valueOf(jSONObject.getLong("minimum"));
                } else {
                    number3 = null;
                }
                i12 = 3;
                if (!jSONObject.isNull("maximum")) {
                    valueOf3 = Long.valueOf(jSONObject.getLong("maximum"));
                    obj2 = valueOf;
                    obj = valueOf2;
                    number = number3;
                    i11 = i12;
                    number2 = valueOf3;
                }
                valueOf3 = null;
                obj2 = valueOf;
                obj = valueOf2;
                number = number3;
                i11 = i12;
                number2 = valueOf3;
            }
            return null;
        }
        if ("boolean".equals(string2)) {
            string3 = Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            string4 = Boolean.valueOf(jSONObject.getBoolean(LogConstants.DEFAULT_CHANNEL));
            i10 = 1;
        } else {
            if ("string".equals(string2)) {
                string3 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                string4 = jSONObject.getString(LogConstants.DEFAULT_CHANNEL);
                i10 = 4;
            }
            return null;
        }
        obj = string4;
        number = null;
        number2 = null;
        obj2 = string3;
        i11 = i10;
        return new d1(i11, obj, number, number2, obj2, string);
    }

    public final boolean b(Object obj) {
        Number number = this.f25179e;
        Number number2 = this.f25178d;
        try {
            Number number3 = (Number) obj;
            if (Math.min(Math.max(number3.longValue(), number2.longValue()), number.longValue()) != number2.longValue()) {
                if (Math.min(Math.max(number3.longValue(), number2.longValue()), number.longValue()) == number.longValue()) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return true;
        }
    }
}
