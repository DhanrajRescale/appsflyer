package z7;

import android.view.ViewParent;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import g7.d3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t.o;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public c f42159a;

    /* renamed from: b, reason: collision with root package name */
    public d3 f42160b;

    /* renamed from: c, reason: collision with root package name */
    public f7.d f42161c;

    /* renamed from: d, reason: collision with root package name */
    public ViewPager2 f42162d;

    /* renamed from: e, reason: collision with root package name */
    public long f42163e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f42164f;

    public d(e eVar) {
        this.f42164f = eVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public final void b(boolean z10) {
        int currentItem;
        g0 g0Var;
        boolean z11;
        e eVar = this.f42164f;
        if (eVar.f42166e.M() || this.f42162d.getScrollState() != 0) {
            return;
        }
        o oVar = eVar.f42167f;
        if (oVar.e() || eVar.a() == 0 || (currentItem = this.f42162d.getCurrentItem()) >= eVar.a()) {
            return;
        }
        long b10 = eVar.b(currentItem);
        if ((b10 != this.f42163e || z10) && (g0Var = (g0) oVar.c(b10)) != null && g0Var.isAdded()) {
            this.f42163e = b10;
            d1 d1Var = eVar.f42166e;
            d1Var.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(d1Var);
            ArrayList arrayList = new ArrayList();
            g0 g0Var2 = null;
            for (int i10 = 0; i10 < oVar.i(); i10++) {
                long f10 = oVar.f(i10);
                g0 g0Var3 = (g0) oVar.j(i10);
                if (g0Var3.isAdded()) {
                    if (f10 != this.f42163e) {
                        aVar.m(g0Var3, n.f1950d);
                        q9.b bVar = eVar.f42171j;
                        bVar.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = bVar.f31867a.iterator();
                        if (!it.hasNext()) {
                            arrayList.add(arrayList2);
                        } else {
                            a3.a.u(it.next());
                            throw null;
                        }
                    } else {
                        g0Var2 = g0Var3;
                    }
                    if (f10 == this.f42163e) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g0Var3.setMenuVisibility(z11);
                }
            }
            if (g0Var2 != null) {
                aVar.m(g0Var2, n.f1951e);
                q9.b bVar2 = eVar.f42171j;
                bVar2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = bVar2.f31867a.iterator();
                if (!it2.hasNext()) {
                    arrayList.add(arrayList3);
                } else {
                    a3.a.u(it2.next());
                    throw null;
                }
            }
            if (!aVar.f1798a.isEmpty()) {
                aVar.i();
                Collections.reverse(arrayList);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    List list = (List) it3.next();
                    eVar.f42171j.getClass();
                    q9.b.d(list);
                }
            }
        }
    }
}
