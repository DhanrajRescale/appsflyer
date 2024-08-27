package a2;

import android.view.ViewGroup;
import d2.k4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.j2;
import t0.o3;

/* loaded from: classes.dex */
public final class i0 implements t0.l {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f70a;

    /* renamed from: b, reason: collision with root package name */
    public t0.v f71b;

    /* renamed from: c, reason: collision with root package name */
    public m1 f72c;

    /* renamed from: d, reason: collision with root package name */
    public int f73d;

    /* renamed from: e, reason: collision with root package name */
    public int f74e;

    /* renamed from: n, reason: collision with root package name */
    public int f83n;

    /* renamed from: o, reason: collision with root package name */
    public int f84o;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f75f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f76g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final d0 f77h = new d0(this);

    /* renamed from: i, reason: collision with root package name */
    public final b0 f78i = new b0(this);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f79j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final l1 f80k = new l1();

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f81l = new LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final v0.h f82m = new v0.h(new Object[16]);

    /* renamed from: p, reason: collision with root package name */
    public final String f85p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public i0(androidx.compose.ui.node.a aVar, m1 m1Var) {
        this.f70a = aVar;
        this.f72c = m1Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [c2.e2, t0.a] */
    public static j2 h(j2 j2Var, androidx.compose.ui.node.a aVar, boolean z10, t0.v vVar, b1.c cVar) {
        if (j2Var == null || ((t0.y) j2Var).f35269t) {
            ViewGroup.LayoutParams layoutParams = k4.f13490a;
            ?? aVar2 = new t0.a(aVar);
            Object obj = t0.z.f35276a;
            j2Var = new t0.y(vVar, aVar2);
        }
        if (!z10) {
            ((t0.y) j2Var).o(cVar);
        } else {
            t0.y yVar = (t0.y) j2Var;
            t0.r rVar = yVar.f35267r;
            rVar.f35190y = 100;
            rVar.f35189x = true;
            yVar.o(cVar);
            if (!rVar.E && rVar.f35190y == 100) {
                rVar.f35190y = -1;
                rVar.f35189x = false;
            } else {
                al.d.e1("Cannot disable reuse from root if it was caused by other groups");
                throw null;
            }
        }
        return j2Var;
    }

    @Override // t0.l
    public final void a() {
        androidx.compose.ui.node.a aVar = this.f70a;
        aVar.f1411l = true;
        HashMap hashMap = this.f75f;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            j2 j2Var = ((a0) it.next()).f25c;
            if (j2Var != null) {
                ((t0.y) j2Var).a();
            }
        }
        aVar.M();
        aVar.f1411l = false;
        hashMap.clear();
        this.f76g.clear();
        this.f84o = 0;
        this.f83n = 0;
        this.f79j.clear();
        d();
    }

    @Override // t0.l
    public final void b() {
        e(true);
    }

    public final void c(int i10) {
        Function1 function1;
        this.f83n = 0;
        androidx.compose.ui.node.a aVar = this.f70a;
        int size = (aVar.o().size() - this.f84o) - 1;
        if (i10 <= size) {
            l1 l1Var = this.f80k;
            l1Var.clear();
            HashMap hashMap = this.f75f;
            Set set = l1Var.f104a;
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    Object obj = hashMap.get((androidx.compose.ui.node.a) aVar.o().get(i11));
                    Intrinsics.c(obj);
                    set.add(((a0) obj).f23a);
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f72c.b(l1Var);
            e1.i h10 = yq.b.h();
            if (h10 != null) {
                function1 = h10.f();
            } else {
                function1 = null;
            }
            e1.i i12 = yq.b.i(h10);
            boolean z10 = false;
            while (size >= i10) {
                try {
                    androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.o().get(size);
                    Object obj2 = hashMap.get(aVar2);
                    Intrinsics.c(obj2);
                    a0 a0Var = (a0) obj2;
                    Object obj3 = a0Var.f23a;
                    if (set.contains(obj3)) {
                        this.f83n++;
                        if (((Boolean) a0Var.f28f.getValue()).booleanValue()) {
                            c2.q0 q0Var = aVar2.f1423x;
                            q0Var.f7827o.f7783k = 3;
                            c2.m0 m0Var = q0Var.f7828p;
                            if (m0Var != null) {
                                m0Var.f7761i = 3;
                            }
                            a0Var.f28f.setValue(Boolean.FALSE);
                            z10 = true;
                        }
                    } else {
                        aVar.f1411l = true;
                        hashMap.remove(aVar2);
                        j2 j2Var = a0Var.f25c;
                        if (j2Var != null) {
                            ((t0.y) j2Var).a();
                        }
                        aVar.N(size, 1);
                        aVar.f1411l = false;
                    }
                    this.f76g.remove(obj3);
                    size--;
                } catch (Throwable th2) {
                    yq.b.l(h10, i12, function1);
                    throw th2;
                }
            }
            Unit unit = Unit.f23355a;
            yq.b.l(h10, i12, function1);
            if (z10) {
                yq.b.m();
            }
        }
        d();
    }

    public final void d() {
        int size = this.f70a.o().size();
        HashMap hashMap = this.f75f;
        if (hashMap.size() == size) {
            if ((size - this.f83n) - this.f84o >= 0) {
                HashMap hashMap2 = this.f79j;
                if (hashMap2.size() == this.f84o) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f84o + ". Map size " + hashMap2.size()).toString());
            }
            StringBuilder n10 = a3.a.n("Incorrect state. Total children ", size, ". Reusable children ");
            n10.append(this.f83n);
            n10.append(". Precomposed children ");
            n10.append(this.f84o);
            throw new IllegalArgumentException(n10.toString().toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    public final void e(boolean z10) {
        Function1 function1;
        this.f84o = 0;
        this.f79j.clear();
        androidx.compose.ui.node.a aVar = this.f70a;
        int size = aVar.o().size();
        if (this.f83n != size) {
            this.f83n = size;
            e1.i h10 = yq.b.h();
            if (h10 != null) {
                function1 = h10.f();
            } else {
                function1 = null;
            }
            e1.i i10 = yq.b.i(h10);
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.o().get(i11);
                    a0 a0Var = (a0) this.f75f.get(aVar2);
                    if (a0Var != null && ((Boolean) a0Var.f28f.getValue()).booleanValue()) {
                        c2.q0 q0Var = aVar2.f1423x;
                        q0Var.f7827o.f7783k = 3;
                        c2.m0 m0Var = q0Var.f7828p;
                        if (m0Var != null) {
                            m0Var.f7761i = 3;
                        }
                        if (z10) {
                            j2 j2Var = a0Var.f25c;
                            if (j2Var != null) {
                                ((t0.y) j2Var).p();
                            }
                            a0Var.f28f = t0.t.n0(Boolean.FALSE, o3.f35116a);
                        } else {
                            a0Var.f28f.setValue(Boolean.FALSE);
                        }
                        a0Var.f23a = g1.f65a;
                    }
                } catch (Throwable th2) {
                    yq.b.l(h10, i10, function1);
                    throw th2;
                }
            }
            Unit unit = Unit.f23355a;
            yq.b.l(h10, i10, function1);
            this.f76g.clear();
        }
        d();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [a2.h1, java.lang.Object] */
    public final h1 f(Object obj, Function2 function2) {
        androidx.compose.ui.node.a aVar = this.f70a;
        if (!aVar.C()) {
            return new Object();
        }
        d();
        if (!this.f76g.containsKey(obj)) {
            this.f81l.remove(obj);
            HashMap hashMap = this.f79j;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = j(obj);
                if (obj2 != null) {
                    int indexOf = aVar.o().indexOf(obj2);
                    int size = aVar.o().size();
                    aVar.f1411l = true;
                    aVar.G(indexOf, size, 1);
                    aVar.f1411l = false;
                    this.f84o++;
                } else {
                    int size2 = aVar.o().size();
                    androidx.compose.ui.node.a aVar2 = new androidx.compose.ui.node.a(2, true, 0);
                    aVar.f1411l = true;
                    aVar.w(size2, aVar2);
                    aVar.f1411l = false;
                    this.f84o++;
                    obj2 = aVar2;
                }
                hashMap.put(obj, obj2);
            }
            g((androidx.compose.ui.node.a) obj2, obj, function2);
        }
        return new h0(this, obj);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [a2.a0, java.lang.Object] */
    public final void g(androidx.compose.ui.node.a aVar, Object obj, Function2 function2) {
        boolean z10;
        HashMap hashMap = this.f75f;
        Object obj2 = hashMap.get(aVar);
        Function1 function1 = null;
        Object obj3 = obj2;
        if (obj2 == null) {
            b1.c cVar = j.f88a;
            ?? obj4 = new Object();
            obj4.f23a = obj;
            obj4.f24b = cVar;
            obj4.f25c = null;
            obj4.f28f = t0.t.n0(Boolean.TRUE, o3.f35116a);
            hashMap.put(aVar, obj4);
            obj3 = obj4;
        }
        a0 a0Var = (a0) obj3;
        j2 j2Var = a0Var.f25c;
        if (j2Var != null) {
            t0.y yVar = (t0.y) j2Var;
            synchronized (yVar.f35253d) {
                if (yVar.f35262m.f37642c > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        if (a0Var.f24b != function2 || z10 || a0Var.f26d) {
            a0Var.f24b = function2;
            e1.i h10 = yq.b.h();
            if (h10 != null) {
                function1 = h10.f();
            }
            e1.i i10 = yq.b.i(h10);
            try {
                androidx.compose.ui.node.a aVar2 = this.f70a;
                aVar2.f1411l = true;
                Function2 function22 = a0Var.f24b;
                j2 j2Var2 = a0Var.f25c;
                t0.v vVar = this.f71b;
                if (vVar != null) {
                    boolean z11 = a0Var.f27e;
                    y.q0 q0Var = new y.q0(8, a0Var, function22);
                    Object obj5 = b1.d.f3079a;
                    a0Var.f25c = h(j2Var2, aVar, z11, vVar, new b1.c(q0Var, true, -1750409193));
                    a0Var.f27e = false;
                    aVar2.f1411l = false;
                    Unit unit = Unit.f23355a;
                    yq.b.l(h10, i10, function1);
                    a0Var.f26d = false;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            } catch (Throwable th2) {
                yq.b.l(h10, i10, function1);
                throw th2;
            }
        }
    }

    @Override // t0.l
    public final void i() {
        e(false);
    }

    public final androidx.compose.ui.node.a j(Object obj) {
        HashMap hashMap;
        int i10;
        if (this.f83n == 0) {
            return null;
        }
        androidx.compose.ui.node.a aVar = this.f70a;
        int size = aVar.o().size() - this.f84o;
        int i11 = size - this.f83n;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            hashMap = this.f75f;
            if (i13 >= i11) {
                Object obj2 = hashMap.get((androidx.compose.ui.node.a) aVar.o().get(i13));
                Intrinsics.c(obj2);
                if (Intrinsics.a(((a0) obj2).f23a, obj)) {
                    i10 = i13;
                    break;
                }
                i13--;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            while (i12 >= i11) {
                Object obj3 = hashMap.get((androidx.compose.ui.node.a) aVar.o().get(i12));
                Intrinsics.c(obj3);
                a0 a0Var = (a0) obj3;
                Object obj4 = a0Var.f23a;
                if (obj4 != g1.f65a && !this.f72c.a(obj, obj4)) {
                    i12--;
                } else {
                    a0Var.f23a = obj;
                    i13 = i12;
                    i10 = i13;
                    break;
                }
            }
            i13 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            aVar.f1411l = true;
            aVar.G(i13, i11, 1);
            aVar.f1411l = false;
        }
        this.f83n--;
        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.o().get(i11);
        Object obj5 = hashMap.get(aVar2);
        Intrinsics.c(obj5);
        a0 a0Var2 = (a0) obj5;
        a0Var2.f28f = t0.t.n0(Boolean.TRUE, o3.f35116a);
        a0Var2.f27e = true;
        a0Var2.f26d = true;
        return aVar2;
    }
}
