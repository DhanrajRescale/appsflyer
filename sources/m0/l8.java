package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l8 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26459a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Float f26461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f26462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(long j10, Float f10, Function2 function2) {
        super(2);
        this.f26460b = j10;
        this.f26461c = f10;
        this.f26462d = function2;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26459a;
        Function2 function2 = this.f26462d;
        Float f10 = this.f26461c;
        long j10 = this.f26460b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                if (f10 != null) {
                    t0.r rVar2 = (t0.r) nVar;
                    rVar2.b0(-452622690);
                    dp.b.p(d1.f26028a.b(f10), function2, rVar2, 0);
                    rVar2.s(false);
                    return;
                }
                t0.r rVar3 = (t0.r) nVar;
                rVar3.b0(-452622510);
                dp.b.p(d1.f26028a.b(Float.valueOf(n1.t.e(j10))), function2, rVar3, 0);
                rVar3.s(false);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                dp.b.p(e1.f26084a.b(new n1.t(j10)), b1.d.b(nVar, -1132188434, new l8(f10, function2, j10)), nVar, 48);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26459a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(Float f10, Function2 function2, long j10) {
        super(2);
        this.f26461c = f10;
        this.f26462d = function2;
        this.f26460b = j10;
    }
}
