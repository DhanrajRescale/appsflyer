package d2;

/* loaded from: classes.dex */
public final class a1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f13348b;

    /* renamed from: c, reason: collision with root package name */
    public int f13349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, yt.a aVar) {
        super(aVar);
        this.f13348b = c1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f13347a = obj;
        this.f13349c |= Integer.MIN_VALUE;
        this.f13348b.a(null, this);
        return zt.a.f42823a;
    }
}
