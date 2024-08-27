package p8;

/* loaded from: classes.dex */
public final class d extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f30729a;

    /* renamed from: b, reason: collision with root package name */
    public yu.f f30730b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f30732d;

    /* renamed from: e, reason: collision with root package name */
    public int f30733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, yt.a aVar) {
        super(aVar);
        this.f30732d = eVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f30731c = obj;
        this.f30733e |= Integer.MIN_VALUE;
        return this.f30732d.a(this);
    }
}
