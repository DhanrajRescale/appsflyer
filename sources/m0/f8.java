package m0;

/* loaded from: classes.dex */
public final class f8 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.k f26184c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f26185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f26186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(boolean z10, boolean z11, a0.l lVar, s1 s1Var, float f10, float f11) {
        super(3);
        this.f26182a = z10;
        this.f26183b = z11;
        this.f26184c = lVar;
        this.f26185d = s1Var;
        this.f26186e = f10;
        this.f26187f = f11;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(1398930845);
        t0.g1 m10 = pp.b.m(this.f26182a, this.f26183b, this.f26184c, this.f26185d, this.f26186e, this.f26187f, rVar, 0);
        g1.l lVar = g1.l.f16404b;
        x.d0 d0Var = (x.d0) m10.getValue();
        float f10 = p8.f26655a;
        g1.o f11 = androidx.compose.ui.draw.a.f(lVar, new s4(d0Var.f39525a, d0Var, 2));
        rVar.s(false);
        return f11;
    }
}
