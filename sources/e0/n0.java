package e0;

/* loaded from: classes.dex */
public final class n0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f14763b;

    /* renamed from: c, reason: collision with root package name */
    public int f14764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, yt.a aVar) {
        super(aVar);
        this.f14763b = o0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f14762a = obj;
        this.f14764c |= Integer.MIN_VALUE;
        return this.f14763b.a(null, s0.g.f34069a, this);
    }
}
