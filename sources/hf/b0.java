package hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f18356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rj.o f18357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(g1.o oVar, rj.o oVar2, int i10, int i11, int i12) {
        super(2);
        this.f18355a = i12;
        this.f18356b = oVar;
        this.f18357c = oVar2;
        this.f18358d = i10;
        this.f18359e = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f18355a;
        rj.o oVar = this.f18357c;
        g1.o oVar2 = this.f18356b;
        int i12 = this.f18359e;
        int i13 = this.f18358d;
        switch (i11) {
            case 0:
                dp.b.m(oVar2, oVar, nVar, t0.t.H0(i13 | 1), i12);
                return;
            case 1:
                dp.b.n(oVar2, oVar, nVar, t0.t.H0(i13 | 1), i12);
                return;
            default:
                dp.b.o(oVar2, oVar, nVar, t0.t.H0(i13 | 1), i12);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f18355a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
