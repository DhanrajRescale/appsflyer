package tu;

/* loaded from: classes2.dex */
public final class o0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.f f36523b;

    /* renamed from: c, reason: collision with root package name */
    public int f36524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(a0.f fVar, yt.a aVar) {
        super(aVar);
        this.f36523b = fVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36522a = obj;
        this.f36524c |= Integer.MIN_VALUE;
        return this.f36523b.a(null, this);
    }
}
