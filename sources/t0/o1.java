package t0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o1 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public p1 f35101a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f35102b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f35103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f35104d;

    /* renamed from: e, reason: collision with root package name */
    public int f35105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, yt.a aVar) {
        super(aVar);
        this.f35104d = p1Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f35103c = obj;
        this.f35105e |= Integer.MIN_VALUE;
        return this.f35104d.U(null, this);
    }
}
