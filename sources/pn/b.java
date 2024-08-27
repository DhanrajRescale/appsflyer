package pn;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f31231a;

    /* renamed from: b, reason: collision with root package name */
    public final jn.i f31232b;

    /* renamed from: c, reason: collision with root package name */
    public final jn.h f31233c;

    public b(long j10, jn.i iVar, jn.h hVar) {
        this.f31231a = j10;
        if (iVar != null) {
            this.f31232b = iVar;
            this.f31233c = hVar;
            return;
        }
        throw new NullPointerException("Null transportContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f31231a == bVar.f31231a && this.f31232b.equals(bVar.f31232b) && this.f31233c.equals(bVar.f31233c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f31231a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f31232b.hashCode()) * 1000003) ^ this.f31233c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f31231a + ", transportContext=" + this.f31232b + ", event=" + this.f31233c + UrlTreeKt.componentParamSuffix;
    }
}
