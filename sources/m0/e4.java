package m0;

/* loaded from: classes.dex */
public final class e4 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public long f26098a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f4 f26100c;

    /* renamed from: d, reason: collision with root package name */
    public int f26101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(f4 f4Var, yt.a aVar) {
        super(aVar);
        this.f26100c = f4Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f26099b = obj;
        this.f26101d |= Integer.MIN_VALUE;
        return this.f26100c.O(0L, this);
    }
}
