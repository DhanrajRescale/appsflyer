package m0;

/* loaded from: classes.dex */
public final class i extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j f26262a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26263b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26264c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f26265d;

    /* renamed from: e, reason: collision with root package name */
    public int f26266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, yt.a aVar) {
        super(aVar);
        this.f26265d = jVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f26264c = obj;
        this.f26266e |= Integer.MIN_VALUE;
        return this.f26265d.a(null, this);
    }
}
