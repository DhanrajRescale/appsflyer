package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16935a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16936b;

    public n1(e4 e4Var, yt.a aVar) {
        super(2, aVar);
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        n1 n1Var = new n1(null, aVar);
        n1Var.f16936b = obj;
        return n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n1) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        tu.g gVar;
        c4 c4Var;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16935a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (tu.g) this.f16936b;
            ut.n.b(obj);
            c4Var = (c4) obj;
        } else {
            ut.n.b(obj);
            gVar = (tu.g) this.f16936b;
            c4Var = null;
        }
        if (c4Var != c4.f16697a) {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        this.f16936b = null;
        this.f16935a = 2;
        if (gVar.a(valueOf, this) == aVar) {
            return aVar;
        }
        return Unit.f23355a;
    }
}
