package uc;

import au.c;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public int f37059a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f37061c;

    /* renamed from: d, reason: collision with root package name */
    public int f37062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, yt.a aVar) {
        super(aVar);
        this.f37061c = bVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f37060b = obj;
        this.f37062d |= Integer.MIN_VALUE;
        return this.f37061c.c(null, this);
    }
}
