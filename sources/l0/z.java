package l0;

import i0.a2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23874a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f23876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2 f23877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m mVar, a2 a2Var, yt.a aVar) {
        super(2, aVar);
        this.f23876c = mVar;
        this.f23877d = a2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        z zVar = new z(this.f23876c, this.f23877d, aVar);
        zVar.f23875b = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23874a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f23875b;
            x1.o0 o0Var = (x1.o0) zVar;
            o0Var.getClass();
            y yVar = new y(this.f23876c, new j(c2.g.y(o0Var).f1419t), this.f23877d, null);
            this.f23874a = 1;
            if (qu.i0.h(zVar, yVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
