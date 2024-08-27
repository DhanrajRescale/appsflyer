package r5;

import android.net.Uri;
import b5.j1;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c1 implements u, v5.k {

    /* renamed from: a, reason: collision with root package name */
    public final g5.i f33102a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.e f33103b;

    /* renamed from: c, reason: collision with root package name */
    public final g5.u f33104c;

    /* renamed from: d, reason: collision with root package name */
    public final kq.e f33105d;

    /* renamed from: e, reason: collision with root package name */
    public final l0.j f33106e;

    /* renamed from: f, reason: collision with root package name */
    public final e1 f33107f;

    /* renamed from: h, reason: collision with root package name */
    public final long f33109h;

    /* renamed from: j, reason: collision with root package name */
    public final b5.v f33111j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f33112k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33113l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f33114m;

    /* renamed from: n, reason: collision with root package name */
    public int f33115n;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f33108g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final v5.o f33110i = new v5.o("SingleSampleMediaPeriod");

    public c1(g5.i iVar, g5.e eVar, g5.u uVar, b5.v vVar, long j10, kq.e eVar2, l0.j jVar, boolean z10) {
        this.f33102a = iVar;
        this.f33103b = eVar;
        this.f33104c = uVar;
        this.f33111j = vVar;
        this.f33109h = j10;
        this.f33105d = eVar2;
        this.f33106e = jVar;
        this.f33112k = z10;
        this.f33107f = new e1(new j1(HttpUrl.FRAGMENT_ENCODE_SET, vVar));
    }

    @Override // r5.u
    public final void A(t tVar, long j10) {
        tVar.a(this);
    }

    @Override // r5.u
    public final e1 D() {
        return this.f33107f;
    }

    @Override // r5.x0
    public final long G() {
        return this.f33113l ? Long.MIN_VALUE : 0L;
    }

    @Override // r5.x0
    public final void J(long j10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Type inference failed for: r3v0, types: [r5.n, java.lang.Object] */
    @Override // v5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v5.j b(v5.m r16, long r17, long r19, java.io.IOException r21, int r22) {
        /*
            r15 = this;
            r0 = r15
            r12 = r21
            r1 = r22
            r2 = r16
            r5.b1 r2 = (r5.b1) r2
            g5.t r2 = r2.f33091b
            r5.n r3 = new r5.n
            android.net.Uri r2 = r2.f16627c
            r3.<init>()
            long r4 = r0.f33109h
            e5.x.P(r4)
            kq.e r2 = r0.f33105d
            r2.getClass()
            boolean r4 = r12 instanceof androidx.media3.common.ParserException
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L55
            boolean r4 = r12 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L55
            boolean r4 = r12 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r4 != 0) goto L55
            boolean r4 = r12 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r4 != 0) goto L55
            int r4 = androidx.media3.datasource.DataSourceException.f2055b
            r4 = r12
        L34:
            if (r4 == 0) goto L49
            boolean r7 = r4 instanceof androidx.media3.datasource.DataSourceException
            if (r7 == 0) goto L44
            r7 = r4
            androidx.media3.datasource.DataSourceException r7 = (androidx.media3.datasource.DataSourceException) r7
            int r7 = r7.f2056a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L44
            goto L55
        L44:
            java.lang.Throwable r4 = r4.getCause()
            goto L34
        L49:
            int r4 = r1 + (-1)
            int r4 = r4 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r7)
            long r7 = (long) r4
            goto L56
        L55:
            r7 = r5
        L56:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L65
            int r2 = r2.H(r6)
            if (r1 < r2) goto L63
            goto L65
        L63:
            r1 = r5
            goto L66
        L65:
            r1 = r6
        L66:
            boolean r2 = r0.f33112k
            if (r2 == 0) goto L79
            if (r1 == 0) goto L79
            java.lang.String r1 = "SingleSampleMediaPeriod"
            java.lang.String r2 = "Loading failed, treating as end-of-stream."
            e5.m.g(r1, r2, r12)
            r0.f33113l = r6
            v5.j r1 = v5.o.f37753d
        L77:
            r14 = r1
            goto L83
        L79:
            if (r4 == 0) goto L80
            v5.j r1 = v5.o.a(r7, r5)
            goto L77
        L80:
            v5.j r1 = v5.o.f37754e
            goto L77
        L83:
            int r1 = r14.f37741a
            if (r1 == 0) goto L89
            if (r1 != r6) goto L8a
        L89:
            r5 = r6
        L8a:
            r13 = r5 ^ 1
            l0.j r1 = r0.f33106e
            r4 = 1
            r5 = -1
            b5.v r6 = r0.f33111j
            r7 = 0
            r8 = 0
            long r9 = r0.f33109h
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r10 = r9
            r8 = 0
            r12 = r21
            r1.n(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.c1.b(v5.m, long, long, java.io.IOException, int):v5.j");
    }

    @Override // r5.u
    public final long g(long j10, i5.j1 j1Var) {
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [r5.n, java.lang.Object] */
    @Override // v5.k
    public final void h(v5.m mVar, long j10, long j11, boolean z10) {
        Uri uri = ((b1) mVar).f33091b.f16627c;
        ?? obj = new Object();
        this.f33105d.getClass();
        this.f33106e.j(obj, 1, -1, null, 0, null, 0L, this.f33109h);
    }

    @Override // r5.x0
    public final long i() {
        if (!this.f33113l && !this.f33110i.b()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [r5.n, java.lang.Object] */
    @Override // v5.k
    public final void j(v5.m mVar, long j10, long j11) {
        b1 b1Var = (b1) mVar;
        this.f33115n = (int) b1Var.f33091b.f16626b;
        byte[] bArr = b1Var.f33092c;
        bArr.getClass();
        this.f33114m = bArr;
        this.f33113l = true;
        Uri uri = b1Var.f33091b.f16627c;
        ?? obj = new Object();
        this.f33105d.getClass();
        this.f33106e.l(obj, 1, -1, this.f33111j, 0, null, 0L, this.f33109h);
    }

    @Override // r5.u
    public final long o(u5.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            v0 v0Var = v0VarArr[i10];
            ArrayList arrayList = this.f33108g;
            if (v0Var != null && (sVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(v0Var);
                v0VarArr[i10] = null;
            }
            if (v0VarArr[i10] == null && sVarArr[i10] != null) {
                a1 a1Var = new a1(this);
                arrayList.add(a1Var);
                v0VarArr[i10] = a1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // r5.u
    public final void p() {
    }

    @Override // r5.u
    public final long q(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f33108g;
            if (i10 < arrayList.size()) {
                a1 a1Var = (a1) arrayList.get(i10);
                if (a1Var.f33084a == 2) {
                    a1Var.f33084a = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override // r5.u
    public final void r(long j10) {
    }

    @Override // r5.x0
    public final boolean s(long j10) {
        if (!this.f33113l) {
            v5.o oVar = this.f33110i;
            if (!oVar.b() && oVar.f37757c == null) {
                g5.f a10 = this.f33103b.a();
                g5.u uVar = this.f33104c;
                if (uVar != null) {
                    a10.m(uVar);
                }
                g5.i iVar = this.f33102a;
                oVar.e(new b1(a10, iVar), this, this.f33105d.H(1));
                this.f33106e.p(new n(iVar), 1, -1, this.f33111j, 0, null, 0L, this.f33109h);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // r5.x0
    public final boolean u() {
        return this.f33110i.b();
    }

    @Override // r5.u
    public final long w() {
        return -9223372036854775807L;
    }
}
