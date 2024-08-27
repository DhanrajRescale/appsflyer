package v;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f37587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f37589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(o0 o0Var, long j10, q0 q0Var, yt.a aVar) {
        super(2, aVar);
        this.f37587b = o0Var;
        this.f37588c = j10;
        this.f37589d = q0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p0(this.f37587b, this.f37588c, this.f37589d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37586a;
        q0 q0Var = this.f37589d;
        o0 o0Var = this.f37587b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w.d dVar = o0Var.f37583a;
            w2.j jVar = new w2.j(this.f37588c);
            w.n nVar = q0Var.f37598n;
            this.f37586a = 1;
            obj = w.d.c(dVar, jVar, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        w.l lVar = (w.l) obj;
        if (lVar.f38580b == 2 && (function2 = q0Var.f37599o) != null) {
            function2.invoke(new w2.j(o0Var.f37584b), lVar.f38579a.f38622b.getValue());
        }
        return Unit.f23355a;
    }
}
