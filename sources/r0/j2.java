package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d4.c0 f32483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f32484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(d4.c0 c0Var, Function2 function2, int i10) {
        super(2);
        this.f32482a = i10;
        this.f32483b = c0Var;
        this.f32484c = function2;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f32482a;
        Function2 function2 = this.f32484c;
        d4.c0 c0Var = this.f32483b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                dp.b.p(p2.f32670b.b(c0Var), function2, nVar, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                dp.b.p(p2.f32670b.b(c0Var), function2, nVar, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32482a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
