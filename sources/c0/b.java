package c0;

import b0.h1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y.x0;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f7453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f7454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f7455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f7457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f7459h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7461j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f7462k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7463l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g1.o oVar, m0 m0Var, h1 h1Var, boolean z10, Object obj, Object obj2, x0 x0Var, boolean z11, Function1 function1, int i10, int i11, int i12) {
        super(2);
        this.f7452a = i12;
        this.f7453b = oVar;
        this.f7454c = m0Var;
        this.f7455d = h1Var;
        this.f7456e = z10;
        this.f7462k = obj;
        this.f7463l = obj2;
        this.f7457f = x0Var;
        this.f7458g = z11;
        this.f7459h = function1;
        this.f7460i = i10;
        this.f7461j = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f7452a;
        int i12 = this.f7460i;
        Object obj = this.f7463l;
        Object obj2 = this.f7462k;
        switch (i11) {
            case 0:
                qu.i0.c(this.f7453b, this.f7454c, this.f7455d, this.f7456e, (b0.j) obj2, (g1.b) obj, this.f7457f, this.f7458g, this.f7459h, nVar, t0.t.H0(i12 | 1), this.f7461j);
                return;
            default:
                qu.i0.d(this.f7453b, this.f7454c, this.f7455d, this.f7456e, (b0.h) obj2, (g1.c) obj, this.f7457f, this.f7458g, this.f7459h, nVar, t0.t.H0(i12 | 1), this.f7461j);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f7452a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
