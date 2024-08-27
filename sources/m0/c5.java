package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c5 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f25978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.o f25979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f25980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f25981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j2.g0 f25982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f25983h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f25984i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f25985j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f25986k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f25987l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p2.l0 f25988m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.p1 f25989n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.o1 f25990o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f25991p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f25992q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f25993r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0.l f25994s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f25995t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s1 f25996u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f25997v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f25998w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25999x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5(String str, Function1 function1, g1.o oVar, boolean z10, boolean z11, j2.g0 g0Var, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z12, p2.l0 l0Var, i0.p1 p1Var, i0.o1 o1Var, boolean z13, int i10, int i11, a0.l lVar, n1.x0 x0Var, s1 s1Var, int i12, int i13, int i14, int i15) {
        super(2);
        this.f25976a = i15;
        this.f25977b = str;
        this.f25978c = function1;
        this.f25979d = oVar;
        this.f25980e = z10;
        this.f25981f = z11;
        this.f25982g = g0Var;
        this.f25983h = function2;
        this.f25984i = function22;
        this.f25985j = function23;
        this.f25986k = function24;
        this.f25987l = z12;
        this.f25988m = l0Var;
        this.f25989n = p1Var;
        this.f25990o = o1Var;
        this.f25991p = z13;
        this.f25992q = i10;
        this.f25993r = i11;
        this.f25994s = lVar;
        this.f25995t = x0Var;
        this.f25996u = s1Var;
        this.f25997v = i12;
        this.f25998w = i13;
        this.f25999x = i14;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f25976a;
        int i12 = this.f25998w;
        int i13 = this.f25997v;
        switch (i11) {
            case 0:
                f5.a(this.f25977b, this.f25978c, this.f25979d, this.f25980e, this.f25981f, this.f25982g, this.f25983h, this.f25984i, this.f25985j, this.f25986k, this.f25987l, this.f25988m, this.f25989n, this.f25990o, this.f25991p, this.f25992q, this.f25993r, this.f25994s, this.f25995t, this.f25996u, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f25999x);
                return;
            default:
                p8.a(this.f25977b, this.f25978c, this.f25979d, this.f25980e, this.f25981f, this.f25982g, this.f25983h, this.f25984i, this.f25985j, this.f25986k, this.f25987l, this.f25988m, this.f25989n, this.f25990o, this.f25991p, this.f25992q, this.f25993r, this.f25994s, this.f25995t, this.f25996u, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f25999x);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25976a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
