package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32337a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f32339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f32339c = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b2 b2Var = new b2(this.f32339c, aVar);
        b2Var.f32338b = obj;
        return b2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32337a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f32338b;
            m1 m1Var = new m1(this.f32339c, 1);
            this.f32337a = 1;
            if (y.i3.d(zVar, null, m1Var, this, 7) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
