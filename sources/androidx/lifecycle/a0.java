package androidx.lifecycle;

/* loaded from: classes.dex */
public final class a0 extends b0 implements r {

    /* renamed from: e, reason: collision with root package name */
    public final t f1876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LiveData f1877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(LiveData liveData, t tVar, f0 f0Var) {
        super(liveData, f0Var);
        this.f1877f = liveData;
        this.f1876e = tVar;
    }

    @Override // androidx.lifecycle.r
    public final void c(t tVar, m mVar) {
        t tVar2 = this.f1876e;
        n b10 = tVar2.getLifecycle().b();
        if (b10 == n.f1947a) {
            this.f1877f.removeObserver(this.f1881a);
            return;
        }
        n nVar = null;
        while (nVar != b10) {
            a(i());
            nVar = b10;
            b10 = tVar2.getLifecycle().b();
        }
    }

    @Override // androidx.lifecycle.b0
    public final void e() {
        this.f1876e.getLifecycle().c(this);
    }

    @Override // androidx.lifecycle.b0
    public final boolean h(t tVar) {
        return this.f1876e == tVar;
    }

    @Override // androidx.lifecycle.b0
    public final boolean i() {
        return this.f1876e.getLifecycle().b().a(n.f1950d);
    }
}
