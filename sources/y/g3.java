package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40734a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1.z f40736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f40737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f40738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f40739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f40740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(x1.z zVar, yt.a aVar, Function1 function1, Function1 function12, Function1 function13, hu.c cVar) {
        super(2, aVar);
        this.f40736c = zVar;
        this.f40737d = cVar;
        this.f40738e = function1;
        this.f40739f = function12;
        this.f40740g = function13;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        g3 g3Var = new g3(this.f40736c, aVar, this.f40738e, this.f40739f, this.f40740g, this.f40737d);
        g3Var.f40735b = obj;
        return g3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g3) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40734a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            qu.f0 f0Var = (qu.f0) this.f40735b;
            x1.z zVar = this.f40736c;
            f3 f3Var = new f3(f0Var, this.f40737d, this.f40738e, this.f40739f, this.f40740g, new k1(zVar), null);
            this.f40734a = 1;
            if (qu.i0.h(zVar, f3Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
