package hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import w.f1;
import x.o2;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f18385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o2 o2Var, yt.a aVar) {
        super(2, aVar);
        this.f18385b = o2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f18385b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18384a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f18384a = 1;
            d1.r rVar = o2.f39652i;
            if (this.f18385b.f(0, new f1(null, 7), this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
