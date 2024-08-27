package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26277a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f26279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f26279c = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        i2 i2Var = new i2(this.f26279c, aVar);
        i2Var.f26278b = obj;
        return i2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26277a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f26278b;
            h2 h2Var = new h2(this.f26279c, 0);
            this.f26277a = 1;
            if (y.i3.d(zVar, null, h2Var, this, 7) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
