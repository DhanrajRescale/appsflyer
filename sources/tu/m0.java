package tu;

/* loaded from: classes2.dex */
public final class m0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36500a;

    /* renamed from: b, reason: collision with root package name */
    public int f36501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g7.w f36502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(g7.w wVar, yt.a aVar) {
        super(aVar);
        this.f36502c = wVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f36500a = obj;
        this.f36501b |= Integer.MIN_VALUE;
        return this.f36502c.a(null, this);
    }
}
