package tu;

/* loaded from: classes2.dex */
public final class d1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.f f36426b;

    /* renamed from: c, reason: collision with root package name */
    public int f36427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(a0.f fVar, yt.a aVar) {
        super(aVar);
        this.f36426b = fVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36425a = obj;
        this.f36427c |= Integer.MIN_VALUE;
        return this.f36426b.b(0, this);
    }
}
