package r5;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f33177b;

    public /* synthetic */ h0(m0 m0Var, int i10) {
        this.f33176a = i10;
        this.f33177b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f33176a;
        m0 m0Var = this.f33177b;
        switch (i10) {
            case 0:
                m0Var.n();
                return;
            case 1:
                if (!m0Var.Y) {
                    t tVar = m0Var.f33233q;
                    tVar.getClass();
                    tVar.b(m0Var);
                    return;
                }
                return;
            default:
                m0Var.F = true;
                return;
        }
    }
}
