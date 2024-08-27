package g7;

/* loaded from: classes.dex */
public final class d0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16703a;

    /* renamed from: b, reason: collision with root package name */
    public int f16704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f16705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(w wVar, yt.a aVar) {
        super(aVar);
        this.f16705c = wVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16703a = obj;
        this.f16704b |= Integer.MIN_VALUE;
        return this.f16705c.a(null, this);
    }
}
