package dg;

import g7.c3;

/* loaded from: classes.dex */
public final class f extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public g f14351a;

    /* renamed from: b, reason: collision with root package name */
    public c3 f14352b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f14354d;

    /* renamed from: e, reason: collision with root package name */
    public int f14355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, yt.a aVar) {
        super(aVar);
        this.f14354d = gVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f14353c = obj;
        this.f14355e |= Integer.MIN_VALUE;
        return this.f14354d.a(null, this);
    }
}
