package n5;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import j5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final List f28252a;

    /* renamed from: b, reason: collision with root package name */
    public final w f28253b;

    /* renamed from: c, reason: collision with root package name */
    public final h.c f28254c;

    /* renamed from: d, reason: collision with root package name */
    public final hr.c f28255d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28256e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28257f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28258g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f28259h;

    /* renamed from: i, reason: collision with root package name */
    public final e5.e f28260i;

    /* renamed from: j, reason: collision with root package name */
    public final kq.e f28261j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f28262k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f28263l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f28264m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f28265n;

    /* renamed from: o, reason: collision with root package name */
    public final c f28266o;

    /* renamed from: p, reason: collision with root package name */
    public int f28267p;

    /* renamed from: q, reason: collision with root package name */
    public int f28268q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f28269r;

    /* renamed from: s, reason: collision with root package name */
    public a f28270s;

    /* renamed from: t, reason: collision with root package name */
    public h5.b f28271t;

    /* renamed from: u, reason: collision with root package name */
    public DrmSession$DrmSessionException f28272u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f28273v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f28274w;

    /* renamed from: x, reason: collision with root package name */
    public u f28275x;

    /* renamed from: y, reason: collision with root package name */
    public v f28276y;

    public d(UUID uuid, w wVar, h.c cVar, hr.c cVar2, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, b0 b0Var, Looper looper, kq.e eVar, d0 d0Var) {
        if (i10 == 1 || i10 == 3) {
            bArr.getClass();
        }
        this.f28264m = uuid;
        this.f28254c = cVar;
        this.f28255d = cVar2;
        this.f28253b = wVar;
        this.f28256e = i10;
        this.f28257f = z10;
        this.f28258g = z11;
        if (bArr != null) {
            this.f28274w = bArr;
            this.f28252a = null;
        } else {
            list.getClass();
            this.f28252a = Collections.unmodifiableList(list);
        }
        this.f28259h = hashMap;
        this.f28263l = b0Var;
        this.f28260i = new e5.e();
        this.f28261j = eVar;
        this.f28262k = d0Var;
        this.f28267p = 2;
        this.f28265n = looper;
        this.f28266o = new c(this, looper);
    }

    @Override // n5.i
    public final void a(l lVar) {
        int i10;
        o();
        boolean z10 = false;
        if (this.f28268q < 0) {
            e5.m.c("DefaultDrmSession", "Session reference count less than zero: " + this.f28268q);
            this.f28268q = 0;
        }
        if (lVar != null) {
            e5.e eVar = this.f28260i;
            synchronized (eVar.f15006a) {
                try {
                    ArrayList arrayList = new ArrayList(eVar.f15009d);
                    arrayList.add(lVar);
                    eVar.f15009d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) eVar.f15007b.get(lVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(eVar.f15008c);
                        hashSet.add(lVar);
                        eVar.f15008c = Collections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = eVar.f15007b;
                    if (num != null) {
                        i10 = num.intValue() + 1;
                    } else {
                        i10 = 1;
                    }
                    hashMap.put(lVar, Integer.valueOf(i10));
                } finally {
                }
            }
        }
        int i11 = this.f28268q + 1;
        this.f28268q = i11;
        if (i11 == 1) {
            if (this.f28267p == 2) {
                z10 = true;
            }
            yk.j.H0(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f28269r = handlerThread;
            handlerThread.start();
            this.f28270s = new a(this, this.f28269r.getLooper());
            if (l()) {
                h(true);
            }
        } else if (lVar != null && i() && this.f28260i.b(lVar) == 1) {
            lVar.d(this.f28267p);
        }
        hr.c cVar = this.f28255d;
        g gVar = (g) cVar.f18690b;
        if (gVar.f28292l != -9223372036854775807L) {
            gVar.f28295o.remove(this);
            Handler handler = ((g) cVar.f18690b).f28301u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // n5.i
    public final UUID b() {
        o();
        return this.f28264m;
    }

    @Override // n5.i
    public final void c(l lVar) {
        o();
        int i10 = this.f28268q;
        if (i10 <= 0) {
            e5.m.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f28268q = i11;
        if (i11 == 0) {
            this.f28267p = 0;
            c cVar = this.f28266o;
            int i12 = e5.x.f15050a;
            cVar.removeCallbacksAndMessages(null);
            a aVar = this.f28270s;
            synchronized (aVar) {
                aVar.removeCallbacksAndMessages(null);
                aVar.f28236a = true;
            }
            this.f28270s = null;
            this.f28269r.quit();
            this.f28269r = null;
            this.f28271t = null;
            this.f28272u = null;
            this.f28275x = null;
            this.f28276y = null;
            byte[] bArr = this.f28273v;
            if (bArr != null) {
                this.f28253b.q(bArr);
                this.f28273v = null;
            }
        }
        if (lVar != null) {
            e5.e eVar = this.f28260i;
            synchronized (eVar.f15006a) {
                try {
                    Integer num = (Integer) eVar.f15007b.get(lVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(eVar.f15009d);
                        arrayList.remove(lVar);
                        eVar.f15009d = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            eVar.f15007b.remove(lVar);
                            HashSet hashSet = new HashSet(eVar.f15008c);
                            hashSet.remove(lVar);
                            eVar.f15008c = Collections.unmodifiableSet(hashSet);
                        } else {
                            eVar.f15007b.put(lVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.f28260i.b(lVar) == 0) {
                lVar.f();
            }
        }
        hr.c cVar2 = this.f28255d;
        int i13 = this.f28268q;
        if (i13 == 1) {
            g gVar = (g) cVar2.f18690b;
            if (gVar.f28296p > 0 && gVar.f28292l != -9223372036854775807L) {
                gVar.f28295o.add(this);
                Handler handler = ((g) cVar2.f18690b).f28301u;
                handler.getClass();
                handler.postAtTime(new androidx.activity.b(this, 17), this, SystemClock.uptimeMillis() + ((g) cVar2.f18690b).f28292l);
                ((g) cVar2.f18690b).k();
            }
        }
        if (i13 == 0) {
            ((g) cVar2.f18690b).f28293m.remove(this);
            g gVar2 = (g) cVar2.f18690b;
            if (gVar2.f28298r == this) {
                gVar2.f28298r = null;
            }
            if (gVar2.f28299s == this) {
                gVar2.f28299s = null;
            }
            h.c cVar3 = gVar2.f28289i;
            ((Set) cVar3.f17583b).remove(this);
            if (((d) cVar3.f17584c) == this) {
                cVar3.f17584c = null;
                if (!((Set) cVar3.f17583b).isEmpty()) {
                    d dVar = (d) ((Set) cVar3.f17583b).iterator().next();
                    cVar3.f17584c = dVar;
                    v f10 = dVar.f28253b.f();
                    dVar.f28276y = f10;
                    a aVar2 = dVar.f28270s;
                    int i14 = e5.x.f15050a;
                    f10.getClass();
                    aVar2.getClass();
                    aVar2.obtainMessage(0, new b(r5.n.f33243a.getAndIncrement(), true, SystemClock.elapsedRealtime(), f10)).sendToTarget();
                }
            }
            g gVar3 = (g) cVar2.f18690b;
            if (gVar3.f28292l != -9223372036854775807L) {
                Handler handler2 = gVar3.f28301u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                ((g) cVar2.f18690b).f28295o.remove(this);
            }
        }
        ((g) cVar2.f18690b).k();
    }

    @Override // n5.i
    public final boolean d() {
        o();
        return this.f28257f;
    }

    @Override // n5.i
    public final boolean e(String str) {
        o();
        byte[] bArr = this.f28273v;
        yk.j.I0(bArr);
        return this.f28253b.A(str, bArr);
    }

    @Override // n5.i
    public final DrmSession$DrmSessionException f() {
        o();
        if (this.f28267p == 1) {
            return this.f28272u;
        }
        return null;
    }

    @Override // n5.i
    public final h5.b g() {
        o();
        return this.f28271t;
    }

    @Override // n5.i
    public final int getState() {
        o();
        return this.f28267p;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:62|(2:63|64)|(6:66|67|68|69|(1:71)|73)|76|67|68|69|(0)|73) */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0095 A[Catch: NumberFormatException -> 0x0099, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0099, blocks: (B:69:0x008d, B:71:0x0095), top: B:68:0x008d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.d.h(boolean):void");
    }

    public final boolean i() {
        int i10 = this.f28267p;
        return i10 == 3 || i10 == 4;
    }

    public final void j(int i10, Exception exc) {
        int i11;
        Set set;
        int i12 = e5.x.f15050a;
        if (i12 >= 21 && r.a(exc)) {
            i11 = r.b(exc);
        } else {
            if (i12 < 23 || !s.a(exc)) {
                if (i12 < 18 || !q.b(exc)) {
                    if (i12 >= 18 && q.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        i11 = 6001;
                    } else if (exc instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i11 = 6003;
                    } else if (exc instanceof KeysExpiredException) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        }
        this.f28272u = new DrmSession$DrmSessionException(i11, exc);
        e5.m.d("DefaultDrmSession", "DRM session error", exc);
        b3.t tVar = new b3.t(exc, 11);
        e5.e eVar = this.f28260i;
        synchronized (eVar.f15006a) {
            set = eVar.f15008c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tVar.b((l) it.next());
        }
        if (this.f28267p != 4) {
            this.f28267p = 1;
        }
    }

    public final void k(Exception exc, boolean z10) {
        int i10;
        if (exc instanceof NotProvisionedException) {
            h.c cVar = this.f28254c;
            ((Set) cVar.f17583b).add(this);
            if (((d) cVar.f17584c) == null) {
                cVar.f17584c = this;
                v f10 = this.f28253b.f();
                this.f28276y = f10;
                a aVar = this.f28270s;
                int i11 = e5.x.f15050a;
                f10.getClass();
                aVar.getClass();
                aVar.obtainMessage(0, new b(r5.n.f33243a.getAndIncrement(), true, SystemClock.elapsedRealtime(), f10)).sendToTarget();
                return;
            }
            return;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        j(i10, exc);
    }

    public final boolean l() {
        Set set;
        if (i()) {
            return true;
        }
        try {
            byte[] n10 = this.f28253b.n();
            this.f28273v = n10;
            this.f28253b.l(n10, this.f28262k);
            this.f28271t = this.f28253b.m(this.f28273v);
            this.f28267p = 3;
            e5.e eVar = this.f28260i;
            synchronized (eVar.f15006a) {
                set = eVar.f15008c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((l) it.next()).d(3);
            }
            this.f28273v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            h.c cVar = this.f28254c;
            ((Set) cVar.f17583b).add(this);
            if (((d) cVar.f17584c) == null) {
                cVar.f17584c = this;
                v f10 = this.f28253b.f();
                this.f28276y = f10;
                a aVar = this.f28270s;
                int i10 = e5.x.f15050a;
                f10.getClass();
                aVar.getClass();
                aVar.obtainMessage(0, new b(r5.n.f33243a.getAndIncrement(), true, SystemClock.elapsedRealtime(), f10)).sendToTarget();
            }
            return false;
        } catch (Exception e10) {
            j(1, e10);
            return false;
        }
    }

    public final void m(byte[] bArr, int i10, boolean z10) {
        try {
            u v10 = this.f28253b.v(bArr, this.f28252a, i10, this.f28259h);
            this.f28275x = v10;
            a aVar = this.f28270s;
            int i11 = e5.x.f15050a;
            v10.getClass();
            aVar.getClass();
            aVar.obtainMessage(1, new b(r5.n.f33243a.getAndIncrement(), z10, SystemClock.elapsedRealtime(), v10)).sendToTarget();
        } catch (Exception e10) {
            k(e10, true);
        }
    }

    public final Map n() {
        o();
        byte[] bArr = this.f28273v;
        if (bArr == null) {
            return null;
        }
        return this.f28253b.c(bArr);
    }

    public final void o() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f28265n;
        if (currentThread != looper.getThread()) {
            e5.m.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
