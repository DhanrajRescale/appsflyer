package w;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final a2 f38607a;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f38608b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f38609c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f38610d;

    /* renamed from: e, reason: collision with root package name */
    public final t f38611e;

    /* renamed from: f, reason: collision with root package name */
    public final t f38612f;

    /* renamed from: g, reason: collision with root package name */
    public final t f38613g;

    /* renamed from: h, reason: collision with root package name */
    public long f38614h;

    /* renamed from: i, reason: collision with root package name */
    public t f38615i;

    public m1(n nVar, y1 y1Var, Object obj, Object obj2, t tVar) {
        t c10;
        this.f38607a = nVar.a(y1Var);
        this.f38608b = y1Var;
        this.f38609c = obj2;
        this.f38610d = obj;
        this.f38611e = (t) y1Var.f38734a.invoke(obj);
        Function1 function1 = y1Var.f38734a;
        this.f38612f = (t) function1.invoke(obj2);
        if (tVar != null) {
            c10 = e.l(tVar);
        } else {
            c10 = ((t) function1.invoke(obj)).c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        }
        this.f38613g = c10;
        this.f38614h = -1L;
    }

    @Override // w.j
    public final boolean a() {
        return this.f38607a.a();
    }

    @Override // w.j
    public final long b() {
        if (this.f38614h < 0) {
            this.f38614h = this.f38607a.c(this.f38611e, this.f38612f, this.f38613g);
        }
        return this.f38614h;
    }

    @Override // w.j
    public final y1 c() {
        return this.f38608b;
    }

    @Override // w.j
    public final t d(long j10) {
        if (!e(j10)) {
            return this.f38607a.f(j10, this.f38611e, this.f38612f, this.f38613g);
        }
        t tVar = this.f38615i;
        if (tVar == null) {
            t d10 = this.f38607a.d(this.f38611e, this.f38612f, this.f38613g);
            this.f38615i = d10;
            return d10;
        }
        return tVar;
    }

    @Override // w.j
    public final Object f(long j10) {
        if (!e(j10)) {
            t e10 = this.f38607a.e(j10, this.f38611e, this.f38612f, this.f38613g);
            int b10 = e10.b();
            for (int i10 = 0; i10 < b10; i10++) {
                if (!(!Float.isNaN(e10.a(i10)))) {
                    throw new IllegalStateException("AnimationVector cannot contain a NaN. " + e10 + ". Animation: " + this + ", playTimeNanos: " + j10);
                }
            }
            return this.f38608b.f38735b.invoke(e10);
        }
        return this.f38609c;
    }

    @Override // w.j
    public final Object g() {
        return this.f38609c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f38610d + " -> " + this.f38609c + ",initial velocity: " + this.f38613g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f38607a;
    }
}
