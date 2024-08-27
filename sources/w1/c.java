package w1;

/* loaded from: classes.dex */
public final class c extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f38755b;

    /* renamed from: c, reason: collision with root package name */
    public int f38756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, yt.a aVar) {
        super(aVar);
        this.f38755b = dVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f38754a = obj;
        this.f38756c |= Integer.MIN_VALUE;
        return this.f38755b.b(0L, this);
    }
}
