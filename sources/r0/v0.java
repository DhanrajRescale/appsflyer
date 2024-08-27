package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f32761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f32762c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f32763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32765f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(g1.o oVar, float f10, long j10, int i10, int i11, int i12) {
        super(2);
        this.f32760a = i12;
        this.f32761b = oVar;
        this.f32762c = f10;
        this.f32763d = j10;
        this.f32764e = i10;
        this.f32765f = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f32760a;
        int i12 = this.f32764e;
        switch (i11) {
            case 0:
                dp.b.s(this.f32761b, this.f32762c, this.f32763d, nVar, t0.t.H0(i12 | 1), this.f32765f);
                return;
            default:
                dp.b.A(this.f32761b, this.f32762c, this.f32763d, nVar, t0.t.H0(i12 | 1), this.f32765f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32760a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
