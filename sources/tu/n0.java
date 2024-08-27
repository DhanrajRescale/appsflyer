package tu;

/* loaded from: classes2.dex */
public final class n0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36507a;

    /* renamed from: b, reason: collision with root package name */
    public int f36508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.f f36509c;

    /* renamed from: d, reason: collision with root package name */
    public Object f36510d;

    /* renamed from: e, reason: collision with root package name */
    public g f36511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(a0.f fVar, yt.a aVar) {
        super(aVar);
        this.f36509c = fVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36507a = obj;
        this.f36508b |= Integer.MIN_VALUE;
        return this.f36509c.a(null, this);
    }
}
