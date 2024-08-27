package tu;

/* loaded from: classes2.dex */
public final class o extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36517a;

    /* renamed from: b, reason: collision with root package name */
    public int f36518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f36519c;

    /* renamed from: d, reason: collision with root package name */
    public Object f36520d;

    /* renamed from: e, reason: collision with root package name */
    public g f36521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, yt.a aVar) {
        super(aVar);
        this.f36519c = pVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36517a = obj;
        this.f36518b |= Integer.MIN_VALUE;
        return this.f36519c.c(null, this);
    }
}
