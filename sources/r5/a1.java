package r5;

/* loaded from: classes.dex */
public final class a1 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f33084a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f33086c;

    public a1(c1 c1Var) {
        this.f33086c = c1Var;
    }

    public final void a() {
        if (!this.f33085b) {
            c1 c1Var = this.f33086c;
            c1Var.f33106e.c(b5.r0.h(c1Var.f33111j.f3652l), c1Var.f33111j, 0, null, 0L);
            this.f33085b = true;
        }
    }

    @Override // r5.v0
    public final void c() {
        c1 c1Var = this.f33086c;
        if (!c1Var.f33112k) {
            c1Var.f33110i.c();
        }
    }

    @Override // r5.v0
    public final boolean d() {
        return this.f33086c.f33113l;
    }

    @Override // r5.v0
    public final int e(long j10) {
        a();
        if (j10 > 0 && this.f33084a != 2) {
            this.f33084a = 2;
            return 1;
        }
        return 0;
    }

    @Override // r5.v0
    public final int f(tr.e eVar, h5.f fVar, int i10) {
        a();
        c1 c1Var = this.f33086c;
        boolean z10 = c1Var.f33113l;
        if (z10 && c1Var.f33114m == null) {
            this.f33084a = 2;
        }
        int i11 = this.f33084a;
        if (i11 == 2) {
            fVar.e(4);
            return -4;
        }
        if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            c1Var.f33114m.getClass();
            fVar.e(1);
            fVar.f18004f = 0L;
            if ((i10 & 4) == 0) {
                fVar.k(c1Var.f33115n);
                fVar.f18002d.put(c1Var.f33114m, 0, c1Var.f33115n);
            }
            if ((i10 & 1) == 0) {
                this.f33084a = 2;
            }
            return -4;
        }
        eVar.f36362c = c1Var.f33111j;
        this.f33084a = 1;
        return -5;
    }
}
