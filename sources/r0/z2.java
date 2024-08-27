package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32831a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32832b;

    /* renamed from: c, reason: collision with root package name */
    public final t f32833c;

    /* renamed from: d, reason: collision with root package name */
    public w2.b f32834d;

    public z2(boolean z10, w2.b bVar, a3 a3Var, Function1 function1, boolean z11) {
        this.f32831a = z10;
        this.f32832b = z11;
        if (z10 && a3Var == a3.f32326c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
        }
        if (z11 && a3Var == a3.f32324a) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
        }
        w.f1 f1Var = b.f32328a;
        this.f32833c = new t(a3Var, new o1(this, 1), new p1(this, 1), function1);
        this.f32834d = bVar;
    }

    public static Object a(z2 z2Var, a3 a3Var, yt.a aVar) {
        Object M = al.d.M(z2Var.f32833c, a3Var, z2Var.f32833c.f32725j.i(), aVar);
        if (M != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return M;
    }

    public final Object b(yt.a aVar) {
        if (!this.f32832b) {
            Object a10 = a(this, a3.f32324a, aVar);
            if (a10 == zt.a.f42823a) {
                return a10;
            }
            return Unit.f23355a;
        }
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
    }

    public final boolean c() {
        if (this.f32833c.f32721f.getValue() != a3.f32324a) {
            return true;
        }
        return false;
    }

    public final Object d(yt.a aVar) {
        if (!this.f32831a) {
            Object a10 = a(this, a3.f32326c, aVar);
            if (a10 == zt.a.f42823a) {
                return a10;
            }
            return Unit.f23355a;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
    }
}
