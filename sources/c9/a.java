package c9;

import o8.o;
import y8.k;
import y8.p;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public final int f8062b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8063c = false;

    public a(int i10) {
        this.f8062b = i10;
        if (i10 > 0) {
        } else {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    @Override // c9.e
    public final f a(o oVar, k kVar) {
        if (!(kVar instanceof p)) {
            return new d(oVar, kVar);
        }
        if (((p) kVar).f41408c == p8.f.f30738a) {
            return new d(oVar, kVar);
        }
        return new b(oVar, kVar, this.f8062b, this.f8063c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f8062b == aVar.f8062b && this.f8063c == aVar.f8063c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8063c) + (this.f8062b * 31);
    }
}
