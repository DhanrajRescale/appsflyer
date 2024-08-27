package g7;

/* loaded from: classes.dex */
public final class b2 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16667a;

    /* renamed from: b, reason: collision with root package name */
    public int f16668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f16669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(v1 v1Var, yt.a aVar) {
        super(aVar);
        this.f16669c = v1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16667a = obj;
        this.f16668b |= Integer.MIN_VALUE;
        return this.f16669c.a(null, this);
    }
}
