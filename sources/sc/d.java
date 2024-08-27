package sc;

/* loaded from: classes.dex */
public final class d extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public e f34551a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f34553c;

    /* renamed from: d, reason: collision with root package name */
    public int f34554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, yt.a aVar) {
        super(aVar);
        this.f34553c = eVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f34552b = obj;
        this.f34554d |= Integer.MIN_VALUE;
        return this.f34553c.a(null, this);
    }
}
