package y;

/* loaded from: classes.dex */
public final class h2 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j2 f40751a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f40753c;

    /* renamed from: d, reason: collision with root package name */
    public int f40754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(j2 j2Var, yt.a aVar) {
        super(aVar);
        this.f40753c = j2Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f40752b = obj;
        this.f40754d |= Integer.MIN_VALUE;
        return this.f40753c.c(s0.g.f34069a, this);
    }
}
