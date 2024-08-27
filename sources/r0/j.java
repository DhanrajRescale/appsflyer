package r0;

/* loaded from: classes.dex */
public final class j extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public t f32461a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f32463c;

    /* renamed from: d, reason: collision with root package name */
    public int f32464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t tVar, yt.a aVar) {
        super(aVar);
        this.f32463c = tVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f32462b = obj;
        this.f32464d |= Integer.MIN_VALUE;
        return this.f32463c.b(null, null, this);
    }
}
