package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w5 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f27024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f27025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f27026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y4 f27027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f27028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hu.c f27029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b6 f27030i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(boolean z10, int i10, Function2 function2, hu.c cVar, Function2 function22, y4 y4Var, Function2 function23, hu.c cVar2, b6 b6Var) {
        super(2);
        this.f27022a = z10;
        this.f27023b = i10;
        this.f27024c = function2;
        this.f27025d = cVar;
        this.f27026e = function22;
        this.f27027f = y4Var;
        this.f27028g = function23;
        this.f27029h = cVar2;
        this.f27030i = b6Var;
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
        z5.e(this.f27022a, this.f27023b, this.f27024c, this.f27025d, b1.d.b(nVar, 433906483, new e(3, this.f27029h, this.f27030i)), this.f27026e, this.f27027f, this.f27028g, nVar, 24576);
        return Unit.f23355a;
    }
}
