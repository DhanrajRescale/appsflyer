package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f34942a;

    /* JADX WARN: Type inference failed for: r0v0, types: [au.i, yt.a, t0.a2] */
    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        ?? iVar = new au.i(2, aVar);
        iVar.f34942a = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a2) create((z1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (((z1) this.f34942a) == z1.f35278a) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
