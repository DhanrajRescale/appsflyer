package f0;

import a2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f15894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f15895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f15894b = mVar;
        this.f15895c = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f15894b, this.f15895c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15893a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            m mVar = this.f15894b;
            mVar.getClass();
            d dVar = (d) mVar.c(c.f15876a);
            if (dVar == null) {
                dVar = mVar.f15873n;
            }
            u Q0 = mVar.Q0();
            if (Q0 == null) {
                return Unit.f23355a;
            }
            this.f15893a = 1;
            if (dVar.b0(Q0, this.f15895c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
