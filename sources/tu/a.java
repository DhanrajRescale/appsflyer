package tu;

/* loaded from: classes2.dex */
public final class a extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public uu.w f36400a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f36402c;

    /* renamed from: d, reason: collision with root package name */
    public int f36403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, yt.a aVar) {
        super(aVar);
        this.f36402c = jVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36401b = obj;
        this.f36403d |= Integer.MIN_VALUE;
        return this.f36402c.c(null, this);
    }
}
