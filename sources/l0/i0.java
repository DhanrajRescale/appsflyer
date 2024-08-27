package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w.f1;

/* loaded from: classes.dex */
public final class i0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f23771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(w.d dVar, long j10, yt.a aVar) {
        super(2, aVar);
        this.f23771b = dVar;
        this.f23772c = j10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i0(this.f23771b, this.f23772c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23770a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            m1.c cVar = new m1.c(this.f23772c);
            f1 f1Var = k0.f23786d;
            this.f23770a = 1;
            if (w.d.c(this.f23771b, cVar, f1Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
