package androidx.work;

/* loaded from: classes.dex */
public final class c0 extends j0 {
    @Override // androidx.work.j0
    public final k0 b() {
        j8.k kVar = this.f2618b;
        if (!kVar.f21090q) {
            return new k0(this.f2617a, kVar, this.f2619c);
        }
        throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
    }

    @Override // androidx.work.j0
    public final j0 c() {
        return this;
    }
}
