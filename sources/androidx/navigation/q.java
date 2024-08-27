package androidx.navigation;

import android.util.Log;
import androidx.lifecycle.h1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tu.i1;
import tu.k1;
import tu.l1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f2278a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f2279b;

    /* renamed from: c, reason: collision with root package name */
    public final k1 f2280c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2281d;

    /* renamed from: e, reason: collision with root package name */
    public final tu.s0 f2282e;

    /* renamed from: f, reason: collision with root package name */
    public final tu.s0 f2283f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f2284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f2285h;

    public q(t tVar, v0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f2285h = tVar;
        this.f2278a = new ReentrantLock(true);
        k1 a10 = l1.a(vt.i0.f38321a);
        this.f2279b = a10;
        k1 a11 = l1.a(vt.k0.f38324a);
        this.f2280c = a11;
        this.f2282e = new tu.s0(a10);
        this.f2283f = new tu.s0(a11);
        this.f2284g = navigator;
    }

    public final void a(n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f2278a;
        reentrantLock.lock();
        try {
            k1 k1Var = this.f2279b;
            k1Var.m(vt.g0.J(backStackEntry, (Collection) k1Var.getValue()));
            Unit unit = Unit.f23355a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(n entry) {
        NavControllerViewModel navControllerViewModel;
        Intrinsics.checkNotNullParameter(entry, "entry");
        t tVar = this.f2285h;
        boolean a10 = Intrinsics.a(tVar.f2328y.get(entry), Boolean.TRUE);
        Intrinsics.checkNotNullParameter(entry, "entry");
        k1 k1Var = this.f2280c;
        Set set = (Set) k1Var.getValue();
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(vt.o0.a(set.size()));
        boolean z10 = false;
        for (Object obj : set) {
            boolean z11 = true;
            if (!z10 && Intrinsics.a(obj, entry)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj);
            }
        }
        k1Var.m(linkedHashSet);
        tVar.f2328y.remove(entry);
        vt.q qVar = tVar.f2310g;
        boolean contains = qVar.contains(entry);
        k1 k1Var2 = tVar.f2312i;
        if (!contains) {
            tVar.y(entry);
            if (entry.f2264h.f1978d.a(androidx.lifecycle.n.f1949c)) {
                entry.b(androidx.lifecycle.n.f1947a);
            }
            boolean z12 = qVar instanceof Collection;
            String backStackEntryId = entry.f2262f;
            if (!z12 || !qVar.isEmpty()) {
                Iterator it = qVar.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.a(((n) it.next()).f2262f, backStackEntryId)) {
                        break;
                    }
                }
            }
            if (!a10 && (navControllerViewModel = tVar.f2318o) != null) {
                Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
                h1 h1Var = (h1) navControllerViewModel.f2147b.remove(backStackEntryId);
                if (h1Var != null) {
                    h1Var.a();
                }
            }
            tVar.z();
            k1Var2.m(tVar.u());
            return;
        }
        if (!this.f2281d) {
            tVar.z();
            tVar.f2311h.m(vt.g0.S(qVar));
            k1Var2.m(tVar.u());
        }
    }

    public final void c(n backStackEntry) {
        int i10;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f2278a;
        reentrantLock.lock();
        try {
            ArrayList S = vt.g0.S((Collection) this.f2282e.f36547a.getValue());
            ListIterator listIterator = S.listIterator(S.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (Intrinsics.a(((n) listIterator.previous()).f2262f, backStackEntry.f2262f)) {
                        i10 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            S.set(i10, backStackEntry);
            this.f2279b.m(S);
            Unit unit = Unit.f23355a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(n popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        t tVar = this.f2285h;
        v0 b10 = tVar.f2324u.b(popUpTo.f2258b.f2174a);
        if (Intrinsics.a(b10, this.f2284g)) {
            Function1 function1 = tVar.f2327x;
            if (function1 != null) {
                function1.invoke(popUpTo);
                e(popUpTo);
                return;
            }
            i0.p0 onComplete = new i0.p0(this, popUpTo, z10, 3);
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            vt.q qVar = tVar.f2310g;
            int indexOf = qVar.indexOf(popUpTo);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
                return;
            }
            int i10 = indexOf + 1;
            if (i10 != qVar.f38332c) {
                tVar.r(((n) qVar.get(i10)).f2258b.f2181h, true, false);
            }
            t.t(tVar, popUpTo);
            onComplete.mo2invoke();
            tVar.A();
            tVar.b();
            return;
        }
        Object obj = tVar.f2325v.get(b10);
        Intrinsics.c(obj);
        ((q) obj).d(popUpTo, z10);
    }

    public final void e(n popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f2278a;
        reentrantLock.lock();
        try {
            k1 k1Var = this.f2279b;
            Iterable iterable = (Iterable) k1Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!Intrinsics.a((n) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            k1Var.m(arrayList);
            Unit unit = Unit.f23355a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void f(n popUpTo, boolean z10) {
        Object obj;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        k1 k1Var = this.f2280c;
        Iterable iterable = (Iterable) k1Var.getValue();
        boolean z11 = iterable instanceof Collection;
        tu.s0 s0Var = this.f2282e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((n) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) s0Var.f36547a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((n) it2.next()) == popUpTo) {
                            }
                        }
                    }
                }
            }
        }
        k1Var.m(vt.v0.b((Set) k1Var.getValue(), popUpTo));
        List list = (List) s0Var.f36547a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                n nVar = (n) obj;
                if (!Intrinsics.a(nVar, popUpTo)) {
                    i1 i1Var = s0Var.f36547a;
                    if (((List) i1Var.getValue()).lastIndexOf(nVar) < ((List) i1Var.getValue()).lastIndexOf(popUpTo)) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar2 = (n) obj;
        if (nVar2 != null) {
            k1Var.m(vt.v0.b((Set) k1Var.getValue(), nVar2));
        }
        d(popUpTo, z10);
        this.f2285h.f2328y.put(popUpTo, Boolean.valueOf(z10));
    }

    public final void g(n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        t tVar = this.f2285h;
        v0 b10 = tVar.f2324u.b(backStackEntry.f2258b.f2174a);
        if (Intrinsics.a(b10, this.f2284g)) {
            Function1 function1 = tVar.f2326w;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                a(backStackEntry);
                return;
            } else {
                Log.i("NavController", "Ignoring add of destination " + backStackEntry.f2258b + " outside of the call to navigate(). ");
                return;
            }
        }
        Object obj = tVar.f2325v.get(b10);
        if (obj != null) {
            ((q) obj).g(backStackEntry);
            return;
        }
        throw new IllegalStateException(nn.d.o(new StringBuilder("NavigatorBackStack for "), backStackEntry.f2258b.f2174a, " should already be created").toString());
    }

    public final void h(n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        k1 k1Var = this.f2280c;
        Iterable iterable = (Iterable) k1Var.getValue();
        boolean z10 = iterable instanceof Collection;
        tu.s0 s0Var = this.f2282e;
        if (!z10 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((n) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) s0Var.f36547a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((n) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        n nVar = (n) vt.g0.D((List) s0Var.f36547a.getValue());
        if (nVar != null) {
            k1Var.m(vt.v0.b((Set) k1Var.getValue(), nVar));
        }
        k1Var.m(vt.v0.b((Set) k1Var.getValue(), backStackEntry));
        g(backStackEntry);
    }
}
