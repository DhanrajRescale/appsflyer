package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p6 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f26642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f26644c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f26647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f26648g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26649h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26650i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(g1.o oVar, boolean z10, n1.x0 x0Var, long j10, long j11, long j12, float f10, int i10, int i11) {
        super(2);
        this.f26642a = oVar;
        this.f26643b = z10;
        this.f26644c = x0Var;
        this.f26645d = j10;
        this.f26646e = j11;
        this.f26647f = j12;
        this.f26648g = f10;
        this.f26649h = i10;
        this.f26650i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        t6.a(this.f26642a, this.f26643b, this.f26644c, this.f26645d, this.f26646e, this.f26647f, this.f26648g, (t0.n) obj, t0.t.H0(this.f26649h | 1), this.f26650i);
        return Unit.f23355a;
    }
}
