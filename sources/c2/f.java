package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f7673b = new f(1);

    /* renamed from: c, reason: collision with root package name */
    public static final f f7674c = new f(2);

    /* renamed from: d, reason: collision with root package name */
    public static final f f7675d = new f(3);

    /* renamed from: e, reason: collision with root package name */
    public static final f f7676e = new f(4);

    /* renamed from: f, reason: collision with root package name */
    public static final f f7677f = new f(5);

    /* renamed from: g, reason: collision with root package name */
    public static final f f7678g = new f(6);

    /* renamed from: h, reason: collision with root package name */
    public static final f f7679h = new f(7);

    /* renamed from: i, reason: collision with root package name */
    public static final f f7680i = new f(8);

    /* renamed from: j, reason: collision with root package name */
    public static final f f7681j = new f(9);

    /* renamed from: k, reason: collision with root package name */
    public static final f f7682k = new f(10);

    /* renamed from: l, reason: collision with root package name */
    public static final f f7683l = new f(11);

    /* renamed from: m, reason: collision with root package name */
    public static final f f7684m = new f(12);

    /* renamed from: n, reason: collision with root package name */
    public static final f f7685n = new f(13);

    /* renamed from: o, reason: collision with root package name */
    public static final f f7686o = new f(14);

    /* renamed from: p, reason: collision with root package name */
    public static final f f7687p = new f(15);

    /* renamed from: q, reason: collision with root package name */
    public static final f f7688q = new f(16);

    /* renamed from: r, reason: collision with root package name */
    public static final f f7689r = new f(17);

    /* renamed from: s, reason: collision with root package name */
    public static final f f7690s = new f(18);

    /* renamed from: t, reason: collision with root package name */
    public static final f f7691t = new f(19);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(1);
        this.f7692a = i10;
    }

    public final void a(androidx.compose.ui.node.a aVar) {
        switch (this.f7692a) {
            case 13:
                if (aVar.C()) {
                    aVar.R(false);
                    return;
                }
                return;
            case 14:
                if (aVar.C()) {
                    aVar.R(false);
                    return;
                }
                return;
            case 15:
                if (aVar.C()) {
                    aVar.P(false);
                    return;
                }
                return;
            case 16:
                if (aVar.C()) {
                    aVar.P(false);
                    return;
                }
                return;
            case 17:
                if (aVar.C()) {
                    androidx.compose.ui.node.a.Q(aVar, false, 3);
                    return;
                }
                return;
            case 18:
                if (aVar.C()) {
                    androidx.compose.ui.node.a.S(aVar, false, 3);
                    return;
                }
                return;
            default:
                if (aVar.C()) {
                    aVar.A();
                    return;
                }
                return;
        }
    }

    public final void d(b bVar) {
        switch (this.f7692a) {
            case 2:
                bVar.c().f7632d = false;
                return;
            case 3:
                bVar.c().f7633e = bVar.c().f7632d;
                return;
            case 4:
                bVar.c().f7631c = false;
                return;
            case 5:
                bVar.c().f7632d = false;
                return;
            case 6:
                bVar.c().f7633e = bVar.c().f7632d;
                return;
            default:
                bVar.c().f7631c = false;
                return;
        }
    }

    public final void e(i1 i1Var) {
        switch (this.f7692a) {
            case 9:
                p1 p1Var = i1Var.C;
                if (p1Var != null) {
                    p1Var.invalidate();
                    return;
                }
                return;
            default:
                if (i1Var.r()) {
                    a0 a0Var = i1Var.f7735y;
                    if (a0Var == null) {
                        i1Var.q1(true);
                        return;
                    }
                    a0 a0Var2 = i1.E;
                    a0Var2.getClass();
                    a0Var2.f7638a = a0Var.f7638a;
                    a0Var2.f7639b = a0Var.f7639b;
                    a0Var2.f7640c = a0Var.f7640c;
                    a0Var2.f7641d = a0Var.f7641d;
                    a0Var2.f7642e = a0Var.f7642e;
                    a0Var2.f7643f = a0Var.f7643f;
                    a0Var2.f7644g = a0Var.f7644g;
                    a0Var2.f7645h = a0Var.f7645h;
                    a0Var2.f7646i = a0Var.f7646i;
                    i1Var.q1(true);
                    if (a0Var2.f7638a != a0Var.f7638a || a0Var2.f7639b != a0Var.f7639b || a0Var2.f7640c != a0Var.f7640c || a0Var2.f7641d != a0Var.f7641d || a0Var2.f7642e != a0Var.f7642e || a0Var2.f7643f != a0Var.f7643f || a0Var2.f7644g != a0Var.f7644g || a0Var2.f7645h != a0Var.f7645h || a0Var2.f7646i != a0Var.f7646i) {
                        androidx.compose.ui.node.a aVar = i1Var.f7721k;
                        q0 q0Var = aVar.f1423x;
                        if (q0Var.f7826n > 0) {
                            if (q0Var.f7825m || q0Var.f7824l) {
                                aVar.R(false);
                            }
                            q0Var.f7827o.B0();
                        }
                        r1 r1Var = aVar.f1408i;
                        if (r1Var != null) {
                            d2.a0 a0Var3 = (d2.a0) r1Var;
                            a0Var3.F.f7876d.f7805a.b(aVar);
                            aVar.E = true;
                            a0Var3.C(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f7692a;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                switch (i10) {
                    case 0:
                        dVar.getClass();
                        g.s(dVar);
                        break;
                    default:
                        dVar.S0();
                        break;
                }
                return Unit.f23355a;
            case 1:
                d dVar2 = (d) obj;
                switch (i10) {
                    case 0:
                        dVar2.getClass();
                        g.s(dVar2);
                        break;
                    default:
                        dVar2.S0();
                        break;
                }
                return Unit.f23355a;
            case 2:
                d((b) obj);
                return Unit.f23355a;
            case 3:
                d((b) obj);
                return Unit.f23355a;
            case 4:
                d((b) obj);
                return Unit.f23355a;
            case 5:
                d((b) obj);
                return Unit.f23355a;
            case 6:
                d((b) obj);
                return Unit.f23355a;
            case 7:
                d((b) obj);
                return Unit.f23355a;
            case 8:
                v1 v1Var = (v1) obj;
                if (v1Var.r()) {
                    v1Var.f7867b.w0(v1Var);
                }
                return Unit.f23355a;
            case 9:
                e((i1) obj);
                return Unit.f23355a;
            case 10:
                e((i1) obj);
                return Unit.f23355a;
            case 11:
                m1 m1Var = (m1) obj;
                if (m1Var.r()) {
                    m1Var.f7777a.j0();
                }
                return Unit.f23355a;
            case 12:
                Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((s1) obj).r());
            case 13:
                a((androidx.compose.ui.node.a) obj);
                return Unit.f23355a;
            case 14:
                a((androidx.compose.ui.node.a) obj);
                return Unit.f23355a;
            case 15:
                a((androidx.compose.ui.node.a) obj);
                return Unit.f23355a;
            case 16:
                a((androidx.compose.ui.node.a) obj);
                return Unit.f23355a;
            case 17:
                a((androidx.compose.ui.node.a) obj);
                return Unit.f23355a;
            case 18:
                a((androidx.compose.ui.node.a) obj);
                return Unit.f23355a;
            default:
                a((androidx.compose.ui.node.a) obj);
                return Unit.f23355a;
        }
    }
}
