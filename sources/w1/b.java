package w1;

/* loaded from: classes.dex */
public final class b extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f38752b;

    /* renamed from: c, reason: collision with root package name */
    public int f38753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, yt.a aVar) {
        super(aVar);
        this.f38752b = dVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f38751a = obj;
        this.f38753c |= Integer.MIN_VALUE;
        return this.f38752b.a(0L, 0L, this);
    }
}
