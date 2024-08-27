package rc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f33587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, yt.a aVar) {
        super(2, aVar);
        this.f33587a = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f33587a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        i iVar = this.f33587a.f33595i;
        if (iVar != null) {
            ((sc.i) iVar).H(true);
        }
        return Unit.f23355a;
    }
}
