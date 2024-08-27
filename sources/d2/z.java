package d2;

/* loaded from: classes.dex */
public final class z extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f13694b;

    /* renamed from: c, reason: collision with root package name */
    public int f13695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, yt.a aVar) {
        super(aVar);
        this.f13694b = a0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f13693a = obj;
        this.f13695c |= Integer.MIN_VALUE;
        this.f13694b.G(null, this);
        return zt.a.f42823a;
    }
}
