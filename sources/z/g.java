package z;

/* loaded from: classes.dex */
public final class g extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f41865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f41866b;

    /* renamed from: c, reason: collision with root package name */
    public int f41867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, yt.a aVar) {
        super(aVar);
        this.f41866b = hVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f41865a = obj;
        this.f41867c |= Integer.MIN_VALUE;
        return h.b(this.f41866b, null, s0.g.f34069a, s0.g.f34069a, null, this);
    }
}
