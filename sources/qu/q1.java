package qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class q1 extends x1 implements r {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(o1 o1Var) {
        super(true);
        n nVar;
        n nVar2;
        boolean z10 = true;
        V(o1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x1.f32297b;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        if (mVar instanceof n) {
            nVar = (n) mVar;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            x1 k10 = nVar.k();
            while (!k10.M()) {
                m mVar2 = (m) atomicReferenceFieldUpdater.get(k10);
                if (mVar2 instanceof n) {
                    nVar2 = (n) mVar2;
                } else {
                    nVar2 = null;
                }
                if (nVar2 != null) {
                    k10 = nVar2.k();
                }
            }
            this.f32253c = z10;
        }
        z10 = false;
        this.f32253c = z10;
    }

    @Override // qu.x1
    public final boolean M() {
        return this.f32253c;
    }

    @Override // qu.x1
    public final boolean N() {
        return true;
    }
}
