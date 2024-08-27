package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p7 f26590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f26591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(p7 p7Var, g1.o oVar, float f10, long j10, int i10, int i11, int i12) {
        super(2);
        this.f26589a = i12;
        this.f26590b = p7Var;
        this.f26591c = oVar;
        this.f26592d = f10;
        this.f26593e = j10;
        this.f26594f = i10;
        this.f26595g = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26589a;
        int i12 = this.f26594f;
        switch (i11) {
            case 0:
                this.f26590b.a(this.f26591c, this.f26592d, this.f26593e, nVar, t0.t.H0(i12 | 1), this.f26595g);
                return;
            default:
                this.f26590b.b(this.f26591c, this.f26592d, this.f26593e, nVar, t0.t.H0(i12 | 1), this.f26595g);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26589a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
