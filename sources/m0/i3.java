package m0;

/* loaded from: classes.dex */
public final class i3 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j3 f26280a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3 f26282c;

    /* renamed from: d, reason: collision with root package name */
    public int f26283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(j3 j3Var, yt.a aVar) {
        super(aVar);
        this.f26282c = j3Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f26281b = obj;
        this.f26283d |= Integer.MIN_VALUE;
        return this.f26282c.b(this);
    }
}
