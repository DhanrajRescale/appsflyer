package hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import x.o2;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f18386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f18387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2 f18388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j jVar, f0 f0Var, o2 o2Var, yt.a aVar) {
        super(2, aVar);
        this.f18386a = jVar;
        this.f18387b = f0Var;
        this.f18388c = o2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f18386a, this.f18387b, this.f18388c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (this.f18386a.f18376b) {
            yk.g.H(this.f18387b, null, null, new n(this.f18388c, null), 3);
        }
        return Unit.f23355a;
    }
}
