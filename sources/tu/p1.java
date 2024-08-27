package tu;

/* loaded from: classes2.dex */
public final class p1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f36530b;

    /* renamed from: c, reason: collision with root package name */
    public int f36531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, yt.a aVar) {
        super(aVar);
        this.f36530b = q1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36529a = obj;
        this.f36531c |= Integer.MIN_VALUE;
        this.f36530b.c(null, this);
        return zt.a.f42823a;
    }
}
