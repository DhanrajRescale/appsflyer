package sc;

import d2.y3;
import g7.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import rc.l;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f34562b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, yt.a aVar) {
        super(2, aVar);
        this.f34562b = iVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f34562b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34561a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            i iVar = this.f34562b;
            l lVar = iVar.f34564g;
            if (lVar != null) {
                tu.f J = el.l.J(new x(lVar.f16768f, 4));
                y3 y3Var = new y3(iVar, 8);
                this.f34561a = 1;
                if (J.c(y3Var, this) == aVar) {
                    return aVar;
                }
            } else {
                Intrinsics.k("arenaUpcomingMiddleLayerAdapter");
                throw null;
            }
        }
        return Unit.f23355a;
    }
}
