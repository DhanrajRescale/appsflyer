package ss;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f34766a;

    public a() {
        JSONObject jSONObject = new JSONObject();
        this.f34766a = jSONObject;
        a(0, "autoplay");
        a(0, "mute");
        a(0, "controls");
        a(1, "enablejsapi");
        a(0, "fs");
        try {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "https://www.youtube.com");
            a(0, "rel");
            a(0, "showinfo");
            a(3, "iv_load_policy");
            a(1, "modestbranding");
            a(0, "cc_load_policy");
        } catch (JSONException unused) {
            throw new RuntimeException("Illegal JSON value origin: https://www.youtube.com");
        }
    }

    public final void a(int i10, String str) {
        try {
            this.f34766a.put(str, i10);
        } catch (JSONException unused) {
            throw new RuntimeException("Illegal JSON value " + str + ": " + i10);
        }
    }
}
