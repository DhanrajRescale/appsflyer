package sc;

import g7.w;

/* loaded from: classes.dex */
public final class g extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f34558a;

    /* renamed from: b, reason: collision with root package name */
    public int f34559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f34560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w wVar, yt.a aVar) {
        super(aVar);
        this.f34560c = wVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f34558a = obj;
        this.f34559b |= Integer.MIN_VALUE;
        return this.f34560c.a(null, this);
    }
}
