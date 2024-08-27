package dg;

/* loaded from: classes.dex */
public final class m extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public int f14366a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f14368c;

    /* renamed from: d, reason: collision with root package name */
    public int f14369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, yt.a aVar) {
        super(aVar);
        this.f14368c = nVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f14367b = obj;
        this.f14369d |= Integer.MIN_VALUE;
        return this.f14368c.c(null, this);
    }
}
