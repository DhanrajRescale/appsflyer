package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f3 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32399a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f32400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f32401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f32402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32405g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(g1.o oVar, String str, float f10, long j10, int i10, int i11) {
        super(2);
        this.f32400b = oVar;
        this.f32405g = str;
        this.f32401c = f10;
        this.f32402d = j10;
        this.f32403e = i10;
        this.f32404f = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f32399a;
        int i12 = this.f32403e;
        Object obj = this.f32405g;
        switch (i11) {
            case 0:
                ((h3) obj).a(this.f32400b, this.f32401c, this.f32402d, nVar, t0.t.H0(i12 | 1), this.f32404f);
                return;
            default:
                el.l.k(this.f32400b, (String) obj, this.f32401c, this.f32402d, nVar, t0.t.H0(i12 | 1), this.f32404f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32399a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(h3 h3Var, g1.o oVar, float f10, long j10, int i10, int i11) {
        super(2);
        this.f32405g = h3Var;
        this.f32400b = oVar;
        this.f32401c = f10;
        this.f32402d = j10;
        this.f32403e = i10;
        this.f32404f = i11;
    }
}
