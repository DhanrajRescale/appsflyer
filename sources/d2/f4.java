package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4 f13417b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(i4 i4Var, yt.a aVar) {
        super(2, aVar);
        this.f13417b = i4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f4(this.f13417b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f13416a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            a0 a0Var = this.f13417b.f13460a;
            this.f13416a = 1;
            Object l10 = a0Var.f13320m.l(this);
            if (l10 != aVar) {
                l10 = Unit.f23355a;
            }
            if (l10 == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
