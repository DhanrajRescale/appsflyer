package b0;

import com.google.android.gms.common.api.Api;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f2926a = new d0(g1.a.f16388j);

    public static final int a(List list, hu.c cVar, hu.c cVar2, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (list.isEmpty()) {
            return 0;
        }
        Object x10 = vt.g0.x(0, list);
        a2.q qVar = (a2.q) x10;
        if (qVar != null) {
            i14 = ((Number) cVar2.b(qVar, 0, Integer.valueOf(i10))).intValue();
        } else {
            i14 = 0;
        }
        if (qVar != null) {
            i15 = ((Number) cVar.b(qVar, 0, Integer.valueOf(i14))).intValue();
        } else {
            i15 = 0;
        }
        int size = list.size();
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i19 < size) {
            Intrinsics.c(x10);
            i18 -= i15;
            int max = Math.max(i21, i14);
            i19++;
            Object x11 = vt.g0.x(i19, list);
            a2.q qVar2 = (a2.q) x11;
            if (qVar2 != null) {
                i16 = ((Number) cVar2.b(qVar2, Integer.valueOf(i19), Integer.valueOf(i10))).intValue();
            } else {
                i16 = 0;
            }
            if (qVar2 != null) {
                i17 = ((Number) cVar.b(qVar2, Integer.valueOf(i19), Integer.valueOf(i16))).intValue() + i11;
            } else {
                i17 = 0;
            }
            if (i18 >= 0 && i19 != list.size()) {
                if (i19 - i22 != i13 && i18 - i17 >= 0) {
                    int i23 = i16;
                    i21 = max;
                    x10 = x11;
                    i15 = i17;
                    i14 = i23;
                }
            }
            i20 += max + i12;
            i17 -= i11;
            i18 = i10;
            max = 0;
            i22 = i19;
            int i232 = i16;
            i21 = max;
            x10 = x11;
            i15 = i17;
            i14 = i232;
        }
        return i20 - i12;
    }

    public static final Pair b(a2.l0 l0Var, long j10, Function1 function1) {
        if (androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.a.k(l0Var)) == s0.g.f34069a) {
            androidx.compose.foundation.layout.a.k(l0Var);
            a2.a1 E = l0Var.E(androidx.compose.foundation.layout.a.z(androidx.compose.foundation.layout.a.j(j10, 0, 0, 14), 1));
            function1.invoke(E);
            return new Pair(Integer.valueOf(E.f29a), Integer.valueOf(E.f30b));
        }
        int z10 = l0Var.z(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return new Pair(Integer.valueOf(z10), Integer.valueOf(l0Var.W(z10)));
    }

    public static final o0 c(i iVar, t0.n nVar) {
        f fVar = n.f2937c;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1479255111);
        rVar.b0(-2434581);
        boolean h10 = rVar.h(fVar) | rVar.h(iVar) | rVar.f(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        Object Q = rVar.Q();
        if (h10 || Q == t0.m.f35080a) {
            Q = new o0(iVar, iVar.f2874d, f2926a, 0);
            rVar.k0(Q);
        }
        o0 o0Var = (o0) Q;
        rVar.s(false);
        rVar.s(false);
        return o0Var;
    }
}
