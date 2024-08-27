package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f17004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(t2 t2Var, yt.a aVar) {
        super(2, aVar);
        this.f17004b = t2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        p2 p2Var = new p2(this.f17004b, aVar);
        p2Var.f17003a = obj;
        return p2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p2) create((w4) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        w4 w4Var = (w4) this.f17003a;
        int i10 = w4Var.f17112a * (-1);
        int i11 = this.f17004b.f17066c.f16675f;
        if (i10 <= i11 && w4Var.f17113b * (-1) <= i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
