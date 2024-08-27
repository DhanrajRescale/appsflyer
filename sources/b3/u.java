package b3;

/* loaded from: classes.dex */
public final class u extends g3.k {

    /* renamed from: l, reason: collision with root package name */
    public final w2.b f3153l;

    /* renamed from: m, reason: collision with root package name */
    public long f3154m = hl.f.c(0, 0, 15);

    public u(w2.b bVar) {
        this.f3153l = bVar;
        this.f16504a = new t(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g3.k
    public final int c(Float f10) {
        if (f10 instanceof w2.e) {
            return this.f3153l.m0(((w2.e) f10).f38783a);
        }
        if (f10 instanceof Float) {
            return Math.round(f10.floatValue());
        }
        if (f10 instanceof Integer) {
            return ((Integer) f10).intValue();
        }
        return 0;
    }
}
