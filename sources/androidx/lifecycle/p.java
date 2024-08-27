package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.o1;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, yt.a aVar) {
        super(2, aVar);
        this.f1955b = qVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        p pVar = new p(this.f1955b, aVar);
        pVar.f1954a = obj;
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
        qu.f0 f0Var = (qu.f0) this.f1954a;
        q qVar = this.f1955b;
        if (qVar.f1957a.b().compareTo(n.f1948b) >= 0) {
            qVar.f1957a.a(qVar);
        } else {
            o1 o1Var = (o1) f0Var.H().g(qu.c0.f32192b);
            if (o1Var != null) {
                o1Var.a(null);
            }
        }
        return Unit.f23355a;
    }
}
