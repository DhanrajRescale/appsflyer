package b2;

import t0.n1;
import t0.o3;
import t0.t;

/* loaded from: classes.dex */
public final class j extends kp.j {

    /* renamed from: e, reason: collision with root package name */
    public final c f3096e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f3097f = t.n0(null, o3.f35116a);

    public j(c cVar) {
        this.f3096e = cVar;
    }

    @Override // kp.j
    public final boolean G(c cVar) {
        return cVar == this.f3096e;
    }

    @Override // kp.j
    public final Object P(i iVar) {
        boolean z10;
        if (iVar == this.f3096e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object value = this.f3097f.getValue();
            if (value == null) {
                return null;
            }
            return value;
        }
        t.C0("Check failed.");
        throw null;
    }
}
