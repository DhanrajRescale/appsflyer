package o2;

/* loaded from: classes.dex */
public final class a extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public b f29448a;

    /* renamed from: b, reason: collision with root package name */
    public q f29449b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f29451d;

    /* renamed from: e, reason: collision with root package name */
    public int f29452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, yt.a aVar) {
        super(aVar);
        this.f29451d = bVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f29450c = obj;
        this.f29452e |= Integer.MIN_VALUE;
        return this.f29451d.a(null, this);
    }
}
