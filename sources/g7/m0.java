package g7;

/* loaded from: classes.dex */
public final class m0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public n0 f16911a;

    /* renamed from: b, reason: collision with root package name */
    public iu.z f16912b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f16914d;

    /* renamed from: e, reason: collision with root package name */
    public int f16915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, yt.a aVar) {
        super(aVar);
        this.f16914d = n0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16913c = obj;
        this.f16915e |= Integer.MIN_VALUE;
        return this.f16914d.a(null, this);
    }
}
