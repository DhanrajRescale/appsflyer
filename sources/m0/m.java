package m0;

/* loaded from: classes.dex */
public final class m extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public y f26463a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f26465c;

    /* renamed from: d, reason: collision with root package name */
    public int f26466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y yVar, yt.a aVar) {
        super(aVar);
        this.f26465c = yVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f26464b = obj;
        this.f26466d |= Integer.MIN_VALUE;
        return this.f26465c.b(null, null, this);
    }
}
