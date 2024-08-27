package uu;

/* loaded from: classes2.dex */
public final class k extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public l f37442a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37443b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f37445d;

    /* renamed from: e, reason: collision with root package name */
    public int f37446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, yt.a aVar) {
        super(aVar);
        this.f37445d = lVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f37444c = obj;
        this.f37446e |= Integer.MIN_VALUE;
        return this.f37445d.a(null, this);
    }
}
