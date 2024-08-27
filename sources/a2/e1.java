package a2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e1 extends c2.g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f58b = new c2.g0("Undefined intrinsics block and it is required");

    @Override // a2.m0
    public final n0 a(o0 o0Var, List list, long j10) {
        n0 n0;
        n0 n02;
        n0 n03;
        if (list.isEmpty()) {
            n03 = o0Var.n0(w2.a.j(j10), w2.a.i(j10), vt.p0.d(), x.f130d);
            return n03;
        }
        if (list.size() == 1) {
            a1 E = ((l0) list.get(0)).E(j10);
            n02 = o0Var.n0(hl.f.L(E.f29a, j10), hl.f.K(E.f30b, j10), vt.p0.d(), new v.f(15, E));
            return n02;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            i10 = nn.d.d((l0) list.get(i10), j10, arrayList, i10, 1);
        }
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            a1 a1Var = (a1) arrayList.get(i13);
            i11 = Math.max(a1Var.f29a, i11);
            i12 = Math.max(a1Var.f30b, i12);
        }
        n0 = o0Var.n0(hl.f.L(i11, j10), hl.f.K(i12, j10), vt.p0.d(), new v.c(5, arrayList));
        return n0;
    }
}
