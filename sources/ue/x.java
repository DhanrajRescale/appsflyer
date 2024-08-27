package ue;

/* loaded from: classes.dex */
public final class x extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public y f37144a;

    /* renamed from: b, reason: collision with root package name */
    public y f37145b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f37147d;

    /* renamed from: e, reason: collision with root package name */
    public int f37148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, yt.a aVar) {
        super(aVar);
        this.f37147d = yVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f37146c = obj;
        this.f37148e |= Integer.MIN_VALUE;
        return this.f37147d.c(null, this);
    }
}
