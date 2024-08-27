package ue;

/* loaded from: classes.dex */
public final class i extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j f37092a;

    /* renamed from: b, reason: collision with root package name */
    public j f37093b;

    /* renamed from: c, reason: collision with root package name */
    public int f37094c;

    /* renamed from: d, reason: collision with root package name */
    public int f37095d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f37096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f37097f;

    /* renamed from: g, reason: collision with root package name */
    public int f37098g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, yt.a aVar) {
        super(aVar);
        this.f37097f = jVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f37096e = obj;
        this.f37098g |= Integer.MIN_VALUE;
        return this.f37097f.c(null, this);
    }
}
