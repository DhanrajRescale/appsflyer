package r5;

import android.os.Looper;
import b5.i1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33075a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f33076b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final l0.j f33077c = new l0.j(new CopyOnWriteArrayList(), 0, (w) null);

    /* renamed from: d, reason: collision with root package name */
    public final n5.l f33078d = new n5.l(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f33079e;

    /* renamed from: f, reason: collision with root package name */
    public i1 f33080f;

    /* renamed from: g, reason: collision with root package name */
    public j5.d0 f33081g;

    public final l0.j a(w wVar) {
        return new l0.j((CopyOnWriteArrayList) this.f33077c.f23775c, 0, wVar);
    }

    public abstract u b(w wVar, v5.e eVar, long j10);

    public final void c(x xVar) {
        HashSet hashSet = this.f33076b;
        boolean z10 = !hashSet.isEmpty();
        hashSet.remove(xVar);
        if (z10 && hashSet.isEmpty()) {
            d();
        }
    }

    public void d() {
    }

    public final void e(x xVar) {
        this.f33079e.getClass();
        HashSet hashSet = this.f33076b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(xVar);
        if (isEmpty) {
            f();
        }
    }

    public void f() {
    }

    public /* bridge */ /* synthetic */ i1 g() {
        return null;
    }

    public abstract b5.k0 h();

    public /* bridge */ /* synthetic */ boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(x xVar, g5.u uVar, j5.d0 d0Var) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f33079e;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        yk.j.E0(z10);
        this.f33081g = d0Var;
        i1 i1Var = this.f33080f;
        this.f33075a.add(xVar);
        if (this.f33079e == null) {
            this.f33079e = myLooper;
            this.f33076b.add(xVar);
            l(uVar);
        } else if (i1Var != null) {
            e(xVar);
            xVar.a(this, i1Var);
        }
    }

    public abstract void l(g5.u uVar);

    public final void m(i1 i1Var) {
        this.f33080f = i1Var;
        Iterator it = this.f33075a.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(this, i1Var);
        }
    }

    public abstract void n(u uVar);

    public final void o(x xVar) {
        ArrayList arrayList = this.f33075a;
        arrayList.remove(xVar);
        if (arrayList.isEmpty()) {
            this.f33079e = null;
            this.f33080f = null;
            this.f33081g = null;
            this.f33076b.clear();
            p();
            return;
        }
        c(xVar);
    }

    public abstract void p();

    public final void q(n5.m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f33078d.f28316c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n5.k kVar = (n5.k) it.next();
            if (kVar.f28313b == mVar) {
                copyOnWriteArrayList.remove(kVar);
            }
        }
    }

    public final void r(b0 b0Var) {
        l0.j jVar = this.f33077c;
        Iterator it = ((CopyOnWriteArrayList) jVar.f23775c).iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (a0Var.f33083b == b0Var) {
                ((CopyOnWriteArrayList) jVar.f23775c).remove(a0Var);
            }
        }
    }
}
