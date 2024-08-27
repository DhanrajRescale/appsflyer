package s8;

/* loaded from: classes.dex */
public final class k extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public l f34332a;

    /* renamed from: b, reason: collision with root package name */
    public q8.k f34333b;

    /* renamed from: c, reason: collision with root package name */
    public Object f34334c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f34335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f34336e;

    /* renamed from: f, reason: collision with root package name */
    public int f34337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, yt.a aVar) {
        super(aVar);
        this.f34336e = lVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f34335d = obj;
        this.f34337f |= Integer.MIN_VALUE;
        return this.f34336e.a(this);
    }
}
