package g7;

/* loaded from: classes.dex */
public final class e2 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f16731a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16732b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16733c;

    /* renamed from: d, reason: collision with root package name */
    public yu.d f16734d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f16735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t2 f16736f;

    /* renamed from: g, reason: collision with root package name */
    public int f16737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(t2 t2Var, yt.a aVar) {
        super(aVar);
        this.f16736f = t2Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16735e = obj;
        this.f16737g |= Integer.MIN_VALUE;
        return this.f16736f.f(this);
    }
}
