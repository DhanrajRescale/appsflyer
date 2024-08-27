package tu;

/* loaded from: classes2.dex */
public final class n1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public o1 f36512a;

    /* renamed from: b, reason: collision with root package name */
    public uu.w f36513b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f36515d;

    /* renamed from: e, reason: collision with root package name */
    public int f36516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, yt.a aVar) {
        super(aVar);
        this.f36515d = o1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36514c = obj;
        this.f36516e |= Integer.MIN_VALUE;
        return this.f36515d.b(this);
    }
}
