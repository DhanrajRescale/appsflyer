package x1;

import java.util.List;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public a2.u f39827a;

    /* renamed from: b, reason: collision with root package name */
    public int f39828b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f39829c;

    public b0(c0 c0Var) {
        this.f39829c = c0Var;
    }

    public final void a(k kVar) {
        List list = kVar.f39870a;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            c0 c0Var = this.f39829c;
            if (i11 < size) {
                if (((t) list.get(i11)).b()) {
                    if (this.f39828b == 2) {
                        a2.u uVar = this.f39827a;
                        if (uVar != null) {
                            t0.t.E0(kVar, uVar.M(m1.c.f27233b), new a0(c0Var, i10), true);
                        } else {
                            throw new IllegalStateException("layoutCoordinates not set".toString());
                        }
                    }
                    this.f39828b = 3;
                    return;
                }
                i11++;
            } else {
                a2.u uVar2 = this.f39827a;
                if (uVar2 != null) {
                    t0.t.E0(kVar, uVar2.M(m1.c.f27233b), new x.z(27, this, c0Var), false);
                    if (this.f39828b == 2) {
                        int size2 = list.size();
                        while (i10 < size2) {
                            ((t) list.get(i10)).a();
                            i10++;
                        }
                        f fVar = kVar.f39871b;
                        if (fVar != null) {
                            fVar.f39846c = !c0Var.f39834d;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("layoutCoordinates not set".toString());
            }
        }
    }
}
