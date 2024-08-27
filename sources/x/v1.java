package x;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public yu.a f39743a;

    /* renamed from: b, reason: collision with root package name */
    public Object f39744b;

    /* renamed from: c, reason: collision with root package name */
    public Object f39745c;

    /* renamed from: d, reason: collision with root package name */
    public w1 f39746d;

    /* renamed from: e, reason: collision with root package name */
    public int f39747e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f39748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1 f39749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w1 f39750h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f39751i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f39752j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(s1 s1Var, w1 w1Var, Function2 function2, Object obj, yt.a aVar) {
        super(2, aVar);
        this.f39749g = s1Var;
        this.f39750h = w1Var;
        this.f39751i = function2;
        this.f39752j = obj;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        v1 v1Var = new v1(this.f39749g, this.f39750h, this.f39751i, this.f39752j, aVar);
        v1Var.f39748f = obj;
        return v1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, yu.a] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        w1 w1Var;
        Object obj2;
        t1 t1Var;
        yu.a aVar;
        Function2 function2;
        t1 t1Var2;
        w1 w1Var2;
        Throwable th2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        zt.a aVar2 = zt.a.f42823a;
        ?? r12 = this.f39747e;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            w1Var2 = (w1) this.f39744b;
                            aVar = this.f39743a;
                            t1Var2 = (t1) this.f39748f;
                            try {
                                ut.n.b(obj);
                                atomicReference2 = w1Var2.f39763a;
                                while (!atomicReference2.compareAndSet(t1Var2, null) && atomicReference2.get() == t1Var2) {
                                }
                                aVar.a(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = w1Var2.f39763a;
                                while (!atomicReference.compareAndSet(t1Var2, null)) {
                                }
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w1 w1Var3 = this.f39746d;
                    obj2 = this.f39745c;
                    function2 = (Function2) this.f39744b;
                    yu.a aVar3 = this.f39743a;
                    t1Var = (t1) this.f39748f;
                    ut.n.b(obj);
                    w1Var = w1Var3;
                    aVar = aVar3;
                } else {
                    ut.n.b(obj);
                    CoroutineContext.Element g10 = ((qu.f0) this.f39748f).H().g(qu.c0.f32192b);
                    Intrinsics.c(g10);
                    t1 t1Var3 = new t1(this.f39749g, (qu.o1) g10);
                    w1Var = this.f39750h;
                    w1.a(w1Var, t1Var3);
                    this.f39748f = t1Var3;
                    yu.d dVar = w1Var.f39764b;
                    this.f39743a = dVar;
                    Function2 function22 = this.f39751i;
                    this.f39744b = function22;
                    Object obj3 = this.f39752j;
                    this.f39745c = obj3;
                    this.f39746d = w1Var;
                    this.f39747e = 1;
                    if (dVar.b(null, this) == aVar2) {
                        return aVar2;
                    }
                    obj2 = obj3;
                    t1Var = t1Var3;
                    aVar = dVar;
                    function2 = function22;
                }
                this.f39748f = t1Var;
                this.f39743a = aVar;
                this.f39744b = w1Var;
                this.f39745c = null;
                this.f39746d = null;
                this.f39747e = 2;
                Object invoke = function2.invoke(obj2, this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                w1Var2 = w1Var;
                obj = invoke;
                t1Var2 = t1Var;
                atomicReference2 = w1Var2.f39763a;
                while (!atomicReference2.compareAndSet(t1Var2, null)) {
                }
                aVar.a(null);
                return obj;
            } catch (Throwable th4) {
                t1Var2 = t1Var;
                w1Var2 = w1Var;
                th2 = th4;
                atomicReference = w1Var2.f39763a;
                while (!atomicReference.compareAndSet(t1Var2, null) && atomicReference.get() == t1Var2) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            r12.a(null);
            throw th5;
        }
    }
}
