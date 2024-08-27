package yb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f41469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f41470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g1 g1Var, yt.a aVar, Function1 function1) {
        super(2, aVar);
        this.f41469a = function1;
        this.f41470b = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s(this.f41470b, aVar, this.f41469a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (((Number) this.f41470b.getValue()).intValue() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41469a.invoke(Boolean.valueOf(z10));
        return Unit.f23355a;
    }
}
