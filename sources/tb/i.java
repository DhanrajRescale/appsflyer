package tb;

import c0.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.c f35708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f35709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f35710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sb.c cVar, f0 f0Var, m0 m0Var, yt.a aVar) {
        super(2, aVar);
        this.f35708a = cVar;
        this.f35709b = f0Var;
        this.f35710c = m0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f35708a, this.f35709b, this.f35710c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        if (this.f35708a != sb.c.f34437a) {
            return Unit.f23355a;
        }
        yk.g.H(this.f35709b, null, null, new h(this.f35710c, null), 3);
        return Unit.f23355a;
    }
}
