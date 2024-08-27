package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f27155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.c f27158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f27159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f27160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27161h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27162i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(int i10, g1.o oVar, long j10, long j11, hu.c cVar, Function2 function2, Function2 function22, int i11, int i12) {
        super(2);
        this.f27154a = i10;
        this.f27155b = oVar;
        this.f27156c = j10;
        this.f27157d = j11;
        this.f27158e = cVar;
        this.f27159f = function2;
        this.f27160g = function22;
        this.f27161h = i11;
        this.f27162i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        z7.b(this.f27154a, this.f27155b, this.f27156c, this.f27157d, this.f27158e, this.f27159f, this.f27160g, (t0.n) obj, t0.t.H0(this.f27161h | 1), this.f27162i);
        return Unit.f23355a;
    }
}
