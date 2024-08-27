package qu;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f32237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f32238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f32238b = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        m1 m1Var = new m1(this.f32238b, aVar);
        m1Var.f32237a = obj;
        return m1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        t0 j10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        CoroutineContext H = ((f0) this.f32237a).H();
        Function0 function0 = this.f32238b;
        try {
            o1 j02 = hl.f.j0(H);
            m2 m2Var = new m2(j02);
            if (j02 instanceof x1) {
                j10 = ((x1) j02).W(true, true, m2Var);
            } else {
                j10 = j02.j(true, true, new i0.g2(m2Var, 4));
            }
            m2Var.f32241b = j10;
            try {
                do {
                    atomicIntegerFieldUpdater = m2.f32239c;
                    i10 = atomicIntegerFieldUpdater.get(m2Var);
                    if (i10 != 0) {
                        if (i10 != 2 && i10 != 3) {
                            m2.b(i10);
                            throw null;
                        }
                    }
                    return function0.mo2invoke();
                } while (!atomicIntegerFieldUpdater.compareAndSet(m2Var, i10, 0));
                return function0.mo2invoke();
            } finally {
                m2Var.a();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
