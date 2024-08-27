package q0;

/* loaded from: classes.dex */
public final class j extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public q f31508a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f31510c;

    /* renamed from: d, reason: collision with root package name */
    public int f31511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, yt.a aVar) {
        super(aVar);
        this.f31510c = qVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f31509b = obj;
        this.f31511d |= Integer.MIN_VALUE;
        return this.f31510c.a(this);
    }
}
