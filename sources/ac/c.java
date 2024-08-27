package ac;

import i0.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.g1;
import ut.n;
import x1.z;
import y.i3;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f321a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g1 g1Var, yt.a aVar, Function1 function1) {
        super(2, aVar);
        this.f323c = function1;
        this.f324d = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        c cVar = new c(this.f324d, aVar, this.f323c);
        cVar.f322b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f321a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            z zVar = (z) this.f322b;
            t tVar = new t(this.f323c, this.f324d, 3);
            this.f321a = 1;
            if (i3.d(zVar, null, tVar, this, 7) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
