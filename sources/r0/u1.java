package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f32752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(z2 z2Var, yt.a aVar) {
        super(2, aVar);
        this.f32752b = z2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u1(this.f32752b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f32751a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f32751a = 1;
            z2 z2Var = this.f32752b;
            f1 d10 = z2Var.f32833c.d();
            a3 a3Var = a3.f32326c;
            if (!d10.f32396a.containsKey(a3Var)) {
                a3Var = a3.f32325b;
            }
            Object a10 = z2.a(z2Var, a3Var, this);
            if (a10 != obj2) {
                a10 = Unit.f23355a;
            }
            if (a10 == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
