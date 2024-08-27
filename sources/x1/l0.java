package x1;

/* loaded from: classes.dex */
public final class l0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f39882b;

    /* renamed from: c, reason: collision with root package name */
    public int f39883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, yt.a aVar) {
        super(aVar);
        this.f39882b = m0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f39881a = obj;
        this.f39883c |= Integer.MIN_VALUE;
        return this.f39882b.i(0L, null, this);
    }
}
