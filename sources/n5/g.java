package n5;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import b5.r0;
import h.m0;
import j5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import lp.j1;
import lp.l0;
import lp.o0;
import lp.v0;
import lp.y1;

/* loaded from: classes.dex */
public final class g implements p {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f28282b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.firebase.messaging.m f28283c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f28284d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f28285e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28286f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f28287g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28288h;

    /* renamed from: i, reason: collision with root package name */
    public final h.c f28289i;

    /* renamed from: j, reason: collision with root package name */
    public final kq.e f28290j;

    /* renamed from: k, reason: collision with root package name */
    public final hr.c f28291k;

    /* renamed from: l, reason: collision with root package name */
    public final long f28292l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f28293m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f28294n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f28295o;

    /* renamed from: p, reason: collision with root package name */
    public int f28296p;

    /* renamed from: q, reason: collision with root package name */
    public w f28297q;

    /* renamed from: r, reason: collision with root package name */
    public d f28298r;

    /* renamed from: s, reason: collision with root package name */
    public d f28299s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f28300t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f28301u;

    /* renamed from: v, reason: collision with root package name */
    public int f28302v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f28303w;

    /* renamed from: x, reason: collision with root package name */
    public d0 f28304x;

    /* renamed from: y, reason: collision with root package name */
    public volatile e f28305y;

    public g(UUID uuid, com.google.firebase.messaging.m mVar, b0 b0Var, HashMap hashMap, boolean z10, int[] iArr, boolean z11, kq.e eVar, long j10) {
        uuid.getClass();
        yk.j.F0(!b5.l.f3400b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f28282b = uuid;
        this.f28283c = mVar;
        this.f28284d = b0Var;
        this.f28285e = hashMap;
        this.f28286f = z10;
        this.f28287g = iArr;
        this.f28288h = z11;
        this.f28290j = eVar;
        this.f28289i = new h.c(this);
        this.f28291k = new hr.c(this);
        this.f28302v = 0;
        this.f28293m = new ArrayList();
        this.f28294n = Collections.newSetFromMap(new IdentityHashMap());
        this.f28295o = Collections.newSetFromMap(new IdentityHashMap());
        this.f28292l = j10;
    }

    public static boolean g(d dVar) {
        dVar.o();
        if (dVar.f28267p == 1) {
            if (e5.x.f15050a < 19) {
                return true;
            }
            DrmSession$DrmSessionException f10 = dVar.f();
            f10.getClass();
            if (f10.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList j(b5.r rVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(rVar.f3582d);
        for (int i10 = 0; i10 < rVar.f3582d; i10++) {
            b5.q qVar = rVar.f3579a[i10];
            if ((qVar.a(uuid) || (b5.l.f3401c.equals(uuid) && qVar.a(b5.l.f3400b))) && (qVar.f3576e != null || z10)) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [n5.w] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    @Override // n5.p
    public final void a() {
        ?? r12;
        l(true);
        int i10 = this.f28296p;
        this.f28296p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f28297q == null) {
            UUID uuid = this.f28282b;
            this.f28283c.getClass();
            try {
                try {
                    try {
                        r12 = new a0(uuid);
                    } catch (UnsupportedSchemeException e10) {
                        throw new Exception(e10);
                    }
                } catch (Exception e11) {
                    throw new Exception(e11);
                }
            } catch (UnsupportedDrmException unused) {
                e5.m.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                r12 = new Object();
            }
            this.f28297q = r12;
            r12.j(new t9.c(this));
            return;
        }
        if (this.f28292l != -9223372036854775807L) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f28293m;
                if (i11 < arrayList.size()) {
                    ((d) arrayList.get(i11)).a(null);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // n5.p
    public final i b(l lVar, b5.v vVar) {
        boolean z10 = false;
        l(false);
        if (this.f28296p > 0) {
            z10 = true;
        }
        yk.j.H0(z10);
        yk.j.I0(this.f28300t);
        return f(this.f28300t, lVar, vVar, true);
    }

    @Override // n5.p
    public final void c(Looper looper, d0 d0Var) {
        boolean z10;
        synchronized (this) {
            try {
                Looper looper2 = this.f28300t;
                if (looper2 == null) {
                    this.f28300t = looper;
                    this.f28301u = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yk.j.H0(z10);
                    this.f28301u.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f28304x = d0Var;
    }

    @Override // n5.p
    public final int d(b5.v vVar) {
        l(false);
        w wVar = this.f28297q;
        wVar.getClass();
        int x10 = wVar.x();
        b5.r rVar = vVar.f3655o;
        if (rVar == null) {
            int h10 = r0.h(vVar.f3652l);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f28287g;
                if (i10 >= iArr.length) {
                    return 0;
                }
                if (iArr[i10] == h10) {
                    if (i10 == -1) {
                        return 0;
                    }
                    return x10;
                }
                i10++;
            }
        } else {
            if (this.f28303w == null) {
                UUID uuid = this.f28282b;
                if (j(rVar, uuid, true).isEmpty()) {
                    if (rVar.f3582d == 1 && rVar.f3579a[0].a(b5.l.f3400b)) {
                        e5.m.f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                    }
                    return 1;
                }
                String str = rVar.f3581c;
                if (str != null && !"cenc".equals(str)) {
                    if ("cbcs".equals(str)) {
                        if (e5.x.f15050a >= 25) {
                            return x10;
                        }
                    } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                        return x10;
                    }
                    return 1;
                }
                return x10;
            }
            return x10;
        }
    }

    @Override // n5.p
    public final o e(l lVar, b5.v vVar) {
        boolean z10;
        if (this.f28296p > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        yk.j.I0(this.f28300t);
        f fVar = new f(this, lVar);
        Handler handler = this.f28301u;
        handler.getClass();
        handler.post(new m0(12, fVar, vVar));
        return fVar;
    }

    public final i f(Looper looper, l lVar, b5.v vVar, boolean z10) {
        ArrayList arrayList;
        if (this.f28305y == null) {
            this.f28305y = new e(this, looper);
        }
        b5.r rVar = vVar.f3655o;
        d dVar = null;
        if (rVar == null) {
            int h10 = r0.h(vVar.f3652l);
            w wVar = this.f28297q;
            wVar.getClass();
            if (wVar.x() == 2 && x.f28323d) {
                return null;
            }
            int[] iArr = this.f28287g;
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (iArr[i10] == h10) {
                    if (i10 == -1 || wVar.x() == 1) {
                        return null;
                    }
                    d dVar2 = this.f28298r;
                    if (dVar2 == null) {
                        l0 l0Var = o0.f25025b;
                        d i11 = i(j1.f24998e, true, null, z10);
                        this.f28293m.add(i11);
                        this.f28298r = i11;
                    } else {
                        dVar2.a(null);
                    }
                    return this.f28298r;
                }
            }
            return null;
        }
        if (this.f28303w == null) {
            arrayList = j(rVar, this.f28282b, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f28282b);
                e5.m.d("DefaultDrmSessionMgr", "DRM error", exc);
                if (lVar != null) {
                    lVar.e(exc);
                }
                return new t(new DrmSession$DrmSessionException(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.f28286f) {
            dVar = this.f28299s;
        } else {
            Iterator it = this.f28293m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar3 = (d) it.next();
                if (e5.x.a(dVar3.f28252a, arrayList)) {
                    dVar = dVar3;
                    break;
                }
            }
        }
        if (dVar == null) {
            dVar = i(arrayList, false, lVar, z10);
            if (!this.f28286f) {
                this.f28299s = dVar;
            }
            this.f28293m.add(dVar);
        } else {
            dVar.a(lVar);
        }
        return dVar;
    }

    public final d h(List list, boolean z10, l lVar) {
        this.f28297q.getClass();
        boolean z11 = this.f28288h | z10;
        UUID uuid = this.f28282b;
        w wVar = this.f28297q;
        h.c cVar = this.f28289i;
        hr.c cVar2 = this.f28291k;
        int i10 = this.f28302v;
        byte[] bArr = this.f28303w;
        HashMap hashMap = this.f28285e;
        b0 b0Var = this.f28284d;
        Looper looper = this.f28300t;
        looper.getClass();
        kq.e eVar = this.f28290j;
        d0 d0Var = this.f28304x;
        d0Var.getClass();
        d dVar = new d(uuid, wVar, cVar, cVar2, list, i10, z11, z10, bArr, hashMap, b0Var, looper, eVar, d0Var);
        dVar.a(lVar);
        if (this.f28292l != -9223372036854775807L) {
            dVar.a(null);
        }
        return dVar;
    }

    public final d i(List list, boolean z10, l lVar, boolean z11) {
        d h10 = h(list, z10, lVar);
        boolean g10 = g(h10);
        long j10 = this.f28292l;
        Set set = this.f28295o;
        if (g10 && !set.isEmpty()) {
            y1 it = v0.q(set).iterator();
            while (it.hasNext()) {
                ((i) it.next()).c(null);
            }
            h10.c(lVar);
            if (j10 != -9223372036854775807L) {
                h10.c(null);
            }
            h10 = h(list, z10, lVar);
        }
        if (g(h10) && z11) {
            Set set2 = this.f28294n;
            if (!set2.isEmpty()) {
                y1 it2 = v0.q(set2).iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    y1 it3 = v0.q(set).iterator();
                    while (it3.hasNext()) {
                        ((i) it3.next()).c(null);
                    }
                }
                h10.c(lVar);
                if (j10 != -9223372036854775807L) {
                    h10.c(null);
                }
                return h(list, z10, lVar);
            }
            return h10;
        }
        return h10;
    }

    public final void k() {
        if (this.f28297q != null && this.f28296p == 0 && this.f28293m.isEmpty() && this.f28294n.isEmpty()) {
            w wVar = this.f28297q;
            wVar.getClass();
            wVar.release();
            this.f28297q = null;
        }
    }

    public final void l(boolean z10) {
        if (z10 && this.f28300t == null) {
            e5.m.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f28300t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            e5.m.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f28300t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // n5.p
    public final void release() {
        l(true);
        int i10 = this.f28296p - 1;
        this.f28296p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f28292l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f28293m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).c(null);
            }
        }
        y1 it = v0.q(this.f28294n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
        k();
    }
}
