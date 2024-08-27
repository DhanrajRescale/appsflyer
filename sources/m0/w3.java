package m0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w3 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public yu.a f27011a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27012b;

    /* renamed from: c, reason: collision with root package name */
    public x3 f27013c;

    /* renamed from: d, reason: collision with root package name */
    public int f27014d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f27015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.s1 f27016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x3 f27017g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f27018h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x.s1 s1Var, x3 x3Var, Function1 function1, yt.a aVar) {
        super(2, aVar);
        this.f27016f = s1Var;
        this.f27017g = x3Var;
        this.f27018h = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        w3 w3Var = new w3(this.f27016f, this.f27017g, this.f27018h, aVar);
        w3Var.f27015e = obj;
        return w3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w3) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, yu.a] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        x3 x3Var;
        yu.a aVar;
        Function1 function1;
        v3 v3Var;
        yu.a aVar2;
        v3 v3Var2;
        x3 x3Var2;
        Throwable th2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        zt.a aVar3 = zt.a.f42823a;
        ?? r12 = this.f27014d;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            x3Var2 = (x3) this.f27012b;
                            aVar2 = this.f27011a;
                            v3Var2 = (v3) this.f27015e;
                            try {
                                ut.n.b(obj);
                                atomicReference2 = x3Var2.f27079a;
                                while (!atomicReference2.compareAndSet(v3Var2, null) && atomicReference2.get() == v3Var2) {
                                }
                                aVar2.a(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = x3Var2.f27079a;
                                while (!atomicReference.compareAndSet(v3Var2, null)) {
                                }
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x3 x3Var3 = this.f27013c;
                    function1 = (Function1) this.f27012b;
                    aVar = this.f27011a;
                    v3Var = (v3) this.f27015e;
                    ut.n.b(obj);
                    x3Var = x3Var3;
                } else {
                    ut.n.b(obj);
                    CoroutineContext.Element g10 = ((qu.f0) this.f27015e).H().g(qu.c0.f32192b);
                    Intrinsics.c(g10);
                    v3 v3Var3 = new v3(this.f27016f, (qu.o1) g10);
                    while (true) {
                        x3Var = this.f27017g;
                        AtomicReference atomicReference3 = x3Var.f27079a;
                        v3 v3Var4 = (v3) atomicReference3.get();
                        if (v3Var4 != null && v3Var3.f26943a.compareTo(v3Var4.f26943a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(v3Var4, v3Var3)) {
                            if (atomicReference3.get() != v3Var4) {
                                break;
                            }
                        }
                        if (v3Var4 != null) {
                            v3Var4.f26944b.a(null);
                        }
                        this.f27015e = v3Var3;
                        aVar = x3Var.f27080b;
                        this.f27011a = aVar;
                        Function1 function12 = this.f27018h;
                        this.f27012b = function12;
                        this.f27013c = x3Var;
                        this.f27014d = 1;
                        if (aVar.b(null, this) == aVar3) {
                            return aVar3;
                        }
                        function1 = function12;
                        v3Var = v3Var3;
                    }
                }
                this.f27015e = v3Var;
                this.f27011a = aVar2;
                this.f27012b = x3Var;
                this.f27013c = null;
                this.f27014d = 2;
                Object invoke = function1.invoke(this);
                if (invoke == aVar3) {
                    return aVar3;
                }
                x3Var2 = x3Var;
                obj = invoke;
                v3Var2 = v3Var;
                atomicReference2 = x3Var2.f27079a;
                while (!atomicReference2.compareAndSet(v3Var2, null)) {
                }
                aVar2.a(null);
                return obj;
            } catch (Throwable th4) {
                v3Var2 = v3Var;
                x3Var2 = x3Var;
                th2 = th4;
                atomicReference = x3Var2.f27079a;
                while (!atomicReference.compareAndSet(v3Var2, null) && atomicReference.get() == v3Var2) {
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
