package g7;

/* loaded from: classes.dex */
public final class o4 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public q4 f16992a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q4 f16994c;

    /* renamed from: d, reason: collision with root package name */
    public int f16995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(q4 q4Var, yt.a aVar) {
        super(aVar);
        this.f16994c = q4Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16993b = obj;
        this.f16995d |= Integer.MIN_VALUE;
        return this.f16994c.a(0, null, this);
    }
}
