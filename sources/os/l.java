package os;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f30352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30353b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30354c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30355d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30356e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30357f;

    public l(int i10, String str, int i11, String str2, int i12, String str3) {
        this.f30352a = i10;
        this.f30353b = str;
        this.f30354c = i11;
        this.f30355d = i12;
        this.f30356e = str2;
        this.f30357f = str3;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f30352a == 1) {
                jSONObject.put("prefix", "shortest");
            }
            String str = this.f30353b;
            if (str != null) {
                jSONObject.put("view_class", str);
            }
            int i10 = this.f30354c;
            if (i10 > -1) {
                jSONObject.put("index", i10);
            }
            int i11 = this.f30355d;
            if (i11 > -1) {
                jSONObject.put("id", i11);
            }
            String str2 = this.f30356e;
            if (str2 != null) {
                jSONObject.put("contentDescription", str2);
            }
            String str3 = this.f30357f;
            if (str3 != null) {
                jSONObject.put("tag", str3);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException("Can't serialize PathElement to String", e10);
        }
    }
}
