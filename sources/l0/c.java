package l0;

import d2.j3;
import d2.s1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j3 f23719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.o f23722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f23723e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j3 j3Var, long j10, boolean z10, g1.o oVar, n nVar) {
        super(2);
        this.f23719a = j3Var;
        this.f23720b = j10;
        this.f23721c = z10;
        this.f23722d = oVar;
        this.f23723e = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        dp.b.p(s1.f13631p.b(this.f23719a), b1.d.b(nVar, -1426434671, new b(this.f23720b, this.f23721c, this.f23722d, this.f23723e)), nVar, 48);
        return Unit.f23355a;
    }
}
