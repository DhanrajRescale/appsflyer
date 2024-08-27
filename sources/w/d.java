package w;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.o3;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f38451a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38452b;

    /* renamed from: c, reason: collision with root package name */
    public final o f38453c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f38454d;

    /* renamed from: e, reason: collision with root package name */
    public final t0.n1 f38455e;

    /* renamed from: f, reason: collision with root package name */
    public final c1 f38456f;

    /* renamed from: g, reason: collision with root package name */
    public final t f38457g;

    /* renamed from: h, reason: collision with root package name */
    public final t f38458h;

    /* renamed from: i, reason: collision with root package name */
    public final t f38459i;

    /* renamed from: j, reason: collision with root package name */
    public final t f38460j;

    public d(Object obj, y1 y1Var, Object obj2) {
        t tVar;
        t tVar2;
        this.f38451a = y1Var;
        this.f38452b = obj2;
        o oVar = new o(y1Var, obj, null, 60);
        this.f38453c = oVar;
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f35116a;
        this.f38454d = t0.t.n0(bool, o3Var);
        this.f38455e = t0.t.n0(obj, o3Var);
        this.f38456f = new c1();
        t tVar3 = oVar.f38623c;
        boolean z10 = tVar3 instanceof p;
        if (z10) {
            tVar = e.f38466e;
        } else if (tVar3 instanceof q) {
            tVar = e.f38467f;
        } else {
            tVar = tVar3 instanceof r ? e.f38468g : e.f38469h;
        }
        this.f38457g = tVar;
        if (z10) {
            tVar2 = e.f38462a;
        } else if (tVar3 instanceof q) {
            tVar2 = e.f38463b;
        } else {
            tVar2 = tVar3 instanceof r ? e.f38464c : e.f38465d;
        }
        this.f38458h = tVar2;
        this.f38459i = tVar;
        this.f38460j = tVar2;
    }

    public static final Object a(d dVar, Object obj) {
        t tVar = dVar.f38457g;
        t tVar2 = dVar.f38459i;
        boolean a10 = Intrinsics.a(tVar2, tVar);
        t tVar3 = dVar.f38460j;
        if (!a10 || !Intrinsics.a(tVar3, dVar.f38458h)) {
            y1 y1Var = dVar.f38451a;
            t tVar4 = (t) y1Var.f38734a.invoke(obj);
            int b10 = tVar4.b();
            boolean z10 = false;
            for (int i10 = 0; i10 < b10; i10++) {
                if (tVar4.a(i10) < tVar2.a(i10) || tVar4.a(i10) > tVar3.a(i10)) {
                    tVar4.e(i10, kotlin.ranges.d.e(tVar4.a(i10), tVar2.a(i10), tVar3.a(i10)));
                    z10 = true;
                }
            }
            if (z10) {
                return y1Var.f38735b.invoke(tVar4);
            }
            return obj;
        }
        return obj;
    }

    public static final void b(d dVar) {
        o oVar = dVar.f38453c;
        oVar.f38623c.d();
        oVar.f38624d = Long.MIN_VALUE;
        dVar.f38454d.setValue(Boolean.FALSE);
    }

    public static Object c(d dVar, Object obj, n nVar, yt.a aVar) {
        Object invoke = dVar.f38451a.f38735b.invoke(dVar.f38453c.f38623c);
        Object d10 = dVar.d();
        y1 y1Var = dVar.f38451a;
        return c1.a(dVar.f38456f, new b(dVar, invoke, new m1(nVar, y1Var, d10, obj, (t) y1Var.f38734a.invoke(invoke)), dVar.f38453c.f38624d, null, null), aVar);
    }

    public final Object d() {
        return this.f38453c.f38622b.getValue();
    }

    public final Object e(Object obj, yt.a aVar) {
        Object a10 = c1.a(this.f38456f, new c(this, obj, null), aVar);
        if (a10 == zt.a.f42823a) {
            return a10;
        }
        return Unit.f23355a;
    }

    public /* synthetic */ d(Object obj, y1 y1Var, Object obj2, int i10) {
        this(obj, y1Var, (i10 & 4) != 0 ? null : obj2);
    }
}
