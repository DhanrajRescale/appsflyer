package p6;

import b5.p0;
import b5.q0;
import e.l;
import e5.x;
import java.io.EOFException;
import z5.b0;
import z5.k;
import z5.o;
import z5.p;
import z5.q;
import z5.r;
import z5.v;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: t, reason: collision with root package name */
    public static final j5.d f30690t = new j5.d(7);

    /* renamed from: f, reason: collision with root package name */
    public final o f30696f;

    /* renamed from: g, reason: collision with root package name */
    public r f30697g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f30698h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f30699i;

    /* renamed from: j, reason: collision with root package name */
    public int f30700j;

    /* renamed from: k, reason: collision with root package name */
    public q0 f30701k;

    /* renamed from: m, reason: collision with root package name */
    public long f30703m;

    /* renamed from: n, reason: collision with root package name */
    public long f30704n;

    /* renamed from: o, reason: collision with root package name */
    public int f30705o;

    /* renamed from: p, reason: collision with root package name */
    public f f30706p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30707q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30708r;

    /* renamed from: s, reason: collision with root package name */
    public long f30709s;

    /* renamed from: a, reason: collision with root package name */
    public final int f30691a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f30692b = new e5.p(10);

    /* renamed from: c, reason: collision with root package name */
    public final z5.b f30693c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final v f30694d = new v();

    /* renamed from: l, reason: collision with root package name */
    public long f30702l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final l f30695e = new l(19);

    /* JADX WARN: Type inference failed for: r0v2, types: [z5.b, java.lang.Object] */
    public d() {
        o oVar = new o();
        this.f30696f = oVar;
        this.f30699i = oVar;
    }

    public static long b(q0 q0Var) {
        if (q0Var != null) {
            int c10 = q0Var.c();
            for (int i10 = 0; i10 < c10; i10++) {
                p0 b10 = q0Var.b(i10);
                if (b10 instanceof k6.o) {
                    k6.o oVar = (k6.o) b10;
                    if (oVar.f22250a.equals("TLEN")) {
                        return x.F(Long.parseLong((String) oVar.f22262c.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [z5.k, p6.a] */
    public final a a(q qVar, boolean z10) {
        e5.p pVar = this.f30692b;
        qVar.n(pVar.f15036a, 0, 4);
        pVar.F(0);
        int g10 = pVar.g();
        z5.b bVar = this.f30693c;
        bVar.a(g10);
        return new k(bVar.f42042f, bVar.f42039c, qVar.f(), qVar.getPosition(), z10);
    }

    public final boolean c(q qVar) {
        f fVar = this.f30706p;
        if (fVar != null) {
            long a10 = fVar.a();
            if (a10 != -1 && qVar.c() > a10 - 4) {
                return true;
            }
        }
        try {
            return !qVar.b(this.f30692b.f15036a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // z5.p
    public final void d(r rVar) {
        this.f30697g = rVar;
        b0 f10 = rVar.f(0, 1);
        this.f30698h = f10;
        this.f30699i = f10;
        this.f30697g.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r9 != 1231971951) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ee  */
    /* JADX WARN: Type inference failed for: r0v54, types: [z5.t] */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r38, mj.b r39) {
        /*
            Method dump skipped, instructions count: 1181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.d.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        this.f30700j = 0;
        this.f30702l = -9223372036854775807L;
        this.f30703m = 0L;
        this.f30705o = 0;
        this.f30709s = j11;
        f fVar = this.f30706p;
        if ((fVar instanceof b) && !((b) fVar).d(j11)) {
            this.f30708r = true;
            this.f30699i = this.f30696f;
        }
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        return h(qVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        if (r19 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        r18.j(r3 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ad, code lost:
    
        r17.f30700j = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        r18.i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(z5.q r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r18.i()
            long r3 = r18.getPosition()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L42
            int r3 = r0.f30691a
            r3 = r3 & 8
            if (r3 != 0) goto L23
            r3 = r4
            goto L25
        L23:
            j5.d r3 = p6.d.f30690t
        L25:
            e.l r6 = r0.f30695e
            b5.q0 r3 = r6.N(r1, r3)
            r0.f30701k = r3
            if (r3 == 0) goto L34
            z5.v r6 = r0.f30694d
            r6.b(r3)
        L34:
            long r6 = r18.c()
            int r3 = (int) r6
            if (r19 != 0) goto L3e
            r1.j(r3)
        L3e:
            r6 = r5
        L3f:
            r7 = r6
            r8 = r7
            goto L45
        L42:
            r3 = r5
            r6 = r3
            goto L3f
        L45:
            boolean r9 = r17.c(r18)
            r10 = 1
            if (r9 == 0) goto L55
            if (r7 <= 0) goto L4f
            goto La3
        L4f:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L55:
            e5.p r9 = r0.f30692b
            r9.F(r5)
            int r9 = r9.g()
            if (r6 == 0) goto L6e
            long r11 = (long) r6
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r9
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L75
        L6e:
            int r11 = z5.a.c(r9)
            r12 = -1
            if (r11 != r12) goto L95
        L75:
            int r6 = r8 + 1
            if (r8 != r2) goto L83
            if (r19 == 0) goto L7c
            return r5
        L7c:
            java.lang.String r1 = "Searched too many bytes."
            androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.a(r1, r4)
            throw r1
        L83:
            if (r19 == 0) goto L8e
            r18.i()
            int r7 = r3 + r6
            r1.d(r7)
            goto L91
        L8e:
            r1.j(r10)
        L91:
            r7 = r5
            r8 = r6
            r6 = r7
            goto L45
        L95:
            int r7 = r7 + 1
            if (r7 != r10) goto La0
            z5.b r6 = r0.f30693c
            r6.a(r9)
            r6 = r9
            goto Lb0
        La0:
            r9 = 4
            if (r7 != r9) goto Lb0
        La3:
            if (r19 == 0) goto Laa
            int r3 = r3 + r8
            r1.j(r3)
            goto Lad
        Laa:
            r18.i()
        Lad:
            r0.f30700j = r6
            return r10
        Lb0:
            int r11 = r11 + (-4)
            r1.d(r11)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.d.h(z5.q, boolean):boolean");
    }

    @Override // z5.p
    public final void release() {
    }
}
