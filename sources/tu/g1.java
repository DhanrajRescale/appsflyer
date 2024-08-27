package tu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36450a;

    /* JADX WARN: Type inference failed for: r0v0, types: [au.i, yt.a, tu.g1] */
    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        ?? iVar = new au.i(2, aVar);
        iVar.f36450a = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((z0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (((z0) this.f36450a) != z0.f36595a) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
