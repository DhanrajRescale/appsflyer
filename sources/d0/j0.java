package d0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y.d2;

/* loaded from: classes.dex */
public final class j0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f13172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f13173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(g0 g0Var, float f10, yt.a aVar) {
        super(2, aVar);
        this.f13172b = g0Var;
        this.f13173c = f10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j0(this.f13172b, this.f13173c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object j10;
        Object obj2 = zt.a.f42823a;
        int i10 = this.f13171a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f13171a = 1;
            c0.e eVar = (c0.e) this.f13172b;
            int i11 = eVar.f7485a;
            float f10 = this.f13173c;
            d2 d2Var = eVar.f7487c;
            switch (i11) {
                case 0:
                    j10 = iu.j.j((c0.m0) d2Var, f10, w.e.v(s0.g.f34069a, null, 7), this);
                    if (j10 != obj2) {
                        j10 = Unit.f23355a;
                        break;
                    }
                    break;
                default:
                    j10 = iu.j.j((e0.j0) d2Var, f10, w.e.v(s0.g.f34069a, null, 7), this);
                    if (j10 != obj2) {
                        j10 = Unit.f23355a;
                        break;
                    }
                    break;
            }
            if (j10 == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
