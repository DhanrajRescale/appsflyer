package y;

/* loaded from: classes.dex */
public final class g extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j f40711a;

    /* renamed from: b, reason: collision with root package name */
    public qu.f0 f40712b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f40713c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f40714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f40715e;

    /* renamed from: f, reason: collision with root package name */
    public int f40716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, yt.a aVar) {
        super(aVar);
        this.f40715e = jVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f40714d = obj;
        this.f40716f |= Integer.MIN_VALUE;
        return j.V0(this.f40715e, null, null, this);
    }
}
