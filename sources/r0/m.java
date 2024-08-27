package r0;

/* loaded from: classes.dex */
public final class m extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public t f32569a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f32571c;

    /* renamed from: d, reason: collision with root package name */
    public int f32572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, yt.a aVar) {
        super(aVar);
        this.f32571c = tVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f32570b = obj;
        this.f32572d |= Integer.MIN_VALUE;
        return this.f32571c.a(null, null, null, this);
    }
}
