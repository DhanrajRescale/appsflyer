package w1;

/* loaded from: classes.dex */
public final class e extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public g f38760a;

    /* renamed from: b, reason: collision with root package name */
    public long f38761b;

    /* renamed from: c, reason: collision with root package name */
    public long f38762c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f38764e;

    /* renamed from: f, reason: collision with root package name */
    public int f38765f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, yt.a aVar) {
        super(aVar);
        this.f38764e = gVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f38763d = obj;
        this.f38765f |= Integer.MIN_VALUE;
        return this.f38764e.f(0L, 0L, this);
    }
}
