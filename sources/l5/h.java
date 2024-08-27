package l5;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import b5.e0;
import b5.f0;
import b5.k0;
import b5.l0;
import e5.x;
import g5.u;
import j5.d0;
import java.util.Map;
import r5.w;

/* loaded from: classes.dex */
public final class h extends r5.a {
    public static final /* synthetic */ int Q = 0;
    public g5.f A;
    public v5.o B;
    public u C;
    public DashManifestStaleException D;
    public Handler E;
    public e0 F;
    public Uri G;
    public final Uri H;
    public m5.c I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long O;
    public int P;

    /* renamed from: h, reason: collision with root package name */
    public final k0 f24025h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f24026i;

    /* renamed from: j, reason: collision with root package name */
    public final g5.e f24027j;

    /* renamed from: k, reason: collision with root package name */
    public final k f24028k;

    /* renamed from: l, reason: collision with root package name */
    public final mt.p f24029l;

    /* renamed from: m, reason: collision with root package name */
    public final n5.p f24030m;

    /* renamed from: n, reason: collision with root package name */
    public final kq.e f24031n;

    /* renamed from: o, reason: collision with root package name */
    public final h8.h f24032o;

    /* renamed from: p, reason: collision with root package name */
    public final long f24033p;

    /* renamed from: q, reason: collision with root package name */
    public final long f24034q;

    /* renamed from: r, reason: collision with root package name */
    public final l0.j f24035r;

    /* renamed from: s, reason: collision with root package name */
    public final v5.q f24036s;

    /* renamed from: t, reason: collision with root package name */
    public final g f24037t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24038u;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f24039v;

    /* renamed from: w, reason: collision with root package name */
    public final d f24040w;

    /* renamed from: x, reason: collision with root package name */
    public final d f24041x;

    /* renamed from: y, reason: collision with root package name */
    public final t9.c f24042y;

    /* renamed from: z, reason: collision with root package name */
    public final v5.p f24043z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [l5.d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [l5.d] */
    public h(k0 k0Var, g5.e eVar, v5.q qVar, k kVar, mt.p pVar, n5.p pVar2, kq.e eVar2, long j10, long j11) {
        this.f24025h = k0Var;
        this.F = k0Var.f3391c;
        f0 f0Var = k0Var.f3390b;
        f0Var.getClass();
        Uri uri = f0Var.f3289a;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.f24027j = eVar;
        this.f24036s = qVar;
        this.f24028k = kVar;
        this.f24030m = pVar2;
        this.f24031n = eVar2;
        this.f24033p = j10;
        this.f24034q = j11;
        this.f24029l = pVar;
        this.f24032o = new h8.h(4);
        final int i10 = 0;
        this.f24026i = false;
        this.f24035r = a(null);
        this.f24038u = new Object();
        this.f24039v = new SparseArray();
        this.f24042y = new t9.c(this);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.f24037t = new g(this, i10);
        this.f24043z = new hr.c(this, 14);
        this.f24040w = new Runnable(this) { // from class: l5.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f24011b;

            {
                this.f24011b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                h hVar = this.f24011b;
                switch (i11) {
                    case 0:
                        hVar.x();
                        return;
                    default:
                        hVar.v(false);
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f24041x = new Runnable(this) { // from class: l5.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f24011b;

            {
                this.f24011b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                h hVar = this.f24011b;
                switch (i112) {
                    case 0:
                        hVar.x();
                        return;
                    default:
                        hVar.v(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean s(m5.h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f27549c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            m5.a r2 = (m5.a) r2
            int r2 = r2.f27504b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.h.s(m5.h):boolean");
    }

    @Override // r5.a
    public final r5.u b(w wVar, v5.e eVar, long j10) {
        int intValue = ((Integer) wVar.f3556a).intValue() - this.P;
        l0.j a10 = a(wVar);
        n5.l lVar = new n5.l(this.f33078d.f28316c, 0, wVar);
        int i10 = this.P + intValue;
        m5.c cVar = this.I;
        h8.h hVar = this.f24032o;
        k kVar = this.f24028k;
        u uVar = this.C;
        n5.p pVar = this.f24030m;
        kq.e eVar2 = this.f24031n;
        long j11 = this.M;
        v5.p pVar2 = this.f24043z;
        mt.p pVar3 = this.f24029l;
        t9.c cVar2 = this.f24042y;
        d0 d0Var = this.f33081g;
        yk.j.I0(d0Var);
        c cVar3 = new c(i10, cVar, hVar, intValue, kVar, uVar, pVar, lVar, eVar2, a10, j11, pVar2, eVar, pVar3, cVar2, d0Var);
        this.f24039v.put(i10, cVar3);
        return cVar3;
    }

    @Override // r5.a
    public final k0 h() {
        return this.f24025h;
    }

    @Override // r5.a
    public final void j() {
        this.f24043z.c();
    }

    @Override // r5.a
    public final void l(u uVar) {
        this.C = uVar;
        Looper myLooper = Looper.myLooper();
        d0 d0Var = this.f33081g;
        yk.j.I0(d0Var);
        n5.p pVar = this.f24030m;
        pVar.c(myLooper, d0Var);
        pVar.a();
        if (this.f24026i) {
            v(false);
            return;
        }
        this.A = this.f24027j.a();
        this.B = new v5.o("DashMediaSource");
        this.E = x.l(null);
        x();
    }

    @Override // r5.a
    public final void n(r5.u uVar) {
        c cVar = (c) uVar;
        r rVar = cVar.f23999m;
        rVar.f24094i = true;
        rVar.f24089d.removeCallbacksAndMessages(null);
        for (s5.j jVar : cVar.f24004r) {
            jVar.x(cVar);
        }
        cVar.f24003q = null;
        this.f24039v.remove(cVar.f23987a);
    }

    @Override // r5.a
    public final void p() {
        m5.c cVar;
        this.J = false;
        this.A = null;
        v5.o oVar = this.B;
        if (oVar != null) {
            oVar.d(null);
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        if (this.f24026i) {
            cVar = this.I;
        } else {
            cVar = null;
        }
        this.I = cVar;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.f24039v.clear();
        h8.h hVar = this.f24032o;
        ((Map) hVar.f18056b).clear();
        ((Map) hVar.f18057c).clear();
        ((Map) hVar.f18058d).clear();
        this.f24030m.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [v5.m, java.lang.Object] */
    public final void t() {
        boolean z10;
        v5.o oVar;
        v5.o oVar2 = this.B;
        e.l lVar = new e.l(this, 16);
        synchronized (w5.b.f38812b) {
            z10 = w5.b.f38813c;
            oVar = oVar2;
        }
        if (z10) {
            lVar.M();
            return;
        }
        if (oVar2 == null) {
            oVar = new v5.o("SntpClient");
        }
        oVar.e(new Object(), new g(lVar, 2), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [r5.n, java.lang.Object] */
    public final void u(v5.r rVar) {
        long j10 = rVar.f37758a;
        Uri uri = rVar.f37761d.f16627c;
        ?? obj = new Object();
        this.f24031n.getClass();
        this.f24035r.j(obj, rVar.f37760c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
    
        r2 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04a9, code lost:
    
        if (r10 > 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04ac, code lost:
    
        if (r10 < 0) goto L239;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:218:0x047e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cb  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r2v20, types: [u5.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(boolean r45) {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.h.v(boolean):void");
    }

    public final void w(v5.r rVar, g gVar, int i10) {
        this.B.e(rVar, gVar, i10);
        this.f24035r.p(new r5.n(rVar.f37759b), rVar.f37760c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x() {
        Uri uri;
        this.E.removeCallbacks(this.f24040w);
        v5.o oVar = this.B;
        if (oVar.f37757c != null) {
            return;
        }
        if (oVar.b()) {
            this.J = true;
            return;
        }
        synchronized (this.f24038u) {
            uri = this.G;
        }
        this.J = false;
        w(new v5.r(this.A, uri, 4, this.f24036s), this.f24037t, this.f24031n.H(4));
    }
}
