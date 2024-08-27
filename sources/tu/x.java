package tu;

/* loaded from: classes2.dex */
public final class x extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36581a;

    /* renamed from: b, reason: collision with root package name */
    public int f36582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f36583c;

    /* renamed from: d, reason: collision with root package name */
    public z f36584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u uVar, yt.a aVar) {
        super(aVar);
        this.f36583c = uVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36581a = obj;
        this.f36582b |= Integer.MIN_VALUE;
        return this.f36583c.c(null, this);
    }
}
