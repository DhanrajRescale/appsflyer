package z5;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f42053a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f42054b;

    /* renamed from: c, reason: collision with root package name */
    public int f42055c;

    /* renamed from: d, reason: collision with root package name */
    public long f42056d;

    /* renamed from: e, reason: collision with root package name */
    public int f42057e;

    /* renamed from: f, reason: collision with root package name */
    public int f42058f;

    /* renamed from: g, reason: collision with root package name */
    public int f42059g;

    public final void a(b0 b0Var, a0 a0Var) {
        if (this.f42055c > 0) {
            b0Var.b(this.f42056d, this.f42057e, this.f42058f, this.f42059g, a0Var);
            this.f42055c = 0;
        }
    }

    public final void b(b0 b0Var, long j10, int i10, int i11, int i12, a0 a0Var) {
        boolean z10;
        if (this.f42059g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.f42054b) {
                return;
            }
            int i13 = this.f42055c;
            int i14 = i13 + 1;
            this.f42055c = i14;
            if (i13 == 0) {
                this.f42056d = j10;
                this.f42057e = i10;
                this.f42058f = 0;
            }
            this.f42058f += i11;
            this.f42059g = i12;
            if (i14 >= 16) {
                a(b0Var, a0Var);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(q qVar) {
        char c10;
        if (this.f42054b) {
            return;
        }
        byte[] bArr = this.f42053a;
        qVar.n(bArr, 0, 10);
        qVar.i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    c10 = '\t';
                } else {
                    c10 = '\b';
                }
                if ((40 << ((bArr[c10] >> 4) & 7)) != 0) {
                    this.f42054b = true;
                }
            }
        }
    }
}
