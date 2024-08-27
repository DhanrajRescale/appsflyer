package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f23729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2.h f23731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1.o f23734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f23735g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, boolean z10, u2.h hVar, boolean z11, long j10, g1.o oVar, int i10, int i11) {
        super(2);
        this.f23729a = nVar;
        this.f23730b = z10;
        this.f23731c = hVar;
        this.f23732d = z11;
        this.f23733e = j10;
        this.f23734f = oVar;
        this.f23735g = i10;
        this.f23736h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dp.b.c0(this.f23729a, this.f23730b, this.f23731c, this.f23732d, this.f23733e, this.f23734f, (t0.n) obj, t0.t.H0(this.f23735g | 1), this.f23736h);
        return Unit.f23355a;
    }
}
