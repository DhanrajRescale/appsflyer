package uu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes2.dex */
public final class m extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37451a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f37453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu.g f37454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, tu.g gVar, yt.a aVar) {
        super(2, aVar);
        this.f37453c = nVar;
        this.f37454d = gVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        m mVar = new m(this.f37453c, this.f37454d, aVar);
        mVar.f37452b = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37451a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            f0 f0Var = (f0) this.f37452b;
            iu.z zVar = new iu.z();
            n nVar = this.f37453c;
            tu.f fVar = nVar.f37437d;
            l lVar = new l(zVar, f0Var, nVar, this.f37454d);
            this.f37451a = 1;
            if (fVar.c(lVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
