package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.fragment.FragmentNavigator;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.assetgro.stockgro.prod.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class d1 {
    public e.e B;
    public e.e C;
    public e.e D;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public FragmentManagerViewModel N;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1645b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1647d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1648e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.w f1650g;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1656m;

    /* renamed from: p, reason: collision with root package name */
    public final r0 f1659p;

    /* renamed from: q, reason: collision with root package name */
    public final r0 f1660q;

    /* renamed from: r, reason: collision with root package name */
    public final r0 f1661r;

    /* renamed from: s, reason: collision with root package name */
    public final r0 f1662s;

    /* renamed from: v, reason: collision with root package name */
    public n0 f1665v;

    /* renamed from: w, reason: collision with root package name */
    public l0 f1666w;

    /* renamed from: x, reason: collision with root package name */
    public g0 f1667x;

    /* renamed from: y, reason: collision with root package name */
    public g0 f1668y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1644a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final n1 f1646c = new n1();

    /* renamed from: f, reason: collision with root package name */
    public final p0 f1649f = new p0(this);

    /* renamed from: h, reason: collision with root package name */
    public final androidx.activity.x f1651h = new androidx.activity.x(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1652i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1653j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1654k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f1655l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final a0 f1657n = new a0(this);

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f1658o = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final t0 f1663t = new t0(this);

    /* renamed from: u, reason: collision with root package name */
    public int f1664u = -1;

    /* renamed from: z, reason: collision with root package name */
    public final u0 f1669z = new u0(this);
    public final z A = new z(this);
    public ArrayDeque E = new ArrayDeque();
    public final o O = new o(this, 1);

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.r0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.r0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.r0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.r0] */
    public d1() {
        final int i10 = 0;
        this.f1659p = new c4.a(this) { // from class: androidx.fragment.app.r0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d1 f1821b;

            {
                this.f1821b = this;
            }

            @Override // c4.a
            public final void b(Object obj) {
                int i11 = i10;
                d1 d1Var = this.f1821b;
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (d1Var.K()) {
                            d1Var.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (d1Var.K() && num.intValue() == 80) {
                            d1Var.l(false);
                            return;
                        }
                        return;
                    case 2:
                        q3.t tVar = (q3.t) obj;
                        if (d1Var.K()) {
                            d1Var.m(tVar.f31643a, false);
                            return;
                        }
                        return;
                    default:
                        q3.y0 y0Var = (q3.y0) obj;
                        if (d1Var.K()) {
                            d1Var.r(y0Var.f31652a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f1660q = new c4.a(this) { // from class: androidx.fragment.app.r0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d1 f1821b;

            {
                this.f1821b = this;
            }

            @Override // c4.a
            public final void b(Object obj) {
                int i112 = i11;
                d1 d1Var = this.f1821b;
                switch (i112) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (d1Var.K()) {
                            d1Var.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (d1Var.K() && num.intValue() == 80) {
                            d1Var.l(false);
                            return;
                        }
                        return;
                    case 2:
                        q3.t tVar = (q3.t) obj;
                        if (d1Var.K()) {
                            d1Var.m(tVar.f31643a, false);
                            return;
                        }
                        return;
                    default:
                        q3.y0 y0Var = (q3.y0) obj;
                        if (d1Var.K()) {
                            d1Var.r(y0Var.f31652a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i12 = 2;
        this.f1661r = new c4.a(this) { // from class: androidx.fragment.app.r0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d1 f1821b;

            {
                this.f1821b = this;
            }

            @Override // c4.a
            public final void b(Object obj) {
                int i112 = i12;
                d1 d1Var = this.f1821b;
                switch (i112) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (d1Var.K()) {
                            d1Var.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (d1Var.K() && num.intValue() == 80) {
                            d1Var.l(false);
                            return;
                        }
                        return;
                    case 2:
                        q3.t tVar = (q3.t) obj;
                        if (d1Var.K()) {
                            d1Var.m(tVar.f31643a, false);
                            return;
                        }
                        return;
                    default:
                        q3.y0 y0Var = (q3.y0) obj;
                        if (d1Var.K()) {
                            d1Var.r(y0Var.f31652a, false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i13 = 3;
        this.f1662s = new c4.a(this) { // from class: androidx.fragment.app.r0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d1 f1821b;

            {
                this.f1821b = this;
            }

            @Override // c4.a
            public final void b(Object obj) {
                int i112 = i13;
                d1 d1Var = this.f1821b;
                switch (i112) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (d1Var.K()) {
                            d1Var.h(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        if (d1Var.K() && num.intValue() == 80) {
                            d1Var.l(false);
                            return;
                        }
                        return;
                    case 2:
                        q3.t tVar = (q3.t) obj;
                        if (d1Var.K()) {
                            d1Var.m(tVar.f31643a, false);
                            return;
                        }
                        return;
                    default:
                        q3.y0 y0Var = (q3.y0) obj;
                        if (d1Var.K()) {
                            d1Var.r(y0Var.f31652a, false);
                            return;
                        }
                        return;
                }
            }
        };
    }

    public static g0 D(View view) {
        g0 g0Var;
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof g0) {
                g0Var = (g0) tag;
            } else {
                g0Var = null;
            }
            if (g0Var != null) {
                return g0Var;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static boolean J(g0 g0Var) {
        if (!g0Var.mHasMenu || !g0Var.mMenuVisible) {
            Iterator it = g0Var.mChildFragmentManager.f1646c.e().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                g0 g0Var2 = (g0) it.next();
                if (g0Var2 != null) {
                    z10 = J(g0Var2);
                }
                if (z10) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean L(g0 g0Var) {
        if (g0Var == null) {
            return true;
        }
        d1 d1Var = g0Var.mFragmentManager;
        if (g0Var.equals(d1Var.f1668y) && L(d1Var.f1667x)) {
            return true;
        }
        return false;
    }

    public static void e0(g0 g0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + g0Var);
        }
        if (g0Var.mHidden) {
            g0Var.mHidden = false;
            g0Var.mHiddenChanged = !g0Var.mHiddenChanged;
        }
    }

    public final int A(int i10, String str, boolean z10) {
        ArrayList arrayList = this.f1647d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f1647d.size() - 1;
        }
        int size = this.f1647d.size() - 1;
        while (size >= 0) {
            a aVar = (a) this.f1647d.get(size);
            if ((str != null && str.equals(aVar.f1806i)) || (i10 >= 0 && i10 == aVar.f1586s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z10) {
            while (size > 0) {
                a aVar2 = (a) this.f1647d.get(size - 1);
                if ((str != null && str.equals(aVar2.f1806i)) || (i10 >= 0 && i10 == aVar2.f1586s)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        }
        if (size == this.f1647d.size() - 1) {
            return -1;
        }
        return size + 1;
    }

    public final g0 B(int i10) {
        n1 n1Var = this.f1646c;
        ArrayList arrayList = n1Var.f1778a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g0 g0Var = (g0) arrayList.get(size);
            if (g0Var != null && g0Var.mFragmentId == i10) {
                return g0Var;
            }
        }
        for (l1 l1Var : n1Var.f1779b.values()) {
            if (l1Var != null) {
                g0 g0Var2 = l1Var.f1754c;
                if (g0Var2.mFragmentId == i10) {
                    return g0Var2;
                }
            }
        }
        return null;
    }

    public final g0 C(String str) {
        n1 n1Var = this.f1646c;
        if (str != null) {
            ArrayList arrayList = n1Var.f1778a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                g0 g0Var = (g0) arrayList.get(size);
                if (g0Var != null && str.equals(g0Var.mTag)) {
                    return g0Var;
                }
            }
        }
        if (str != null) {
            for (l1 l1Var : n1Var.f1779b.values()) {
                if (l1Var != null) {
                    g0 g0Var2 = l1Var.f1754c;
                    if (str.equals(g0Var2.mTag)) {
                        return g0Var2;
                    }
                }
            }
        } else {
            n1Var.getClass();
        }
        return null;
    }

    public final g0 E(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        g0 b10 = this.f1646c.b(string);
        if (b10 != null) {
            return b10;
        }
        f0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public final ViewGroup F(g0 g0Var) {
        ViewGroup viewGroup = g0Var.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (g0Var.mContainerId > 0 && this.f1666w.c()) {
            View b10 = this.f1666w.b(g0Var.mContainerId);
            if (b10 instanceof ViewGroup) {
                return (ViewGroup) b10;
            }
        }
        return null;
    }

    public final u0 G() {
        g0 g0Var = this.f1667x;
        if (g0Var != null) {
            return g0Var.mFragmentManager.G();
        }
        return this.f1669z;
    }

    public final z H() {
        g0 g0Var = this.f1667x;
        if (g0Var != null) {
            return g0Var.mFragmentManager.H();
        }
        return this.A;
    }

    public final void I(g0 g0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + g0Var);
        }
        if (!g0Var.mHidden) {
            g0Var.mHidden = true;
            g0Var.mHiddenChanged = true ^ g0Var.mHiddenChanged;
            d0(g0Var);
        }
    }

    public final boolean K() {
        g0 g0Var = this.f1667x;
        if (g0Var == null) {
            return true;
        }
        if (g0Var.isAdded() && this.f1667x.getParentFragmentManager().K()) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        return this.G || this.H;
    }

    public final void N(int i10, boolean z10) {
        HashMap hashMap;
        n0 n0Var;
        if (this.f1665v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z10 && i10 == this.f1664u) {
            return;
        }
        this.f1664u = i10;
        n1 n1Var = this.f1646c;
        Iterator it = n1Var.f1778a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = n1Var.f1779b;
            if (!hasNext) {
                break;
            }
            l1 l1Var = (l1) hashMap.get(((g0) it.next()).mWho);
            if (l1Var != null) {
                l1Var.k();
            }
        }
        for (l1 l1Var2 : hashMap.values()) {
            if (l1Var2 != null) {
                l1Var2.k();
                g0 g0Var = l1Var2.f1754c;
                if (g0Var.mRemoving && !g0Var.isInBackStack()) {
                    if (g0Var.mBeingSaved && !n1Var.f1780c.containsKey(g0Var.mWho)) {
                        n1Var.i(l1Var2.n(), g0Var.mWho);
                    }
                    n1Var.h(l1Var2);
                }
            }
        }
        Iterator it2 = n1Var.d().iterator();
        while (it2.hasNext()) {
            l1 l1Var3 = (l1) it2.next();
            g0 g0Var2 = l1Var3.f1754c;
            if (g0Var2.mDeferStart) {
                if (this.f1645b) {
                    this.J = true;
                } else {
                    g0Var2.mDeferStart = false;
                    l1Var3.k();
                }
            }
        }
        if (this.F && (n0Var = this.f1665v) != null && this.f1664u == 7) {
            ((i0) n0Var).f1717e.invalidateMenu();
            this.F = false;
        }
    }

    public final void O() {
        if (this.f1665v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.f1583g = false;
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null) {
                g0Var.noteStateNotSaved();
            }
        }
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i10, int i11) {
        x(false);
        w(true);
        g0 g0Var = this.f1668y;
        if (g0Var != null && i10 < 0 && g0Var.getChildFragmentManager().P()) {
            return true;
        }
        boolean R = R(this.K, this.L, null, i10, i11);
        if (R) {
            this.f1645b = true;
            try {
                U(this.K, this.L);
            } finally {
                d();
            }
        }
        h0();
        boolean z10 = this.J;
        n1 n1Var = this.f1646c;
        if (z10) {
            this.J = false;
            Iterator it = n1Var.d().iterator();
            while (it.hasNext()) {
                l1 l1Var = (l1) it.next();
                g0 g0Var2 = l1Var.f1754c;
                if (g0Var2.mDeferStart) {
                    if (this.f1645b) {
                        this.J = true;
                    } else {
                        g0Var2.mDeferStart = false;
                        l1Var.k();
                    }
                }
            }
        }
        n1Var.f1779b.values().removeAll(Collections.singleton(null));
        return R;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        boolean z10;
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int A = A(i10, str, z10);
        if (A < 0) {
            return false;
        }
        for (int size = this.f1647d.size() - 1; size >= A; size--) {
            arrayList.add((a) this.f1647d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(Bundle bundle, g0 g0Var, String str) {
        if (g0Var.mFragmentManager == this) {
            bundle.putString(str, g0Var.mWho);
        } else {
            f0(new IllegalStateException(a3.a.e("Fragment ", g0Var, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void T(g0 g0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + g0Var + " nesting=" + g0Var.mBackStackNesting);
        }
        boolean z10 = !g0Var.isInBackStack();
        if (!g0Var.mDetached || z10) {
            n1 n1Var = this.f1646c;
            synchronized (n1Var.f1778a) {
                n1Var.f1778a.remove(g0Var);
            }
            g0Var.mAdded = false;
            if (J(g0Var)) {
                this.F = true;
            }
            g0Var.mRemoving = true;
            d0(g0Var);
        }
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!((a) arrayList.get(i10)).f1813p) {
                    if (i11 != i10) {
                        z(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).f1813p) {
                            i11++;
                        }
                    }
                    z(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                z(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void V(Bundle bundle) {
        a0 a0Var;
        l1 l1Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f1665v.f1775b.getClassLoader());
                this.f1654k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f1665v.f1775b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        n1 n1Var = this.f1646c;
        HashMap hashMap2 = n1Var.f1780c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        f1 f1Var = (f1) bundle.getParcelable("state");
        if (f1Var == null) {
            return;
        }
        HashMap hashMap3 = n1Var.f1779b;
        hashMap3.clear();
        Iterator it = f1Var.f1688a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            a0Var = this.f1657n;
            if (!hasNext) {
                break;
            }
            Bundle i10 = n1Var.i(null, (String) it.next());
            if (i10 != null) {
                g0 g0Var = (g0) this.N.f1578b.get(((k1) i10.getParcelable("state")).f1734b);
                if (g0Var != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g0Var);
                    }
                    l1Var = new l1(a0Var, n1Var, g0Var, i10);
                } else {
                    l1Var = new l1(this.f1657n, this.f1646c, this.f1665v.f1775b.getClassLoader(), G(), i10);
                }
                g0 g0Var2 = l1Var.f1754c;
                g0Var2.mSavedFragmentState = i10;
                g0Var2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + g0Var2.mWho + "): " + g0Var2);
                }
                l1Var.l(this.f1665v.f1775b.getClassLoader());
                n1Var.g(l1Var);
                l1Var.f1756e = this.f1664u;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.N;
        fragmentManagerViewModel.getClass();
        Iterator it2 = new ArrayList(fragmentManagerViewModel.f1578b.values()).iterator();
        while (it2.hasNext()) {
            g0 g0Var3 = (g0) it2.next();
            if (hashMap3.get(g0Var3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + g0Var3 + " that was not found in the set of active Fragments " + f1Var.f1688a);
                }
                this.N.i(g0Var3);
                g0Var3.mFragmentManager = this;
                l1 l1Var2 = new l1(a0Var, n1Var, g0Var3);
                l1Var2.f1756e = 1;
                l1Var2.k();
                g0Var3.mRemoving = true;
                l1Var2.k();
            }
        }
        ArrayList<String> arrayList = f1Var.f1689b;
        n1Var.f1778a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                g0 b10 = n1Var.b(str3);
                if (b10 != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b10);
                    }
                    n1Var.a(b10);
                } else {
                    throw new IllegalStateException(nn.d.k("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (f1Var.f1690c != null) {
            this.f1647d = new ArrayList(f1Var.f1690c.length);
            int i11 = 0;
            while (true) {
                c[] cVarArr = f1Var.f1690c;
                if (i11 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i11];
                cVar.getClass();
                a aVar = new a(this);
                cVar.a(aVar);
                aVar.f1586s = cVar.f1611g;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = cVar.f1606b;
                    if (i12 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i12);
                    if (str4 != null) {
                        ((o1) aVar.f1798a.get(i12)).f1788b = n1Var.b(str4);
                    }
                    i12++;
                }
                aVar.g(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder n10 = a3.a.n("restoreAllState: back stack #", i11, " (index ");
                    n10.append(aVar.f1586s);
                    n10.append("): ");
                    n10.append(aVar);
                    Log.v("FragmentManager", n10.toString());
                    PrintWriter printWriter = new PrintWriter(new a2());
                    aVar.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1647d.add(aVar);
                i11++;
            }
        } else {
            this.f1647d = null;
        }
        this.f1652i.set(f1Var.f1691d);
        String str5 = f1Var.f1692e;
        if (str5 != null) {
            g0 b11 = n1Var.b(str5);
            this.f1668y = b11;
            q(b11);
        }
        ArrayList arrayList3 = f1Var.f1693f;
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                this.f1653j.put((String) arrayList3.get(i13), (d) f1Var.f1694g.get(i13));
            }
        }
        this.E = new ArrayDeque(f1Var.f1695h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.Parcelable, java.lang.Object, androidx.fragment.app.f1] */
    public final Bundle W() {
        int i10;
        ArrayList arrayList;
        c[] cVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n nVar = (n) it.next();
            if (nVar.f1773e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                nVar.f1773e = false;
                nVar.h();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).k();
        }
        x(true);
        this.G = true;
        this.N.f1583g = true;
        n1 n1Var = this.f1646c;
        n1Var.getClass();
        HashMap hashMap = n1Var.f1779b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (l1 l1Var : hashMap.values()) {
            if (l1Var != null) {
                g0 g0Var = l1Var.f1754c;
                n1Var.i(l1Var.n(), g0Var.mWho);
                arrayList2.add(g0Var.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + g0Var + ": " + g0Var.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.f1646c.f1780c;
        if (hashMap2.isEmpty()) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            n1 n1Var2 = this.f1646c;
            synchronized (n1Var2.f1778a) {
                try {
                    if (n1Var2.f1778a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(n1Var2.f1778a.size());
                        Iterator it3 = n1Var2.f1778a.iterator();
                        while (it3.hasNext()) {
                            g0 g0Var2 = (g0) it3.next();
                            arrayList.add(g0Var2.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + g0Var2.mWho + "): " + g0Var2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f1647d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                cVarArr = new c[size];
                for (i10 = 0; i10 < size; i10++) {
                    cVarArr[i10] = new c((a) this.f1647d.get(i10));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder n10 = a3.a.n("saveAllState: adding back stack #", i10, ": ");
                        n10.append(this.f1647d.get(i10));
                        Log.v("FragmentManager", n10.toString());
                    }
                }
            } else {
                cVarArr = null;
            }
            ?? obj = new Object();
            obj.f1692e = null;
            ArrayList arrayList4 = new ArrayList();
            obj.f1693f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj.f1694g = arrayList5;
            obj.f1688a = arrayList2;
            obj.f1689b = arrayList;
            obj.f1690c = cVarArr;
            obj.f1691d = this.f1652i.get();
            g0 g0Var3 = this.f1668y;
            if (g0Var3 != null) {
                obj.f1692e = g0Var3.mWho;
            }
            arrayList4.addAll(this.f1653j.keySet());
            arrayList5.addAll(this.f1653j.values());
            obj.f1695h = new ArrayList(this.E);
            bundle.putParcelable("state", obj);
            for (String str : this.f1654k.keySet()) {
                bundle.putBundle(a3.a.f("result_", str), (Bundle) this.f1654k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(a3.a.f("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final f0 X(g0 g0Var) {
        l1 l1Var = (l1) this.f1646c.f1779b.get(g0Var.mWho);
        if (l1Var != null) {
            g0 g0Var2 = l1Var.f1754c;
            if (g0Var2.equals(g0Var)) {
                if (g0Var2.mState <= -1) {
                    return null;
                }
                return new f0(l1Var.n());
            }
        }
        f0(new IllegalStateException(a3.a.e("Fragment ", g0Var, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void Y() {
        synchronized (this.f1644a) {
            try {
                if (this.f1644a.size() == 1) {
                    this.f1665v.f1776c.removeCallbacks(this.O);
                    this.f1665v.f1776c.post(this.O);
                    h0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Z(g0 g0Var, boolean z10) {
        ViewGroup F = F(g0Var);
        if (F != null && (F instanceof FragmentContainerView)) {
            ((FragmentContainerView) F).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final l1 a(g0 g0Var) {
        String str = g0Var.mPreviousWho;
        if (str != null) {
            u4.c.d(g0Var, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + g0Var);
        }
        l1 f10 = f(g0Var);
        g0Var.mFragmentManager = this;
        n1 n1Var = this.f1646c;
        n1Var.g(f10);
        if (!g0Var.mDetached) {
            n1Var.a(g0Var);
            g0Var.mRemoving = false;
            if (g0Var.mView == null) {
                g0Var.mHiddenChanged = false;
            }
            if (J(g0Var)) {
                this.F = true;
            }
        }
        return f10;
    }

    public final void a0(androidx.lifecycle.t tVar, j1 j1Var) {
        androidx.lifecycle.o lifecycle = tVar.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.n.f1947a) {
            return;
        }
        v0 v0Var = new v0(this, j1Var, lifecycle);
        z0 z0Var = (z0) this.f1655l.put("SOCIAL_BOTTOM_SHEET_RESULT", new z0(lifecycle, j1Var, v0Var));
        if (z0Var != null) {
            z0Var.f1867a.c(z0Var.f1869c);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key SOCIAL_BOTTOM_SHEET_RESULT lifecycleOwner " + lifecycle + " and listener " + j1Var);
        }
        lifecycle.a(v0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [f.a, java.lang.Object] */
    public final void b(n0 n0Var, l0 l0Var, g0 g0Var) {
        String str;
        if (this.f1665v == null) {
            this.f1665v = n0Var;
            this.f1666w = l0Var;
            this.f1667x = g0Var;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1658o;
            if (g0Var != null) {
                copyOnWriteArrayList.add(new w0(g0Var));
            } else if (n0Var instanceof h1) {
                copyOnWriteArrayList.add((h1) n0Var);
            }
            if (this.f1667x != null) {
                h0();
            }
            if (n0Var instanceof androidx.activity.y) {
                androidx.activity.y yVar = (androidx.activity.y) n0Var;
                androidx.activity.w onBackPressedDispatcher = yVar.getOnBackPressedDispatcher();
                this.f1650g = onBackPressedDispatcher;
                androidx.lifecycle.t tVar = yVar;
                if (g0Var != null) {
                    tVar = g0Var;
                }
                onBackPressedDispatcher.a(tVar, this.f1651h);
            }
            int i10 = 0;
            if (g0Var != null) {
                FragmentManagerViewModel fragmentManagerViewModel = g0Var.mFragmentManager.N;
                HashMap hashMap = fragmentManagerViewModel.f1579c;
                FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) hashMap.get(g0Var.mWho);
                if (fragmentManagerViewModel2 == null) {
                    fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.f1581e);
                    hashMap.put(g0Var.mWho, fragmentManagerViewModel2);
                }
                this.N = fragmentManagerViewModel2;
            } else if (n0Var instanceof androidx.lifecycle.i1) {
                androidx.lifecycle.h1 store = ((androidx.lifecycle.i1) n0Var).getViewModelStore();
                Intrinsics.checkNotNullParameter(store, "store");
                g1 factory = FragmentManagerViewModel.f1577h;
                Intrinsics.checkNotNullParameter(factory, "factory");
                y4.a defaultCreationExtras = y4.a.f41149b;
                Intrinsics.checkNotNullParameter(store, "store");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                h.c cVar = new h.c(store, factory, defaultCreationExtras);
                Intrinsics.checkNotNullParameter(FragmentManagerViewModel.class, "modelClass");
                iu.e b10 = a3.a.b(FragmentManagerViewModel.class, "<this>", FragmentManagerViewModel.class, "modelClass", "modelClass");
                String s7 = qu.i0.s(b10);
                if (s7 != null) {
                    this.N = (FragmentManagerViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
                } else {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                }
            } else {
                this.N = new FragmentManagerViewModel(false);
            }
            this.N.f1583g = M();
            this.f1646c.f1781d = this.N;
            Object obj = this.f1665v;
            if ((obj instanceof o7.f) && g0Var == null) {
                o7.d savedStateRegistry = ((o7.f) obj).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new androidx.activity.d(this, 3));
                Bundle a10 = savedStateRegistry.a("android:support:fragments");
                if (a10 != null) {
                    V(a10);
                }
            }
            Object obj2 = this.f1665v;
            if (obj2 instanceof e.i) {
                e.h activityResultRegistry = ((e.i) obj2).getActivityResultRegistry();
                if (g0Var != null) {
                    str = nn.d.o(new StringBuilder(), g0Var.mWho, ":");
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String f10 = a3.a.f("FragmentManager:", str);
                this.B = activityResultRegistry.d(jr.h.r(f10, "StartActivityForResult"), new Object(), new s0(this, 1));
                int i11 = 2;
                this.C = activityResultRegistry.d(jr.h.r(f10, "StartIntentSenderForResult"), new f.b(i11), new s0(this, i11));
                this.D = activityResultRegistry.d(jr.h.r(f10, "RequestPermissions"), new Object(), new s0(this, i10));
            }
            Object obj3 = this.f1665v;
            if (obj3 instanceof r3.n) {
                ((r3.n) obj3).addOnConfigurationChangedListener(this.f1659p);
            }
            Object obj4 = this.f1665v;
            if (obj4 instanceof r3.o) {
                ((r3.o) obj4).addOnTrimMemoryListener(this.f1660q);
            }
            Object obj5 = this.f1665v;
            if (obj5 instanceof q3.w0) {
                ((q3.w0) obj5).addOnMultiWindowModeChangedListener(this.f1661r);
            }
            Object obj6 = this.f1665v;
            if (obj6 instanceof q3.x0) {
                ((q3.x0) obj6).addOnPictureInPictureModeChangedListener(this.f1662s);
            }
            Object obj7 = this.f1665v;
            if ((obj7 instanceof d4.r) && g0Var == null) {
                ((d4.r) obj7).addMenuProvider(this.f1663t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0(g0 g0Var, androidx.lifecycle.n nVar) {
        if (g0Var.equals(this.f1646c.b(g0Var.mWho)) && (g0Var.mHost == null || g0Var.mFragmentManager == this)) {
            g0Var.mMaxState = nVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + g0Var + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(g0 g0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + g0Var);
        }
        if (g0Var.mDetached) {
            g0Var.mDetached = false;
            if (!g0Var.mAdded) {
                this.f1646c.a(g0Var);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "add from attach: " + g0Var);
                }
                if (J(g0Var)) {
                    this.F = true;
                }
            }
        }
    }

    public final void c0(g0 g0Var) {
        if (g0Var != null) {
            if (!g0Var.equals(this.f1646c.b(g0Var.mWho)) || (g0Var.mHost != null && g0Var.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + g0Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        g0 g0Var2 = this.f1668y;
        this.f1668y = g0Var;
        q(g0Var2);
        q(this.f1668y);
    }

    public final void d() {
        this.f1645b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(g0 g0Var) {
        ViewGroup F = F(g0Var);
        if (F != null) {
            if (g0Var.getPopExitAnim() + g0Var.getPopEnterAnim() + g0Var.getExitAnim() + g0Var.getEnterAnim() > 0) {
                if (F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F.setTag(R.id.visible_removing_fragment_view_tag, g0Var);
                }
                ((g0) F.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(g0Var.getPopDirection());
            }
        }
    }

    public final HashSet e() {
        n nVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f1646c.d().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((l1) it.next()).f1754c.mContainer;
            if (container != null) {
                z factory = H();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof n) {
                    nVar = (n) tag;
                } else {
                    factory.getClass();
                    nVar = new n(container);
                    Intrinsics.checkNotNullExpressionValue(nVar, "factory.createController(container)");
                    container.setTag(R.id.special_effects_controller_view_tag, nVar);
                }
                hashSet.add(nVar);
            }
        }
        return hashSet;
    }

    public final l1 f(g0 g0Var) {
        String str = g0Var.mWho;
        n1 n1Var = this.f1646c;
        l1 l1Var = (l1) n1Var.f1779b.get(str);
        if (l1Var != null) {
            return l1Var;
        }
        l1 l1Var2 = new l1(this.f1657n, n1Var, g0Var);
        l1Var2.l(this.f1665v.f1775b.getClassLoader());
        l1Var2.f1756e = this.f1664u;
        return l1Var2;
    }

    public final void f0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a2());
        n0 n0Var = this.f1665v;
        if (n0Var != null) {
            try {
                ((i0) n0Var).f1717e.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            u("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public final void g(g0 g0Var) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + g0Var);
        }
        if (!g0Var.mDetached) {
            g0Var.mDetached = true;
            if (g0Var.mAdded) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "remove from detach: " + g0Var);
                }
                n1 n1Var = this.f1646c;
                synchronized (n1Var.f1778a) {
                    n1Var.f1778a.remove(g0Var);
                }
                g0Var.mAdded = false;
                if (J(g0Var)) {
                    this.F = true;
                }
                d0(g0Var);
            }
        }
    }

    public final void g0(x0 x0Var) {
        a0 a0Var = this.f1657n;
        synchronized (((CopyOnWriteArrayList) a0Var.f1588a)) {
            try {
                int size = ((CopyOnWriteArrayList) a0Var.f1588a).size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (((q0) ((CopyOnWriteArrayList) a0Var.f1588a).get(i10)).f1815a == x0Var) {
                        ((CopyOnWriteArrayList) a0Var.f1588a).remove(i10);
                        break;
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(boolean z10, Configuration configuration) {
        if (z10 && (this.f1665v instanceof r3.n)) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null) {
                g0Var.performConfigurationChanged(configuration);
                if (z10) {
                    g0Var.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final void h0() {
        synchronized (this.f1644a) {
            try {
                boolean z10 = true;
                if (!this.f1644a.isEmpty()) {
                    this.f1651h.setEnabled(true);
                    return;
                }
                androidx.activity.x xVar = this.f1651h;
                ArrayList arrayList = this.f1647d;
                if (arrayList == null || arrayList.size() <= 0 || !L(this.f1667x)) {
                    z10 = false;
                }
                xVar.setEnabled(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f1664u < 1) {
            return false;
        }
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null && g0Var.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.f1664u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null && g0Var.isMenuVisible() && g0Var.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(g0Var);
                z10 = true;
            }
        }
        if (this.f1648e != null) {
            for (int i10 = 0; i10 < this.f1648e.size(); i10++) {
                g0 g0Var2 = (g0) this.f1648e.get(i10);
                if (arrayList == null || !arrayList.contains(g0Var2)) {
                    g0Var2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1648e = arrayList;
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r0 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r6 = this;
            r0 = 1
            r6.I = r0
            r6.x(r0)
            java.util.HashSet r1 = r6.e()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.n r2 = (androidx.fragment.app.n) r2
            r2.k()
            goto Le
        L1e:
            androidx.fragment.app.n0 r1 = r6.f1665v
            boolean r2 = r1 instanceof androidx.lifecycle.i1
            androidx.fragment.app.n1 r3 = r6.f1646c
            if (r2 == 0) goto L2b
            androidx.fragment.app.FragmentManagerViewModel r0 = r3.f1781d
            boolean r0 = r0.f1582f
            goto L38
        L2b:
            android.content.Context r1 = r1.f1775b
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L3a
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L38:
            if (r0 == 0) goto L69
        L3a:
            java.util.Map r0 = r6.f1653j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.d r1 = (androidx.fragment.app.d) r1
            java.util.List r1 = r1.f1642a
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.FragmentManagerViewModel r4 = r3.f1781d
            r5 = 0
            r4.g(r2, r5)
            goto L56
        L69:
            r0 = -1
            r6.t(r0)
            androidx.fragment.app.n0 r0 = r6.f1665v
            boolean r1 = r0 instanceof r3.o
            if (r1 == 0) goto L7a
            r3.o r0 = (r3.o) r0
            androidx.fragment.app.r0 r1 = r6.f1660q
            r0.removeOnTrimMemoryListener(r1)
        L7a:
            androidx.fragment.app.n0 r0 = r6.f1665v
            boolean r1 = r0 instanceof r3.n
            if (r1 == 0) goto L87
            r3.n r0 = (r3.n) r0
            androidx.fragment.app.r0 r1 = r6.f1659p
            r0.removeOnConfigurationChangedListener(r1)
        L87:
            androidx.fragment.app.n0 r0 = r6.f1665v
            boolean r1 = r0 instanceof q3.w0
            if (r1 == 0) goto L94
            q3.w0 r0 = (q3.w0) r0
            androidx.fragment.app.r0 r1 = r6.f1661r
            r0.removeOnMultiWindowModeChangedListener(r1)
        L94:
            androidx.fragment.app.n0 r0 = r6.f1665v
            boolean r1 = r0 instanceof q3.x0
            if (r1 == 0) goto La1
            q3.x0 r0 = (q3.x0) r0
            androidx.fragment.app.r0 r1 = r6.f1662s
            r0.removeOnPictureInPictureModeChangedListener(r1)
        La1:
            androidx.fragment.app.n0 r0 = r6.f1665v
            boolean r1 = r0 instanceof d4.r
            if (r1 == 0) goto Lb2
            androidx.fragment.app.g0 r1 = r6.f1667x
            if (r1 != 0) goto Lb2
            d4.r r0 = (d4.r) r0
            androidx.fragment.app.t0 r1 = r6.f1663t
            r0.removeMenuProvider(r1)
        Lb2:
            r0 = 0
            r6.f1665v = r0
            r6.f1666w = r0
            r6.f1667x = r0
            androidx.activity.w r1 = r6.f1650g
            if (r1 == 0) goto Lc4
            androidx.activity.x r1 = r6.f1651h
            r1.remove()
            r6.f1650g = r0
        Lc4:
            e.e r0 = r6.B
            if (r0 == 0) goto Ld5
            r0.b()
            e.e r0 = r6.C
            r0.b()
            e.e r0 = r6.D
            r0.b()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d1.k():void");
    }

    public final void l(boolean z10) {
        if (z10 && (this.f1665v instanceof r3.o)) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null) {
                g0Var.performLowMemory();
                if (z10) {
                    g0Var.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (z11 && (this.f1665v instanceof q3.w0)) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null) {
                g0Var.performMultiWindowModeChanged(z10);
                if (z11) {
                    g0Var.mChildFragmentManager.m(z10, true);
                }
            }
        }
    }

    public final void n() {
        Iterator it = this.f1646c.e().iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (g0Var != null) {
                g0Var.onHiddenChanged(g0Var.isHidden());
                g0Var.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f1664u < 1) {
            return false;
        }
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null && g0Var.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.f1664u < 1) {
            return;
        }
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null) {
                g0Var.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(g0 g0Var) {
        if (g0Var != null) {
            if (g0Var.equals(this.f1646c.b(g0Var.mWho))) {
                g0Var.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        if (z11 && (this.f1665v instanceof q3.x0)) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null) {
                g0Var.performPictureInPictureModeChanged(z10);
                if (z11) {
                    g0Var.mChildFragmentManager.r(z10, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z10 = false;
        if (this.f1664u < 1) {
            return false;
        }
        for (g0 g0Var : this.f1646c.f()) {
            if (g0Var != null && g0Var.isMenuVisible() && g0Var.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void t(int i10) {
        try {
            this.f1645b = true;
            for (l1 l1Var : this.f1646c.f1779b.values()) {
                if (l1Var != null) {
                    l1Var.f1756e = i10;
                }
            }
            N(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((n) it.next()).k();
            }
            this.f1645b = false;
            x(true);
        } catch (Throwable th2) {
            this.f1645b = false;
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        g0 g0Var = this.f1667x;
        if (g0Var != null) {
            sb2.append(g0Var.getClass().getSimpleName());
            sb2.append(UrlTreeKt.componentParamPrefix);
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1667x)));
            sb2.append(UrlTreeKt.componentParamSuffix);
        } else {
            n0 n0Var = this.f1665v;
            if (n0Var != null) {
                sb2.append(n0Var.getClass().getSimpleName());
                sb2.append(UrlTreeKt.componentParamPrefix);
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1665v)));
                sb2.append(UrlTreeKt.componentParamSuffix);
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String r10 = jr.h.r(str, "    ");
        n1 n1Var = this.f1646c;
        n1Var.getClass();
        String str2 = str + "    ";
        HashMap hashMap = n1Var.f1779b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (l1 l1Var : hashMap.values()) {
                printWriter.print(str);
                if (l1Var != null) {
                    g0 g0Var = l1Var.f1754c;
                    printWriter.println(g0Var);
                    g0Var.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = n1Var.f1778a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                g0 g0Var2 = (g0) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(g0Var2.toString());
            }
        }
        ArrayList arrayList2 = this.f1648e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                g0 g0Var3 = (g0) this.f1648e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(g0Var3.toString());
            }
        }
        ArrayList arrayList3 = this.f1647d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = (a) this.f1647d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(r10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1652i.get());
        synchronized (this.f1644a) {
            try {
                int size4 = this.f1644a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (a1) this.f1644a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1665v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1666w);
        if (this.f1667x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1667x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1664u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void v(a1 a1Var, boolean z10) {
        if (!z10) {
            if (this.f1665v == null) {
                if (this.I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (M()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1644a) {
            try {
                if (this.f1665v == null) {
                    if (z10) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1644a.add(a1Var);
                    Y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w(boolean z10) {
        if (!this.f1645b) {
            if (this.f1665v == null) {
                if (this.I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f1665v.f1776c.getLooper()) {
                if (!z10 && M()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.K == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean x(boolean z10) {
        w(z10);
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.K;
            ArrayList arrayList2 = this.L;
            synchronized (this.f1644a) {
                if (this.f1644a.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f1644a.size();
                    boolean z12 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        z12 |= ((a1) this.f1644a.get(i10)).a(arrayList, arrayList2);
                    }
                    if (!z12) {
                        break;
                    }
                    this.f1645b = true;
                    try {
                        U(this.K, this.L);
                        d();
                        z11 = true;
                    } catch (Throwable th2) {
                        d();
                        throw th2;
                    }
                } finally {
                    this.f1644a.clear();
                    this.f1665v.f1776c.removeCallbacks(this.O);
                }
            }
        }
        h0();
        if (this.J) {
            this.J = false;
            Iterator it = this.f1646c.d().iterator();
            while (it.hasNext()) {
                l1 l1Var = (l1) it.next();
                g0 g0Var = l1Var.f1754c;
                if (g0Var.mDeferStart) {
                    if (this.f1645b) {
                        this.J = true;
                    } else {
                        g0Var.mDeferStart = false;
                        l1Var.k();
                    }
                }
            }
        }
        this.f1646c.f1779b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    public final void y(a1 a1Var, boolean z10) {
        if (z10 && (this.f1665v == null || this.I)) {
            return;
        }
        w(z10);
        if (a1Var.a(this.K, this.L)) {
            this.f1645b = true;
            try {
                U(this.K, this.L);
            } finally {
                d();
            }
        }
        h0();
        boolean z11 = this.J;
        n1 n1Var = this.f1646c;
        if (z11) {
            this.J = false;
            Iterator it = n1Var.d().iterator();
            while (it.hasNext()) {
                l1 l1Var = (l1) it.next();
                g0 g0Var = l1Var.f1754c;
                if (g0Var.mDeferStart) {
                    if (this.f1645b) {
                        this.J = true;
                    } else {
                        g0Var.mDeferStart = false;
                        l1Var.k();
                    }
                }
            }
        }
        n1Var.f1779b.values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:132:0x0225. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:158:0x02e8. Please report as an issue. */
    public final void z(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        ArrayList arrayList3;
        Iterator it;
        Object obj;
        Iterator it2;
        Object obj2;
        ArrayList arrayList4;
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        int i12;
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        boolean z10 = ((a) arrayList5.get(i10)).f1813p;
        ArrayList arrayList7 = this.M;
        if (arrayList7 == null) {
            this.M = new ArrayList();
        } else {
            arrayList7.clear();
        }
        ArrayList arrayList8 = this.M;
        n1 n1Var4 = this.f1646c;
        arrayList8.addAll(n1Var4.f());
        g0 g0Var = this.f1668y;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int i14 = 1;
            if (i13 < i11) {
                a aVar = (a) arrayList5.get(i13);
                if (!((Boolean) arrayList6.get(i13)).booleanValue()) {
                    ArrayList arrayList9 = this.M;
                    int i15 = 0;
                    while (true) {
                        ArrayList arrayList10 = aVar.f1798a;
                        if (i15 < arrayList10.size()) {
                            o1 o1Var = (o1) arrayList10.get(i15);
                            int i16 = o1Var.f1787a;
                            if (i16 != i14) {
                                if (i16 != 2) {
                                    if (i16 != 3 && i16 != 6) {
                                        if (i16 != 7) {
                                            if (i16 == 8) {
                                                arrayList10.add(i15, new o1(9, g0Var));
                                                o1Var.f1789c = true;
                                                i15++;
                                                g0Var = o1Var.f1788b;
                                            }
                                        } else {
                                            n1Var3 = n1Var4;
                                            i12 = 1;
                                        }
                                    } else {
                                        arrayList9.remove(o1Var.f1788b);
                                        g0 g0Var2 = o1Var.f1788b;
                                        if (g0Var2 == g0Var) {
                                            arrayList10.add(i15, new o1(g0Var2, 9));
                                            i15++;
                                            n1Var3 = n1Var4;
                                            i12 = 1;
                                            g0Var = null;
                                        }
                                    }
                                    n1Var3 = n1Var4;
                                    i12 = 1;
                                } else {
                                    g0 g0Var3 = o1Var.f1788b;
                                    int i17 = g0Var3.mContainerId;
                                    int size = arrayList9.size() - 1;
                                    boolean z12 = false;
                                    while (size >= 0) {
                                        n1 n1Var5 = n1Var4;
                                        g0 g0Var4 = (g0) arrayList9.get(size);
                                        if (g0Var4.mContainerId == i17) {
                                            if (g0Var4 == g0Var3) {
                                                z12 = true;
                                            } else {
                                                if (g0Var4 == g0Var) {
                                                    arrayList10.add(i15, new o1(9, g0Var4));
                                                    i15++;
                                                    g0Var = null;
                                                }
                                                o1 o1Var2 = new o1(3, g0Var4);
                                                o1Var2.f1790d = o1Var.f1790d;
                                                o1Var2.f1792f = o1Var.f1792f;
                                                o1Var2.f1791e = o1Var.f1791e;
                                                o1Var2.f1793g = o1Var.f1793g;
                                                arrayList10.add(i15, o1Var2);
                                                arrayList9.remove(g0Var4);
                                                i15++;
                                                g0Var = g0Var;
                                            }
                                        }
                                        size--;
                                        n1Var4 = n1Var5;
                                    }
                                    n1Var3 = n1Var4;
                                    i12 = 1;
                                    if (z12) {
                                        arrayList10.remove(i15);
                                        i15--;
                                    } else {
                                        o1Var.f1787a = 1;
                                        o1Var.f1789c = true;
                                        arrayList9.add(g0Var3);
                                    }
                                }
                                i15 += i12;
                                i14 = i12;
                                n1Var4 = n1Var3;
                            } else {
                                n1Var3 = n1Var4;
                                i12 = i14;
                            }
                            arrayList9.add(o1Var.f1788b);
                            i15 += i12;
                            i14 = i12;
                            n1Var4 = n1Var3;
                        } else {
                            n1Var2 = n1Var4;
                        }
                    }
                } else {
                    n1Var2 = n1Var4;
                    int i18 = 1;
                    ArrayList arrayList11 = this.M;
                    ArrayList arrayList12 = aVar.f1798a;
                    int size2 = arrayList12.size() - 1;
                    while (size2 >= 0) {
                        o1 o1Var3 = (o1) arrayList12.get(size2);
                        int i19 = o1Var3.f1787a;
                        if (i19 != i18) {
                            if (i19 != 3) {
                                switch (i19) {
                                    case 8:
                                        g0Var = null;
                                        break;
                                    case 9:
                                        g0Var = o1Var3.f1788b;
                                        break;
                                    case 10:
                                        o1Var3.f1795i = o1Var3.f1794h;
                                        break;
                                }
                                size2--;
                                i18 = 1;
                            }
                            arrayList11.add(o1Var3.f1788b);
                            size2--;
                            i18 = 1;
                        }
                        arrayList11.remove(o1Var3.f1788b);
                        size2--;
                        i18 = 1;
                    }
                }
                if (!z11 && !aVar.f1804g) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i13++;
                arrayList5 = arrayList;
                arrayList6 = arrayList2;
                n1Var4 = n1Var2;
            } else {
                n1 n1Var6 = n1Var4;
                this.M.clear();
                if (!z10 && this.f1664u >= 1) {
                    for (int i20 = i10; i20 < i11; i20++) {
                        Iterator it3 = ((a) arrayList.get(i20)).f1798a.iterator();
                        while (it3.hasNext()) {
                            g0 g0Var5 = ((o1) it3.next()).f1788b;
                            if (g0Var5 != null && g0Var5.mFragmentManager != null) {
                                n1Var = n1Var6;
                                n1Var.g(f(g0Var5));
                            } else {
                                n1Var = n1Var6;
                            }
                            n1Var6 = n1Var;
                        }
                    }
                }
                for (int i21 = i10; i21 < i11; i21++) {
                    a aVar2 = (a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue()) {
                        aVar2.g(-1);
                        ArrayList arrayList13 = aVar2.f1798a;
                        boolean z13 = true;
                        for (int size3 = arrayList13.size() - 1; size3 >= 0; size3--) {
                            o1 o1Var4 = (o1) arrayList13.get(size3);
                            g0 g0Var6 = o1Var4.f1788b;
                            if (g0Var6 != null) {
                                g0Var6.mBeingSaved = aVar2.f1587t;
                                g0Var6.setPopDirection(z13);
                                int i22 = aVar2.f1803f;
                                int i23 = 8194;
                                int i24 = 4097;
                                if (i22 != 4097) {
                                    if (i22 != 8194) {
                                        i23 = 4100;
                                        i24 = 8197;
                                        if (i22 != 8197) {
                                            if (i22 != 4099) {
                                                if (i22 != 4100) {
                                                    i23 = 0;
                                                }
                                            } else {
                                                i23 = 4099;
                                            }
                                        }
                                    }
                                    i23 = i24;
                                }
                                g0Var6.setNextTransition(i23);
                                g0Var6.setSharedElementNames(aVar2.f1812o, aVar2.f1811n);
                            }
                            int i25 = o1Var4.f1787a;
                            d1 d1Var = aVar2.f1584q;
                            switch (i25) {
                                case 1:
                                    g0Var6.setAnimations(o1Var4.f1790d, o1Var4.f1791e, o1Var4.f1792f, o1Var4.f1793g);
                                    z13 = true;
                                    d1Var.Z(g0Var6, true);
                                    d1Var.T(g0Var6);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + o1Var4.f1787a);
                                case 3:
                                    g0Var6.setAnimations(o1Var4.f1790d, o1Var4.f1791e, o1Var4.f1792f, o1Var4.f1793g);
                                    d1Var.a(g0Var6);
                                    z13 = true;
                                case 4:
                                    g0Var6.setAnimations(o1Var4.f1790d, o1Var4.f1791e, o1Var4.f1792f, o1Var4.f1793g);
                                    d1Var.getClass();
                                    e0(g0Var6);
                                    z13 = true;
                                case 5:
                                    g0Var6.setAnimations(o1Var4.f1790d, o1Var4.f1791e, o1Var4.f1792f, o1Var4.f1793g);
                                    d1Var.Z(g0Var6, true);
                                    d1Var.I(g0Var6);
                                    z13 = true;
                                case 6:
                                    g0Var6.setAnimations(o1Var4.f1790d, o1Var4.f1791e, o1Var4.f1792f, o1Var4.f1793g);
                                    d1Var.c(g0Var6);
                                    z13 = true;
                                case 7:
                                    g0Var6.setAnimations(o1Var4.f1790d, o1Var4.f1791e, o1Var4.f1792f, o1Var4.f1793g);
                                    d1Var.Z(g0Var6, true);
                                    d1Var.g(g0Var6);
                                    z13 = true;
                                case 8:
                                    d1Var.c0(null);
                                    z13 = true;
                                case 9:
                                    d1Var.c0(g0Var6);
                                    z13 = true;
                                case 10:
                                    d1Var.b0(g0Var6, o1Var4.f1794h);
                                    z13 = true;
                            }
                        }
                    } else {
                        aVar2.g(1);
                        ArrayList arrayList14 = aVar2.f1798a;
                        int size4 = arrayList14.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            o1 o1Var5 = (o1) arrayList14.get(i26);
                            g0 g0Var7 = o1Var5.f1788b;
                            if (g0Var7 != null) {
                                g0Var7.mBeingSaved = aVar2.f1587t;
                                g0Var7.setPopDirection(false);
                                g0Var7.setNextTransition(aVar2.f1803f);
                                g0Var7.setSharedElementNames(aVar2.f1811n, aVar2.f1812o);
                            }
                            int i27 = o1Var5.f1787a;
                            d1 d1Var2 = aVar2.f1584q;
                            switch (i27) {
                                case 1:
                                    arrayList4 = arrayList14;
                                    g0Var7.setAnimations(o1Var5.f1790d, o1Var5.f1791e, o1Var5.f1792f, o1Var5.f1793g);
                                    d1Var2.Z(g0Var7, false);
                                    d1Var2.a(g0Var7);
                                    i26++;
                                    arrayList14 = arrayList4;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + o1Var5.f1787a);
                                case 3:
                                    arrayList4 = arrayList14;
                                    g0Var7.setAnimations(o1Var5.f1790d, o1Var5.f1791e, o1Var5.f1792f, o1Var5.f1793g);
                                    d1Var2.T(g0Var7);
                                    i26++;
                                    arrayList14 = arrayList4;
                                case 4:
                                    arrayList4 = arrayList14;
                                    g0Var7.setAnimations(o1Var5.f1790d, o1Var5.f1791e, o1Var5.f1792f, o1Var5.f1793g);
                                    d1Var2.I(g0Var7);
                                    i26++;
                                    arrayList14 = arrayList4;
                                case 5:
                                    arrayList4 = arrayList14;
                                    g0Var7.setAnimations(o1Var5.f1790d, o1Var5.f1791e, o1Var5.f1792f, o1Var5.f1793g);
                                    d1Var2.Z(g0Var7, false);
                                    e0(g0Var7);
                                    i26++;
                                    arrayList14 = arrayList4;
                                case 6:
                                    arrayList4 = arrayList14;
                                    g0Var7.setAnimations(o1Var5.f1790d, o1Var5.f1791e, o1Var5.f1792f, o1Var5.f1793g);
                                    d1Var2.g(g0Var7);
                                    i26++;
                                    arrayList14 = arrayList4;
                                case 7:
                                    arrayList4 = arrayList14;
                                    g0Var7.setAnimations(o1Var5.f1790d, o1Var5.f1791e, o1Var5.f1792f, o1Var5.f1793g);
                                    d1Var2.Z(g0Var7, false);
                                    d1Var2.c(g0Var7);
                                    i26++;
                                    arrayList14 = arrayList4;
                                case 8:
                                    d1Var2.c0(g0Var7);
                                    arrayList4 = arrayList14;
                                    i26++;
                                    arrayList14 = arrayList4;
                                case 9:
                                    d1Var2.c0(null);
                                    arrayList4 = arrayList14;
                                    i26++;
                                    arrayList14 = arrayList4;
                                case 10:
                                    d1Var2.b0(g0Var7, o1Var5.f1795i);
                                    arrayList4 = arrayList14;
                                    i26++;
                                    arrayList14 = arrayList4;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
                if (z11 && (arrayList3 = this.f1656m) != null && !arrayList3.isEmpty()) {
                    LinkedHashSet<g0> linkedHashSet = new LinkedHashSet();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        a aVar3 = (a) it4.next();
                        HashSet hashSet = new HashSet();
                        for (int i28 = 0; i28 < aVar3.f1798a.size(); i28++) {
                            g0 g0Var8 = ((o1) aVar3.f1798a.get(i28)).f1788b;
                            if (g0Var8 != null && aVar3.f1804g) {
                                hashSet.add(g0Var8);
                            }
                        }
                        linkedHashSet.addAll(hashSet);
                    }
                    Iterator it5 = this.f1656m.iterator();
                    while (it5.hasNext()) {
                        f7.h hVar = (f7.h) it5.next();
                        for (g0 fragment : linkedHashSet) {
                            hVar.getClass();
                            Intrinsics.checkNotNullParameter(fragment, "fragment");
                            if (booleanValue) {
                                androidx.navigation.q qVar = hVar.f15972a;
                                List list = (List) qVar.f2282e.f36547a.getValue();
                                ListIterator listIterator = list.listIterator(list.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        obj2 = listIterator.previous();
                                        it2 = it5;
                                        if (!Intrinsics.a(((androidx.navigation.n) obj2).f2262f, fragment.getTag())) {
                                            it5 = it2;
                                        }
                                    } else {
                                        it2 = it5;
                                        obj2 = null;
                                    }
                                }
                                androidx.navigation.n entry = (androidx.navigation.n) obj2;
                                if (entry != null) {
                                    Intrinsics.checkNotNullParameter(entry, "entry");
                                    Intrinsics.checkNotNullParameter(entry, "entry");
                                    tu.k1 k1Var = qVar.f2280c;
                                    k1Var.m(vt.v0.b((Set) k1Var.getValue(), entry));
                                    if (qVar.f2285h.f2310g.contains(entry)) {
                                        entry.b(androidx.lifecycle.n.f1950d);
                                    } else {
                                        throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                it2 = it5;
                            }
                            it5 = it2;
                        }
                    }
                    Iterator it6 = this.f1656m.iterator();
                    while (it6.hasNext()) {
                        f7.h hVar2 = (f7.h) it6.next();
                        for (g0 fragment2 : linkedHashSet) {
                            hVar2.getClass();
                            Intrinsics.checkNotNullParameter(fragment2, "fragment");
                            androidx.navigation.q qVar2 = hVar2.f15972a;
                            ArrayList I = vt.g0.I((Iterable) qVar2.f2283f.f36547a.getValue(), (Collection) qVar2.f2282e.f36547a.getValue());
                            ListIterator listIterator2 = I.listIterator(I.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    obj = listIterator2.previous();
                                    it = it6;
                                    if (!Intrinsics.a(((androidx.navigation.n) obj).f2262f, fragment2.getTag())) {
                                        it6 = it;
                                    }
                                } else {
                                    it = it6;
                                    obj = null;
                                }
                            }
                            androidx.navigation.n nVar = (androidx.navigation.n) obj;
                            if (!booleanValue && nVar == null) {
                                throw new IllegalArgumentException(a3.a.e("The fragment ", fragment2, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                            }
                            if (nVar != null) {
                                FragmentNavigator fragmentNavigator = hVar2.f15973b;
                                fragmentNavigator.getClass();
                                FragmentNavigator.k(fragment2, nVar, qVar2);
                                if (booleanValue && fragmentNavigator.m().isEmpty() && fragment2.isRemoving()) {
                                    qVar2.f(nVar, false);
                                    it6 = it;
                                }
                            }
                            it6 = it;
                        }
                    }
                }
                for (int i29 = i10; i29 < i11; i29++) {
                    a aVar4 = (a) arrayList.get(i29);
                    if (booleanValue) {
                        for (int size5 = aVar4.f1798a.size() - 1; size5 >= 0; size5--) {
                            g0 g0Var9 = ((o1) aVar4.f1798a.get(size5)).f1788b;
                            if (g0Var9 != null) {
                                f(g0Var9).k();
                            }
                        }
                    } else {
                        Iterator it7 = aVar4.f1798a.iterator();
                        while (it7.hasNext()) {
                            g0 g0Var10 = ((o1) it7.next()).f1788b;
                            if (g0Var10 != null) {
                                f(g0Var10).k();
                            }
                        }
                    }
                }
                N(this.f1664u, true);
                HashSet hashSet2 = new HashSet();
                for (int i30 = i10; i30 < i11; i30++) {
                    Iterator it8 = ((a) arrayList.get(i30)).f1798a.iterator();
                    while (it8.hasNext()) {
                        g0 g0Var11 = ((o1) it8.next()).f1788b;
                        if (g0Var11 != null && (viewGroup = g0Var11.mContainer) != null) {
                            hashSet2.add(n.l(viewGroup, this));
                        }
                    }
                }
                Iterator it9 = hashSet2.iterator();
                while (it9.hasNext()) {
                    n nVar2 = (n) it9.next();
                    nVar2.f1772d = booleanValue;
                    nVar2.m();
                    nVar2.h();
                }
                for (int i31 = i10; i31 < i11; i31++) {
                    a aVar5 = (a) arrayList.get(i31);
                    if (((Boolean) arrayList2.get(i31)).booleanValue() && aVar5.f1586s >= 0) {
                        aVar5.f1586s = -1;
                    }
                    aVar5.getClass();
                }
                if (z11 && this.f1656m != null) {
                    for (int i32 = 0; i32 < this.f1656m.size(); i32++) {
                        ((f7.h) this.f1656m.get(i32)).getClass();
                    }
                    return;
                }
                return;
            }
        }
    }
}
