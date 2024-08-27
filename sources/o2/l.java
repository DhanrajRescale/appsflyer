package o2;

/* loaded from: classes.dex */
public final class l extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public m f29499a;

    /* renamed from: b, reason: collision with root package name */
    public k f29500b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29501c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f29503e;

    /* renamed from: f, reason: collision with root package name */
    public int f29504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, yt.a aVar) {
        super(aVar);
        this.f29503e = mVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f29502d = obj;
        this.f29504f |= Integer.MIN_VALUE;
        return this.f29503e.b(null, null, null, this);
    }
}
