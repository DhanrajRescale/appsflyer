package m0;

/* loaded from: classes.dex */
public final class h3 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j3 f26233a;

    /* renamed from: b, reason: collision with root package name */
    public a0.j f26234b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26235c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j3 f26236d;

    /* renamed from: e, reason: collision with root package name */
    public int f26237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(j3 j3Var, yt.a aVar) {
        super(aVar);
        this.f26236d = j3Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f26235c = obj;
        this.f26237e |= Integer.MIN_VALUE;
        return this.f26236d.a(null, this);
    }
}
