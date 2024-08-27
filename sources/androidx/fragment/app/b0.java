package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b0 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.a f1593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f1595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e.b f1596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f1597e;

    public b0(g0 g0Var, p.a aVar, AtomicReference atomicReference, f.a aVar2, e.b bVar) {
        this.f1597e = g0Var;
        this.f1593a = aVar;
        this.f1594b = atomicReference;
        this.f1595c = aVar2;
        this.f1596d = bVar;
    }

    @Override // androidx.fragment.app.d0
    public final void a() {
        g0 g0Var = this.f1597e;
        this.f1594b.set(((e.h) this.f1593a.apply(null)).c(g0Var.generateActivityResultKey(), g0Var, this.f1595c, this.f1596d));
    }
}
