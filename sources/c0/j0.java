package c0;

import a2.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y.q1;

/* loaded from: classes.dex */
public final class j0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f7513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, int i10, int i11, yt.a aVar) {
        super(2, aVar);
        this.f7513a = m0Var;
        this.f7514b = i10;
        this.f7515c = i11;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j0(this.f7513a, this.f7514b, this.f7515c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        m0 m0Var = this.f7513a;
        e0 e0Var = m0Var.f7533d;
        e0Var.a(this.f7514b, this.f7515c);
        e0Var.f7491d = null;
        m mVar = m0Var.f7542m;
        mVar.f7522a.clear();
        mVar.f7523b = d0.e.f13156b;
        mVar.getClass();
        c1 c1Var = m0Var.f7539j;
        if (c1Var != null) {
            ((androidx.compose.ui.node.a) c1Var).j();
        }
        return Unit.f23355a;
    }
}
