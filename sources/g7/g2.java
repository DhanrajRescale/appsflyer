package g7;

/* loaded from: classes.dex */
public final class g2 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f16792b;

    /* renamed from: c, reason: collision with root package name */
    public int f16793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(t1 t1Var, yt.a aVar) {
        super(aVar);
        this.f16792b = t1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16791a = obj;
        this.f16793c |= Integer.MIN_VALUE;
        return this.f16792b.b(null, this);
    }
}
