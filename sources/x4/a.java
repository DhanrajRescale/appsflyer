package x4;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.e3;
import t0.t1;
import tu.f;
import ut.n;

/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f39951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f39952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, t1 t1Var, yt.a aVar) {
        super(2, aVar);
        this.f39951b = fVar;
        this.f39952c = t1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f39951b, this.f39952c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39950a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            e3 e3Var = new e3(this.f39952c, 3);
            this.f39950a = 1;
            if (this.f39951b.c(e3Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
