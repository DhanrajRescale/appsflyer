package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m3 extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f16921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f16922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f16923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(o3 o3Var, c3 c3Var, yt.a aVar) {
        super(1, aVar);
        this.f16922b = o3Var;
        this.f16923c = c3Var;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new m3(this.f16922b, this.f16923c, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m3) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16921a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            c3 c3Var = this.f16923c;
            t4 t4Var = c3Var.f16694b;
            o3 o3Var = this.f16922b;
            o3Var.f16983c = t4Var;
            tu.f fVar = c3Var.f16693a;
            a0.f fVar2 = new a0.f(5, o3Var, c3Var);
            this.f16921a = 1;
            if (fVar.c(fVar2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
