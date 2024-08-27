package t8;

/* loaded from: classes.dex */
public final class k extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public l f35615a;

    /* renamed from: b, reason: collision with root package name */
    public j f35616b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f35617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f35618d;

    /* renamed from: e, reason: collision with root package name */
    public int f35619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, yt.a aVar) {
        super(aVar);
        this.f35618d = lVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f35617c = obj;
        this.f35619e |= Integer.MIN_VALUE;
        return this.f35618d.b(null, this);
    }
}
