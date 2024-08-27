package y;

/* loaded from: classes.dex */
public final class j1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public k1 f40792a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f40794c;

    /* renamed from: d, reason: collision with root package name */
    public int f40795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, yt.a aVar) {
        super(aVar);
        this.f40794c = k1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f40793b = obj;
        this.f40795d |= Integer.MIN_VALUE;
        return this.f40794c.c(this);
    }
}
