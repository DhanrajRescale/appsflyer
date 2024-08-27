package tu;

/* loaded from: classes2.dex */
public final class y extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public z f36586a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36587b;

    /* renamed from: c, reason: collision with root package name */
    public int f36588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f36589d;

    /* renamed from: e, reason: collision with root package name */
    public Object f36590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, yt.a aVar) {
        super(aVar);
        this.f36589d = zVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36587b = obj;
        this.f36588c |= Integer.MIN_VALUE;
        return this.f36589d.a(null, this);
    }
}
