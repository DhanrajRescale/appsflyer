package ue;

/* loaded from: classes.dex */
public final class m extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public int f37108a;

    /* renamed from: b, reason: collision with root package name */
    public int f37109b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f37111d;

    /* renamed from: e, reason: collision with root package name */
    public int f37112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, yt.a aVar) {
        super(aVar);
        this.f37111d = nVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f37110c = obj;
        this.f37112e |= Integer.MIN_VALUE;
        return this.f37111d.c(null, this);
    }
}
