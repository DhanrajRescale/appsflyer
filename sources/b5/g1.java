package b5;

/* loaded from: classes.dex */
public final class g1 implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final String f3311h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3312i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3313j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3314k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f3315l;

    /* renamed from: a, reason: collision with root package name */
    public Object f3316a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3317b;

    /* renamed from: c, reason: collision with root package name */
    public int f3318c;

    /* renamed from: d, reason: collision with root package name */
    public long f3319d;

    /* renamed from: e, reason: collision with root package name */
    public long f3320e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3321f;

    /* renamed from: g, reason: collision with root package name */
    public b f3322g = b.f3203g;

    static {
        int i10 = e5.x.f15050a;
        f3311h = Integer.toString(0, 36);
        f3312i = Integer.toString(1, 36);
        f3313j = Integer.toString(2, 36);
        f3314k = Integer.toString(3, 36);
        f3315l = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a a10 = this.f3322g.a(i10);
        if (a10.f3195b != -1) {
            return a10.f3199f[i11];
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(long r10) {
        /*
            r9 = this;
            b5.b r0 = r9.f3322g
            long r1 = r9.f3319d
            r0.getClass()
            r3 = -9223372036854775808
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r6 = -1
            if (r5 == 0) goto L4b
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L1c
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 < 0) goto L1c
            goto L4b
        L1c:
            int r1 = r0.f3214e
        L1e:
            int r2 = r0.f3211b
            if (r1 >= r2) goto L48
            b5.a r5 = r0.a(r1)
            long r7 = r5.f3194a
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L36
            b5.a r5 = r0.a(r1)
            long r7 = r5.f3194a
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 <= 0) goto L45
        L36:
            b5.a r5 = r0.a(r1)
            int r7 = r5.f3195b
            if (r7 == r6) goto L48
            int r5 = r5.a(r6)
            if (r5 >= r7) goto L45
            goto L48
        L45:
            int r1 = r1 + 1
            goto L1e
        L48:
            if (r1 >= r2) goto L4b
            r6 = r1
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.g1.b(long):int");
    }

    public final int c(long j10) {
        b bVar = this.f3322g;
        long j11 = this.f3319d;
        int i10 = bVar.f3211b - 1;
        int i11 = i10 - (bVar.b(i10) ? 1 : 0);
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            a a10 = bVar.a(i11);
            long j12 = a10.f3194a;
            if (j12 == Long.MIN_VALUE) {
                if (j11 != -9223372036854775807L && ((!a10.f3201h || a10.f3195b != -1) && j10 >= j11)) {
                    break;
                }
                i11--;
            } else {
                if (j10 >= j12) {
                    break;
                }
                i11--;
            }
        }
        if (i11 >= 0) {
            a a11 = bVar.a(i11);
            int i12 = a11.f3195b;
            if (i12 != -1) {
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = a11.f3198e[i13];
                    if (i14 == 0 || i14 == 1) {
                        return i11;
                    }
                }
            } else {
                return i11;
            }
        }
        return -1;
    }

    public final long d(int i10) {
        return this.f3322g.a(i10).f3194a;
    }

    public final int e(int i10, int i11) {
        a a10 = this.f3322g.a(i10);
        if (a10.f3195b != -1) {
            return a10.f3198e[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !g1.class.equals(obj.getClass())) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (e5.x.a(this.f3316a, g1Var.f3316a) && e5.x.a(this.f3317b, g1Var.f3317b) && this.f3318c == g1Var.f3318c && this.f3319d == g1Var.f3319d && this.f3320e == g1Var.f3320e && this.f3321f == g1Var.f3321f && e5.x.a(this.f3322g, g1Var.f3322g)) {
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return this.f3322g.a(i10).a(-1);
    }

    public final long g() {
        return this.f3320e;
    }

    public final boolean h(int i10) {
        b bVar = this.f3322g;
        if (i10 == bVar.f3211b - 1 && bVar.b(i10)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f3316a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f3317b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        int i12 = (((i11 + i10) * 31) + this.f3318c) * 31;
        long j10 = this.f3319d;
        int i13 = (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3320e;
        return this.f3322g.hashCode() + ((((i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f3321f ? 1 : 0)) * 31);
    }

    public final boolean i(int i10) {
        return this.f3322g.a(i10).f3201h;
    }

    public final void j(Object obj, Object obj2, int i10, long j10, long j11, b bVar, boolean z10) {
        this.f3316a = obj;
        this.f3317b = obj2;
        this.f3318c = i10;
        this.f3319d = j10;
        this.f3320e = j11;
        this.f3322g = bVar;
        this.f3321f = z10;
    }
}
