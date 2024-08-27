package d0;

import y.d2;

/* loaded from: classes.dex */
public interface g0 {
    default float a() {
        int i10;
        int i11;
        c0.e eVar = (c0.e) this;
        d2 d2Var = eVar.f7487c;
        int i12 = eVar.f7485a;
        switch (i12) {
            case 0:
                i10 = ((c0.m0) d2Var).f7533d.f7489b.i();
                break;
            default:
                i10 = ((e0.j0) d2Var).f14720f;
                break;
        }
        switch (i12) {
            case 0:
                i11 = ((c0.m0) d2Var).f7533d.f7488a.i();
                break;
            default:
                i11 = ((e0.j0) d2Var).f14719e;
                break;
        }
        return (i11 * 500) + i10;
    }
}
