package lf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x.o2;

/* loaded from: classes.dex */
public final class z extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf.j f24809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f24810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2 f24811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(hf.j jVar, qu.f0 f0Var, o2 o2Var, yt.a aVar) {
        super(2, aVar);
        this.f24809a = jVar;
        this.f24810b = f0Var;
        this.f24811c = o2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new z(this.f24809a, this.f24810b, this.f24811c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (this.f24809a.f18376b) {
            yk.g.H(this.f24810b, null, null, new y(this.f24811c, null), 3);
        }
        return Unit.f23355a;
    }
}
