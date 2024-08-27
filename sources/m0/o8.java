package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o8 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f26596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f26597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f26598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f26599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f26600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f26601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f26602g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f26603h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.h1 f26604i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26605j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(g1.o oVar, Function2 function2, Function2 function22, hu.c cVar, Function2 function23, Function2 function24, boolean z10, float f10, b0.h1 h1Var, int i10) {
        super(2);
        this.f26596a = oVar;
        this.f26597b = function2;
        this.f26598c = function22;
        this.f26599d = cVar;
        this.f26600e = function23;
        this.f26601f = function24;
        this.f26602g = z10;
        this.f26603h = f10;
        this.f26604i = h1Var;
        this.f26605j = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        p8.b(this.f26596a, this.f26597b, this.f26598c, this.f26599d, this.f26600e, this.f26601f, this.f26602g, this.f26603h, this.f26604i, (t0.n) obj, t0.t.H0(this.f26605j | 1));
        return Unit.f23355a;
    }
}
