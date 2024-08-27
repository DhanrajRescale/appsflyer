package androidx.navigation;

import android.os.Bundle;
import d4.t1;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public q f2332a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2333b;

    public abstract c0 a();

    public final q b() {
        q qVar = this.f2332a;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public c0 c(c0 destination, Bundle bundle, k0 k0Var) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void d(List entries, k0 k0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(entries, "<this>");
        pu.e eVar = new pu.e(pu.p.e(pu.p.g(new t1(entries, 2), new c.g(24, this, k0Var, null))));
        while (eVar.hasNext()) {
            b().g((n) eVar.next());
        }
    }

    public void e(q state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f2332a = state;
        this.f2333b = true;
    }

    public void f(n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        c0 c0Var = backStackEntry.f2258b;
        if (!(c0Var instanceof c0)) {
            c0Var = null;
        }
        if (c0Var == null) {
            return;
        }
        c(c0Var, null, yk.g.I(c.f2171m));
        b().c(backStackEntry);
    }

    public void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    public Bundle h() {
        return null;
    }

    public void i(n popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List list = (List) b().f2282e.f36547a.getValue();
        if (list.contains(popUpTo)) {
            ListIterator listIterator = list.listIterator(list.size());
            n nVar = null;
            while (j()) {
                nVar = (n) listIterator.previous();
                if (Intrinsics.a(nVar, popUpTo)) {
                    break;
                }
            }
            if (nVar != null) {
                b().d(nVar, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
    }

    public boolean j() {
        return true;
    }
}
