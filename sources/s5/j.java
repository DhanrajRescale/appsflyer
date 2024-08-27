package s5;

import android.net.Uri;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import b5.v;
import e5.x;
import h.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l5.q;
import n5.p;
import r5.s;
import r5.u0;
import r5.v0;
import r5.w0;
import r5.x0;
import v5.o;
import z5.y;

/* loaded from: classes.dex */
public final class j implements v0, x0, v5.k, v5.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f34263a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f34264b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f34265c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f34266d;

    /* renamed from: e, reason: collision with root package name */
    public final l5.a f34267e;

    /* renamed from: f, reason: collision with root package name */
    public final w0 f34268f;

    /* renamed from: g, reason: collision with root package name */
    public final l0.j f34269g;

    /* renamed from: h, reason: collision with root package name */
    public final kq.e f34270h;

    /* renamed from: i, reason: collision with root package name */
    public final o f34271i = new o("ChunkSampleStream");

    /* renamed from: j, reason: collision with root package name */
    public final r0 f34272j = new r0(4);

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f34273k;

    /* renamed from: l, reason: collision with root package name */
    public final List f34274l;

    /* renamed from: m, reason: collision with root package name */
    public final u0 f34275m;

    /* renamed from: n, reason: collision with root package name */
    public final u0[] f34276n;

    /* renamed from: o, reason: collision with root package name */
    public final b f34277o;

    /* renamed from: p, reason: collision with root package name */
    public e f34278p;

    /* renamed from: q, reason: collision with root package name */
    public v f34279q;

    /* renamed from: r, reason: collision with root package name */
    public i f34280r;

    /* renamed from: s, reason: collision with root package name */
    public long f34281s;

    /* renamed from: t, reason: collision with root package name */
    public long f34282t;

    /* renamed from: u, reason: collision with root package name */
    public int f34283u;

    /* renamed from: v, reason: collision with root package name */
    public a f34284v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34285w;

    public j(int i10, int[] iArr, v[] vVarArr, l5.n nVar, w0 w0Var, v5.e eVar, long j10, p pVar, n5.l lVar, kq.e eVar2, l0.j jVar) {
        this.f34263a = i10;
        this.f34264b = iArr;
        this.f34265c = vVarArr;
        this.f34267e = nVar;
        this.f34268f = w0Var;
        this.f34269g = jVar;
        this.f34270h = eVar2;
        ArrayList arrayList = new ArrayList();
        this.f34273k = arrayList;
        this.f34274l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f34276n = new u0[length];
        this.f34266d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        u0[] u0VarArr = new u0[i11];
        pVar.getClass();
        lVar.getClass();
        u0 u0Var = new u0(eVar, pVar, lVar);
        this.f34275m = u0Var;
        int i12 = 0;
        iArr2[0] = i10;
        u0VarArr[0] = u0Var;
        while (i12 < length) {
            u0 u0Var2 = new u0(eVar, null, null);
            this.f34276n[i12] = u0Var2;
            int i13 = i12 + 1;
            u0VarArr[i13] = u0Var2;
            iArr2[i13] = this.f34264b[i12];
            i12 = i13;
        }
        this.f34277o = new b(iArr2, u0VarArr);
        this.f34281s = j10;
        this.f34282t = j10;
    }

    @Override // r5.x0
    public final long G() {
        long j10;
        if (this.f34285w) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.f34281s;
        }
        long j11 = this.f34282t;
        a l10 = l();
        if (!l10.c()) {
            ArrayList arrayList = this.f34273k;
            if (arrayList.size() > 1) {
                l10 = (a) jr.h.l(arrayList, 2);
            } else {
                l10 = null;
            }
        }
        if (l10 != null) {
            j11 = Math.max(j11, l10.f34256h);
        }
        u0 u0Var = this.f34275m;
        synchronized (u0Var) {
            j10 = u0Var.f33322v;
        }
        return Math.max(j11, j10);
    }

    @Override // r5.x0
    public final void J(long j10) {
        int size;
        o oVar = this.f34271i;
        if (oVar.f37757c != null || n()) {
            return;
        }
        boolean b10 = oVar.b();
        ArrayList arrayList = this.f34273k;
        List list = this.f34274l;
        l5.a aVar = this.f34267e;
        if (b10) {
            e eVar = this.f34278p;
            eVar.getClass();
            boolean z10 = eVar instanceof a;
            if (z10 && m(arrayList.size() - 1)) {
                return;
            }
            l5.n nVar = (l5.n) aVar;
            if (nVar.f24069l == null && nVar.f24066i.b(j10, eVar, list)) {
                v5.l lVar = oVar.f37756b;
                yk.j.I0(lVar);
                lVar.a(false);
                if (z10) {
                    this.f34284v = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        l5.n nVar2 = (l5.n) aVar;
        if (nVar2.f24069l == null && nVar2.f24066i.length() >= 2) {
            size = nVar2.f24066i.j(j10, list);
        } else {
            size = list.size();
        }
        if (size < arrayList.size()) {
            yk.j.H0(!oVar.b());
            int size2 = arrayList.size();
            while (true) {
                if (size < size2) {
                    if (!m(size)) {
                        break;
                    } else {
                        size++;
                    }
                } else {
                    size = -1;
                    break;
                }
            }
            if (size != -1) {
                long j11 = l().f34256h;
                a k10 = k(size);
                if (arrayList.isEmpty()) {
                    this.f34281s = this.f34282t;
                }
                this.f34285w = false;
                int i10 = this.f34263a;
                l0.j jVar = this.f34269g;
                jVar.getClass();
                jVar.s(new s(1, i10, null, 3, null, x.P(k10.f34255g), x.P(j11)));
            }
        }
    }

    @Override // v5.n
    public final void a() {
        u0 u0Var = this.f34275m;
        u0Var.u(true);
        n5.i iVar = u0Var.f33308h;
        if (iVar != null) {
            iVar.c(u0Var.f33305e);
            u0Var.f33308h = null;
            u0Var.f33307g = null;
        }
        for (u0 u0Var2 : this.f34276n) {
            u0Var2.u(true);
            n5.i iVar2 = u0Var2.f33308h;
            if (iVar2 != null) {
                iVar2.c(u0Var2.f33305e);
                u0Var2.f33308h = null;
                u0Var2.f33307g = null;
            }
        }
        for (l5.l lVar : ((l5.n) this.f34267e).f24065h) {
            g gVar = lVar.f24048a;
            if (gVar != null) {
                ((d) gVar).f34240a.release();
            }
        }
        i iVar3 = this.f34280r;
        if (iVar3 != null) {
            l5.c cVar = (l5.c) iVar3;
            synchronized (cVar) {
                q qVar = (q) cVar.f24000n.remove(this);
                if (qVar != null) {
                    u0 u0Var3 = qVar.f24081a;
                    u0Var3.u(true);
                    n5.i iVar4 = u0Var3.f33308h;
                    if (iVar4 != null) {
                        iVar4.c(u0Var3.f33305e);
                        u0Var3.f33308h = null;
                        u0Var3.f33307g = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x01f2, code lost:
    
        if (r0.n(r0.e(r4), r14) != false) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0271  */
    @Override // v5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v5.j b(v5.m r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.j.b(v5.m, long, long, java.io.IOException, int):v5.j");
    }

    @Override // r5.v0
    public final void c() {
        o oVar = this.f34271i;
        oVar.c();
        u0 u0Var = this.f34275m;
        n5.i iVar = u0Var.f33308h;
        if (iVar != null && iVar.getState() == 1) {
            DrmSession$DrmSessionException f10 = u0Var.f33308h.f();
            f10.getClass();
            throw f10;
        }
        if (!oVar.b()) {
            l5.n nVar = (l5.n) this.f34267e;
            BehindLiveWindowException behindLiveWindowException = nVar.f24069l;
            if (behindLiveWindowException == null) {
                nVar.f24058a.c();
                return;
            }
            throw behindLiveWindowException;
        }
    }

    @Override // r5.v0
    public final boolean d() {
        if (!n() && this.f34275m.q(this.f34285w)) {
            return true;
        }
        return false;
    }

    @Override // r5.v0
    public final int e(long j10) {
        if (n()) {
            return 0;
        }
        boolean z10 = this.f34285w;
        u0 u0Var = this.f34275m;
        int p10 = u0Var.p(j10, z10);
        a aVar = this.f34284v;
        if (aVar != null) {
            p10 = Math.min(p10, aVar.a(0) - u0Var.n());
        }
        u0Var.w(p10);
        t();
        return p10;
    }

    @Override // r5.v0
    public final int f(tr.e eVar, h5.f fVar, int i10) {
        if (n()) {
            return -3;
        }
        a aVar = this.f34284v;
        u0 u0Var = this.f34275m;
        if (aVar != null && aVar.a(0) <= u0Var.n()) {
            return -3;
        }
        t();
        return u0Var.t(eVar, fVar, i10, this.f34285w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [r5.n, java.lang.Object] */
    @Override // v5.k
    public final void h(v5.m mVar, long j10, long j11, boolean z10) {
        e eVar = (e) mVar;
        this.f34278p = null;
        this.f34284v = null;
        long j12 = eVar.f34249a;
        Uri uri = eVar.f34257i.f16627c;
        ?? obj = new Object();
        this.f34270h.getClass();
        this.f34269g.j(obj, eVar.f34251c, this.f34263a, eVar.f34252d, eVar.f34253e, eVar.f34254f, eVar.f34255g, eVar.f34256h);
        if (!z10) {
            if (n()) {
                this.f34275m.u(false);
                for (u0 u0Var : this.f34276n) {
                    u0Var.u(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.f34273k;
                k(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.f34281s = this.f34282t;
                }
            }
            this.f34268f.b(this);
        }
    }

    @Override // r5.x0
    public final long i() {
        if (n()) {
            return this.f34281s;
        }
        if (this.f34285w) {
            return Long.MIN_VALUE;
        }
        return l().f34256h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [r5.n, java.lang.Object] */
    @Override // v5.k
    public final void j(v5.m mVar, long j10, long j11) {
        e eVar = (e) mVar;
        z5.j jVar = null;
        this.f34278p = null;
        l5.n nVar = (l5.n) this.f34267e;
        nVar.getClass();
        if (eVar instanceof l) {
            int e10 = nVar.f24066i.e(((l) eVar).f34252d);
            l5.l[] lVarArr = nVar.f24065h;
            l5.l lVar = lVarArr[e10];
            if (lVar.f24051d == null) {
                g gVar = lVar.f24048a;
                y yVar = ((d) gVar).f34247h;
                if (yVar instanceof z5.j) {
                    jVar = (z5.j) yVar;
                }
                if (jVar != null) {
                    m5.m mVar2 = lVar.f24049b;
                    lVarArr[e10] = new l5.l(lVar.f24052e, mVar2, lVar.f24050c, gVar, lVar.f24053f, new l5.j(jVar, 0, mVar2.f27566c));
                }
            }
        }
        q qVar = nVar.f24064g;
        if (qVar != null) {
            long j12 = qVar.f24084d;
            if (j12 == -9223372036854775807L || eVar.f34256h > j12) {
                qVar.f24084d = eVar.f34256h;
            }
            qVar.f24085e.f24092g = true;
        }
        long j13 = eVar.f34249a;
        Uri uri = eVar.f34257i.f16627c;
        ?? obj = new Object();
        this.f34270h.getClass();
        this.f34269g.l(obj, eVar.f34251c, this.f34263a, eVar.f34252d, eVar.f34253e, eVar.f34254f, eVar.f34255g, eVar.f34256h);
        this.f34268f.b(this);
    }

    public final a k(int i10) {
        ArrayList arrayList = this.f34273k;
        a aVar = (a) arrayList.get(i10);
        int size = arrayList.size();
        int i11 = x.f15050a;
        if (i10 >= 0 && size <= arrayList.size() && i10 <= size) {
            if (i10 != size) {
                arrayList.subList(i10, size).clear();
            }
            this.f34283u = Math.max(this.f34283u, arrayList.size());
            int i12 = 0;
            this.f34275m.k(aVar.a(0));
            while (true) {
                u0[] u0VarArr = this.f34276n;
                if (i12 < u0VarArr.length) {
                    u0 u0Var = u0VarArr[i12];
                    i12++;
                    u0Var.k(aVar.a(i12));
                } else {
                    return aVar;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final a l() {
        return (a) jr.h.l(this.f34273k, 1);
    }

    public final boolean m(int i10) {
        int n10;
        a aVar = (a) this.f34273k.get(i10);
        if (this.f34275m.n() > aVar.a(0)) {
            return true;
        }
        int i11 = 0;
        do {
            u0[] u0VarArr = this.f34276n;
            if (i11 >= u0VarArr.length) {
                return false;
            }
            n10 = u0VarArr[i11].n();
            i11++;
        } while (n10 <= aVar.a(i11));
        return true;
    }

    public final boolean n() {
        return this.f34281s != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ca, code lost:
    
        if (r2 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0438  */
    @Override // r5.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(long r50) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.j.s(long):boolean");
    }

    public final void t() {
        int v10 = v(this.f34275m.n(), this.f34283u - 1);
        while (true) {
            int i10 = this.f34283u;
            if (i10 <= v10) {
                this.f34283u = i10 + 1;
                a aVar = (a) this.f34273k.get(i10);
                v vVar = aVar.f34252d;
                if (!vVar.equals(this.f34279q)) {
                    this.f34269g.c(this.f34263a, vVar, aVar.f34253e, aVar.f34254f, aVar.f34255g);
                }
                this.f34279q = vVar;
            } else {
                return;
            }
        }
    }

    @Override // r5.x0
    public final boolean u() {
        return this.f34271i.b();
    }

    public final int v(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.f34273k;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).a(0) <= i10);
        return i11 - 1;
    }

    public final void x(i iVar) {
        this.f34280r = iVar;
        u0 u0Var = this.f34275m;
        u0Var.i();
        n5.i iVar2 = u0Var.f33308h;
        if (iVar2 != null) {
            iVar2.c(u0Var.f33305e);
            u0Var.f33308h = null;
            u0Var.f33307g = null;
        }
        for (u0 u0Var2 : this.f34276n) {
            u0Var2.i();
            n5.i iVar3 = u0Var2.f33308h;
            if (iVar3 != null) {
                iVar3.c(u0Var2.f33305e);
                u0Var2.f33308h = null;
                u0Var2.f33307g = null;
            }
        }
        this.f34271i.d(this);
    }
}
