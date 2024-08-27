package g7;

/* loaded from: classes.dex */
public final class s1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public x1 f17042a;

    /* renamed from: b, reason: collision with root package name */
    public x3 f17043b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f17045d;

    /* renamed from: e, reason: collision with root package name */
    public int f17046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(x1 x1Var, yt.a aVar) {
        super(aVar);
        this.f17045d = x1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f17044c = obj;
        this.f17046e |= Integer.MIN_VALUE;
        return x1.a(this.f17045d, null, this);
    }
}
