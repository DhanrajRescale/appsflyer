package g7;

/* loaded from: classes.dex */
public final class m4 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public n4 f16924a;

    /* renamed from: b, reason: collision with root package name */
    public qu.o1 f16925b;

    /* renamed from: c, reason: collision with root package name */
    public yu.a f16926c;

    /* renamed from: d, reason: collision with root package name */
    public int f16927d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f16928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n4 f16929f;

    /* renamed from: g, reason: collision with root package name */
    public int f16930g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(n4 n4Var, yt.a aVar) {
        super(aVar);
        this.f16929f = n4Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16928e = obj;
        this.f16930g |= Integer.MIN_VALUE;
        return this.f16929f.b(0, null, this);
    }
}
