package androidx.navigation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.b1;
import androidx.fragment.app.c1;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.a1;
import androidx.lifecycle.h1;
import androidx.navigation.c0;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.k0;
import androidx.navigation.n;
import androidx.navigation.p;
import androidx.navigation.q;
import androidx.navigation.u0;
import androidx.navigation.v0;
import c2.e1;
import e.l;
import f7.g;
import f7.h;
import h.c;
import iu.a0;
import iu.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import vt.d0;
import vt.z;
import x.y0;
import y4.d;
import y4.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/v0;", "Lf7/g;", "ClearEntryStateViewModel", "x2/c", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@u0("fragment")
/* loaded from: classes.dex */
public class FragmentNavigator extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2195c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f2196d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2197e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f2198f;

    /* renamed from: g, reason: collision with root package name */
    public final p f2199g;

    /* renamed from: h, reason: collision with root package name */
    public final e1 f2200h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/a1;", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class ClearEntryStateViewModel extends a1 {

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f2201b;

        @Override // androidx.lifecycle.a1
        public final void d() {
            WeakReference weakReference = this.f2201b;
            if (weakReference != null) {
                Function0 function0 = (Function0) weakReference.get();
                if (function0 != null) {
                    function0.mo2invoke();
                    return;
                }
                return;
            }
            Intrinsics.k("completeTransition");
            throw null;
        }
    }

    public FragmentNavigator(Context context, d1 fragmentManager, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f2195c = context;
        this.f2196d = fragmentManager;
        this.f2197e = i10;
        this.f2198f = new LinkedHashSet();
        this.f2199g = new p(this, 1);
        this.f2200h = new e1(this, 11);
    }

    public static void k(g0 fragment, n entry, q state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        h1 store = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(store, "fragment.viewModelStore");
        l lVar = new l(15);
        a initializer = a.f2207a;
        e clazz = a0.a(ClearEntryStateViewModel.class);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        if (!((Map) lVar.f14641b).containsKey(clazz)) {
            ((Map) lVar.f14641b).put(clazz, new f(clazz));
            Collection initializers = ((Map) lVar.f14641b).values();
            Intrinsics.checkNotNullParameter(initializers, "initializers");
            f[] fVarArr = (f[]) initializers.toArray(new f[0]);
            d factory = new d((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
            y4.a defaultCreationExtras = y4.a.f41149b;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            c cVar = new c(store, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(ClearEntryStateViewModel.class, "modelClass");
            e b10 = a3.a.b(ClearEntryStateViewModel.class, "<this>", ClearEntryStateViewModel.class, "modelClass", "modelClass");
            String s7 = i0.s(b10);
            if (s7 != null) {
                ClearEntryStateViewModel clearEntryStateViewModel = (ClearEntryStateViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
                WeakReference weakReference = new WeakReference(new y0(19, entry, state));
                clearEntryStateViewModel.getClass();
                Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
                clearEntryStateViewModel.f2201b = weakReference;
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + i0.s(clazz) + '.').toString());
    }

    @Override // androidx.navigation.v0
    public final c0 a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new c0(this);
    }

    @Override // androidx.navigation.v0
    public final void d(List entries, k0 k0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        d1 d1Var = this.f2196d;
        if (d1Var.M()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            boolean isEmpty = ((List) b().f2282e.f36547a.getValue()).isEmpty();
            int i10 = 0;
            if (k0Var != null && !isEmpty && k0Var.f2235b && this.f2198f.remove(nVar.f2262f)) {
                d1Var.v(new c1(d1Var, nVar.f2262f, i10), false);
                b().h(nVar);
            } else {
                androidx.fragment.app.a l10 = l(nVar, k0Var);
                if (!isEmpty) {
                    l10.c(nVar.f2262f);
                }
                l10.h(false);
                b().h(nVar);
            }
        }
    }

    @Override // androidx.navigation.v0
    public final void e(final q state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        androidx.fragment.app.h1 h1Var = new androidx.fragment.app.h1() { // from class: f7.f
            @Override // androidx.fragment.app.h1
            public final void a(d1 d1Var, g0 fragment) {
                Object obj;
                q state2 = q.this;
                Intrinsics.checkNotNullParameter(state2, "$state");
                FragmentNavigator this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(d1Var, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                List list = (List) state2.f2282e.f36547a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (Intrinsics.a(((n) obj).f2262f, fragment.getTag())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                n nVar = (n) obj;
                if (nVar != null) {
                    this$0.getClass();
                    fragment.getViewLifecycleOwnerLiveData().observe(fragment, new i(0, new c.g(25, this$0, fragment, nVar)));
                    fragment.getLifecycle().a(this$0.f2199g);
                    FragmentNavigator.k(fragment, nVar, state2);
                }
            }
        };
        d1 d1Var = this.f2196d;
        d1Var.f1658o.add(h1Var);
        h hVar = new h(state, this);
        if (d1Var.f1656m == null) {
            d1Var.f1656m = new ArrayList();
        }
        d1Var.f1656m.add(hVar);
    }

    @Override // androidx.navigation.v0
    public final void f(n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        d1 d1Var = this.f2196d;
        if (d1Var.M()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a l10 = l(backStackEntry, null);
        if (((List) b().f2282e.f36547a.getValue()).size() > 1) {
            String str = backStackEntry.f2262f;
            d1Var.v(new b1(d1Var, str, -1, 1), false);
            l10.c(str);
        }
        l10.h(false);
        b().c(backStackEntry);
    }

    @Override // androidx.navigation.v0
    public final void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f2198f;
            linkedHashSet.clear();
            d0.m(stringArrayList, linkedHashSet);
        }
    }

    @Override // androidx.navigation.v0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f2198f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return hl.f.y(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // androidx.navigation.v0
    public final void i(n popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        d1 d1Var = this.f2196d;
        if (d1Var.M()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f2282e.f36547a.getValue();
        List subList = list.subList(list.indexOf(popUpTo), list.size());
        int i10 = 1;
        if (z10) {
            n nVar = (n) vt.g0.u(list);
            for (n nVar2 : vt.g0.L(subList)) {
                if (Intrinsics.a(nVar2, nVar)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + nVar2);
                } else {
                    d1Var.v(new c1(d1Var, nVar2.f2262f, i10), false);
                    this.f2198f.add(nVar2.f2262f);
                }
            }
        } else {
            d1Var.v(new b1(d1Var, popUpTo.f2262f, -1, 1), false);
        }
        b().f(popUpTo, z10);
    }

    public final androidx.fragment.app.a l(n nVar, k0 k0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        c0 c0Var = nVar.f2258b;
        Intrinsics.d(c0Var, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle a10 = nVar.a();
        String str = ((g) c0Var).f15971k;
        if (str != null) {
            int i14 = 0;
            char charAt = str.charAt(0);
            Context context = this.f2195c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            d1 d1Var = this.f2196d;
            androidx.fragment.app.u0 G = d1Var.G();
            context.getClassLoader();
            g0 a11 = G.a(str);
            Intrinsics.checkNotNullExpressionValue(a11, "fragmentManager.fragment…t.classLoader, className)");
            a11.setArguments(a10);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(d1Var);
            Intrinsics.checkNotNullExpressionValue(aVar, "fragmentManager.beginTransaction()");
            if (k0Var != null) {
                i10 = k0Var.f2239f;
            } else {
                i10 = -1;
            }
            if (k0Var != null) {
                i11 = k0Var.f2240g;
            } else {
                i11 = -1;
            }
            if (k0Var != null) {
                i12 = k0Var.f2241h;
            } else {
                i12 = -1;
            }
            if (k0Var != null) {
                i13 = k0Var.f2242i;
            } else {
                i13 = -1;
            }
            if (i10 != -1 || i11 != -1 || i12 != -1 || i13 != -1) {
                if (i10 == -1) {
                    i10 = 0;
                }
                if (i11 == -1) {
                    i11 = 0;
                }
                if (i12 == -1) {
                    i12 = 0;
                }
                if (i13 != -1) {
                    i14 = i13;
                }
                aVar.f1799b = i10;
                aVar.f1800c = i11;
                aVar.f1801d = i12;
                aVar.f1802e = i14;
            }
            aVar.f(this.f2197e, a11, nVar.f2262f);
            aVar.n(a11);
            aVar.f1813p = true;
            return aVar;
        }
        throw new IllegalStateException("Fragment class was not set".toString());
    }

    public final Set m() {
        Set R;
        LinkedHashSet linkedHashSet;
        Set set;
        Set set2 = (Set) b().f2283f.f36547a.getValue();
        Set elements = vt.g0.V((Iterable) b().f2282e.f36547a.getValue());
        Intrinsics.checkNotNullParameter(set2, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        if (elements instanceof Collection) {
            R = elements;
        } else {
            R = vt.g0.R(elements);
        }
        if (R.isEmpty()) {
            set = vt.g0.V(set2);
        } else {
            if (R instanceof Set) {
                linkedHashSet = new LinkedHashSet();
                for (Object obj : set2) {
                    if (!R.contains(obj)) {
                        linkedHashSet.add(obj);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(set2);
                linkedHashSet.removeAll(R);
            }
            set = linkedHashSet;
        }
        Set set3 = set;
        ArrayList arrayList = new ArrayList(z.k(set3));
        Iterator it = set3.iterator();
        while (it.hasNext()) {
            arrayList.add(((n) it.next()).f2262f);
        }
        return vt.g0.V(arrayList);
    }
}
