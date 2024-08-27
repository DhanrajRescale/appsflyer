package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19231a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f19233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f19234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a2 a2Var, l0.v0 v0Var, yt.a aVar) {
        super(2, aVar);
        this.f19233c = a2Var;
        this.f19234d = v0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        v0 v0Var = new v0(this.f19233c, this.f19234d, aVar);
        v0Var.f19232b = obj;
        return v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19231a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            u0 u0Var = new u0((x1.z) this.f19232b, this.f19233c, this.f19234d, null);
            this.f19231a = 1;
            if (hl.f.P(u0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
