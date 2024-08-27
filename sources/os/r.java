package os;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f30368a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30369b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f30370c;

    /* renamed from: d, reason: collision with root package name */
    public final ns.d f30371d;

    public r(String str, String str2, JSONObject jSONObject, ns.d dVar) {
        this.f30368a = str;
        this.f30369b = str2;
        this.f30370c = jSONObject;
        this.f30371d = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r) || obj.hashCode() != this.f30368a.hashCode()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f30368a.hashCode();
    }
}
