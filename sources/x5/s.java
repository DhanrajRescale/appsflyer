package x5;

import android.view.Surface;
import e5.x;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final b f40041a;

    /* renamed from: b, reason: collision with root package name */
    public final o f40042b;

    /* renamed from: c, reason: collision with root package name */
    public final r f40043c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40044d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f40045e;

    /* renamed from: f, reason: collision with root package name */
    public float f40046f;

    /* renamed from: g, reason: collision with root package name */
    public float f40047g;

    /* renamed from: h, reason: collision with root package name */
    public float f40048h;

    /* renamed from: i, reason: collision with root package name */
    public float f40049i;

    /* renamed from: j, reason: collision with root package name */
    public int f40050j;

    /* renamed from: k, reason: collision with root package name */
    public long f40051k;

    /* renamed from: l, reason: collision with root package name */
    public long f40052l;

    /* renamed from: m, reason: collision with root package name */
    public long f40053m;

    /* renamed from: n, reason: collision with root package name */
    public long f40054n;

    /* renamed from: o, reason: collision with root package name */
    public long f40055o;

    /* renamed from: p, reason: collision with root package name */
    public long f40056p;

    /* renamed from: q, reason: collision with root package name */
    public long f40057q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Type inference failed for: r0v0, types: [x5.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            x5.b r0 = new x5.b
            r0.<init>()
            x5.a r1 = new x5.a
            r1.<init>()
            r0.f39973a = r1
            x5.a r1 = new x5.a
            r1.<init>()
            r0.f39974b = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f39976d = r1
            r5.f40041a = r0
            r0 = 0
            if (r6 == 0) goto L50
            android.content.Context r6 = r6.getApplicationContext()
            int r3 = e5.x.f15050a
            r4 = 17
            if (r3 < r4) goto L3c
            java.lang.String r3 = "display"
            java.lang.Object r3 = r6.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L3c
            x5.q r4 = new x5.q
            r4.<init>(r3)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            if (r4 != 0) goto L51
            java.lang.String r3 = "window"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            if (r6 == 0) goto L50
            x5.p r3 = new x5.p
            r3.<init>(r6)
            r4 = r3
            goto L51
        L50:
            r4 = r0
        L51:
            r5.f40042b = r4
            if (r4 == 0) goto L57
            x5.r r0 = x5.r.f40036e
        L57:
            r5.f40043c = r0
            r5.f40051k = r1
            r5.f40052l = r1
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.f40046f = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.f40049i = r6
            r6 = 0
            r5.f40050j = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.s.<init>(android.content.Context):void");
    }

    public final long a(long j10) {
        long j11;
        r rVar;
        long j12;
        long j13;
        if (this.f40056p != -1 && this.f40041a.f39973a.a()) {
            b bVar = this.f40041a;
            if (bVar.f39973a.a()) {
                a aVar = bVar.f39973a;
                long j14 = aVar.f39969e;
                if (j14 == 0) {
                    j13 = 0;
                } else {
                    j13 = aVar.f39970f / j14;
                }
            } else {
                j13 = -9223372036854775807L;
            }
            j11 = this.f40057q + (((float) ((this.f40053m - this.f40056p) * j13)) / this.f40049i);
            if (Math.abs(j10 - j11) > 20000000) {
                this.f40053m = 0L;
                this.f40056p = -1L;
                this.f40054n = -1L;
            }
            this.f40054n = this.f40053m;
            this.f40055o = j11;
            rVar = this.f40043c;
            if (rVar == null && this.f40051k != -9223372036854775807L) {
                long j15 = rVar.f40037a;
                if (j15 == -9223372036854775807L) {
                    return j11;
                }
                long j16 = this.f40051k;
                long j17 = (((j11 - j15) / j16) * j16) + j15;
                if (j11 <= j17) {
                    j12 = j17 - j16;
                } else {
                    j12 = j17;
                    j17 = j16 + j17;
                }
                if (j17 - j11 >= j11 - j12) {
                    j17 = j12;
                }
                return j17 - this.f40052l;
            }
            return j11;
        }
        j11 = j10;
        this.f40054n = this.f40053m;
        this.f40055o = j11;
        rVar = this.f40043c;
        if (rVar == null) {
        }
        return j11;
    }

    public final void b() {
        Surface surface;
        if (x.f15050a >= 30 && (surface = this.f40045e) != null && this.f40050j != Integer.MIN_VALUE && this.f40048h != s0.g.f34069a) {
            this.f40048h = s0.g.f34069a;
            n.a(surface, s0.g.f34069a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r1.f39971g[(int) ((r6 - 1) % 15)] != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r11) {
        /*
            r10 = this;
            long r0 = r10.f40054n
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Le
            r10.f40056p = r0
            long r0 = r10.f40055o
            r10.f40057q = r0
        Le:
            long r0 = r10.f40053m
            r2 = 1
            long r0 = r0 + r2
            r10.f40053m = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            x5.b r0 = r10.f40041a
            x5.a r1 = r0.f39973a
            r1.b(r11)
            x5.a r1 = r0.f39973a
            boolean r1 = r1.a()
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2c
            r0.f39975c = r5
            goto L64
        L2c:
            long r6 = r0.f39976d
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L64
            boolean r1 = r0.f39975c
            if (r1 == 0) goto L51
            x5.a r1 = r0.f39974b
            long r6 = r1.f39968d
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L46
            goto L5d
        L46:
            long r6 = r6 - r2
            r2 = 15
            long r6 = r6 % r2
            int r2 = (int) r6
            boolean[] r1 = r1.f39971g
            boolean r1 = r1[r2]
            if (r1 == 0) goto L5d
        L51:
            x5.a r1 = r0.f39974b
            r1.c()
            x5.a r1 = r0.f39974b
            long r2 = r0.f39976d
            r1.b(r2)
        L5d:
            r0.f39975c = r4
            x5.a r1 = r0.f39974b
            r1.b(r11)
        L64:
            boolean r1 = r0.f39975c
            if (r1 == 0) goto L7a
            x5.a r1 = r0.f39974b
            boolean r1 = r1.a()
            if (r1 == 0) goto L7a
            x5.a r1 = r0.f39973a
            x5.a r2 = r0.f39974b
            r0.f39973a = r2
            r0.f39974b = r1
            r0.f39975c = r5
        L7a:
            r0.f39976d = r11
            x5.a r11 = r0.f39973a
            boolean r11 = r11.a()
            if (r11 == 0) goto L85
            goto L89
        L85:
            int r11 = r0.f39977e
            int r5 = r11 + 1
        L89:
            r0.f39977e = r5
            r10.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.s.c(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r9 = this;
            int r0 = e5.x.f15050a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f40045e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            x5.b r0 = r9.f40041a
            x5.a r2 = r0.f39973a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            x5.a r2 = r0.f39973a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            x5.a r2 = r0.f39973a
            long r4 = r2.f39969e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f39970f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f40046f
        L3b:
            float r4 = r9.f40047g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            x5.a r1 = r0.f39973a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            x5.a r1 = r0.f39973a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            x5.a r0 = r0.f39973a
            long r0 = r0.f39970f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f40047g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f39977e
            if (r0 < r1) goto L8d
        L87:
            r9.f40047g = r2
            r0 = 0
            r9.e(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.s.d():void");
    }

    public final void e(boolean z10) {
        Surface surface;
        float f10;
        if (x.f15050a >= 30 && (surface = this.f40045e) != null && this.f40050j != Integer.MIN_VALUE) {
            if (this.f40044d) {
                float f11 = this.f40047g;
                if (f11 != -1.0f) {
                    f10 = f11 * this.f40049i;
                    if (z10 && this.f40048h == f10) {
                        return;
                    }
                    this.f40048h = f10;
                    n.a(surface, f10);
                }
            }
            f10 = s0.g.f34069a;
            if (z10) {
            }
            this.f40048h = f10;
            n.a(surface, f10);
        }
    }
}
