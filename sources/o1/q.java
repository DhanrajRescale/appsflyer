package o1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f29423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(1);
        this.f29422a = i10;
        this.f29423b = rVar;
    }

    public final Double a(double d10) {
        int i10 = this.f29422a;
        r rVar = this.f29423b;
        switch (i10) {
            case 0:
                return Double.valueOf(rVar.f29435n.h(kotlin.ranges.d.d(d10, rVar.f29426e, rVar.f29427f)));
            default:
                return Double.valueOf(kotlin.ranges.d.d(rVar.f29432k.h(d10), rVar.f29426e, rVar.f29427f));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f29422a) {
            case 0:
                return a(((Number) obj).doubleValue());
            default:
                return a(((Number) obj).doubleValue());
        }
    }
}
