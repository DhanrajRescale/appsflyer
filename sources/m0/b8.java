package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b8 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g8 f25945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.k f25948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f25949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f25950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f25951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f25952h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25953i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f25954j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(g8 g8Var, boolean z10, boolean z11, a0.k kVar, s1 s1Var, n1.x0 x0Var, float f10, float f11, int i10, int i11) {
        super(2);
        this.f25945a = g8Var;
        this.f25946b = z10;
        this.f25947c = z11;
        this.f25948d = kVar;
        this.f25949e = s1Var;
        this.f25950f = x0Var;
        this.f25951g = f10;
        this.f25952h = f11;
        this.f25953i = i10;
        this.f25954j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f25945a.a(this.f25946b, this.f25947c, this.f25948d, this.f25949e, this.f25950f, this.f25951g, this.f25952h, (t0.n) obj, t0.t.H0(this.f25953i | 1), this.f25954j);
        return Unit.f23355a;
    }
}
