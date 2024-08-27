package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tu.k1;
import tu.l1;

/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1976b;

    /* renamed from: c, reason: collision with root package name */
    public o.a f1977c;

    /* renamed from: d, reason: collision with root package name */
    public n f1978d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f1979e;

    /* renamed from: f, reason: collision with root package name */
    public int f1980f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1981g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1982h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1983i;

    /* renamed from: j, reason: collision with root package name */
    public final k1 f1984j;

    public v(t provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f1976b = true;
        this.f1977c = new o.a();
        n nVar = n.f1948b;
        this.f1978d = nVar;
        this.f1983i = new ArrayList();
        this.f1979e = new WeakReference(provider);
        this.f1984j = l1.a(nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.u, java.lang.Object] */
    @Override // androidx.lifecycle.o
    public final void a(s object) {
        r gVar;
        t tVar;
        Intrinsics.checkNotNullParameter(object, "observer");
        e("addObserver");
        n nVar = this.f1978d;
        n initialState = n.f1947a;
        if (nVar != initialState) {
            initialState = n.f1948b;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        ?? obj = new Object();
        Intrinsics.c(object);
        HashMap hashMap = x.f1995a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z10 = object instanceof r;
        boolean z11 = object instanceof e;
        boolean z12 = false;
        if (z10 && z11) {
            gVar = new g((e) object, (r) object);
        } else if (z11) {
            gVar = new g((e) object, (r) null);
        } else if (z10) {
            gVar = (r) object;
        } else {
            Class<?> cls = object.getClass();
            if (x.c(cls) == 2) {
                Object obj2 = x.f1996b.get(cls);
                Intrinsics.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    x.a((Constructor) list.get(0), object);
                    gVar = new d();
                } else {
                    int size = list.size();
                    h[] hVarArr = new h[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        x.a((Constructor) list.get(i10), object);
                        hVarArr[i10] = null;
                    }
                    gVar = new d(hVarArr);
                }
            } else {
                gVar = new g(object);
            }
        }
        obj.f1971b = gVar;
        obj.f1970a = initialState;
        if (((u) this.f1977c.e(object, obj)) != null || (tVar = (t) this.f1979e.get()) == null) {
            return;
        }
        if (this.f1980f != 0 || this.f1981g) {
            z12 = true;
        }
        n d10 = d(object);
        this.f1980f++;
        while (obj.f1970a.compareTo(d10) < 0 && this.f1977c.f29324e.containsKey(object)) {
            this.f1983i.add(obj.f1970a);
            k kVar = m.Companion;
            n nVar2 = obj.f1970a;
            kVar.getClass();
            m b10 = k.b(nVar2);
            if (b10 != null) {
                obj.a(tVar, b10);
                ArrayList arrayList = this.f1983i;
                arrayList.remove(arrayList.size() - 1);
                d10 = d(object);
            } else {
                throw new IllegalStateException("no event up from " + obj.f1970a);
            }
        }
        if (!z12) {
            i();
        }
        this.f1980f--;
    }

    @Override // androidx.lifecycle.o
    public final n b() {
        return this.f1978d;
    }

    @Override // androidx.lifecycle.o
    public final void c(s observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        e("removeObserver");
        this.f1977c.g(observer);
    }

    public final n d(s sVar) {
        o.c cVar;
        n state1;
        u uVar;
        HashMap hashMap = this.f1977c.f29324e;
        n nVar = null;
        if (hashMap.containsKey(sVar)) {
            cVar = ((o.c) hashMap.get(sVar)).f29329d;
        } else {
            cVar = null;
        }
        if (cVar != null && (uVar = (u) cVar.f29327b) != null) {
            state1 = uVar.f1970a;
        } else {
            state1 = null;
        }
        ArrayList arrayList = this.f1983i;
        if (!arrayList.isEmpty()) {
            nVar = (n) jr.h.l(arrayList, 1);
        }
        n state12 = this.f1978d;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (nVar == null || nVar.compareTo(state1) >= 0) {
            return state1;
        }
        return nVar;
    }

    public final void e(String str) {
        if (this.f1976b) {
            n.b.u0().f28109g.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(nn.d.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(n nVar) {
        n nVar2 = this.f1978d;
        if (nVar2 == nVar) {
            return;
        }
        n nVar3 = n.f1948b;
        n nVar4 = n.f1947a;
        if (nVar2 == nVar3 && nVar == nVar4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + nVar + ", but was " + this.f1978d + " in component " + this.f1979e.get()).toString());
        }
        this.f1978d = nVar;
        if (!this.f1981g && this.f1980f == 0) {
            this.f1981g = true;
            i();
            this.f1981g = false;
            if (this.f1978d == nVar4) {
                this.f1977c = new o.a();
                return;
            }
            return;
        }
        this.f1982h = true;
    }

    public final void h(n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r8.f1982h = false;
        r8.f1984j.m(r8.f1978d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.v.i():void");
    }
}
