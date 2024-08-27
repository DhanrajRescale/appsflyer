package jr;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final Date f21590g = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f21591a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f21592b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f21593c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f21594d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f21595e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21596f;

    public e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        this.f21592b = jSONObject;
        this.f21593c = date;
        this.f21594d = jSONArray;
        this.f21595e = jSONObject2;
        this.f21596f = j10;
        this.f21591a = jSONObject3;
    }

    public static e a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vj.d] */
    public static vj.d b() {
        ?? obj = new Object();
        obj.f38119c = new JSONObject();
        obj.f38120d = f21590g;
        obj.f38121e = new JSONArray();
        obj.f38118b = new JSONObject();
        obj.f38117a = 0L;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f21591a.toString().equals(((e) obj).f21591a.toString());
    }

    public final int hashCode() {
        return this.f21591a.hashCode();
    }

    public final String toString() {
        return this.f21591a.toString();
    }
}
