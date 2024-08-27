package z;

/* loaded from: classes.dex */
public final class f extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f41862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f41863b;

    /* renamed from: c, reason: collision with root package name */
    public int f41864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, yt.a aVar) {
        super(aVar);
        this.f41863b = hVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f41862a = obj;
        this.f41864c |= Integer.MIN_VALUE;
        return this.f41863b.e(null, s0.g.f34069a, null, this);
    }
}
