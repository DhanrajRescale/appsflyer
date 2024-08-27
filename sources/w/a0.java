package w;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f38418a;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f38419b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f38420c;

    /* renamed from: d, reason: collision with root package name */
    public final t f38421d;

    /* renamed from: e, reason: collision with root package name */
    public final t f38422e;

    /* renamed from: f, reason: collision with root package name */
    public final t f38423f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f38424g;

    /* renamed from: h, reason: collision with root package name */
    public final long f38425h;

    public a0(b0 b0Var, y1 y1Var, Object obj, t tVar) {
        f2 f2Var = new f2(b0Var.f38436a);
        this.f38418a = f2Var;
        this.f38419b = y1Var;
        this.f38420c = obj;
        t tVar2 = (t) y1Var.f38734a.invoke(obj);
        this.f38421d = tVar2;
        this.f38422e = e.l(tVar);
        this.f38424g = y1Var.f38735b.invoke(f2Var.a(tVar2, tVar));
        if (f2Var.f38491c == null) {
            t c10 = tVar2.c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            f2Var.f38491c = c10;
        }
        t tVar3 = f2Var.f38491c;
        if (tVar3 != null) {
            int b10 = tVar3.b();
            long j10 = 0;
            for (int i10 = 0; i10 < b10; i10++) {
                tVar2.a(i10);
                j10 = Math.max(j10, ((long) (Math.exp(((v.s0) f2Var.f38489a).f37607a.b(tVar.a(i10)) / (v.l0.f37559a - 1.0d)) * 1000.0d)) * 1000000);
            }
            this.f38425h = j10;
            t l10 = e.l(this.f38418a.b(j10, this.f38421d, tVar));
            this.f38423f = l10;
            int b11 = l10.b();
            for (int i11 = 0; i11 < b11; i11++) {
                t tVar4 = this.f38423f;
                float a10 = tVar4.a(i11);
                this.f38418a.getClass();
                this.f38418a.getClass();
                tVar4.e(i11, kotlin.ranges.d.e(a10, -0.0f, s0.g.f34069a));
            }
            return;
        }
        Intrinsics.k("velocityVector");
        throw null;
    }

    @Override // w.j
    public final boolean a() {
        return false;
    }

    @Override // w.j
    public final long b() {
        return this.f38425h;
    }

    @Override // w.j
    public final y1 c() {
        return this.f38419b;
    }

    @Override // w.j
    public final t d(long j10) {
        if (!e(j10)) {
            return this.f38418a.b(j10, this.f38421d, this.f38422e);
        }
        return this.f38423f;
    }

    @Override // w.j
    public final Object f(long j10) {
        float f10;
        if (!e(j10)) {
            Function1 function1 = this.f38419b.f38735b;
            f2 f2Var = this.f38418a;
            t tVar = f2Var.f38490b;
            t tVar2 = this.f38421d;
            if (tVar == null) {
                t c10 = tVar2.c();
                Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
                f2Var.f38490b = c10;
            }
            t tVar3 = f2Var.f38490b;
            String str = "valueVector";
            if (tVar3 != null) {
                int b10 = tVar3.b();
                int i10 = 0;
                while (i10 < b10) {
                    t tVar4 = f2Var.f38490b;
                    if (tVar4 != null) {
                        float a10 = tVar2.a(i10);
                        float a11 = this.f38422e.a(i10);
                        v.s0 s0Var = (v.s0) f2Var.f38489a;
                        s0Var.getClass();
                        long j11 = j10 / 1000000;
                        v.k0 a12 = s0Var.f37607a.a(a11);
                        String str2 = str;
                        long j12 = a12.f37545c;
                        if (j12 > 0) {
                            f10 = ((float) j11) / ((float) j12);
                        } else {
                            f10 = 1.0f;
                        }
                        tVar4.e(i10, (Math.signum(a12.f37543a) * a12.f37544b * v.b.a(f10).f37475a) + a10);
                        i10++;
                        str = str2;
                    } else {
                        Intrinsics.k(str);
                        throw null;
                    }
                }
                String str3 = str;
                t tVar5 = f2Var.f38490b;
                if (tVar5 != null) {
                    return function1.invoke(tVar5);
                }
                Intrinsics.k(str3);
                throw null;
            }
            Intrinsics.k("valueVector");
            throw null;
        }
        return this.f38424g;
    }

    @Override // w.j
    public final Object g() {
        return this.f38424g;
    }
}
