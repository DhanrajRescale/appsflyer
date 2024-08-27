package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18967a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f18969c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j2.g0 f18970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.l0 f18971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f18972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.l f18973g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n1.p f18974h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f18975i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f18976j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18977k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1 f18978l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f18979m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f18980n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hu.c f18981o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18982p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18983q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18984r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f18985s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18986t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Function1 function1, g1.o oVar, boolean z10, boolean z11, j2.g0 g0Var, p1 p1Var, o1 o1Var, boolean z12, int i10, int i11, p2.l0 l0Var, Function1 function12, a0.l lVar, n1.p pVar, hu.c cVar, int i12, int i13, int i14) {
        super(2);
        this.f18985s = str;
        this.f18968b = function1;
        this.f18969c = oVar;
        this.f18975i = z10;
        this.f18979m = z11;
        this.f18970d = g0Var;
        this.f18986t = p1Var;
        this.f18978l = o1Var;
        this.f18980n = z12;
        this.f18976j = i10;
        this.f18977k = i11;
        this.f18971e = l0Var;
        this.f18972f = function12;
        this.f18973g = lVar;
        this.f18974h = pVar;
        this.f18981o = cVar;
        this.f18982p = i12;
        this.f18983q = i13;
        this.f18984r = i14;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f18967a;
        int i12 = this.f18983q;
        int i13 = this.f18982p;
        Object obj = this.f18986t;
        Object obj2 = this.f18985s;
        switch (i11) {
            case 0:
                l1.d((String) obj2, this.f18968b, this.f18969c, this.f18975i, this.f18979m, this.f18970d, (p1) obj, this.f18978l, this.f18980n, this.f18976j, this.f18977k, this.f18971e, this.f18972f, this.f18973g, this.f18974h, this.f18981o, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f18984r);
                return;
            default:
                l1.f((p2.c0) obj2, this.f18968b, this.f18969c, this.f18970d, this.f18971e, this.f18972f, this.f18973g, this.f18974h, this.f18975i, this.f18976j, this.f18977k, (p2.o) obj, this.f18978l, this.f18979m, this.f18980n, this.f18981o, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f18984r);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f18967a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p2.c0 c0Var, Function1 function1, g1.o oVar, j2.g0 g0Var, p2.l0 l0Var, Function1 function12, a0.l lVar, n1.p pVar, boolean z10, int i10, int i11, p2.o oVar2, o1 o1Var, boolean z11, boolean z12, hu.c cVar, int i12, int i13, int i14) {
        super(2);
        this.f18985s = c0Var;
        this.f18968b = function1;
        this.f18969c = oVar;
        this.f18970d = g0Var;
        this.f18971e = l0Var;
        this.f18972f = function12;
        this.f18973g = lVar;
        this.f18974h = pVar;
        this.f18975i = z10;
        this.f18976j = i10;
        this.f18977k = i11;
        this.f18986t = oVar2;
        this.f18978l = o1Var;
        this.f18979m = z11;
        this.f18980n = z12;
        this.f18981o = cVar;
        this.f18982p = i12;
        this.f18983q = i13;
        this.f18984r = i14;
    }
}
