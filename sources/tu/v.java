package tu;

/* loaded from: classes2.dex */
public final class v extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public w f36558a;

    /* renamed from: b, reason: collision with root package name */
    public Object f36559b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f36561d;

    /* renamed from: e, reason: collision with root package name */
    public int f36562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, yt.a aVar) {
        super(aVar);
        this.f36561d = wVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36560c = obj;
        this.f36562e |= Integer.MIN_VALUE;
        return this.f36561d.a(null, this);
    }
}
