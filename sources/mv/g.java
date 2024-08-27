package mv;

import hv.r;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends h implements Serializable {
    private static final long serialVersionUID = -8733721350312276297L;

    /* renamed from: a, reason: collision with root package name */
    public final r f28103a;

    public g(r rVar) {
        this.f28103a = rVar;
    }

    @Override // mv.h
    public final r a(hv.e eVar) {
        return this.f28103a;
    }

    @Override // mv.h
    public final e b(hv.g gVar) {
        return null;
    }

    @Override // mv.h
    public final List c(hv.g gVar) {
        return Collections.singletonList(this.f28103a);
    }

    @Override // mv.h
    public final boolean d(hv.e eVar) {
        return false;
    }

    @Override // mv.h
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z10 = obj instanceof g;
        r rVar = this.f28103a;
        if (z10) {
            return rVar.equals(((g) obj).f28103a);
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (bVar.e() && rVar.equals(bVar.a(hv.e.f18716c))) {
            return true;
        }
        return false;
    }

    @Override // mv.h
    public final boolean f(hv.g gVar, r rVar) {
        return this.f28103a.equals(rVar);
    }

    public final int hashCode() {
        int i10 = this.f28103a.f18764b;
        return ((i10 + 31) ^ (i10 + 31)) ^ 1;
    }

    public final String toString() {
        return "FixedRules:" + this.f28103a;
    }
}
