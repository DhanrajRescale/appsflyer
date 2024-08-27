package b0;

import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n0 extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f2942b = new n0(2);

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f2943c = new n0(4);

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f2944d = new n0(6);

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f2945e = new n0(8);

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f2946f = new n0(9);

    /* renamed from: g, reason: collision with root package name */
    public static final n0 f2947g = new n0(10);

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f2948h = new n0(11);

    /* renamed from: i, reason: collision with root package name */
    public static final n0 f2949i = new n0(12);

    /* renamed from: j, reason: collision with root package name */
    public static final n0 f2950j = new n0(13);

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f2951k = new n0(14);

    /* renamed from: l, reason: collision with root package name */
    public static final n0 f2952l = new n0(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i10) {
        super(3);
        this.f2953a = i10;
    }

    public final g1.o a(g1.o oVar, t0.n nVar) {
        to.e eVar = t0.m.f35080a;
        switch (this.f2953a) {
            case 16:
                t0.r rVar = (t0.r) nVar;
                rVar.b0(359872873);
                WeakHashMap weakHashMap = y1.f3042v;
                y1 c10 = g0.c(rVar);
                rVar.b0(1929189691);
                boolean h10 = rVar.h(c10);
                Object Q = rVar.Q();
                if (h10 || Q == eVar) {
                    Q = new t0(c10.f3045c);
                    rVar.k0(Q);
                }
                t0 t0Var = (t0) Q;
                rVar.s(false);
                rVar.s(false);
                return t0Var;
            case 17:
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(359872873);
                WeakHashMap weakHashMap2 = y1.f3042v;
                y1 c11 = g0.c(rVar2);
                rVar2.b0(1929189691);
                boolean h11 = rVar2.h(c11);
                Object Q2 = rVar2.Q();
                if (h11 || Q2 == eVar) {
                    Q2 = new t0(c11.f3047e);
                    rVar2.k0(Q2);
                }
                t0 t0Var2 = (t0) Q2;
                rVar2.s(false);
                rVar2.s(false);
                return t0Var2;
            default:
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(359872873);
                WeakHashMap weakHashMap3 = y1.f3042v;
                y1 c12 = g0.c(rVar3);
                rVar3.b0(1929189691);
                boolean h12 = rVar3.h(c12);
                Object Q3 = rVar3.Q();
                if (h12 || Q3 == eVar) {
                    Q3 = new t0(c12.f3053k);
                    rVar3.k0(Q3);
                }
                t0 t0Var3 = (t0) Q3;
                rVar3.s(false);
                rVar3.s(false);
                return t0Var3;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f2953a) {
            case 0:
                return e((a2.q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 1:
                return e((a2.q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 2:
                return e((a2.q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 3:
                return e((a2.q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 4:
                return e((a2.q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 5:
                return e((a2.q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 6:
                return e((a2.q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 7:
                return e((a2.q) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 8:
                return d(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 9:
                return d(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 10:
                return d(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 11:
                return d(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 12:
                return d(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 13:
                return d(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 14:
                return d(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 15:
                return d(((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj);
            case 16:
                ((Number) obj3).intValue();
                return a((g1.o) obj, (t0.n) obj2);
            case 17:
                ((Number) obj3).intValue();
                return a((g1.o) obj, (t0.n) obj2);
            default:
                ((Number) obj3).intValue();
                return a((g1.o) obj, (t0.n) obj2);
        }
    }

    public final Integer d(int i10, int i11, List list) {
        switch (this.f2953a) {
            case 8:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, k.f2889c, k.f2890d, i10, i11, 1, 2));
            case 9:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, k.f2891e, k.f2892f, i10, i11, 1, 1));
            case 10:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, k.f2893g, k.f2894h, i10, i11, 1, 2));
            case 11:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, k.f2895i, k.f2896j, i10, i11, 1, 1));
            case 12:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, k.f2897k, k.f2898l, i10, i11, 2, 2));
            case 13:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, k.f2899m, k.f2900n, i10, i11, 2, 1));
            case 14:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, k.f2901o, k.f2902p, i10, i11, 2, 2));
            default:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, k.f2903q, k.f2904r, i10, i11, 2, 1));
        }
    }

    public final Integer e(a2.q qVar, int i10, int i11) {
        switch (this.f2953a) {
            case 0:
                return Integer.valueOf(qVar.e(i11));
            case 1:
                return Integer.valueOf(qVar.D(i11));
            case 2:
                return Integer.valueOf(qVar.D(i11));
            case 3:
                return Integer.valueOf(qVar.e(i11));
            case 4:
                return Integer.valueOf(qVar.W(i11));
            case 5:
                return Integer.valueOf(qVar.z(i11));
            case 6:
                return Integer.valueOf(qVar.z(i11));
            default:
                return Integer.valueOf(qVar.W(i11));
        }
    }
}
