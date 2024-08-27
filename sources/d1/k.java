package d1;

import d0.n0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.t;
import t0.x1;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final yq.b f13274d = new yq.b(17, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final r f13275e;

    /* renamed from: a, reason: collision with root package name */
    public final Map f13276a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13277b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public n f13278c;

    static {
        f fVar = f.f13261b;
        g gVar = g.f13264b;
        r rVar = s.f13291a;
        f13275e = new r(fVar, gVar);
    }

    public k(Map map) {
        this.f13276a = map;
    }

    @Override // d1.e
    public final void e(Object obj, Function2 function2, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1198538093);
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
            rVar.b0(444418301);
            rVar.d0(obj);
            rVar.b0(1516495213);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                n nVar2 = this.f13278c;
                if (nVar2 != null && !nVar2.a(obj)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Q = new i(this, obj);
                rVar.k0(Q);
            }
            i iVar = (i) Q;
            rVar.s(false);
            dp.b.p(q.f13288a.b(iVar.f13270c), function2, rVar, i11 & 112);
            Unit unit = Unit.f23355a;
            rVar.b0(1516495733);
            boolean j10 = rVar.j(this) | rVar.j(obj) | rVar.j(iVar);
            Object Q2 = rVar.Q();
            if (j10 || Q2 == eVar) {
                Q2 = new c.g(18, this, obj, iVar);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t.c(unit, (Function1) Q2, rVar);
            rVar.x();
            rVar.s(false);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(this, obj, function2, i10, 4);
        }
    }

    @Override // d1.e
    public final void f(Object obj) {
        i iVar = (i) this.f13277b.get(obj);
        if (iVar != null) {
            iVar.f13269b = false;
        } else {
            this.f13276a.remove(obj);
        }
    }
}
