package y;

/* loaded from: classes.dex */
public final class e extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j f40661a;

    /* renamed from: b, reason: collision with root package name */
    public qu.f0 f40662b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40663c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f40664d;

    /* renamed from: e, reason: collision with root package name */
    public int f40665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, yt.a aVar) {
        super(aVar);
        this.f40664d = jVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f40663c = obj;
        this.f40665e |= Integer.MIN_VALUE;
        return j.T0(this.f40664d, this, null);
    }
}
