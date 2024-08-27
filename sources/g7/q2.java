package g7;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f17021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(t2 t2Var, yt.a aVar) {
        super(2, aVar);
        this.f17021b = t2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q2(this.f17021b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17020a;
        t2 t2Var = this.f17021b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.f[] fVarArr = {t2Var.f17070g.q(b1.f16665c), t2Var.f17070g.q(b1.f16664b)};
            int i11 = tu.a0.f36404a;
            Intrinsics.checkNotNullParameter(fVarArr, "<this>");
            uu.p pVar = new uu.p(new vt.u(fVarArr, 0), kotlin.coroutines.k.f23369a, -2, su.a.f34776a);
            p2 p2Var = new p2(t2Var, null);
            this.f17020a = 1;
            obj = el.l.V(pVar, p2Var, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        w4 w4Var = (w4) obj;
        if (w4Var != null) {
            if (Log.isLoggable("Paging", 3)) {
                String message = "Jump triggered on PagingSource " + t2Var.f17065b + " by " + w4Var;
                Intrinsics.checkNotNullParameter(message, "message");
                Log.d("Paging", message, null);
            }
            t2Var.f17069f.mo2invoke();
        }
        return Unit.f23355a;
    }
}
