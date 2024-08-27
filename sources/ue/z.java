package ue;

/* loaded from: classes.dex */
public final class z extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public a0 f37153a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f37154b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f37156d;

    /* renamed from: e, reason: collision with root package name */
    public int f37157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, yt.a aVar) {
        super(aVar);
        this.f37156d = a0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f37155c = obj;
        this.f37157e |= Integer.MIN_VALUE;
        return this.f37156d.c(null, this);
    }
}
