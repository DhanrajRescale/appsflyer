package g7;

import kotlin.collections.IndexedValue;

/* loaded from: classes.dex */
public final class g0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public h0 f16778a;

    /* renamed from: b, reason: collision with root package name */
    public IndexedValue f16779b;

    /* renamed from: c, reason: collision with root package name */
    public yu.d f16780c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f16782e;

    /* renamed from: f, reason: collision with root package name */
    public int f16783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, yt.a aVar) {
        super(aVar);
        this.f16782e = h0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f16781d = obj;
        this.f16783f |= Integer.MIN_VALUE;
        return this.f16782e.b(null, this);
    }
}
