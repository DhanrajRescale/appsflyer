package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40973a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f40975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f40976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f40975c = yVar;
        this.f40976d = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        v vVar = new v(this.f40975c, this.f40976d, aVar);
        vVar.f40974b = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40973a;
        y yVar = this.f40975c;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                q1 q1Var = (q1) this.f40974b;
                yVar.f40995d.setValue(Boolean.TRUE);
                Function2 function2 = this.f40976d;
                this.f40973a = 1;
                if (function2.invoke(q1Var, this) == aVar) {
                    return aVar;
                }
            }
            yVar.f40995d.setValue(Boolean.FALSE);
            return Unit.f23355a;
        } catch (Throwable th2) {
            yVar.f40995d.setValue(Boolean.FALSE);
            throw th2;
        }
    }
}
