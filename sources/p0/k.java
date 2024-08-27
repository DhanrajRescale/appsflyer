package p0;

/* loaded from: classes.dex */
public final class k extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f30469b;

    /* renamed from: c, reason: collision with root package name */
    public int f30470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, yt.a aVar) {
        super(aVar);
        this.f30469b = lVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f30468a = obj;
        this.f30470c |= Integer.MIN_VALUE;
        return this.f30469b.O(0L, this);
    }
}
