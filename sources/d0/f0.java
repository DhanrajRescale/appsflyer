package d0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public u0 f13160a;

    public final e0 a(int i10, long j10) {
        u0 u0Var = this.f13160a;
        if (u0Var != null) {
            t0 t0Var = new t0(u0Var, i10, j10);
            a aVar = (a) u0Var.f13230c;
            aVar.f13129b.b(t0Var);
            if (!aVar.f13132e) {
                aVar.f13132e = true;
                aVar.f13128a.post(aVar);
                return t0Var;
            }
            return t0Var;
        }
        return e.f13155a;
    }
}
