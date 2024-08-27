package w;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f38489a;

    /* renamed from: b, reason: collision with root package name */
    public t f38490b;

    /* renamed from: c, reason: collision with root package name */
    public t f38491c;

    /* renamed from: d, reason: collision with root package name */
    public t f38492d;

    public f2(h0 h0Var) {
        this.f38489a = h0Var;
        h0Var.getClass();
    }

    public final t a(t tVar, t tVar2) {
        if (this.f38492d == null) {
            t c10 = tVar.c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f38492d = c10;
        }
        t tVar3 = this.f38492d;
        if (tVar3 != null) {
            int i10 = 0;
            for (int b10 = tVar3.b(); i10 < b10; b10 = b10) {
                t tVar4 = this.f38492d;
                if (tVar4 != null) {
                    float a10 = tVar.a(i10);
                    float a11 = tVar2.a(i10);
                    p4.e eVar = ((v.s0) this.f38489a).f37607a;
                    double b11 = eVar.b(a11);
                    double d10 = v.l0.f37559a;
                    float f10 = eVar.f30635a * eVar.f30636b;
                    tVar4.e(i10, (Math.signum(a11) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * b11) * f10))) + a10);
                    i10++;
                } else {
                    Intrinsics.k("targetVector");
                    throw null;
                }
            }
            t tVar5 = this.f38492d;
            if (tVar5 != null) {
                return tVar5;
            }
            Intrinsics.k("targetVector");
            throw null;
        }
        Intrinsics.k("targetVector");
        throw null;
    }

    public final t b(long j10, t tVar, t tVar2) {
        float f10;
        if (this.f38491c == null) {
            t c10 = tVar.c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f38491c = c10;
        }
        t tVar3 = this.f38491c;
        if (tVar3 != null) {
            int b10 = tVar3.b();
            for (int i10 = 0; i10 < b10; i10++) {
                t tVar4 = this.f38491c;
                if (tVar4 != null) {
                    tVar.a(i10);
                    float a10 = tVar2.a(i10);
                    v.s0 s0Var = (v.s0) this.f38489a;
                    s0Var.getClass();
                    long j11 = j10 / 1000000;
                    v.k0 a11 = s0Var.f37607a.a(a10);
                    long j12 = a11.f37545c;
                    if (j12 > 0) {
                        f10 = ((float) j11) / ((float) j12);
                    } else {
                        f10 = 1.0f;
                    }
                    tVar4.e(i10, (((Math.signum(a11.f37543a) * v.b.a(f10).f37476b) * a11.f37544b) / ((float) j12)) * 1000.0f);
                } else {
                    Intrinsics.k("velocityVector");
                    throw null;
                }
            }
            t tVar5 = this.f38491c;
            if (tVar5 != null) {
                return tVar5;
            }
            Intrinsics.k("velocityVector");
            throw null;
        }
        Intrinsics.k("velocityVector");
        throw null;
    }
}
