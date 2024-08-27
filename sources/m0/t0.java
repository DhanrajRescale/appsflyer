package m0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class t0 extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f26817b = new t0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f26818c = new t0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f26819d = new t0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f26820e = new t0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f26821f = new t0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final t0 f26822g = new t0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final t0 f26823h = new t0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final t0 f26824i = new t0(7);

    /* renamed from: j, reason: collision with root package name */
    public static final t0 f26825j = new t0(8);

    /* renamed from: k, reason: collision with root package name */
    public static final t0 f26826k = new t0(9);

    /* renamed from: l, reason: collision with root package name */
    public static final t0 f26827l = new t0(10);

    /* renamed from: m, reason: collision with root package name */
    public static final t0 f26828m = new t0(11);

    /* renamed from: n, reason: collision with root package name */
    public static final t0 f26829n = new t0(12);

    /* renamed from: o, reason: collision with root package name */
    public static final t0 f26830o = new t0(13);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i10) {
        super(3);
        this.f26831a = i10;
    }

    public final w.f0 a(w.p1 p1Var, t0.n nVar) {
        w.f0 x10;
        w.f0 v10;
        w.x1 x11;
        w.x1 x12;
        w.x1 x13;
        w.f0 x1Var;
        i2.a aVar = i2.a.f19330b;
        switch (this.f26831a) {
            case 0:
                t0.r rVar = (t0.r) nVar;
                rVar.b0(1075283605);
                if (p1Var.f38639a == aVar) {
                    x10 = new w.d1(0);
                } else if (p1Var.f38640b == aVar) {
                    x10 = new w.d1(100);
                } else {
                    x10 = w.e.x(100, 0, null, 6);
                }
                rVar.s(false);
                return x10;
            case 1:
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-1707702900);
                if (p1Var.f38639a == aVar) {
                    v10 = w.e.x(100, 0, null, 6);
                } else if (p1Var.f38640b == aVar) {
                    v10 = new w.d1(100);
                } else {
                    v10 = w.e.v(s0.g.f34069a, null, 7);
                }
                rVar2.s(false);
                return v10;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(-1079955085);
                t3 t3Var = t3.f26834a;
                t3 t3Var2 = t3.f26835b;
                if (p1Var.a(t3Var, t3Var2)) {
                    x1Var = w.e.x(67, 0, w.e0.f38472c, 2);
                } else if (!p1Var.a(t3Var2, t3Var) && !p1Var.a(t3.f26836c, t3Var2)) {
                    x1Var = w.e.v(s0.g.f34069a, null, 7);
                } else {
                    x1Var = new w.x1(83, 67, w.e0.f38472c);
                }
                rVar3.s(false);
                return x1Var;
            case 7:
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-2065494304);
                if (p1Var.a(Boolean.FALSE, Boolean.TRUE)) {
                    x11 = w.e.x(30, 0, null, 6);
                } else {
                    x11 = w.e.x(75, 0, null, 6);
                }
                rVar4.s(false);
                return x11;
            case 8:
                t0.r rVar5 = (t0.r) nVar;
                rVar5.b0(-800950068);
                if (p1Var.a(Boolean.FALSE, Boolean.TRUE)) {
                    x12 = w.e.x(120, 0, w.e0.f38471b, 2);
                } else {
                    x12 = w.e.x(1, 74, null, 4);
                }
                rVar5.s(false);
                return x12;
            case 9:
                t0.r rVar6 = (t0.r) nVar;
                rVar6.b0(-2120892502);
                if (p1Var.a(Boolean.FALSE, Boolean.TRUE)) {
                    x13 = new w.x1(150, 100, w.e0.f38472c);
                } else {
                    x13 = w.e.x(100, 0, w.e0.f38472c, 2);
                }
                rVar6.s(false);
                return x13;
            case 10:
                t0.r rVar7 = (t0.r) nVar;
                rVar7.b0(-32667848);
                w.x1 x14 = w.e.x(150, 0, null, 6);
                rVar7.s(false);
                return x14;
            case 11:
                t0.r rVar8 = (t0.r) nVar;
                rVar8.b0(-611722692);
                w.x1 x15 = w.e.x(150, 0, null, 6);
                rVar8.s(false);
                return x15;
            case 12:
                t0.r rVar9 = (t0.r) nVar;
                rVar9.b0(-130058045);
                w.x1 x16 = w.e.x(150, 0, null, 6);
                rVar9.s(false);
                return x16;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean j10;
        int i10;
        switch (this.f26831a) {
            case 0:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
            case 1:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
            case 2:
                d((b0.p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 3:
                d((b0.p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 4:
                e((l6) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 5:
                e((l6) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 6:
                a3.a.u(obj);
                t0.n nVar = (t0.n) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        j10 = ((t0.r) nVar).h(null);
                    } else {
                        j10 = ((t0.r) nVar).j(null);
                    }
                    if (j10) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 19) == 18) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                t6.a(null, false, null, 0L, 0L, 0L, s0.g.f34069a, nVar, intValue & 14, 254);
                return Unit.f23355a;
            case 7:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
            case 8:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
            case 9:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
            case 10:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
            case 11:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
            case 12:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
            default:
                ((Number) obj3).intValue();
                return a((w.p1) obj, (t0.n) obj2);
        }
    }

    public final void d(b0.p1 p1Var, t0.n nVar, int i10) {
        switch (this.f26831a) {
            case 2:
                if ((i10 & 17) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                    return;
                }
                return;
            default:
                if ((i10 & 17) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void e(l6 l6Var, t0.n nVar, int i10) {
        int i11 = 2;
        switch (this.f26831a) {
            case 4:
                if ((i10 & 6) == 0) {
                    if (((t0.r) nVar).h(l6Var)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 19) == 18) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                pp.b.i(l6Var, null, null, nVar, i10 & 14, 6);
                return;
            default:
                if ((i10 & 6) == 0) {
                    if (((t0.r) nVar).h(l6Var)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 19) == 18) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                pp.b.i(l6Var, null, null, nVar, i10 & 14, 6);
                return;
        }
    }
}
