package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n implements androidx.lifecycle.t, i1, androidx.lifecycle.i, o7.f {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f2256m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2257a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f2258b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2259c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.n f2260d;

    /* renamed from: e, reason: collision with root package name */
    public final t0 f2261e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2262f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2263g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.v f2264h = new androidx.lifecycle.v(this);

    /* renamed from: i, reason: collision with root package name */
    public final o7.e f2265i = x2.c.m(this);

    /* renamed from: j, reason: collision with root package name */
    public boolean f2266j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.lifecycle.n f2267k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.w0 f2268l;

    public n(Context context, c0 c0Var, Bundle bundle, androidx.lifecycle.n nVar, t0 t0Var, String str, Bundle bundle2) {
        this.f2257a = context;
        this.f2258b = c0Var;
        this.f2259c = bundle;
        this.f2260d = nVar;
        this.f2261e = t0Var;
        this.f2262f = str;
        this.f2263g = bundle2;
        ut.g a10 = ut.h.a(new m(this, 1));
        ut.h.a(new m(this, 0));
        this.f2267k = androidx.lifecycle.n.f1948b;
        this.f2268l = (androidx.lifecycle.w0) a10.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.f2259c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(androidx.lifecycle.n maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.f2267k = maxState;
        c();
    }

    public final void c() {
        if (!this.f2266j) {
            o7.e eVar = this.f2265i;
            eVar.a();
            this.f2266j = true;
            if (this.f2261e != null) {
                androidx.lifecycle.u0.d(this);
            }
            eVar.b(this.f2263g);
        }
        int ordinal = this.f2260d.ordinal();
        int ordinal2 = this.f2267k.ordinal();
        androidx.lifecycle.v vVar = this.f2264h;
        if (ordinal < ordinal2) {
            vVar.h(this.f2260d);
        } else {
            vVar.h(this.f2267k);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!Intrinsics.a(this.f2262f, nVar.f2262f) || !Intrinsics.a(this.f2258b, nVar.f2258b) || !Intrinsics.a(this.f2264h, nVar.f2264h) || !Intrinsics.a(this.f2265i.f29766b, nVar.f2265i.f29766b)) {
            return false;
        }
        Bundle bundle = this.f2259c;
        Bundle bundle2 = nVar.f2259c;
        if (!Intrinsics.a(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    Object obj3 = bundle.get(str);
                    if (bundle2 != null) {
                        obj2 = bundle2.get(str);
                    } else {
                        obj2 = null;
                    }
                    if (!Intrinsics.a(obj3, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.i
    public final y4.c getDefaultViewModelCreationExtras() {
        Context context;
        y4.e eVar = new y4.e(0);
        Application application = null;
        Context context2 = this.f2257a;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        if (application != null) {
            eVar.b(c1.f1897d, application);
        }
        eVar.b(androidx.lifecycle.u0.f1972a, this);
        eVar.b(androidx.lifecycle.u0.f1973b, this);
        Bundle a10 = a();
        if (a10 != null) {
            eVar.b(androidx.lifecycle.u0.f1974c, a10);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.i
    public final d1 getDefaultViewModelProviderFactory() {
        return this.f2268l;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        return this.f2264h;
    }

    @Override // o7.f
    public final o7.d getSavedStateRegistry() {
        return this.f2265i.f29766b;
    }

    @Override // androidx.lifecycle.i1
    public final h1 getViewModelStore() {
        if (this.f2266j) {
            if (this.f2264h.f1978d != androidx.lifecycle.n.f1947a) {
                t0 t0Var = this.f2261e;
                if (t0Var != null) {
                    String backStackEntryId = this.f2262f;
                    Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
                    LinkedHashMap linkedHashMap = ((NavControllerViewModel) t0Var).f2147b;
                    h1 h1Var = (h1) linkedHashMap.get(backStackEntryId);
                    if (h1Var == null) {
                        h1 h1Var2 = new h1();
                        linkedHashMap.put(backStackEntryId, h1Var2);
                        return h1Var2;
                    }
                    return h1Var;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    public final int hashCode() {
        Set<String> keySet;
        int i10;
        int hashCode = this.f2258b.hashCode() + (this.f2262f.hashCode() * 31);
        Bundle bundle = this.f2259c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i11 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                hashCode = i11 + i10;
            }
        }
        return this.f2265i.f29766b.hashCode() + ((this.f2264h.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n.class.getSimpleName());
        sb2.append("(" + this.f2262f + ')');
        sb2.append(" destination=");
        sb2.append(this.f2258b);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
