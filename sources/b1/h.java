package b1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3084b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f3085c;

    public h(int i10, long[] jArr, Object[] objArr) {
        this.f3083a = i10;
        this.f3084b = jArr;
        this.f3085c = objArr;
    }

    public final int a(long j10) {
        int i10 = this.f3083a - 1;
        if (i10 == -1) {
            return -1;
        }
        long[] jArr = this.f3084b;
        int i11 = 0;
        if (i10 != 0) {
            while (i11 <= i10) {
                int i12 = (i11 + i10) >>> 1;
                long j11 = jArr[i12] - j10;
                if (j11 < 0) {
                    i11 = i12 + 1;
                } else if (j11 > 0) {
                    i10 = i12 - 1;
                } else {
                    return i12;
                }
            }
            return -(i11 + 1);
        }
        long j12 = jArr[0];
        if (j12 == j10) {
            return 0;
        }
        if (j12 <= j10) {
            return -1;
        }
        return -2;
    }

    public final h b(long j10, Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f3085c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f3084b;
                i10 = this.f3083a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j11 = jArr[i14];
                Object obj3 = objArr[i14];
                if (j11 > j10) {
                    jArr2[i11] = j10;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i11] = j11;
                    objArr2[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = j10;
                objArr2[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j12 = jArr[i14];
                    Object obj4 = objArr[i14];
                    if (obj4 != null) {
                        jArr2[i11] = j12;
                        objArr2[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j10;
            objArr2[0] = obj;
        }
        return new h(i13, jArr2, objArr2);
    }
}
