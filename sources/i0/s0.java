package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.z f19189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f19190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(x1.z zVar, a2 a2Var, yt.a aVar) {
        super(2, aVar);
        this.f19189b = zVar;
        this.f19190c = a2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s0(this.f19189b, this.f19190c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f19188a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f19188a = 1;
            Object P = hl.f.P(new u1(this.f19189b, this.f19190c, null), this);
            if (P != obj2) {
                P = Unit.f23355a;
            }
            if (P == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
