package r0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public yu.a f32367a;

    /* renamed from: b, reason: collision with root package name */
    public Object f32368b;

    /* renamed from: c, reason: collision with root package name */
    public e1 f32369c;

    /* renamed from: d, reason: collision with root package name */
    public int f32370d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.s1 f32372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1 f32373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f32374h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(x.s1 s1Var, e1 e1Var, Function1 function1, yt.a aVar) {
        super(2, aVar);
        this.f32372f = s1Var;
        this.f32373g = e1Var;
        this.f32374h = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        d1 d1Var = new d1(this.f32372f, this.f32373g, this.f32374h, aVar);
        d1Var.f32371e = obj;
        return d1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, yu.a] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        e1 e1Var;
        yu.a aVar;
        Function1 function1;
        c1 c1Var;
        yu.a aVar2;
        c1 c1Var2;
        e1 e1Var2;
        Throwable th2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        zt.a aVar3 = zt.a.f42823a;
        ?? r12 = this.f32370d;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            e1Var2 = (e1) this.f32368b;
                            aVar2 = this.f32367a;
                            c1Var2 = (c1) this.f32371e;
                            try {
                                ut.n.b(obj);
                                atomicReference2 = e1Var2.f32383a;
                                while (!atomicReference2.compareAndSet(c1Var2, null) && atomicReference2.get() == c1Var2) {
                                }
                                aVar2.a(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = e1Var2.f32383a;
                                while (!atomicReference.compareAndSet(c1Var2, null)) {
                                }
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1 e1Var3 = this.f32369c;
                    function1 = (Function1) this.f32368b;
                    aVar = this.f32367a;
                    c1Var = (c1) this.f32371e;
                    ut.n.b(obj);
                    e1Var = e1Var3;
                } else {
                    ut.n.b(obj);
                    CoroutineContext.Element g10 = ((qu.f0) this.f32371e).H().g(qu.c0.f32192b);
                    Intrinsics.c(g10);
                    c1 c1Var3 = new c1(this.f32372f, (qu.o1) g10);
                    while (true) {
                        e1Var = this.f32373g;
                        AtomicReference atomicReference3 = e1Var.f32383a;
                        c1 c1Var4 = (c1) atomicReference3.get();
                        if (c1Var4 != null && c1Var3.f32348a.compareTo(c1Var4.f32348a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c1Var4, c1Var3)) {
                            if (atomicReference3.get() != c1Var4) {
                                break;
                            }
                        }
                        if (c1Var4 != null) {
                            c1Var4.f32349b.a(null);
                        }
                        this.f32371e = c1Var3;
                        aVar = e1Var.f32384b;
                        this.f32367a = aVar;
                        Function1 function12 = this.f32374h;
                        this.f32368b = function12;
                        this.f32369c = e1Var;
                        this.f32370d = 1;
                        if (aVar.b(null, this) == aVar3) {
                            return aVar3;
                        }
                        function1 = function12;
                        c1Var = c1Var3;
                    }
                }
                this.f32371e = c1Var;
                this.f32367a = aVar2;
                this.f32368b = e1Var;
                this.f32369c = null;
                this.f32370d = 2;
                Object invoke = function1.invoke(this);
                if (invoke == aVar3) {
                    return aVar3;
                }
                e1Var2 = e1Var;
                obj = invoke;
                c1Var2 = c1Var;
                atomicReference2 = e1Var2.f32383a;
                while (!atomicReference2.compareAndSet(c1Var2, null)) {
                }
                aVar2.a(null);
                return obj;
            } catch (Throwable th4) {
                c1Var2 = c1Var;
                e1Var2 = e1Var;
                th2 = th4;
                atomicReference = e1Var2.f32383a;
                while (!atomicReference.compareAndSet(c1Var2, null) && atomicReference.get() == c1Var2) {
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
