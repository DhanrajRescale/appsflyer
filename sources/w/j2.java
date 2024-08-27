package w;

/* loaded from: classes.dex */
public final class j2 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2 f38564a;

    public j2(float f10, float f11, t tVar) {
        b2 b2Var;
        if (tVar != null) {
            b2Var = new b2(f10, f11, tVar);
        } else {
            b2Var = new b2(f10, f11);
        }
        this.f38564a = new e2(b2Var);
    }

    @Override // w.d2, w.a2
    public final boolean a() {
        this.f38564a.getClass();
        return false;
    }

    @Override // w.a2
    public final long c(t tVar, t tVar2, t tVar3) {
        return this.f38564a.c(tVar, tVar2, tVar3);
    }

    @Override // w.a2
    public final t d(t tVar, t tVar2, t tVar3) {
        return this.f38564a.d(tVar, tVar2, tVar3);
    }

    @Override // w.a2
    public final t e(long j10, t tVar, t tVar2, t tVar3) {
        return this.f38564a.e(j10, tVar, tVar2, tVar3);
    }

    @Override // w.a2
    public final t f(long j10, t tVar, t tVar2, t tVar3) {
        return this.f38564a.f(j10, tVar, tVar2, tVar3);
    }
}
