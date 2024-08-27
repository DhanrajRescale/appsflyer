package i5;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final j5.d0 f19345a;

    /* renamed from: e, reason: collision with root package name */
    public final m0 f19349e;

    /* renamed from: h, reason: collision with root package name */
    public final j5.a f19352h;

    /* renamed from: i, reason: collision with root package name */
    public final e5.h f19353i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19355k;

    /* renamed from: l, reason: collision with root package name */
    public g5.u f19356l;

    /* renamed from: j, reason: collision with root package name */
    public r5.y0 f19354j = new r5.y0();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f19347c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f19348d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19346b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f19350f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f19351g = new HashSet();

    public a1(m0 m0Var, j5.a aVar, e5.t tVar, j5.d0 d0Var) {
        this.f19345a = d0Var;
        this.f19349e = m0Var;
        this.f19352h = aVar;
        this.f19353i = tVar;
    }

    public final b5.i1 a(int i10, List list, r5.y0 y0Var) {
        if (!list.isEmpty()) {
            this.f19354j = y0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                z0 z0Var = (z0) list.get(i11 - i10);
                ArrayList arrayList = this.f19346b;
                if (i11 > 0) {
                    z0 z0Var2 = (z0) arrayList.get(i11 - 1);
                    z0Var.f19682d = z0Var2.f19679a.f33280o.f33206b.p() + z0Var2.f19682d;
                    z0Var.f19683e = false;
                    z0Var.f19681c.clear();
                } else {
                    z0Var.f19682d = 0;
                    z0Var.f19683e = false;
                    z0Var.f19681c.clear();
                }
                int p10 = z0Var.f19679a.f33280o.f33206b.p();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((z0) arrayList.get(i12)).f19682d += p10;
                }
                arrayList.add(i11, z0Var);
                this.f19348d.put(z0Var.f19680b, z0Var);
                if (this.f19355k) {
                    e(z0Var);
                    if (this.f19347c.isEmpty()) {
                        this.f19351g.add(z0Var);
                    } else {
                        y0 y0Var2 = (y0) this.f19350f.get(z0Var);
                        if (y0Var2 != null) {
                            y0Var2.f19675a.c(y0Var2.f19676b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final b5.i1 b() {
        ArrayList arrayList = this.f19346b;
        if (arrayList.isEmpty()) {
            return b5.i1.f3357a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            z0 z0Var = (z0) arrayList.get(i11);
            z0Var.f19682d = i10;
            i10 += z0Var.f19679a.f33280o.f33206b.p();
        }
        return new f1(arrayList, this.f19354j);
    }

    public final void c() {
        Iterator it = this.f19351g.iterator();
        while (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            if (z0Var.f19681c.isEmpty()) {
                y0 y0Var = (y0) this.f19350f.get(z0Var);
                if (y0Var != null) {
                    y0Var.f19675a.c(y0Var.f19676b);
                }
                it.remove();
            }
        }
    }

    public final void d(z0 z0Var) {
        if (z0Var.f19683e && z0Var.f19681c.isEmpty()) {
            y0 y0Var = (y0) this.f19350f.remove(z0Var);
            y0Var.getClass();
            r5.a aVar = y0Var.f19675a;
            aVar.o(y0Var.f19676b);
            tr.e eVar = y0Var.f19677c;
            aVar.r(eVar);
            aVar.q(eVar);
            this.f19351g.remove(z0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [r5.x, i5.t0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [n5.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [r5.a0, java.lang.Object] */
    public final void e(z0 z0Var) {
        r5.r rVar = z0Var.f19679a;
        ?? r12 = new r5.x() { // from class: i5.t0
            @Override // r5.x
            public final void a(r5.a aVar, b5.i1 i1Var) {
                a1.this.f19349e.f19558h.d(22);
            }
        };
        tr.e eVar = new tr.e(this, z0Var, 11);
        this.f19350f.put(z0Var, new y0(rVar, r12, eVar));
        int i10 = e5.x.f15050a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        l0.j jVar = rVar.f33077c;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) jVar.f23775c;
        ?? obj = new Object();
        obj.f33082a = handler;
        obj.f33083b = eVar;
        copyOnWriteArrayList.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        n5.l lVar = rVar.f33078d;
        lVar.getClass();
        ?? obj2 = new Object();
        obj2.f28312a = handler2;
        obj2.f28313b = eVar;
        lVar.f28316c.add(obj2);
        rVar.k(r12, this.f19356l, this.f19345a);
    }

    public final void f(r5.u uVar) {
        IdentityHashMap identityHashMap = this.f19347c;
        z0 z0Var = (z0) identityHashMap.remove(uVar);
        z0Var.getClass();
        z0Var.f19679a.n(uVar);
        z0Var.f19681c.remove(((r5.o) uVar).f33245a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(z0Var);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f19346b;
            z0 z0Var = (z0) arrayList.remove(i12);
            this.f19348d.remove(z0Var.f19680b);
            int i13 = -z0Var.f19679a.f33280o.f33206b.p();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((z0) arrayList.get(i14)).f19682d += i13;
            }
            z0Var.f19683e = true;
            if (this.f19355k) {
                d(z0Var);
            }
        }
    }
}
