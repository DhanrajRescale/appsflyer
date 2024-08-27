package os;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f30372a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f30373b;

    /* renamed from: c, reason: collision with root package name */
    public final ns.d f30374c;

    public s(String str, JSONObject jSONObject, ns.d dVar) {
        this.f30372a = str;
        this.f30373b = jSONObject;
        this.f30374c = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s) || obj.hashCode() != this.f30372a.hashCode()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f30372a.hashCode();
    }
}
