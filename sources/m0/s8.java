package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s8 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z2 f26805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f26806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.c f26809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f26810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.e f26811g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26812h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(z2 z2Var, t3 t3Var, long j10, long j11, hu.c cVar, boolean z10, hu.e eVar, int i10) {
        super(2);
        this.f26805a = z2Var;
        this.f26806b = t3Var;
        this.f26807c = j10;
        this.f26808d = j11;
        this.f26809e = cVar;
        this.f26810f = z10;
        this.f26811g = eVar;
        this.f26812h = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f26805a.b(this.f26806b, this.f26807c, this.f26808d, this.f26809e, this.f26810f, this.f26811g, (t0.n) obj, t0.t.H0(this.f26812h | 1));
        return Unit.f23355a;
    }
}
