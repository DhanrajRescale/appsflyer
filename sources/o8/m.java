package o8;

/* loaded from: classes.dex */
public final class m extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29809a;

    /* renamed from: b, reason: collision with root package name */
    public int f29810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g7.w f29811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g7.w wVar, yt.a aVar) {
        super(aVar);
        this.f29811c = wVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f29809a = obj;
        this.f29810b |= Integer.MIN_VALUE;
        return this.f29811c.a(null, this);
    }
}
