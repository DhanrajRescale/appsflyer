package z5;

/* loaded from: classes.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f42134a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f42135b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42136c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f42137d;

    public w(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42137d = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f42134a = jArr3;
            long[] jArr4 = new long[i10];
            this.f42135b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f42134a = jArr;
            this.f42135b = jArr2;
        }
        this.f42136c = j10;
    }

    @Override // z5.y
    public final boolean c() {
        return this.f42137d;
    }

    @Override // z5.y
    public final x h(long j10) {
        if (!this.f42137d) {
            z zVar = z.f42140c;
            return new x(zVar, zVar);
        }
        long[] jArr = this.f42135b;
        int f10 = e5.x.f(jArr, j10, true);
        long j11 = jArr[f10];
        long[] jArr2 = this.f42134a;
        z zVar2 = new z(j11, jArr2[f10]);
        if (j11 != j10 && f10 != jArr.length - 1) {
            int i10 = f10 + 1;
            return new x(zVar2, new z(jArr[i10], jArr2[i10]));
        }
        return new x(zVar2, zVar2);
    }

    @Override // z5.y
    public final long i() {
        return this.f42136c;
    }
}
