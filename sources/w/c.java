package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f38447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Object obj, yt.a aVar) {
        super(1, aVar);
        this.f38447a = dVar;
        this.f38448b = obj;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new c(this.f38447a, this.f38448b, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        d dVar = this.f38447a;
        d.b(dVar);
        Object a10 = d.a(dVar, this.f38448b);
        dVar.f38453c.f38622b.setValue(a10);
        dVar.f38455e.setValue(a10);
        return Unit.f23355a;
    }
}
