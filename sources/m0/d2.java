package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f26030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(p2 p2Var, yt.a aVar) {
        super(2, aVar);
        this.f26030b = p2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d2(this.f26030b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f26029a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f26029a = 1;
            q2 q2Var = q2.f26666a;
            y yVar = this.f26030b.f26627a;
            Object s7 = pp.b.s(yVar, q2Var, yVar.f27124k.i(), this);
            if (s7 != obj2) {
                s7 = Unit.f23355a;
            }
            if (s7 == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
