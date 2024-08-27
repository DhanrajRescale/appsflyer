package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e3 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f40677b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f40679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f40680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f40681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iu.z f40682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k1 f40683h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(qu.f0 f0Var, Function1 function1, Function1 function12, iu.z zVar, k1 k1Var, yt.a aVar) {
        super(aVar);
        this.f40679d = f0Var;
        this.f40680e = function1;
        this.f40681f = function12;
        this.f40682g = zVar;
        this.f40683h = k1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        e3 e3Var = new e3(this.f40679d, this.f40680e, this.f40681f, this.f40682g, this.f40683h, aVar);
        e3Var.f40678c = obj;
        return e3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e3) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40677b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.m0 m0Var = (x1.m0) this.f40678c;
            this.f40677b = 1;
            obj = i3.e(m0Var, x1.l.f39878b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        x1.t tVar = (x1.t) obj;
        qu.f0 f0Var = this.f40679d;
        k1 k1Var = this.f40683h;
        if (tVar != null) {
            tVar.a();
            yk.g.H(f0Var, null, null, new c3(k1Var, null), 3);
            this.f40680e.invoke(new m1.c(tVar.f39911c));
            return Unit.f23355a;
        }
        yk.g.H(f0Var, null, null, new d3(k1Var, null), 3);
        Function1 function1 = this.f40681f;
        if (function1 == null) {
            return null;
        }
        function1.invoke(new m1.c(((x1.t) this.f40682g.f20560a).f39911c));
        return Unit.f23355a;
    }
}
