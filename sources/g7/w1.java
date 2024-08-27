package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f17107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.c f17108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(e4 e4Var, t2 t2Var, h.c cVar, yt.a aVar) {
        super(2, aVar);
        this.f17107b = t2Var;
        this.f17108c = cVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        w1 w1Var = new w1(null, this.f17107b, this.f17108c, aVar);
        w1Var.f17106a = obj;
        return w1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((j4) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        throw null;
    }
}
