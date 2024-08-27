package g7;

/* loaded from: classes.dex */
public final class d2 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public t2 f16708a;

    /* renamed from: b, reason: collision with root package name */
    public u2 f16709b;

    /* renamed from: c, reason: collision with root package name */
    public yu.d f16710c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2 f16712e;

    /* renamed from: f, reason: collision with root package name */
    public int f16713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(t2 t2Var, yt.a aVar) {
        super(aVar);
        this.f16712e = t2Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16711d = obj;
        this.f16713f |= Integer.MIN_VALUE;
        return this.f16712e.e(this);
    }
}
