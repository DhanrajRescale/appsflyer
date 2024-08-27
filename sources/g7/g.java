package g7;

/* loaded from: classes.dex */
public final class g extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public m f16773a;

    /* renamed from: b, reason: collision with root package name */
    public k3 f16774b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f16776d;

    /* renamed from: e, reason: collision with root package name */
    public int f16777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, yt.a aVar) {
        super(aVar);
        this.f16776d = iVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16775c = obj;
        this.f16777e |= Integer.MIN_VALUE;
        return this.f16776d.c(null, this);
    }
}
