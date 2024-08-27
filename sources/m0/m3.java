package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m3 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f26479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f26480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.l f26481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f26482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f26484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1 f26485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f26486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26488j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(Function0 function0, g1.o oVar, a0.l lVar, n1.x0 x0Var, long j10, long j11, p1 p1Var, Function2 function2, int i10, int i11) {
        super(2);
        this.f26479a = function0;
        this.f26480b = oVar;
        this.f26481c = lVar;
        this.f26482d = x0Var;
        this.f26483e = j10;
        this.f26484f = j11;
        this.f26485g = p1Var;
        this.f26486h = function2;
        this.f26487i = i10;
        this.f26488j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        n3.b(this.f26479a, this.f26480b, this.f26481c, this.f26482d, this.f26483e, this.f26484f, this.f26485g, this.f26486h, (t0.n) obj, t0.t.H0(this.f26487i | 1), this.f26488j);
        return Unit.f23355a;
    }
}
