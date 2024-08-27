package gn;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17522a;

    /* renamed from: b, reason: collision with root package name */
    public final c f17523b;

    public a(Object obj, c cVar) {
        if (obj != null) {
            this.f17522a = obj;
            this.f17523b = cVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f17522a.equals(aVar.f17522a) && this.f17523b.equals(aVar.f17523b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17522a.hashCode() ^ (-721379959)) * 1000003) ^ this.f17523b.hashCode();
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f17522a + ", priority=" + this.f17523b + UrlTreeKt.componentParamSuffix;
    }
}
