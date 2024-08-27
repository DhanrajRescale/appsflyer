package r5;

/* loaded from: classes.dex */
public final class b implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f33087a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f33089c;

    public b(c cVar, v0 v0Var) {
        this.f33089c = cVar;
        this.f33087a = v0Var;
    }

    @Override // r5.v0
    public final void c() {
        this.f33087a.c();
    }

    @Override // r5.v0
    public final boolean d() {
        if (!this.f33089c.c() && this.f33087a.d()) {
            return true;
        }
        return false;
    }

    @Override // r5.v0
    public final int e(long j10) {
        if (this.f33089c.c()) {
            return -3;
        }
        return this.f33087a.e(j10);
    }

    @Override // r5.v0
    public final int f(tr.e eVar, h5.f fVar, int i10) {
        c cVar = this.f33089c;
        if (cVar.c()) {
            return -3;
        }
        if (this.f33088b) {
            fVar.f17988b = 4;
            return -4;
        }
        long G = cVar.G();
        int f10 = this.f33087a.f(eVar, fVar, i10);
        if (f10 == -5) {
            b5.v vVar = (b5.v) eVar.f36362c;
            vVar.getClass();
            int i11 = vVar.C;
            int i12 = vVar.B;
            if (i12 != 0 || i11 != 0) {
                if (cVar.f33097e != 0) {
                    i12 = 0;
                }
                if (cVar.f33098f != Long.MIN_VALUE) {
                    i11 = 0;
                }
                b5.u a10 = vVar.a();
                a10.A = i12;
                a10.B = i11;
                eVar.f36362c = a10.a();
            }
            return -5;
        }
        long j10 = cVar.f33098f;
        if (j10 != Long.MIN_VALUE && ((f10 == -4 && fVar.f18004f >= j10) || (f10 == -3 && G == Long.MIN_VALUE && !fVar.f18003e))) {
            fVar.i();
            fVar.f17988b = 4;
            this.f33088b = true;
            return -4;
        }
        return f10;
    }
}
