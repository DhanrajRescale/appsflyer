package y;

/* loaded from: classes.dex */
public final class y1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public z1 f40999a;

    /* renamed from: b, reason: collision with root package name */
    public long f41000b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f41001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1 f41002d;

    /* renamed from: e, reason: collision with root package name */
    public int f41003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, yt.a aVar) {
        super(aVar);
        this.f41002d = z1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f41001c = obj;
        this.f41003e |= Integer.MIN_VALUE;
        return this.f41002d.f(0L, 0L, this);
    }
}
