package tu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f36469a;

    /* JADX WARN: Type inference failed for: r0v0, types: [au.i, yt.a, tu.j0] */
    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        ?? iVar = new au.i(2, aVar);
        iVar.f36469a = ((Number) obj).intValue();
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create(Integer.valueOf(((Number) obj).intValue()), (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (this.f36469a > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
