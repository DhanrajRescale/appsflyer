package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w.x1;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31513b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, yt.a aVar) {
        super(2, aVar);
        this.f31513b = qVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f31513b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f31512a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w.d dVar = this.f31513b.f31529f;
            Float f10 = new Float(1.0f);
            x1 x10 = w.e.x(75, 0, w.e0.f38472c, 2);
            this.f31512a = 1;
            if (w.d.c(dVar, f10, x10, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
