package h;

import android.view.MenuItem;
import android.view.ViewGroup;
import d4.b2;
import d4.n1;
import d4.z0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u implements k.a {

    /* renamed from: a, reason: collision with root package name */
    public final k.a f17752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f17753b;

    public u(e0 e0Var, h8.h hVar) {
        this.f17753b = e0Var;
        this.f17752a = hVar;
    }

    @Override // k.a
    public final boolean a(k.b bVar, MenuItem menuItem) {
        return this.f17752a.a(bVar, menuItem);
    }

    @Override // k.a
    public final boolean b(k.b bVar, l.o oVar) {
        ViewGroup viewGroup = this.f17753b.B;
        WeakHashMap weakHashMap = n1.f13788a;
        z0.c(viewGroup);
        return this.f17752a.b(bVar, oVar);
    }

    @Override // k.a
    public final boolean c(k.b bVar, l.o oVar) {
        return this.f17752a.c(bVar, oVar);
    }

    @Override // k.a
    public final void d(k.b bVar) {
        this.f17752a.d(bVar);
        e0 e0Var = this.f17753b;
        if (e0Var.f17655w != null) {
            e0Var.f17634l.getDecorView().removeCallbacks(e0Var.f17657x);
        }
        if (e0Var.f17653v != null) {
            b2 b2Var = e0Var.f17659y;
            if (b2Var != null) {
                b2Var.b();
            }
            b2 a10 = n1.a(e0Var.f17653v);
            a10.a(s0.g.f34069a);
            e0Var.f17659y = a10;
            a10.d(new t(this, 2));
        }
        n nVar = e0Var.f17638n;
        if (nVar != null) {
            nVar.g();
        }
        e0Var.f17651u = null;
        ViewGroup viewGroup = e0Var.B;
        WeakHashMap weakHashMap = n1.f13788a;
        z0.c(viewGroup);
        e0Var.I();
    }
}
