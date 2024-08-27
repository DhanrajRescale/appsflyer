package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17011a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q.h f17013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(q.h hVar, yt.a aVar) {
        super(2, aVar);
        this.f17013c = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        q qVar = new q(this.f17013c, aVar);
        qVar.f17012b = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [au.i, kotlin.jvm.functions.Function2] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17011a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.g gVar = (tu.g) this.f17012b;
            iu.x xVar = new iu.x();
            xVar.f20558a = Integer.MIN_VALUE;
            tu.u uVar = new tu.u((tu.t0) this.f17013c.f31452d, new au.i(2, null), 1);
            p pVar = new p(xVar, gVar);
            this.f17011a = 1;
            if (uVar.c(pVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
