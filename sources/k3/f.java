package k3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import e5.r;
import e5.s;
import e5.t;
import h.r0;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21990a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21991b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21992c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21993d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f21994e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractCollection f21995f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractCollection f21996g;

    /* renamed from: h, reason: collision with root package name */
    public Object f21997h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f21998i;

    public f(j3.e eVar) {
        this.f21990a = true;
        this.f21991b = true;
        this.f21994e = new ArrayList();
        this.f21995f = new ArrayList();
        this.f21997h = null;
        this.f21998i = new Object();
        this.f21996g = new ArrayList();
        this.f21992c = eVar;
        this.f21993d = eVar;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f21998i) {
            try {
                if (this.f21990a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f21995f).add(new e5.l(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [k3.m, java.lang.Object] */
    public final void b(g gVar, int i10, ArrayList arrayList, m mVar) {
        q qVar = gVar.f22002d;
        if (qVar.f22031c == null) {
            j3.e eVar = (j3.e) this.f21992c;
            if (qVar != eVar.f20854d) {
                m mVar2 = mVar;
                if (qVar != eVar.f20856e) {
                    if (mVar == null) {
                        ?? obj = new Object();
                        obj.f22014a = null;
                        obj.f22015b = new ArrayList();
                        obj.f22014a = qVar;
                        arrayList.add(obj);
                        mVar2 = obj;
                    }
                    qVar.f22031c = mVar2;
                    mVar2.f22015b.add(qVar);
                    g gVar2 = qVar.f22036h;
                    Iterator it = gVar2.f22009k.iterator();
                    while (it.hasNext()) {
                        e eVar2 = (e) it.next();
                        if (eVar2 instanceof g) {
                            b((g) eVar2, i10, arrayList, mVar2);
                        }
                    }
                    g gVar3 = qVar.f22037i;
                    Iterator it2 = gVar3.f22009k.iterator();
                    while (it2.hasNext()) {
                        e eVar3 = (e) it2.next();
                        if (eVar3 instanceof g) {
                            b((g) eVar3, i10, arrayList, mVar2);
                        }
                    }
                    if (i10 == 1 && (qVar instanceof n)) {
                        Iterator it3 = ((n) qVar).f22016k.f22009k.iterator();
                        while (it3.hasNext()) {
                            e eVar4 = (e) it3.next();
                            if (eVar4 instanceof g) {
                                b((g) eVar4, i10, arrayList, mVar2);
                            }
                        }
                    }
                    Iterator it4 = gVar2.f22010l.iterator();
                    while (it4.hasNext()) {
                        b((g) it4.next(), i10, arrayList, mVar2);
                    }
                    Iterator it5 = gVar3.f22010l.iterator();
                    while (it5.hasNext()) {
                        b((g) it5.next(), i10, arrayList, mVar2);
                    }
                    if (i10 == 1 && (qVar instanceof n)) {
                        Iterator it6 = ((n) qVar).f22016k.f22010l.iterator();
                        while (it6.hasNext()) {
                            b((g) it6.next(), i10, arrayList, mVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x025c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(j3.e r17) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.f.c(j3.e):void");
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.f21994e;
        arrayList.clear();
        j3.e eVar = (j3.e) this.f21993d;
        eVar.f20854d.f();
        eVar.f20856e.f();
        arrayList.add(eVar.f20854d);
        arrayList.add(eVar.f20856e);
        Iterator it = eVar.f20935s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            j3.d dVar = (j3.d) it.next();
            if (dVar instanceof j3.h) {
                q qVar = new q(dVar);
                dVar.f20854d.f();
                dVar.f20856e.f();
                qVar.f22034f = ((j3.h) dVar).f20924w0;
                arrayList.add(qVar);
            } else {
                if (dVar.z()) {
                    if (dVar.f20850b == null) {
                        dVar.f20850b = new d(0, dVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f20850b);
                } else {
                    arrayList.add(dVar.f20854d);
                }
                if (dVar.A()) {
                    if (dVar.f20852c == null) {
                        dVar.f20852c = new d(1, dVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f20852c);
                } else {
                    arrayList.add(dVar.f20856e);
                }
                if (dVar instanceof j3.j) {
                    arrayList.add(new q(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((q) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            q qVar2 = (q) it3.next();
            if (qVar2.f22030b != eVar) {
                qVar2.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f21996g;
        arrayList2.clear();
        j3.e eVar2 = (j3.e) this.f21992c;
        f(eVar2.f20854d, 0, arrayList2);
        f(eVar2.f20856e, 1, arrayList2);
        this.f21990a = false;
    }

    public final int e(j3.e eVar, int i10) {
        q qVar;
        q qVar2;
        ArrayList arrayList;
        int i11;
        int i12;
        long j10;
        float f10;
        long j11;
        j3.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f21996g;
        int size = arrayList2.size();
        int i13 = 0;
        long j12 = 0;
        while (i13 < size) {
            q qVar3 = ((m) arrayList2.get(i13)).f22014a;
            if (!(qVar3 instanceof d) ? !(i10 != 0 ? (qVar3 instanceof n) : (qVar3 instanceof l)) : ((d) qVar3).f22034f != i10) {
                arrayList = arrayList2;
                i11 = size;
                i12 = i13;
                j10 = 0;
            } else {
                if (i10 == 0) {
                    qVar = eVar2.f20854d;
                } else {
                    qVar = eVar2.f20856e;
                }
                g gVar = qVar.f22036h;
                if (i10 == 0) {
                    qVar2 = eVar2.f20854d;
                } else {
                    qVar2 = eVar2.f20856e;
                }
                g gVar2 = qVar2.f22037i;
                boolean contains = qVar3.f22036h.f22010l.contains(gVar);
                g gVar3 = qVar3.f22037i;
                boolean contains2 = gVar3.f22010l.contains(gVar2);
                long j13 = qVar3.j();
                g gVar4 = qVar3.f22036h;
                if (contains && contains2) {
                    long b10 = m.b(gVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i11 = size;
                    long a10 = m.a(gVar3, 0L);
                    long j14 = b10 - j13;
                    int i14 = gVar3.f22004f;
                    arrayList = arrayList3;
                    i12 = i13;
                    if (j14 >= (-i14)) {
                        j14 += i14;
                    }
                    long j15 = (-a10) - j13;
                    long j16 = gVar4.f22004f;
                    long j17 = j15 - j16;
                    if (j17 >= j16) {
                        j17 -= j16;
                    }
                    j3.d dVar = qVar3.f22030b;
                    if (i10 == 0) {
                        f10 = dVar.f20859f0;
                    } else if (i10 == 1) {
                        f10 = dVar.f20861g0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > s0.g.f34069a) {
                        j11 = (((float) j14) / (1.0f - f10)) + (((float) j17) / f10);
                    } else {
                        j11 = 0;
                    }
                    float f11 = (float) j11;
                    j10 = (gVar4.f22004f + ((((f11 * f10) + 0.5f) + j13) + nn.d.b(1.0f, f10, f11, 0.5f))) - gVar3.f22004f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    i12 = i13;
                    if (contains) {
                        j10 = Math.max(m.b(gVar4, gVar4.f22004f), gVar4.f22004f + j13);
                    } else if (contains2) {
                        j10 = Math.max(-m.a(gVar3, gVar3.f22004f), (-gVar3.f22004f) + j13);
                    } else {
                        j10 = (qVar3.j() + gVar4.f22004f) - gVar3.f22004f;
                    }
                }
            }
            j12 = Math.max(j12, j10);
            i13 = i12 + 1;
            eVar2 = eVar;
            size = i11;
            arrayList2 = arrayList;
        }
        return (int) j12;
    }

    public final void f(q qVar, int i10, ArrayList arrayList) {
        g gVar;
        Iterator it = qVar.f22036h.f22009k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = qVar.f22037i;
            if (!hasNext) {
                break;
            }
            e eVar = (e) it.next();
            if (eVar instanceof g) {
                b((g) eVar, i10, arrayList, null);
            } else if (eVar instanceof q) {
                b(((q) eVar).f22036h, i10, arrayList, null);
            }
        }
        Iterator it2 = gVar.f22009k.iterator();
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            if (eVar2 instanceof g) {
                b((g) eVar2, i10, arrayList, null);
            } else if (eVar2 instanceof q) {
                b(((q) eVar2).f22037i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((n) qVar).f22016k.f22009k.iterator();
            while (it3.hasNext()) {
                e eVar3 = (e) it3.next();
                if (eVar3 instanceof g) {
                    b((g) eVar3, i10, arrayList, null);
                }
            }
        }
    }

    public final void g() {
        m();
        if (((ArrayDeque) this.f21997h).isEmpty()) {
            return;
        }
        t tVar = (t) ((e5.h) this.f21993d);
        if (!tVar.f15044a.hasMessages(0)) {
            tVar.getClass();
            s b10 = t.b();
            b10.f15042a = tVar.f15044a.obtainMessage(0);
            tVar.getClass();
            Message message = b10.f15042a;
            message.getClass();
            tVar.f15044a.sendMessageAtFrontOfQueue(message);
            b10.a();
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f21996g;
        boolean z10 = !arrayDeque.isEmpty();
        arrayDeque.addAll((ArrayDeque) this.f21997h);
        ((ArrayDeque) this.f21997h).clear();
        if (z10) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.peekFirst()).run();
            arrayDeque.removeFirst();
        }
    }

    public final void h(j3.d dVar, int i10, int i11, int i12, int i13) {
        b bVar = (b) this.f21998i;
        bVar.f21978a = i10;
        bVar.f21979b = i12;
        bVar.f21980c = i11;
        bVar.f21981d = i13;
        ((c) this.f21997h).b(dVar, bVar);
        dVar.T(bVar.f21982e);
        dVar.O(bVar.f21983f);
        dVar.G = bVar.f21985h;
        dVar.K(bVar.f21984g);
    }

    public final void i() {
        boolean z10;
        a aVar;
        Iterator it = ((j3.e) this.f21992c).f20935s0.iterator();
        while (it.hasNext()) {
            j3.d dVar = (j3.d) it.next();
            if (!dVar.f20848a) {
                int[] iArr = dVar.f20882r0;
                boolean z11 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = dVar.f20884t;
                int i13 = dVar.f20885u;
                if (i10 != 2 && (i10 != 3 || i12 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z11 = true;
                }
                h hVar = dVar.f20854d.f22033e;
                boolean z12 = hVar.f22008j;
                h hVar2 = dVar.f20856e.f22033e;
                boolean z13 = hVar2.f22008j;
                if (z12 && z13) {
                    h(dVar, 1, hVar.f22005g, 1, hVar2.f22005g);
                    dVar.f20848a = true;
                } else if (z12 && z11) {
                    h(dVar, 1, hVar.f22005g, 2, hVar2.f22005g);
                    if (i11 == 3) {
                        dVar.f20856e.f22033e.f22011m = dVar.m();
                    } else {
                        dVar.f20856e.f22033e.d(dVar.m());
                        dVar.f20848a = true;
                    }
                } else if (z13 && z10) {
                    h(dVar, 2, hVar.f22005g, 1, hVar2.f22005g);
                    if (i10 == 3) {
                        dVar.f20854d.f22033e.f22011m = dVar.s();
                    } else {
                        dVar.f20854d.f22033e.d(dVar.s());
                        dVar.f20848a = true;
                    }
                }
                if (dVar.f20848a && (aVar = dVar.f20856e.f22017l) != null) {
                    aVar.d(dVar.f20853c0);
                }
            }
        }
    }

    public final void j(int i10, e5.j jVar) {
        m();
        ((ArrayDeque) this.f21997h).add(new defpackage.a(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f21995f), i10, jVar, 1));
    }

    public final void k() {
        m();
        synchronized (this.f21998i) {
            this.f21990a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f21995f).iterator();
        while (it.hasNext()) {
            e5.l lVar = (e5.l) it.next();
            e5.k kVar = (e5.k) this.f21994e;
            lVar.f15024d = true;
            if (lVar.f15023c) {
                lVar.f15023c = false;
                kVar.e(lVar.f15021a, lVar.f15022b.c());
            }
        }
        ((CopyOnWriteArraySet) this.f21995f).clear();
    }

    public final void l(int i10, e5.j jVar) {
        j(i10, jVar);
        g();
    }

    public final void m() {
        boolean z10;
        if (!this.f21991b) {
            return;
        }
        if (Thread.currentThread() == ((t) ((e5.h) this.f21993d)).f15044a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
    }

    public f(Looper looper, e5.b bVar, e5.k kVar) {
        this(new CopyOnWriteArraySet(), looper, bVar, kVar, true);
    }

    public f(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, e5.b bVar, e5.k kVar, boolean z10) {
        this.f21992c = bVar;
        this.f21995f = copyOnWriteArraySet;
        this.f21994e = kVar;
        this.f21998i = new Object();
        this.f21996g = new ArrayDeque();
        this.f21997h = new ArrayDeque();
        this.f21993d = ((r) bVar).a(looper, new Handler.Callback() { // from class: e5.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                k3.f fVar = k3.f.this;
                Iterator it = ((CopyOnWriteArraySet) fVar.f21995f).iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    k kVar2 = (k) fVar.f21994e;
                    if (!lVar.f15024d && lVar.f15023c) {
                        b5.t c10 = lVar.f15022b.c();
                        lVar.f15022b = new r0(2);
                        lVar.f15023c = false;
                        kVar2.e(lVar.f15021a, c10);
                    }
                    if (((t) ((h) fVar.f21993d)).f15044a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f21991b = z10;
    }
}
