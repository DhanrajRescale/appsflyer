package a0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;
import tu.w0;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f14c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f13b = kVar;
        this.f14c = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f13b, this.f14c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f12a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            ArrayList arrayList = new ArrayList();
            w0 w0Var = ((l) this.f13b).f16a;
            f fVar = new f(0, arrayList, this.f14c);
            this.f12a = 1;
            w0Var.getClass();
            if (w0.n(w0Var, fVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
