package w1;

/* loaded from: classes.dex */
public final class f extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public g f38766a;

    /* renamed from: b, reason: collision with root package name */
    public long f38767b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f38769d;

    /* renamed from: e, reason: collision with root package name */
    public int f38770e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, yt.a aVar) {
        super(aVar);
        this.f38769d = gVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f38768c = obj;
        this.f38770e |= Integer.MIN_VALUE;
        return this.f38769d.O(0L, this);
    }
}
