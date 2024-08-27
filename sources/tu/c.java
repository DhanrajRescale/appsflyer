package tu;

/* loaded from: classes2.dex */
public final class c extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v.j f36412b;

    /* renamed from: c, reason: collision with root package name */
    public int f36413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v.j jVar, yt.a aVar) {
        super(aVar);
        this.f36412b = jVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36411a = obj;
        this.f36413c |= Integer.MIN_VALUE;
        return this.f36412b.a(null, this);
    }
}
