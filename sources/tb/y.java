package tb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f35803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f35804c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f35805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f35806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, int i11, int i12, g1.o oVar, Function0 function0) {
        super(2);
        this.f35802a = i12;
        this.f35803b = oVar;
        this.f35804c = function0;
        this.f35805d = i10;
        this.f35806e = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f35802a;
        Function0 function0 = this.f35804c;
        g1.o oVar = this.f35803b;
        int i12 = this.f35806e;
        int i13 = this.f35805d;
        switch (i11) {
            case 0:
                yk.o.p(oVar, function0, nVar, t0.t.H0(i13 | 1), i12);
                return;
            default:
                el.l.d(oVar, function0, nVar, t0.t.H0(i13 | 1), i12);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f35802a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
