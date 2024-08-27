package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31523b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, yt.a aVar) {
        super(2, aVar);
        this.f31523b = qVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        p pVar = new p(this.f31523b, aVar);
        pVar.f31522a = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        return yk.g.H((qu.f0) this.f31522a, null, null, new o(this.f31523b, null), 3);
    }
}
