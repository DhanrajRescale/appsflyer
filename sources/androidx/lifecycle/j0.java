package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public yu.a f1916a;

    /* renamed from: b, reason: collision with root package name */
    public Function2 f1917b;

    /* renamed from: c, reason: collision with root package name */
    public int f1918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu.a f1919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f1920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(yu.a aVar, Function2 function2, yt.a aVar2) {
        super(2, aVar2);
        this.f1919d = aVar;
        this.f1920e = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j0(this.f1919d, this.f1920e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        yu.a aVar;
        Function2 function2;
        yu.a aVar2;
        Throwable th2;
        zt.a aVar3 = zt.a.f42823a;
        int i10 = this.f1918c;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        aVar2 = this.f1916a;
                        try {
                            ut.n.b(obj);
                            Unit unit = Unit.f23355a;
                            aVar2.a(null);
                            return Unit.f23355a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar2.a(null);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function2 = this.f1917b;
                yu.a aVar4 = this.f1916a;
                ut.n.b(obj);
                aVar = aVar4;
            } else {
                ut.n.b(obj);
                aVar = this.f1919d;
                this.f1916a = aVar;
                function2 = this.f1920e;
                this.f1917b = function2;
                this.f1918c = 1;
                if (aVar.b(null, this) == aVar3) {
                    return aVar3;
                }
            }
            i0 i0Var = new i0(function2, null);
            this.f1916a = aVar;
            this.f1917b = null;
            this.f1918c = 2;
            if (hl.f.P(i0Var, this) == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            Unit unit2 = Unit.f23355a;
            aVar2.a(null);
            return Unit.f23355a;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            aVar2.a(null);
            throw th2;
        }
    }
}
