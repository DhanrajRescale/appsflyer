package g7;

/* loaded from: classes.dex */
public final class u1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17081a;

    /* renamed from: b, reason: collision with root package name */
    public int f17082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f17083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, yt.a aVar) {
        super(aVar);
        this.f17083c = v1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f17081a = obj;
        this.f17082b |= Integer.MIN_VALUE;
        return this.f17083c.a(null, this);
    }
}
