package wb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f38986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f38988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l3 l3Var, String str, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f38986a = l3Var;
        this.f38987b = str;
        this.f38988c = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f38986a, this.f38987b, this.f38988c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ut.p pVar;
        qs.e eVar;
        ut.p pVar2;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        l3 l3Var = this.f38986a;
        if (l3Var != null && (pVar2 = (ut.p) l3Var.getValue()) != null) {
            str = (String) pVar2.f37401b;
        } else {
            str = null;
        }
        if (!Intrinsics.a(str, this.f38987b) && l3Var != null && (pVar = (ut.p) l3Var.getValue()) != null && ((Boolean) pVar.f37402c).booleanValue() && (eVar = (qs.e) this.f38988c.getValue()) != null) {
            ((us.g) eVar).c();
        }
        return Unit.f23355a;
    }
}
