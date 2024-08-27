package z5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements y {

    /* renamed from: a, reason: collision with root package name */
    public final int f42090a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f42091b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f42092c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f42093d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f42094e;

    /* renamed from: f, reason: collision with root package name */
    public final long f42095f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f42091b = iArr;
        this.f42092c = jArr;
        this.f42093d = jArr2;
        this.f42094e = jArr3;
        int length = iArr.length;
        this.f42090a = length;
        if (length > 0) {
            this.f42095f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f42095f = 0L;
        }
    }

    @Override // z5.y
    public final boolean c() {
        return true;
    }

    @Override // z5.y
    public final x h(long j10) {
        long[] jArr = this.f42094e;
        int f10 = e5.x.f(jArr, j10, true);
        long j11 = jArr[f10];
        long[] jArr2 = this.f42092c;
        z zVar = new z(j11, jArr2[f10]);
        if (j11 < j10 && f10 != this.f42090a - 1) {
            int i10 = f10 + 1;
            return new x(zVar, new z(jArr[i10], jArr2[i10]));
        }
        return new x(zVar, zVar);
    }

    @Override // z5.y
    public final long i() {
        return this.f42095f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f42090a + ", sizes=" + Arrays.toString(this.f42091b) + ", offsets=" + Arrays.toString(this.f42092c) + ", timeUs=" + Arrays.toString(this.f42094e) + ", durationsUs=" + Arrays.toString(this.f42093d) + ")";
    }
}
