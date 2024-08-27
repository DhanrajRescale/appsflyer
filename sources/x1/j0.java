package x1;

import qu.h2;

/* loaded from: classes.dex */
public final class j0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public h2 f39866a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f39868c;

    /* renamed from: d, reason: collision with root package name */
    public int f39869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, yt.a aVar) {
        super(aVar);
        this.f39868c = m0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f39867b = obj;
        this.f39869d |= Integer.MIN_VALUE;
        return this.f39868c.g(0L, null, this);
    }
}
