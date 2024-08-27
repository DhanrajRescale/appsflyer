package d2;

/* loaded from: classes.dex */
public final class l0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public r0 f13492a;

    /* renamed from: b, reason: collision with root package name */
    public t.u f13493b;

    /* renamed from: c, reason: collision with root package name */
    public su.b f13494c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f13496e;

    /* renamed from: f, reason: collision with root package name */
    public int f13497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r0 r0Var, yt.a aVar) {
        super(aVar);
        this.f13496e = r0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f13495d = obj;
        this.f13497f |= Integer.MIN_VALUE;
        return this.f13496e.l(this);
    }
}
