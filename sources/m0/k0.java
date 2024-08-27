package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f26370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26372c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.h1 f26374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.c f26375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26377h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g1.o oVar, long j10, long j11, float f10, b0.h1 h1Var, hu.c cVar, int i10, int i11) {
        super(2);
        this.f26370a = oVar;
        this.f26371b = j10;
        this.f26372c = j11;
        this.f26373d = f10;
        this.f26374e = h1Var;
        this.f26375f = cVar;
        this.f26376g = i10;
        this.f26377h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l0.b(this.f26370a, this.f26371b, this.f26372c, this.f26373d, this.f26374e, this.f26375f, (t0.n) obj, t0.t.H0(this.f26376g | 1), this.f26377h);
        return Unit.f23355a;
    }
}
