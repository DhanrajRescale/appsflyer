package l0;

import a2.g1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f23804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f23805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(g1.o oVar, Function2 function2, int i10, int i11, int i12) {
        super(2);
        this.f23803a = i12;
        this.f23804b = oVar;
        this.f23805c = function2;
        this.f23806d = i10;
        this.f23807e = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f23803a;
        Function2 function2 = this.f23805c;
        g1.o oVar = this.f23804b;
        int i12 = this.f23807e;
        int i13 = this.f23806d;
        switch (i11) {
            case 0:
                dp.b.i0(oVar, function2, nVar, t0.t.H0(i13 | 1), i12);
                return;
            case 1:
                g1.b(oVar, function2, nVar, t0.t.H0(i13 | 1), i12);
                return;
            default:
                hl.f.o(oVar, function2, nVar, t0.t.H0(i13 | 1), i12);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f23803a) {
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
