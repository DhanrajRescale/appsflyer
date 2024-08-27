package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y.i3;

/* loaded from: classes.dex */
public final class v extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19227a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f19229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f19230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t0.g1 g1Var, yt.a aVar, Function1 function1) {
        super(2, aVar);
        this.f19229c = g1Var;
        this.f19230d = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        v vVar = new v(this.f19229c, aVar, this.f19230d);
        vVar.f19228b = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19227a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f19228b;
            t tVar = new t(this.f19229c, this.f19230d, 1);
            this.f19227a = 1;
            if (i3.d(zVar, null, tVar, this, 7) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
