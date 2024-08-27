package h7;

import d2.h1;
import g7.a1;
import g7.c0;
import g7.c3;
import g7.i;
import g7.v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import t0.n1;
import t0.o3;
import t0.t;
import tu.t0;
import vt.g0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final tu.f f18022a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f18023b;

    /* renamed from: c, reason: collision with root package name */
    public final i f18024c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f18025d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f18026e;

    public b(tu.f flow) {
        c3 c3Var;
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f18022a = flow;
        CoroutineContext coroutineContext = (CoroutineContext) h1.f13427m.getValue();
        this.f18023b = coroutineContext;
        if (flow instanceof t0) {
            c3Var = (c3) g0.w(((t0) flow).b());
        } else {
            c3Var = null;
        }
        i iVar = new i(this, coroutineContext, c3Var);
        this.f18024c = iVar;
        v0 d10 = iVar.d();
        o3 o3Var = o3.f35116a;
        this.f18025d = t.n0(d10, o3Var);
        c0 c0Var = (c0) iVar.f16990j.getValue();
        if (c0Var == null) {
            a1 a1Var = g.f18037a;
            c0Var = new c0(a1Var.f16646a, a1Var.f16647b, a1Var.f16648c, a1Var, null);
        }
        this.f18026e = t.n0(c0Var, o3Var);
    }

    public final Object a(int i10) {
        this.f18024c.b(i10);
        return ((v0) this.f18025d.getValue()).get(i10);
    }

    public final int b() {
        return ((v0) this.f18025d.getValue()).b();
    }

    public final c0 c() {
        return (c0) this.f18026e.getValue();
    }
}
