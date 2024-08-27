package g7;

/* loaded from: classes.dex */
public final class j0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public k0 f16844a;

    /* renamed from: b, reason: collision with root package name */
    public iu.z f16845b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f16847d;

    /* renamed from: e, reason: collision with root package name */
    public int f16848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, yt.a aVar) {
        super(aVar);
        this.f16847d = k0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16846c = obj;
        this.f16848e |= Integer.MIN_VALUE;
        return this.f16847d.a(null, this);
    }
}
