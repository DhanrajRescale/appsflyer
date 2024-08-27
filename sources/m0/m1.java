package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f26473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f26474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(j3 j3Var, p1 p1Var, yt.a aVar) {
        super(2, aVar);
        this.f26473b = j3Var;
        this.f26474c = p1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new m1(this.f26473b, this.f26474c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26472a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            p1 p1Var = this.f26474c;
            float f10 = p1Var.f26623a;
            float f11 = p1Var.f26624b;
            float f12 = p1Var.f26625c;
            float f13 = p1Var.f26626d;
            this.f26472a = 1;
            j3 j3Var = this.f26473b;
            j3Var.f26319a = f10;
            j3Var.f26320b = f11;
            j3Var.f26321c = f12;
            j3Var.f26322d = f13;
            Object b10 = j3Var.b(this);
            if (b10 != aVar) {
                b10 = Unit.f23355a;
            }
            if (b10 == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
