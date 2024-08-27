package y;

/* loaded from: classes.dex */
public final class e2 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public iu.y f40673a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f40675c;

    /* renamed from: d, reason: collision with root package name */
    public int f40676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(j2 j2Var, yt.a aVar) {
        super(aVar);
        this.f40675c = j2Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f40674b = obj;
        this.f40676d |= Integer.MIN_VALUE;
        return this.f40675c.b(0L, this);
    }
}
