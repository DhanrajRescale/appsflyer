package g7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f16822a;

    /* renamed from: b, reason: collision with root package name */
    public int f16823b;

    /* renamed from: c, reason: collision with root package name */
    public final vt.q f16824c = new vt.q();

    /* renamed from: d, reason: collision with root package name */
    public final h.c f16825d = new h.c(22, 0);

    /* renamed from: e, reason: collision with root package name */
    public a1 f16826e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16827f;

    public final void a(j1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16827f = true;
        boolean z10 = event instanceof g1;
        int i10 = 0;
        vt.q qVar = this.f16824c;
        h.c cVar = this.f16825d;
        if (z10) {
            g1 g1Var = (g1) event;
            cVar.T(g1Var.f16789e);
            this.f16826e = g1Var.f16790f;
            int ordinal = g1Var.f16785a.ordinal();
            int i11 = g1Var.f16787c;
            int i12 = g1Var.f16788d;
            List list = g1Var.f16786b;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.f16823b = i12;
                        qVar.addAll(list);
                        return;
                    }
                    return;
                }
                this.f16822a = i11;
                int size = list.size() - 1;
                kotlin.ranges.c.INSTANCE.getClass();
                nu.f it = new kotlin.ranges.c(size, 0, -1).iterator();
                while (it.f29173c) {
                    qVar.g(list.get(it.b()));
                }
                return;
            }
            qVar.clear();
            this.f16823b = i12;
            this.f16822a = i11;
            qVar.addAll(list);
            return;
        }
        if (event instanceof f1) {
            f1 f1Var = (f1) event;
            cVar.V(f1Var.f16746a, y0.f17134c);
            int ordinal2 = f1Var.f16746a.ordinal();
            int i13 = f1Var.f16749d;
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    this.f16823b = i13;
                    int a10 = f1Var.a();
                    while (i10 < a10) {
                        qVar.u();
                        i10++;
                    }
                    return;
                }
                throw new IllegalArgumentException("Page drop type must be prepend or append");
            }
            this.f16822a = i13;
            int a11 = f1Var.a();
            while (i10 < a11) {
                qVar.t();
                i10++;
            }
            return;
        }
        if (event instanceof h1) {
            h1 h1Var = (h1) event;
            cVar.T(h1Var.f16806a);
            this.f16826e = h1Var.f16807b;
        } else if (event instanceof i1) {
            i1 i1Var = (i1) event;
            i1Var.getClass();
            qVar.clear();
            this.f16823b = 0;
            this.f16822a = 0;
            qVar.h(new s4(0, i1Var.f16828a));
        }
    }

    public final List b() {
        if (!this.f16827f) {
            return vt.i0.f38321a;
        }
        ArrayList arrayList = new ArrayList();
        a1 X = this.f16825d.X();
        vt.q qVar = this.f16824c;
        if (!qVar.isEmpty()) {
            g1 g1Var = g1.f16784g;
            arrayList.add(mt.p.n(vt.g0.R(qVar), this.f16822a, this.f16823b, X, this.f16826e));
        } else {
            arrayList.add(new h1(X, this.f16826e));
        }
        return arrayList;
    }
}
