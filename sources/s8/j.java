package s8;

/* loaded from: classes.dex */
public final class j extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f34329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f34330b;

    /* renamed from: c, reason: collision with root package name */
    public int f34331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, yt.a aVar) {
        super(aVar);
        this.f34330b = lVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f34329a = obj;
        this.f34331c |= Integer.MIN_VALUE;
        return this.f34330b.b(null, this);
    }
}
