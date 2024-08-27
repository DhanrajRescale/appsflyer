package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17014a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tu.f f17016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f17017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(tu.f fVar, hu.c cVar, yt.a aVar) {
        super(2, aVar);
        this.f17016c = fVar;
        this.f17017d = cVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        q0 q0Var = new q0(this.f17016c, this.f17017d, aVar);
        q0Var.f17015b = obj;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((j4) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17014a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            p0 p0Var = new p0(this.f17017d, new d2.y3((j4) this.f17015b), null);
            this.f17014a = 1;
            if (el.l.B(this.f17016c, p0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
