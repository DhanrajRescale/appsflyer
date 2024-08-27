package r1;

import n1.s0;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vt.i0 f32945a = vt.i0.f38321a;

    static {
        int i10 = n1.t.f28178j;
    }

    public static final boolean a(n1.u uVar) {
        if (uVar instanceof n1.m) {
            n1.m mVar = (n1.m) uVar;
            if (s0.b(mVar.f28154c, 5) || s0.b(mVar.f28154c, 3)) {
                return true;
            }
        } else if (uVar == null) {
            return true;
        }
        return false;
    }
}
