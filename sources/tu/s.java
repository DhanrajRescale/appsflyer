package tu;

/* loaded from: classes2.dex */
public final class s extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f36545b;

    /* renamed from: c, reason: collision with root package name */
    public int f36546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, yt.a aVar) {
        super(aVar);
        this.f36545b = tVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36544a = obj;
        this.f36546c |= Integer.MIN_VALUE;
        return this.f36545b.a(null, this);
    }
}
