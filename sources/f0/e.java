package f0;

/* loaded from: classes.dex */
public final class e extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public m1.d f15877a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f15878b;

    /* renamed from: c, reason: collision with root package name */
    public int f15879c;

    /* renamed from: d, reason: collision with root package name */
    public int f15880d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f15882f;

    /* renamed from: g, reason: collision with root package name */
    public int f15883g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, yt.a aVar) {
        super(aVar);
        this.f15882f = fVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f15881e = obj;
        this.f15883g |= Integer.MIN_VALUE;
        return this.f15882f.a(null, this);
    }
}
