package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16835a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f16837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f16837c = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        i4 i4Var = new i4(this.f16837c, aVar);
        i4Var.f16836b = obj;
        return i4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i4) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16835a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            h4 h4Var = new h4((tu.g) this.f16836b, this.f16837c, null);
            this.f16835a = 1;
            if (hl.f.P(h4Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
