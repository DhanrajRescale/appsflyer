package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1778a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1779b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1780c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public FragmentManagerViewModel f1781d;

    public final void a(g0 g0Var) {
        if (!this.f1778a.contains(g0Var)) {
            synchronized (this.f1778a) {
                this.f1778a.add(g0Var);
            }
            g0Var.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + g0Var);
    }

    public final g0 b(String str) {
        l1 l1Var = (l1) this.f1779b.get(str);
        if (l1Var != null) {
            return l1Var.f1754c;
        }
        return null;
    }

    public final g0 c(String str) {
        g0 findFragmentByWho;
        for (l1 l1Var : this.f1779b.values()) {
            if (l1Var != null && (findFragmentByWho = l1Var.f1754c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (l1 l1Var : this.f1779b.values()) {
            if (l1Var != null) {
                arrayList.add(l1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (l1 l1Var : this.f1779b.values()) {
            if (l1Var != null) {
                arrayList.add(l1Var.f1754c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f1778a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1778a) {
            arrayList = new ArrayList(this.f1778a);
        }
        return arrayList;
    }

    public final void g(l1 l1Var) {
        g0 g0Var = l1Var.f1754c;
        String str = g0Var.mWho;
        HashMap hashMap = this.f1779b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(g0Var.mWho, l1Var);
        if (g0Var.mRetainInstanceChangedWhileDetached) {
            if (g0Var.mRetainInstance) {
                this.f1781d.e(g0Var);
            } else {
                this.f1781d.i(g0Var);
            }
            g0Var.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + g0Var);
        }
    }

    public final void h(l1 l1Var) {
        g0 g0Var = l1Var.f1754c;
        if (g0Var.mRetainInstance) {
            this.f1781d.i(g0Var);
        }
        HashMap hashMap = this.f1779b;
        if (hashMap.get(g0Var.mWho) == l1Var && ((l1) hashMap.put(g0Var.mWho, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + g0Var);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.f1780c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }
}
