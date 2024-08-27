package g7;

/* loaded from: classes.dex */
public final class l4 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public n4 f16892a;

    /* renamed from: b, reason: collision with root package name */
    public qu.o1 f16893b;

    /* renamed from: c, reason: collision with root package name */
    public yu.d f16894c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n4 f16896e;

    /* renamed from: f, reason: collision with root package name */
    public int f16897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(n4 n4Var, yt.a aVar) {
        super(aVar);
        this.f16896e = n4Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16895d = obj;
        this.f16897f |= Integer.MIN_VALUE;
        return this.f16896e.a(null, this);
    }
}
