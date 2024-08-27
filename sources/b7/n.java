package b7;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final z5.b0 f3911a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3912b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3913c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3914d;

    /* renamed from: e, reason: collision with root package name */
    public int f3915e;

    /* renamed from: f, reason: collision with root package name */
    public int f3916f;

    /* renamed from: g, reason: collision with root package name */
    public long f3917g;

    /* renamed from: h, reason: collision with root package name */
    public long f3918h;

    public n(z5.b0 b0Var) {
        this.f3911a = b0Var;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        boolean z10;
        if (this.f3913c) {
            int i12 = this.f3916f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f3914d = z10;
                this.f3913c = false;
                return;
            }
            this.f3916f = (i11 - i10) + i12;
        }
    }
}
