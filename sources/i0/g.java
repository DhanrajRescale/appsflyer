package i0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f18886a = new Object();

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        a2.n0 n0;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            i10 = nn.d.d((a2.l0) list.get(i10), j10, arrayList, i10, 1);
        }
        n0 = o0Var.n0(w2.a.h(j10), w2.a.g(j10), vt.p0.d(), new v.c(1, arrayList));
        return n0;
    }
}
