package x;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public yu.a f39730a;

    /* renamed from: b, reason: collision with root package name */
    public Object f39731b;

    /* renamed from: c, reason: collision with root package name */
    public w1 f39732c;

    /* renamed from: d, reason: collision with root package name */
    public int f39733d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f39735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w1 f39736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f39737h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(s1 s1Var, w1 w1Var, Function1 function1, yt.a aVar) {
        super(2, aVar);
        this.f39735f = s1Var;
        this.f39736g = w1Var;
        this.f39737h = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        u1 u1Var = new u1(this.f39735f, this.f39736g, this.f39737h, aVar);
        u1Var.f39734e = obj;
        return u1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, yu.a] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        w1 w1Var;
        yu.a aVar;
        Function1 function1;
        t1 t1Var;
        yu.a aVar2;
        t1 t1Var2;
        w1 w1Var2;
        Throwable th2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        zt.a aVar3 = zt.a.f42823a;
        ?? r12 = this.f39733d;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            w1Var2 = (w1) this.f39731b;
                            aVar2 = this.f39730a;
                            t1Var2 = (t1) this.f39734e;
                            try {
                                ut.n.b(obj);
                                atomicReference2 = w1Var2.f39763a;
                                while (!atomicReference2.compareAndSet(t1Var2, null) && atomicReference2.get() == t1Var2) {
                                }
                                aVar2.a(null);
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
                    w1 w1Var3 = this.f39732c;
                    function1 = (Function1) this.f39731b;
                    aVar = this.f39730a;
                    t1Var = (t1) this.f39734e;
                    ut.n.b(obj);
                    w1Var = w1Var3;
                } else {
                    ut.n.b(obj);
                    CoroutineContext.Element g10 = ((qu.f0) this.f39734e).H().g(qu.c0.f32192b);
                    Intrinsics.c(g10);
                    t1 t1Var3 = new t1(this.f39735f, (qu.o1) g10);
                    w1Var = this.f39736g;
                    w1.a(w1Var, t1Var3);
                    this.f39734e = t1Var3;
                    aVar = w1Var.f39764b;
                    this.f39730a = aVar;
                    Function1 function12 = this.f39737h;
                    this.f39731b = function12;
                    this.f39732c = w1Var;
                    this.f39733d = 1;
                    if (aVar.b(null, this) == aVar3) {
                        return aVar3;
                    }
                    function1 = function12;
                    t1Var = t1Var3;
                }
                this.f39734e = t1Var;
                this.f39730a = aVar2;
                this.f39731b = w1Var;
                this.f39732c = null;
                this.f39733d = 2;
                Object invoke = function1.invoke(this);
                if (invoke == aVar3) {
                    return aVar3;
                }
                w1Var2 = w1Var;
                obj = invoke;
                t1Var2 = t1Var;
                atomicReference2 = w1Var2.f39763a;
                while (!atomicReference2.compareAndSet(t1Var2, null)) {
                }
                aVar2.a(null);
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
            aVar2 = aVar;
        } catch (Throwable th5) {
            r12.a(null);
            throw th5;
        }
    }
}
