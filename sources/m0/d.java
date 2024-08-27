package m0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class d extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ qu.f0 f26023a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f26024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f26025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, yt.a aVar) {
        super(3, aVar);
        this.f26025c = yVar;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        d dVar = new d(this.f26025c, (yt.a) obj3);
        dVar.f26023a = (qu.f0) obj;
        dVar.f26024b = floatValue;
        return dVar.invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        yk.g.H(this.f26023a, null, null, new c(this.f26025c, this.f26024b, null), 3);
        return Unit.f23355a;
    }
}
