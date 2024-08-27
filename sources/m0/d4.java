package m0;

/* loaded from: classes.dex */
public final class d4 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public long f26034a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f4 f26036c;

    /* renamed from: d, reason: collision with root package name */
    public int f26037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, yt.a aVar) {
        super(aVar);
        this.f26036c = f4Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f26035b = obj;
        this.f26037d |= Integer.MIN_VALUE;
        return this.f26036c.f(0L, 0L, this);
    }
}
