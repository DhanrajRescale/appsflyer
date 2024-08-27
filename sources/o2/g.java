package o2;

/* loaded from: classes.dex */
public final class g extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public q f29482a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f29484c;

    /* renamed from: d, reason: collision with root package name */
    public int f29485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, yt.a aVar) {
        super(aVar);
        this.f29484c = iVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f29483b = obj;
        this.f29485d |= Integer.MIN_VALUE;
        return this.f29484c.d(null, this);
    }
}
