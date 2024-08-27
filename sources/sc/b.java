package sc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.b2;
import qu.f0;
import qu.r0;
import ut.n;
import vu.u;

/* loaded from: classes.dex */
public final class b extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f34548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, yt.a aVar) {
        super(2, aVar);
        this.f34548b = iVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f34548b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34547a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            this.f34547a = 1;
            if (kp.j.K(3000L, this) == aVar) {
                return aVar;
            }
        }
        xu.e eVar = r0.f32255a;
        b2 b2Var = u.f38408a;
        a aVar2 = new a(this.f34548b, null);
        this.f34547a = 2;
        if (yk.g.e0(b2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return Unit.f23355a;
    }
}
