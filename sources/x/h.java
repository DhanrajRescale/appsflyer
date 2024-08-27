package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f39568a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, yt.a aVar) {
        super(2, aVar);
        this.f39568a = kVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f39568a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a0.h, java.lang.Object] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        k kVar = this.f39568a;
        if (kVar.A == null) {
            ?? obj2 = new Object();
            a0.l lVar = kVar.f39602p;
            if (lVar != null) {
                yk.g.H(kVar.E0(), null, null, new b(lVar, obj2, null), 3);
            }
            kVar.A = obj2;
        }
        return Unit.f23355a;
    }
}
