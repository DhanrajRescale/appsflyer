package y;

/* loaded from: classes.dex */
public final class i1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public k1 f40770a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f40772c;

    /* renamed from: d, reason: collision with root package name */
    public int f40773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, yt.a aVar) {
        super(aVar);
        this.f40772c = k1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f40771b = obj;
        this.f40773d |= Integer.MIN_VALUE;
        return this.f40772c.a(this);
    }
}
