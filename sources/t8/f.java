package t8;

/* loaded from: classes.dex */
public final class f extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public i f35586a;

    /* renamed from: b, reason: collision with root package name */
    public l f35587b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f35588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f35589d;

    /* renamed from: e, reason: collision with root package name */
    public int f35590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, yt.a aVar) {
        super(aVar);
        this.f35589d = iVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f35588c = obj;
        this.f35590e |= Integer.MIN_VALUE;
        return this.f35589d.d(null, this);
    }
}
