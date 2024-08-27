package f7;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.fragment.app.h1;
import androidx.fragment.app.t;
import androidx.lifecycle.o;
import androidx.navigation.c0;
import androidx.navigation.k0;
import androidx.navigation.n;
import androidx.navigation.q;
import androidx.navigation.u0;
import androidx.navigation.v0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tu.k1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lf7/e;", "Landroidx/navigation/v0;", "Lf7/b;", "mt/p", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@u0("dialog")
/* loaded from: classes.dex */
public final class e extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f15964c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f15965d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f15966e;

    /* renamed from: f, reason: collision with root package name */
    public final d f15967f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f15968g;

    public e(Context context, d1 fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f15964c = context;
        this.f15965d = fragmentManager;
        this.f15966e = new LinkedHashSet();
        this.f15967f = new d(this, 0);
        this.f15968g = new LinkedHashMap();
    }

    @Override // androidx.navigation.v0
    public final c0 a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new c0(this);
    }

    @Override // androidx.navigation.v0
    public final void d(List entries, k0 k0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        d1 d1Var = this.f15965d;
        if (d1Var.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            k(nVar).show(d1Var, nVar.f2262f);
            b().h(nVar);
        }
    }

    @Override // androidx.navigation.v0
    public final void e(q state) {
        o lifecycle;
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        Iterator it = ((List) state.f2282e.f36547a.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            d1 d1Var = this.f15965d;
            if (hasNext) {
                n nVar = (n) it.next();
                t tVar = (t) d1Var.C(nVar.f2262f);
                if (tVar != null && (lifecycle = tVar.getLifecycle()) != null) {
                    lifecycle.a(this.f15967f);
                } else {
                    this.f15966e.add(nVar.f2262f);
                }
            } else {
                d1Var.f1658o.add(new h1() { // from class: f7.a
                    @Override // androidx.fragment.app.h1
                    public final void a(d1 d1Var2, g0 childFragment) {
                        e this$0 = e.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(d1Var2, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
                        LinkedHashSet linkedHashSet = this$0.f15966e;
                        if (zq.f.u(linkedHashSet).remove(childFragment.getTag())) {
                            childFragment.getLifecycle().a(this$0.f15967f);
                        }
                        LinkedHashMap linkedHashMap = this$0.f15968g;
                        String tag = childFragment.getTag();
                        zq.f.w(linkedHashMap);
                        linkedHashMap.remove(tag);
                    }
                });
                return;
            }
        }
    }

    @Override // androidx.navigation.v0
    public final void f(n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        d1 d1Var = this.f15965d;
        if (d1Var.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f15968g;
        String str = backStackEntry.f2262f;
        t tVar = (t) linkedHashMap.get(str);
        if (tVar == null) {
            g0 C = d1Var.C(str);
            if (C instanceof t) {
                tVar = (t) C;
            } else {
                tVar = null;
            }
        }
        if (tVar != null) {
            tVar.getLifecycle().c(this.f15967f);
            tVar.dismiss();
        }
        k(backStackEntry).show(d1Var, str);
        q b10 = b();
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List list = (List) b10.f2282e.f36547a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            n nVar = (n) listIterator.previous();
            if (Intrinsics.a(nVar.f2262f, str)) {
                k1 k1Var = b10.f2280c;
                k1Var.m(vt.v0.b(vt.v0.b((Set) k1Var.getValue(), nVar), backStackEntry));
                b10.c(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // androidx.navigation.v0
    public final void i(n popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        d1 d1Var = this.f15965d;
        if (d1Var.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f2282e.f36547a.getValue();
        Iterator it = vt.g0.L(list.subList(list.indexOf(popUpTo), list.size())).iterator();
        while (it.hasNext()) {
            g0 C = d1Var.C(((n) it.next()).f2262f);
            if (C != null) {
                ((t) C).dismiss();
            }
        }
        b().f(popUpTo, z10);
    }

    public final t k(n nVar) {
        c0 c0Var = nVar.f2258b;
        Intrinsics.d(c0Var, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) c0Var;
        String str = bVar.f15960k;
        if (str != null) {
            char charAt = str.charAt(0);
            Context context = this.f15964c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            androidx.fragment.app.u0 G = this.f15965d.G();
            context.getClassLoader();
            g0 a10 = G.a(str);
            Intrinsics.checkNotNullExpressionValue(a10, "fragmentManager.fragment…ader, className\n        )");
            if (t.class.isAssignableFrom(a10.getClass())) {
                t tVar = (t) a10;
                tVar.setArguments(nVar.a());
                tVar.getLifecycle().a(this.f15967f);
                this.f15968g.put(nVar.f2262f, tVar);
                return tVar;
            }
            StringBuilder sb2 = new StringBuilder("Dialog destination ");
            String str2 = bVar.f15960k;
            if (str2 != null) {
                throw new IllegalArgumentException(nn.d.o(sb2, str2, " is not an instance of DialogFragment").toString());
            }
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }
        throw new IllegalStateException("DialogFragment class was not set".toString());
    }
}
