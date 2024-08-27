package r0;

/* loaded from: classes.dex */
public final class g extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public h f32406a;

    /* renamed from: b, reason: collision with root package name */
    public Object f32407b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32408c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f32409d;

    /* renamed from: e, reason: collision with root package name */
    public int f32410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, yt.a aVar) {
        super(aVar);
        this.f32409d = hVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f32408c = obj;
        this.f32410e |= Integer.MIN_VALUE;
        return this.f32409d.a(null, this);
    }
}
