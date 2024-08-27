package kn;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import jr.h;
import w.k;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23265a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23266b;

    public a(int i10, long j10) {
        if (i10 != 0) {
            this.f23265a = i10;
            this.f23266b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (k.b(this.f23265a, aVar.f23265a) && this.f23266b == aVar.f23266b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int e10 = (k.e(this.f23265a) ^ 1000003) * 1000003;
        long j10 = this.f23266b;
        return e10 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(h.z(this.f23265a));
        sb2.append(", nextRequestWaitMillis=");
        return a3.a.j(sb2, this.f23266b, UrlTreeKt.componentParamSuffix);
    }
}
