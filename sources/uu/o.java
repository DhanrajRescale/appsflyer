package uu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes2.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu.f f37457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f37458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tu.f fVar, a0 a0Var, yt.a aVar) {
        super(2, aVar);
        this.f37457b = fVar;
        this.f37458c = a0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f37457b, this.f37458c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37456a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f37456a = 1;
            if (this.f37457b.c(this.f37458c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
