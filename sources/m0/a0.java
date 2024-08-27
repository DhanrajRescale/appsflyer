package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f25848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f25849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.o2 f25851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z2.u f25852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f25853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25854h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25855i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z10, Function0 function0, g1.o oVar, long j10, x.o2 o2Var, z2.u uVar, hu.c cVar, int i10, int i11) {
        super(2);
        this.f25847a = z10;
        this.f25848b = function0;
        this.f25849c = oVar;
        this.f25850d = j10;
        this.f25851e = o2Var;
        this.f25852f = uVar;
        this.f25853g = cVar;
        this.f25854h = i10;
        this.f25855i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pp.b.d(this.f25847a, this.f25848b, this.f25849c, this.f25850d, this.f25851e, this.f25852f, this.f25853g, (t0.n) obj, t0.t.H0(this.f25854h | 1), this.f25855i);
        return Unit.f23355a;
    }
}
