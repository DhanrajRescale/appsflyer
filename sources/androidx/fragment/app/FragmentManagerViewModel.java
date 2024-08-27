package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FragmentManagerViewModel extends androidx.lifecycle.a1 {

    /* renamed from: h, reason: collision with root package name */
    public static final g1 f1577h = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1581e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1578b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1579c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1580d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1582f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1583g = false;

    public FragmentManagerViewModel(boolean z10) {
        this.f1581e = z10;
    }

    @Override // androidx.lifecycle.a1
    public final void d() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1582f = true;
    }

    public final void e(g0 g0Var) {
        if (this.f1583g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap hashMap = this.f1578b;
        if (hashMap.containsKey(g0Var.mWho)) {
            return;
        }
        hashMap.put(g0Var.mWho, g0Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + g0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        if (this.f1578b.equals(fragmentManagerViewModel.f1578b) && this.f1579c.equals(fragmentManagerViewModel.f1579c) && this.f1580d.equals(fragmentManagerViewModel.f1580d)) {
            return true;
        }
        return false;
    }

    public final void f(g0 g0Var, boolean z10) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + g0Var);
        }
        h(g0Var.mWho, z10);
    }

    public final void g(String str, boolean z10) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z10);
    }

    public final void h(String str, boolean z10) {
        HashMap hashMap = this.f1579c;
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) hashMap.get(str);
        if (fragmentManagerViewModel != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.f1579c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.g((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1580d;
        androidx.lifecycle.h1 h1Var = (androidx.lifecycle.h1) hashMap2.get(str);
        if (h1Var != null) {
            h1Var.a();
            hashMap2.remove(str);
        }
    }

    public final int hashCode() {
        return this.f1580d.hashCode() + ((this.f1579c.hashCode() + (this.f1578b.hashCode() * 31)) * 31);
    }

    public final void i(g0 g0Var) {
        if (this.f1583g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f1578b.remove(g0Var.mWho) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + g0Var);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f1578b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f1579c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f1580d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
