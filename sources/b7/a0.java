package b7;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class a0 implements z5.p {

    /* renamed from: e, reason: collision with root package name */
    public boolean f3750e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3751f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3752g;

    /* renamed from: h, reason: collision with root package name */
    public long f3753h;

    /* renamed from: i, reason: collision with root package name */
    public c6.a f3754i;

    /* renamed from: j, reason: collision with root package name */
    public z5.r f3755j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3756k;

    /* renamed from: a, reason: collision with root package name */
    public final e5.u f3746a = new e5.u(0);

    /* renamed from: c, reason: collision with root package name */
    public final e5.p f3748c = new e5.p(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f3747b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y f3749d = new y();

    @Override // z5.p
    public final void d(z5.r rVar) {
        this.f3755j = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Type inference failed for: r5v3, types: [c6.a, z5.i] */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r30, mj.b r31) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.a0.e(z5.q, mj.b):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r4 != r9) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r7.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0028, code lost:
    
        if (r8 != false) goto L19;
     */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r7, long r9) {
        /*
            r6 = this;
            e5.u r7 = r6.f3746a
            monitor-enter(r7)
            long r0 = r7.f15046b     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r7)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r8 != 0) goto L12
            r8 = 1
            goto L13
        L12:
            r8 = r0
        L13:
            if (r8 != 0) goto L28
            long r4 = r7.c()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L2d
            r1 = 0
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 == 0) goto L2d
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 == 0) goto L2d
            goto L2a
        L28:
            if (r8 == 0) goto L2d
        L2a:
            r7.d(r9)
        L2d:
            c6.a r7 = r6.f3754i
            if (r7 == 0) goto L34
            r7.c(r9)
        L34:
            r7 = r0
        L35:
            android.util.SparseArray r8 = r6.f3747b
            int r9 = r8.size()
            if (r7 >= r9) goto L4d
            java.lang.Object r8 = r8.valueAt(r7)
            b7.z r8 = (b7.z) r8
            r8.f4071f = r0
            b7.j r8 = r8.f4066a
            r8.d()
            int r7 = r7 + 1
            goto L35
        L4d:
            return
        L4e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.a0.f(long, long):void");
    }

    @Override // z5.p
    public final boolean g(z5.q qVar) {
        byte[] bArr = new byte[14];
        z5.l lVar = (z5.l) qVar;
        lVar.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.k(bArr[13] & 7, false);
        lVar.b(bArr, 0, 3, false);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @Override // z5.p
    public final void release() {
    }
}
