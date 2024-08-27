package o8;

/* loaded from: classes.dex */
public final class s extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29835a;

    /* renamed from: b, reason: collision with root package name */
    public int f29836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g7.w f29837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g7.w wVar, yt.a aVar) {
        super(aVar);
        this.f29837c = wVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f29835a = obj;
        this.f29836b |= Integer.MIN_VALUE;
        return this.f29837c.a(null, this);
    }
}
