package g7;

/* loaded from: classes.dex */
public final class f0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public h0 f16741a;

    /* renamed from: b, reason: collision with root package name */
    public yu.d f16742b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f16744d;

    /* renamed from: e, reason: collision with root package name */
    public int f16745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, yt.a aVar) {
        super(aVar);
        this.f16744d = h0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16743c = obj;
        this.f16745e |= Integer.MIN_VALUE;
        return this.f16744d.a(this);
    }
}
