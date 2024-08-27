package d0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y.d2;

/* loaded from: classes.dex */
public final class k0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f13176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g0 g0Var, int i10, yt.a aVar) {
        super(2, aVar);
        this.f13176b = g0Var;
        this.f13177c = i10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k0(this.f13176b, this.f13177c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object i10;
        Object obj2 = zt.a.f42823a;
        int i11 = this.f13175a;
        if (i11 != 0) {
            if (i11 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f13175a = 1;
            c0.e eVar = (c0.e) this.f13176b;
            int i12 = eVar.f7485a;
            int i13 = this.f13177c;
            d2 d2Var = eVar.f7487c;
            switch (i12) {
                case 0:
                    i10 = c0.m0.i((c0.m0) d2Var, i13, this);
                    if (i10 != obj2) {
                        i10 = Unit.f23355a;
                        break;
                    }
                    break;
                default:
                    i10 = e0.j0.q((e0.j0) d2Var, i13, this);
                    if (i10 != obj2) {
                        i10 = Unit.f23355a;
                        break;
                    }
                    break;
            }
            if (i10 == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
