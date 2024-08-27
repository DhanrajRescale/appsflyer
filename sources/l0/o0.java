package l0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o0 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f23799a = new Object();

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        a2.n0 n0;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        int i10 = 0;
        while (i10 < size) {
            i10 = nn.d.d((a2.l0) list.get(i10), j10, arrayList, i10, 1);
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i11 = 0; i11 < size2; i11++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((a2.a1) arrayList.get(i11)).f29a));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((a2.a1) arrayList.get(i12)).f30b));
        }
        n0 = o0Var.n0(intValue, num.intValue(), vt.p0.d(), new v.c(2, arrayList));
        return n0;
    }
}
