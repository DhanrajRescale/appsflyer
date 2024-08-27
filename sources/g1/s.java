package g1;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qu.f0;
import qu.o1;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16422a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f16424c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f16425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f16426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AtomicReference atomicReference, yt.a aVar, Function1 function1, Function2 function2) {
        super(2, aVar);
        this.f16424c = function1;
        this.f16425d = atomicReference;
        this.f16426e = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        s sVar = new s(this.f16425d, aVar, this.f16424c, this.f16426e);
        sVar.f16423b = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        o1 o1Var;
        r rVar2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16422a;
        AtomicReference atomicReference = this.f16425d;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        rVar2 = (r) this.f16423b;
                        try {
                            ut.n.b(obj);
                            while (!atomicReference.compareAndSet(rVar2, null) && atomicReference.get() == rVar2) {
                            }
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            while (!atomicReference.compareAndSet(rVar2, null)) {
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) this.f16423b;
                ut.n.b(obj);
            } else {
                ut.n.b(obj);
                f0 f0Var = (f0) this.f16423b;
                rVar = new r(hl.f.j0(f0Var.H()), this.f16424c.invoke(f0Var));
                r rVar3 = (r) atomicReference.getAndSet(rVar);
                if (rVar3 != null && (o1Var = rVar3.f16420a) != null) {
                    this.f16423b = rVar;
                    this.f16422a = 1;
                    o1Var.a(null);
                    Object S = o1Var.S(this);
                    if (S != aVar) {
                        S = Unit.f23355a;
                    }
                    if (S == aVar) {
                        return aVar;
                    }
                }
            }
            Function2 function2 = this.f16426e;
            Object obj2 = rVar.f16421b;
            this.f16423b = rVar;
            this.f16422a = 2;
            obj = function2.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
            rVar2 = rVar;
            while (!atomicReference.compareAndSet(rVar2, null)) {
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            rVar2 = rVar;
            while (!atomicReference.compareAndSet(rVar2, null) && atomicReference.get() == rVar2) {
            }
            throw th;
        }
    }
}
