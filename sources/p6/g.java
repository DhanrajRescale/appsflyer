package p6;

import e5.x;
import z5.z;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f30710a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f30711b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30712c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30713d;

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f30710a = jArr;
        this.f30711b = jArr2;
        this.f30712c = j10;
        this.f30713d = j11;
    }

    @Override // p6.f
    public final long a() {
        return this.f30713d;
    }

    @Override // p6.f
    public final long b(long j10) {
        return this.f30710a[x.f(this.f30711b, j10, true)];
    }

    @Override // z5.y
    public final boolean c() {
        return true;
    }

    @Override // z5.y
    public final z5.x h(long j10) {
        long[] jArr = this.f30710a;
        int f10 = x.f(jArr, j10, true);
        long j11 = jArr[f10];
        long[] jArr2 = this.f30711b;
        z zVar = new z(j11, jArr2[f10]);
        if (j11 < j10 && f10 != jArr.length - 1) {
            int i10 = f10 + 1;
            return new z5.x(zVar, new z(jArr[i10], jArr2[i10]));
        }
        return new z5.x(zVar, zVar);
    }

    @Override // z5.y
    public final long i() {
        return this.f30712c;
    }
}
