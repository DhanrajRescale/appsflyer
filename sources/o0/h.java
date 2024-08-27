package o0;

import a2.a1;
import a2.l0;
import a2.m0;
import a2.n0;
import a2.o0;
import java.util.ArrayList;
import java.util.List;
import vt.p0;
import vt.y;

/* loaded from: classes.dex */
public final class h implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f29352a = new Object();

    @Override // a2.m0
    public final n0 a(o0 o0Var, List list, long j10) {
        n0 n0;
        n0 n02;
        int i10;
        n0 n03;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            n0 = o0Var.n0(0, 0, p0.d(), e.f29345d);
            return n0;
        }
        if (size != 1) {
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            int i12 = 0;
            while (i12 < size2) {
                i12 = nn.d.d((l0) list.get(i12), j10, arrayList, i12, 1);
            }
            int f10 = y.f(arrayList);
            if (f10 >= 0) {
                int i13 = 0;
                i10 = 0;
                while (true) {
                    a1 a1Var = (a1) arrayList.get(i11);
                    i13 = Math.max(i13, a1Var.f29a);
                    i10 = Math.max(i10, a1Var.f30b);
                    if (i11 == f10) {
                        break;
                    }
                    i11++;
                }
                i11 = i13;
            } else {
                i10 = 0;
            }
            n03 = o0Var.n0(i11, i10, p0.d(), new v.c(3, arrayList));
            return n03;
        }
        a1 E = ((l0) list.get(0)).E(j10);
        n02 = o0Var.n0(E.f29a, E.f30b, p0.d(), new v.f(13, E));
        return n02;
    }
}
