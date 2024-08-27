package qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v1 extends vu.b {

    /* renamed from: b, reason: collision with root package name */
    public final vu.p f32283b;

    /* renamed from: c, reason: collision with root package name */
    public vu.p f32284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f32285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32286e;

    public v1(vu.p pVar, x1 x1Var, Object obj) {
        this.f32285d = x1Var;
        this.f32286e = obj;
        this.f32283b = pVar;
    }

    @Override // vu.b
    public final void b(Object obj, Object obj2) {
        boolean z10;
        vu.p pVar;
        vu.p pVar2 = (vu.p) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        vu.p pVar3 = this.f32283b;
        if (z10) {
            pVar = pVar3;
        } else {
            pVar = this.f32284c;
        }
        if (pVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vu.p.f38396a;
            while (!atomicReferenceFieldUpdater.compareAndSet(pVar2, this, pVar)) {
                if (atomicReferenceFieldUpdater.get(pVar2) != this) {
                    return;
                }
            }
            if (z10) {
                vu.p pVar4 = this.f32284c;
                Intrinsics.c(pVar4);
                pVar3.g(pVar4);
            }
        }
    }

    @Override // vu.b
    public final kp.g c(Object obj) {
        if (this.f32285d.P() == this.f32286e) {
            return null;
        }
        return vu.o.f38395a;
    }
}
