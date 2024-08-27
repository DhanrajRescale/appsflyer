package d0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.m3;
import t0.n1;
import t0.o3;
import t0.x1;

/* loaded from: classes.dex */
public final class o0 implements d1.n, d1.e {

    /* renamed from: a, reason: collision with root package name */
    public final d1.n f13195a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f13196b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f13197c;

    public o0(d1.n nVar, Map map) {
        l0 l0Var = new l0(nVar, 0);
        m3 m3Var = d1.q.f13288a;
        this.f13195a = new d1.p(map, l0Var);
        this.f13196b = t0.t.n0(null, o3.f35116a);
        this.f13197c = new LinkedHashSet();
    }

    @Override // d1.n
    public final boolean a(Object obj) {
        return this.f13195a.a(obj);
    }

    @Override // d1.n
    public final Map b() {
        d1.e eVar = (d1.e) this.f13196b.getValue();
        if (eVar != null) {
            Iterator it = this.f13197c.iterator();
            while (it.hasNext()) {
                eVar.f(it.next());
            }
        }
        return this.f13195a.b();
    }

    @Override // d1.n
    public final Object c(String str) {
        return this.f13195a.c(str);
    }

    @Override // d1.n
    public final d1.m d(String str, Function0 function0) {
        return this.f13195a.d(str, function0);
    }

    @Override // d1.e
    public final void e(Object obj, Function2 function2, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-697180401);
        if ((i10 & 6) == 0) {
            if (rVar.j(obj)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.j(this)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            d1.e eVar = (d1.e) this.f13196b.getValue();
            if (eVar != null) {
                eVar.e(obj, function2, rVar, (i11 & 112) | (i11 & 14));
                rVar.b0(-395563180);
                boolean j10 = rVar.j(this) | rVar.j(obj);
                Object Q = rVar.Q();
                if (j10 || Q == t0.m.f35080a) {
                    Q = new x.z(8, this, obj);
                    rVar.k0(Q);
                }
                rVar.s(false);
                t0.t.c(obj, (Function1) Q, rVar);
            } else {
                throw new IllegalArgumentException("null wrappedHolder".toString());
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(this, obj, function2, i10, 0);
        }
    }

    @Override // d1.e
    public final void f(Object obj) {
        d1.e eVar = (d1.e) this.f13196b.getValue();
        if (eVar != null) {
            eVar.f(obj);
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder".toString());
    }
}
