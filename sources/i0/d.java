package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, long j10) {
        super(1);
        this.f18819a = i10;
        this.f18820b = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18819a) {
            case 0:
                k1.d dVar = (k1.d) obj;
                float e10 = m1.f.e(dVar.f21893a.d()) / 2.0f;
                return dVar.a(new x.u(e10, dp.b.e1(dVar, e10), kq.e.P(5, this.f18820b)));
            default:
                ((h2.j) ((h2.v) obj)).h(l0.e0.f23746c, new l0.d0(z0.f19288a, this.f18820b, 2, true));
                return Unit.f23355a;
        }
    }
}
