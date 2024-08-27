package w;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public yu.a f38437a;

    /* renamed from: b, reason: collision with root package name */
    public Object f38438b;

    /* renamed from: c, reason: collision with root package name */
    public c1 f38439c;

    /* renamed from: d, reason: collision with root package name */
    public int f38440d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f38441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c1 f38443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f38444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(int i10, c1 c1Var, Function1 function1, yt.a aVar) {
        super(2, aVar);
        this.f38442f = i10;
        this.f38443g = c1Var;
        this.f38444h = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b1 b1Var = new b1(this.f38442f, this.f38443g, this.f38444h, aVar);
        b1Var.f38441e = obj;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, yu.a] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        c1 c1Var;
        yu.a aVar;
        Function1 function1;
        a1 a1Var;
        yu.a aVar2;
        a1 a1Var2;
        c1 c1Var2;
        Throwable th2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        zt.a aVar3 = zt.a.f42823a;
        ?? r12 = this.f38440d;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            c1Var2 = (c1) this.f38438b;
                            aVar2 = this.f38437a;
                            a1Var2 = (a1) this.f38441e;
                            try {
                                ut.n.b(obj);
                                atomicReference2 = c1Var2.f38449a;
                                while (!atomicReference2.compareAndSet(a1Var2, null) && atomicReference2.get() == a1Var2) {
                                }
                                aVar2.a(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = c1Var2.f38449a;
                                while (!atomicReference.compareAndSet(a1Var2, null)) {
                                }
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1 c1Var3 = this.f38439c;
                    function1 = (Function1) this.f38438b;
                    aVar = this.f38437a;
                    a1Var = (a1) this.f38441e;
                    ut.n.b(obj);
                    c1Var = c1Var3;
                } else {
                    ut.n.b(obj);
                    CoroutineContext.Element g10 = ((qu.f0) this.f38441e).H().g(qu.c0.f32192b);
                    Intrinsics.c(g10);
                    a1 a1Var3 = new a1(this.f38442f, (qu.o1) g10);
                    while (true) {
                        c1Var = this.f38443g;
                        AtomicReference atomicReference3 = c1Var.f38449a;
                        a1 a1Var4 = (a1) atomicReference3.get();
                        if (a1Var4 != null && k.a(a1Var3.f38426a, a1Var4.f38426a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(a1Var4, a1Var3)) {
                            if (atomicReference3.get() != a1Var4) {
                                break;
                            }
                        }
                        if (a1Var4 != null) {
                            a1Var4.f38427b.a(new z0(0, 0));
                        }
                        this.f38441e = a1Var3;
                        aVar = c1Var.f38450b;
                        this.f38437a = aVar;
                        Function1 function12 = this.f38444h;
                        this.f38438b = function12;
                        this.f38439c = c1Var;
                        this.f38440d = 1;
                        if (aVar.b(null, this) == aVar3) {
                            return aVar3;
                        }
                        function1 = function12;
                        a1Var = a1Var3;
                    }
                }
                this.f38441e = a1Var;
                this.f38437a = aVar2;
                this.f38438b = c1Var;
                this.f38439c = null;
                this.f38440d = 2;
                Object invoke = function1.invoke(this);
                if (invoke == aVar3) {
                    return aVar3;
                }
                c1Var2 = c1Var;
                obj = invoke;
                a1Var2 = a1Var;
                atomicReference2 = c1Var2.f38449a;
                while (!atomicReference2.compareAndSet(a1Var2, null)) {
                }
                aVar2.a(null);
                return obj;
            } catch (Throwable th4) {
                a1Var2 = a1Var;
                c1Var2 = c1Var;
                th2 = th4;
                atomicReference = c1Var2.f38449a;
                while (!atomicReference.compareAndSet(a1Var2, null) && atomicReference.get() == a1Var2) {
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
