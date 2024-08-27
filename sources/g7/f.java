package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f16740a;

    /* JADX WARN: Type inference failed for: r0v0, types: [au.i, yt.a, g7.f] */
    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        ?? iVar = new au.i(2, aVar);
        iVar.f16740a = ((Boolean) obj).booleanValue();
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        return Boolean.valueOf(!this.f16740a);
    }
}
