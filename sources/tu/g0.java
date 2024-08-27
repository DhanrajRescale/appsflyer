package tu;

/* loaded from: classes2.dex */
public final class g0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public h0 f36445a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36446b;

    /* renamed from: c, reason: collision with root package name */
    public int f36447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f36448d;

    /* renamed from: e, reason: collision with root package name */
    public Object f36449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, yt.a aVar) {
        super(aVar);
        this.f36448d = h0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36446b = obj;
        this.f36447c |= Integer.MIN_VALUE;
        return this.f36448d.a(null, this);
    }
}
