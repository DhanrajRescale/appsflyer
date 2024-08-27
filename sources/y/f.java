package y;

/* loaded from: classes.dex */
public final class f extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j f40684a;

    /* renamed from: b, reason: collision with root package name */
    public qu.f0 f40685b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f40686c;

    /* renamed from: d, reason: collision with root package name */
    public a0.b f40687d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f40688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f40689f;

    /* renamed from: g, reason: collision with root package name */
    public int f40690g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, yt.a aVar) {
        super(aVar);
        this.f40689f = jVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f40688e = obj;
        this.f40690g |= Integer.MIN_VALUE;
        return j.U0(this.f40689f, null, null, this);
    }
}
