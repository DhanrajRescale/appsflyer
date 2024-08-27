package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1913a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f1915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f1915c = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        i0 i0Var = new i0(this.f1915c, aVar);
        i0Var.f1914b = obj;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f1913a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f1914b;
            this.f1913a = 1;
            if (this.f1915c.invoke(f0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
