package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a3 extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f16656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Function0 function0, yt.a aVar) {
        super(1, aVar);
        this.f16656a = function0;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new a3(this.f16656a, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a3) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        return this.f16656a.mo2invoke();
    }
}
