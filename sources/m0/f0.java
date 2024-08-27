package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26136a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f26137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f26138c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f26139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f26141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f26142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26144i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f26145j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f26146k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(long j10, long j11, float f10, b0.h1 h1Var, n1.x0 x0Var, b0.x1 x1Var, g1.o oVar, hu.c cVar, int i10, int i11) {
        super(2);
        this.f26140e = j10;
        this.f26141f = j11;
        this.f26142g = f10;
        this.f26145j = h1Var;
        this.f26146k = x0Var;
        this.f26137b = x1Var;
        this.f26138c = oVar;
        this.f26139d = cVar;
        this.f26143h = i10;
        this.f26144i = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26136a;
        int i12 = this.f26143h;
        Object obj = this.f26146k;
        Object obj2 = this.f26145j;
        switch (i11) {
            case 0:
                l0.a(this.f26140e, this.f26141f, this.f26142g, (b0.h1) obj2, (n1.x0) obj, this.f26137b, this.f26138c, this.f26139d, nVar, t0.t.H0(i12 | 1), this.f26144i);
                return;
            default:
                l0.c((Function2) obj2, this.f26137b, this.f26138c, (Function2) obj, this.f26139d, this.f26140e, this.f26141f, this.f26142g, nVar, t0.t.H0(i12 | 1), this.f26144i);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26136a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Function2 function2, b0.x1 x1Var, g1.o oVar, Function2 function22, hu.c cVar, long j10, long j11, float f10, int i10, int i11) {
        super(2);
        this.f26145j = function2;
        this.f26137b = x1Var;
        this.f26138c = oVar;
        this.f26146k = function22;
        this.f26139d = cVar;
        this.f26140e = j10;
        this.f26141f = j11;
        this.f26142g = f10;
        this.f26143h = i10;
        this.f26144i = i11;
    }
}
