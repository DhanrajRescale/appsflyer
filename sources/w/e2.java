package w;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e2 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final u f38480a;

    /* renamed from: b, reason: collision with root package name */
    public t f38481b;

    /* renamed from: c, reason: collision with root package name */
    public t f38482c;

    /* renamed from: d, reason: collision with root package name */
    public t f38483d;

    public e2(b2 b2Var) {
        this.f38480a = b2Var;
    }

    @Override // w.a2
    public final long c(t tVar, t tVar2, t tVar3) {
        Iterator<Integer> it = kotlin.ranges.d.k(0, tVar.b()).iterator();
        long j10 = 0;
        while (it.hasNext()) {
            int b10 = ((vt.l0) it).b();
            j10 = Math.max(j10, ((b2) this.f38480a).a(b10).c(tVar.a(b10), tVar2.a(b10), tVar3.a(b10)));
        }
        return j10;
    }

    @Override // w.a2
    public final t d(t tVar, t tVar2, t tVar3) {
        if (this.f38483d == null) {
            t c10 = tVar3.c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f38483d = c10;
        }
        t tVar4 = this.f38483d;
        if (tVar4 != null) {
            int b10 = tVar4.b();
            for (int i10 = 0; i10 < b10; i10++) {
                t tVar5 = this.f38483d;
                if (tVar5 != null) {
                    tVar5.e(i10, ((b2) this.f38480a).a(i10).d(tVar.a(i10), tVar2.a(i10), tVar3.a(i10)));
                } else {
                    Intrinsics.k("endVelocityVector");
                    throw null;
                }
            }
            t tVar6 = this.f38483d;
            if (tVar6 != null) {
                return tVar6;
            }
            Intrinsics.k("endVelocityVector");
            throw null;
        }
        Intrinsics.k("endVelocityVector");
        throw null;
    }

    @Override // w.a2
    public final t e(long j10, t tVar, t tVar2, t tVar3) {
        if (this.f38481b == null) {
            t c10 = tVar.c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f38481b = c10;
        }
        t tVar4 = this.f38481b;
        if (tVar4 != null) {
            int b10 = tVar4.b();
            for (int i10 = 0; i10 < b10; i10++) {
                t tVar5 = this.f38481b;
                if (tVar5 != null) {
                    tVar5.e(i10, ((b2) this.f38480a).a(i10).e(j10, tVar.a(i10), tVar2.a(i10), tVar3.a(i10)));
                } else {
                    Intrinsics.k("valueVector");
                    throw null;
                }
            }
            t tVar6 = this.f38481b;
            if (tVar6 != null) {
                return tVar6;
            }
            Intrinsics.k("valueVector");
            throw null;
        }
        Intrinsics.k("valueVector");
        throw null;
    }

    @Override // w.a2
    public final t f(long j10, t tVar, t tVar2, t tVar3) {
        if (this.f38482c == null) {
            t c10 = tVar3.c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f38482c = c10;
        }
        t tVar4 = this.f38482c;
        if (tVar4 != null) {
            int b10 = tVar4.b();
            for (int i10 = 0; i10 < b10; i10++) {
                t tVar5 = this.f38482c;
                if (tVar5 != null) {
                    tVar5.e(i10, ((b2) this.f38480a).a(i10).b(j10, tVar.a(i10), tVar2.a(i10), tVar3.a(i10)));
                } else {
                    Intrinsics.k("velocityVector");
                    throw null;
                }
            }
            t tVar6 = this.f38482c;
            if (tVar6 != null) {
                return tVar6;
            }
            Intrinsics.k("velocityVector");
            throw null;
        }
        Intrinsics.k("velocityVector");
        throw null;
    }

    public e2(g0 g0Var) {
        this(new b2(g0Var));
    }
}
