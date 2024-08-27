package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26302a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f26303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f26306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f26307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26309h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f26310i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f26311j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(g1.o oVar, n1.x0 x0Var, long j10, long j11, x.d0 d0Var, float f10, Function2 function2, int i10, int i11) {
        super(2);
        this.f26303b = oVar;
        this.f26310i = x0Var;
        this.f26304c = j10;
        this.f26305d = j11;
        this.f26311j = d0Var;
        this.f26306e = f10;
        this.f26307f = function2;
        this.f26308g = i10;
        this.f26309h = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26302a;
        int i12 = this.f26308g;
        Object obj = this.f26311j;
        Object obj2 = this.f26310i;
        switch (i11) {
            case 0:
                l0.d(this.f26307f, this.f26303b, (Function2) obj2, (hu.c) obj, this.f26304c, this.f26305d, this.f26306e, nVar, t0.t.H0(i12 | 1), this.f26309h);
                return;
            default:
                pp.b.j(this.f26303b, (n1.x0) obj2, this.f26304c, this.f26305d, (x.d0) obj, this.f26306e, this.f26307f, nVar, t0.t.H0(i12 | 1), this.f26309h);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26302a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Function2 function2, g1.o oVar, Function2 function22, hu.c cVar, long j10, long j11, float f10, int i10, int i11) {
        super(2);
        this.f26307f = function2;
        this.f26303b = oVar;
        this.f26310i = function22;
        this.f26311j = cVar;
        this.f26304c = j10;
        this.f26305d = j11;
        this.f26306e = f10;
        this.f26308g = i10;
        this.f26309h = i11;
    }
}
