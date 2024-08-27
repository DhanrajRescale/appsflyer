package g7;

/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16670a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16671b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16672c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16673d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16674e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16675f;

    public b3(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        i11 = (i13 & 2) != 0 ? i10 : i11;
        if ((i13 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i12 = (i13 & 8) != 0 ? i10 * 3 : i12;
        if ((i13 & 16) != 0) {
            i14 = Integer.MAX_VALUE;
        } else {
            i14 = 0;
        }
        int i15 = (i13 & 32) != 0 ? Integer.MIN_VALUE : 0;
        this.f16670a = i10;
        this.f16671b = i11;
        this.f16672c = z10;
        this.f16673d = i12;
        this.f16674e = i14;
        this.f16675f = i15;
        if (!z10 && i11 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i14 != Integer.MAX_VALUE && i14 < (i11 * 2) + i10) {
            StringBuilder q10 = da.e.q("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", i10, ", prefetchDist=", i11, ", maxSize=");
            q10.append(i14);
            throw new IllegalArgumentException(q10.toString());
        }
        if (i15 != Integer.MIN_VALUE && i15 <= 0) {
            throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
        }
    }
}
