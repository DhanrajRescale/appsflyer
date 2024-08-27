package g7;

/* loaded from: classes.dex */
public final class v extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17093a;

    /* renamed from: b, reason: collision with root package name */
    public int f17094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f17095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, yt.a aVar) {
        super(aVar);
        this.f17095c = wVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f17093a = obj;
        this.f17094b |= Integer.MIN_VALUE;
        return this.f17095c.a(null, this);
    }
}
