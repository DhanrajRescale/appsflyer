package e0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14712a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f14714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j0 j0Var, yt.a aVar) {
        super(2, aVar);
        this.f14714c = j0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        j jVar = new j(this.f14714c, aVar);
        jVar.f14713b = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f14712a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            i iVar = new i((x1.z) this.f14713b, this.f14714c, null);
            this.f14712a = 1;
            if (hl.f.P(iVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
