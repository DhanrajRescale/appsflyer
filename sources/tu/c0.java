package tu;

/* loaded from: classes2.dex */
public final class c0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public d0 f36414a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36415b;

    /* renamed from: c, reason: collision with root package name */
    public int f36416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f36417d;

    /* renamed from: e, reason: collision with root package name */
    public Object f36418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, yt.a aVar) {
        super(aVar);
        this.f36417d = d0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36415b = obj;
        this.f36416c |= Integer.MIN_VALUE;
        return this.f36417d.a(null, this);
    }
}
