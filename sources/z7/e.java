package z7;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.d1;
import androidx.fragment.app.f0;
import androidx.fragment.app.g0;
import androidx.fragment.app.q0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import d4.n1;
import d4.w0;
import d4.y0;
import g7.d3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k7.y1;
import k7.z0;
import t.g;

/* loaded from: classes.dex */
public abstract class e extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final o f42165d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f42166e;

    /* renamed from: i, reason: collision with root package name */
    public d f42170i;

    /* renamed from: f, reason: collision with root package name */
    public final t.o f42167f = new t.o((Object) null);

    /* renamed from: g, reason: collision with root package name */
    public final t.o f42168g = new t.o((Object) null);

    /* renamed from: h, reason: collision with root package name */
    public final t.o f42169h = new t.o((Object) null);

    /* renamed from: j, reason: collision with root package name */
    public final q9.b f42171j = new q9.b(0);

    /* renamed from: k, reason: collision with root package name */
    public boolean f42172k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42173l = false;

    public e(d1 d1Var, o oVar) {
        this.f42166e = d1Var;
        this.f42165d = oVar;
        if (!this.f22651a.a()) {
            this.f22652b = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public static void p(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // k7.z0
    public long b(int i10) {
        return i10;
    }

    @Override // k7.z0
    public final void g(RecyclerView recyclerView) {
        if (this.f42170i == null) {
            d dVar = new d(this);
            this.f42170i = dVar;
            ViewPager2 a10 = d.a(recyclerView);
            dVar.f42162d = a10;
            c cVar = new c(dVar, 0);
            dVar.f42159a = cVar;
            a10.a(cVar);
            d3 d3Var = new d3(dVar);
            dVar.f42160b = d3Var;
            o(d3Var);
            f7.d dVar2 = new f7.d(dVar, 1);
            dVar.f42161c = dVar2;
            this.f42165d.a(dVar2);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        f fVar = (f) y1Var;
        long j10 = fVar.f22633e;
        FrameLayout frameLayout = (FrameLayout) fVar.f22629a;
        int id2 = frameLayout.getId();
        Long t10 = t(id2);
        t.o oVar = this.f42169h;
        if (t10 != null && t10.longValue() != j10) {
            v(t10.longValue());
            oVar.h(t10.longValue());
        }
        oVar.g(j10, Integer.valueOf(id2));
        long b10 = b(i10);
        t.o oVar2 = this.f42167f;
        if (oVar2.d(b10) < 0) {
            g0 r10 = r(i10);
            r10.setInitialSavedState((f0) this.f42168g.c(b10));
            oVar2.g(b10, r10);
        }
        WeakHashMap weakHashMap = n1.f13788a;
        if (y0.b(frameLayout)) {
            u(fVar);
        }
        s();
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView recyclerView) {
        int i11 = f.f42174u;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = n1.f13788a;
        frameLayout.setId(w0.a());
        frameLayout.setSaveEnabled(false);
        return new y1(frameLayout);
    }

    @Override // k7.z0
    public final void j(RecyclerView recyclerView) {
        d dVar = this.f42170i;
        dVar.getClass();
        ViewPager2 a10 = d.a(recyclerView);
        ((List) a10.f2511c.f42158b).remove(dVar.f42159a);
        d3 d3Var = dVar.f42160b;
        e eVar = dVar.f42164f;
        eVar.f22651a.unregisterObserver(d3Var);
        eVar.f42165d.c(dVar.f42161c);
        dVar.f42162d = null;
        this.f42170i = null;
    }

    @Override // k7.z0
    public final /* bridge */ /* synthetic */ boolean k(y1 y1Var) {
        return true;
    }

    @Override // k7.z0
    public final void l(y1 y1Var) {
        u((f) y1Var);
        s();
    }

    @Override // k7.z0
    public final void n(y1 y1Var) {
        Long t10 = t(((FrameLayout) ((f) y1Var).f22629a).getId());
        if (t10 != null) {
            v(t10.longValue());
            this.f42169h.h(t10.longValue());
        }
    }

    public final boolean q(long j10) {
        if (j10 >= 0 && j10 < a()) {
            return true;
        }
        return false;
    }

    public abstract g0 r(int i10);

    public final void s() {
        t.o oVar;
        t.o oVar2;
        g0 g0Var;
        View view;
        if (this.f42173l && !this.f42166e.M()) {
            g gVar = new g(0);
            int i10 = 0;
            while (true) {
                oVar = this.f42167f;
                int i11 = oVar.i();
                oVar2 = this.f42169h;
                if (i10 >= i11) {
                    break;
                }
                long f10 = oVar.f(i10);
                if (!q(f10)) {
                    gVar.add(Long.valueOf(f10));
                    oVar2.h(f10);
                }
                i10++;
            }
            if (!this.f42172k) {
                this.f42173l = false;
                for (int i12 = 0; i12 < oVar.i(); i12++) {
                    long f11 = oVar.f(i12);
                    if (oVar2.d(f11) < 0 && ((g0Var = (g0) oVar.c(f11)) == null || (view = g0Var.getView()) == null || view.getParent() == null)) {
                        gVar.add(Long.valueOf(f11));
                    }
                }
            }
            t.b bVar = new t.b(gVar);
            while (bVar.hasNext()) {
                v(((Long) bVar.next()).longValue());
            }
        }
    }

    public final Long t(int i10) {
        Long l10 = null;
        int i11 = 0;
        while (true) {
            t.o oVar = this.f42169h;
            if (i11 < oVar.i()) {
                if (((Integer) oVar.j(i11)).intValue() == i10) {
                    if (l10 == null) {
                        l10 = Long.valueOf(oVar.f(i11));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i11++;
            } else {
                return l10;
            }
        }
    }

    public final void u(f fVar) {
        g0 g0Var = (g0) this.f42167f.c(fVar.f22633e);
        if (g0Var != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.f22629a;
            View view = g0Var.getView();
            if (!g0Var.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean isAdded = g0Var.isAdded();
            d1 d1Var = this.f42166e;
            if (isAdded && view == null) {
                ((CopyOnWriteArrayList) d1Var.f1657n.f1588a).add(new q0(new a(this, g0Var, frameLayout), false));
                return;
            }
            if (g0Var.isAdded() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    p(view, frameLayout);
                    return;
                }
                return;
            }
            if (g0Var.isAdded()) {
                p(view, frameLayout);
                return;
            }
            if (!d1Var.M()) {
                ((CopyOnWriteArrayList) d1Var.f1657n.f1588a).add(new q0(new a(this, g0Var, frameLayout), false));
                q9.b bVar = this.f42171j;
                bVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = bVar.f31867a.iterator();
                if (!it.hasNext()) {
                    try {
                        g0Var.setMenuVisibility(false);
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(d1Var);
                        aVar.e(0, g0Var, "f" + fVar.f22633e, 1);
                        aVar.m(g0Var, n.f1950d);
                        aVar.i();
                        this.f42170i.b(false);
                        return;
                    } finally {
                        q9.b.d(arrayList);
                    }
                }
                a3.a.u(it.next());
                throw null;
            }
            if (d1Var.I) {
                return;
            }
            this.f42165d.a(new androidx.lifecycle.g(this, fVar));
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void v(long j10) {
        ViewParent parent;
        t.o oVar = this.f42167f;
        g0 g0Var = (g0) oVar.c(j10);
        if (g0Var == null) {
            return;
        }
        if (g0Var.getView() != null && (parent = g0Var.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean q10 = q(j10);
        t.o oVar2 = this.f42168g;
        if (!q10) {
            oVar2.h(j10);
        }
        if (!g0Var.isAdded()) {
            oVar.h(j10);
            return;
        }
        d1 d1Var = this.f42166e;
        if (d1Var.M()) {
            this.f42173l = true;
            return;
        }
        boolean isAdded = g0Var.isAdded();
        q9.b bVar = this.f42171j;
        if (isAdded && q(j10)) {
            bVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = bVar.f31867a.iterator();
            if (!it.hasNext()) {
                f0 X = d1Var.X(g0Var);
                q9.b.d(arrayList);
                oVar2.g(j10, X);
            } else {
                a3.a.u(it.next());
                throw null;
            }
        }
        bVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = bVar.f31867a.iterator();
        if (!it2.hasNext()) {
            try {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(d1Var);
                aVar.l(g0Var);
                aVar.i();
                oVar.h(j10);
                return;
            } finally {
                q9.b.d(arrayList2);
            }
        }
        a3.a.u(it2.next());
        throw null;
    }
}
