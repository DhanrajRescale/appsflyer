package d0;

/* loaded from: classes.dex */
public final class b extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public yt.a f13139a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f13141c;

    /* renamed from: d, reason: collision with root package name */
    public int f13142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, yt.a aVar) {
        super(aVar);
        this.f13141c = cVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f13140b = obj;
        this.f13142d |= Integer.MIN_VALUE;
        return this.f13141c.d(this);
    }
}
