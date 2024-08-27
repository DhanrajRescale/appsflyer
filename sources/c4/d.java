package c4;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7942a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7943b;

    public d(Object obj, Object obj2) {
        this.f7942a = obj;
        this.f7943b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.f7942a, this.f7942a) || !c.a(dVar.f7943b, this.f7943b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f7942a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f7943b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f7942a + " " + this.f7943b + UrlTreeKt.componentParamSuffix;
    }
}
