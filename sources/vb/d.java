package vb;

import b0.l1;
import b0.o1;
import b0.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.r1;
import t0.t;
import v.r;

/* loaded from: classes.dex */
public final class d extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f37856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f37857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f37859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z10, Function0 function0, boolean z11, Function0 function02) {
        super(3);
        this.f37856a = z10;
        this.f37857b = function0;
        this.f37858c = z11;
        this.f37859d = function02;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        r AnimatedVisibility = (r) obj;
        ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        boolean z10 = this.f37858c;
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(693286680);
        g1.l lVar = g1.l.f16404b;
        l1 a10 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, 0);
        rVar.b0(-1323940314);
        int i10 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t.v0(rVar, a10, c2.k.f7749e);
            t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar, i10, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            q1 q1Var = q1.f2981a;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(16, rVar)), rVar);
            yk.j.f0(this.f37856a, this.f37857b, rVar, 0, 0);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(24, rVar)), rVar);
            iu.j.c(q1Var, z10, null, null, null, null, b1.d.c(-1853272682, new tb.j(this.f37859d, 1), rVar), rVar, 1572870, 30);
            v.e.y(rVar, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
