package y;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40906a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f40908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, yt.a aVar) {
        super(2, aVar);
        this.f40908c = sVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        r rVar = new r(this.f40908c, aVar);
        rVar.f40907b = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40906a;
        s sVar = this.f40908c;
        try {
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ut.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ut.n.b(obj);
                    qu.o1 j02 = hl.f.j0(((qu.f0) this.f40907b).H());
                    sVar.f40932x = true;
                    d2 d2Var = sVar.f40923o;
                    q qVar = new q(sVar, j02, null);
                    this.f40906a = 1;
                    if (d2Var.b(x.s1.f39717a, qVar, this) == aVar) {
                        return aVar;
                    }
                }
                sVar.f40926r.b();
                sVar.f40932x = false;
                sVar.f40926r.a(null);
                sVar.f40930v = false;
                return Unit.f23355a;
            } catch (CancellationException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            sVar.f40932x = false;
            sVar.f40926r.a(null);
            sVar.f40930v = false;
            throw th2;
        }
    }
}
