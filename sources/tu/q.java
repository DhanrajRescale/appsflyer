package tu;

/* loaded from: classes2.dex */
public final class q extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36532a;

    /* renamed from: b, reason: collision with root package name */
    public int f36533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f36534c;

    /* renamed from: d, reason: collision with root package name */
    public r f36535d;

    /* renamed from: e, reason: collision with root package name */
    public g f36536e;

    /* renamed from: f, reason: collision with root package name */
    public uu.w f36537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, yt.a aVar) {
        super(aVar);
        this.f36534c = rVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36532a = obj;
        this.f36533b |= Integer.MIN_VALUE;
        return this.f36534c.c(null, this);
    }
}
