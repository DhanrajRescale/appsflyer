package m0;

/* loaded from: classes.dex */
public final class p extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public y f26606a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f26608c;

    /* renamed from: d, reason: collision with root package name */
    public int f26609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y yVar, yt.a aVar) {
        super(aVar);
        this.f26608c = yVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f26607b = obj;
        this.f26609d |= Integer.MIN_VALUE;
        return this.f26608c.a(null, null, null, this);
    }
}
