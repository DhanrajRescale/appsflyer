package g7;

/* loaded from: classes.dex */
public final class j extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16838a;

    /* renamed from: b, reason: collision with root package name */
    public int f16839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f16840c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16841d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16842e;

    /* renamed from: f, reason: collision with root package name */
    public tu.g f16843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, yt.a aVar) {
        super(aVar);
        this.f16840c = kVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16838a = obj;
        this.f16839b |= Integer.MIN_VALUE;
        return this.f16840c.a(null, this);
    }
}
