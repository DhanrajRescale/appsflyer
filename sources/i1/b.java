package i1;

/* loaded from: classes.dex */
public final class b extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public c f19307a;

    /* renamed from: b, reason: collision with root package name */
    public su.b f19308b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f19310d;

    /* renamed from: e, reason: collision with root package name */
    public int f19311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, yt.a aVar) {
        super(aVar);
        this.f19310d = cVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f19309c = obj;
        this.f19311e |= Integer.MIN_VALUE;
        return this.f19310d.a(this);
    }
}
