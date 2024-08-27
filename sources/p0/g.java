package p0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.t;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f30450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f30452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f30454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f30455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f30456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f30457h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z10, o oVar, g1.o oVar2, long j10, long j11, boolean z11, int i10, int i11) {
        super(2);
        this.f30450a = z10;
        this.f30451b = oVar;
        this.f30452c = oVar2;
        this.f30453d = j10;
        this.f30454e = j11;
        this.f30455f = z11;
        this.f30456g = i10;
        this.f30457h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h.a(this.f30450a, this.f30451b, this.f30452c, this.f30453d, this.f30454e, this.f30455f, (t0.n) obj, t.H0(this.f30456g | 1), this.f30457h);
        return Unit.f23355a;
    }
}
