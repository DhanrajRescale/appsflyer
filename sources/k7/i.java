package k7;

/* loaded from: classes.dex */
public final class i implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f22396a;

    /* renamed from: b, reason: collision with root package name */
    public int f22397b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f22398c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f22399d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f22400e = null;

    public i(r0 r0Var) {
        this.f22396a = r0Var;
    }

    @Override // k7.r0
    public final void a(int i10, int i11) {
        e();
        this.f22396a.a(i10, i11);
    }

    @Override // k7.r0
    public final void b(int i10, int i11) {
        int i12;
        if (this.f22397b == 1 && i10 >= (i12 = this.f22398c)) {
            int i13 = this.f22399d;
            if (i10 <= i12 + i13) {
                this.f22399d = i13 + i11;
                this.f22398c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f22398c = i10;
        this.f22399d = i11;
        this.f22397b = 1;
    }

    @Override // k7.r0
    public final void c(int i10, int i11) {
        int i12;
        if (this.f22397b == 2 && (i12 = this.f22398c) >= i10 && i12 <= i10 + i11) {
            this.f22399d += i11;
            this.f22398c = i10;
        } else {
            e();
            this.f22398c = i10;
            this.f22399d = i11;
            this.f22397b = 2;
        }
    }

    @Override // k7.r0
    public final void d(int i10, int i11, Object obj) {
        int i12;
        if (this.f22397b == 3) {
            int i13 = this.f22398c;
            int i14 = this.f22399d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f22400e == obj) {
                this.f22398c = Math.min(i10, i13);
                this.f22399d = Math.max(i14 + i13, i12) - this.f22398c;
                return;
            }
        }
        e();
        this.f22398c = i10;
        this.f22399d = i11;
        this.f22400e = obj;
        this.f22397b = 3;
    }

    public final void e() {
        int i10 = this.f22397b;
        if (i10 == 0) {
            return;
        }
        r0 r0Var = this.f22396a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    r0Var.d(this.f22398c, this.f22399d, this.f22400e);
                }
            } else {
                r0Var.c(this.f22398c, this.f22399d);
            }
        } else {
            r0Var.b(this.f22398c, this.f22399d);
        }
        this.f22400e = null;
        this.f22397b = 0;
    }
}
