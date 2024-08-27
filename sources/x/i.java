package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f39584a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, yt.a aVar) {
        super(2, aVar);
        this.f39584a = kVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f39584a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        k kVar = this.f39584a;
        a0.h hVar = kVar.A;
        if (hVar != null) {
            a0.i iVar = new a0.i(hVar);
            a0.l lVar = kVar.f39602p;
            if (lVar != null) {
                yk.g.H(kVar.E0(), null, null, new c(lVar, iVar, null), 3);
            }
            kVar.A = null;
        }
        return Unit.f23355a;
    }
}
