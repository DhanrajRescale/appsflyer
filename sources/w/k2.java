package w;

/* loaded from: classes.dex */
public final class k2 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38576a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38577b;

    /* renamed from: c, reason: collision with root package name */
    public final e2 f38578c;

    public k2(int i10, int i11, d0 d0Var) {
        this.f38576a = i10;
        this.f38577b = i11;
        this.f38578c = new e2(new j0(i10, i11, d0Var));
    }

    @Override // w.a2
    public final t e(long j10, t tVar, t tVar2, t tVar3) {
        return this.f38578c.e(j10, tVar, tVar2, tVar3);
    }

    @Override // w.a2
    public final t f(long j10, t tVar, t tVar2, t tVar3) {
        return this.f38578c.f(j10, tVar, tVar2, tVar3);
    }

    @Override // w.c2
    public final int g() {
        return this.f38577b;
    }

    @Override // w.c2
    public final int i() {
        return this.f38576a;
    }
}
