package ue;

/* loaded from: classes.dex */
public final class k extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public int f37102a;

    /* renamed from: b, reason: collision with root package name */
    public int f37103b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f37105d;

    /* renamed from: e, reason: collision with root package name */
    public int f37106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, yt.a aVar) {
        super(aVar);
        this.f37105d = lVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f37104c = obj;
        this.f37106e |= Integer.MIN_VALUE;
        return this.f37105d.c(null, this);
    }
}
