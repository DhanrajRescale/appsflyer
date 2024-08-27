package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f32680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(z2 z2Var, yt.a aVar) {
        super(2, aVar);
        this.f32680b = z2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q1(this.f32680b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f32679a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f32679a = 1;
            a3 a3Var = a3.f32325b;
            t tVar = this.f32680b.f32833c;
            Object M = al.d.M(tVar, a3Var, tVar.f32725j.i(), this);
            if (M != obj2) {
                M = Unit.f23355a;
            }
            if (M == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
