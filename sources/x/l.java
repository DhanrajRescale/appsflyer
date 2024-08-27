package x;

/* loaded from: classes.dex */
public final class l extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public p f39620a;

    /* renamed from: b, reason: collision with root package name */
    public long f39621b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39622c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f39623d;

    /* renamed from: e, reason: collision with root package name */
    public int f39624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, yt.a aVar) {
        super(aVar);
        this.f39623d = pVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f39622c = obj;
        this.f39624e |= Integer.MIN_VALUE;
        return this.f39623d.d(0L, null, this);
    }
}
