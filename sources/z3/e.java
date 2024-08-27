package z3;

import java.util.ArrayList;
import t.j0;

/* loaded from: classes.dex */
public final class e implements c4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41991b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f41990a = i10;
        this.f41991b = obj;
    }

    public final void a(f fVar) {
        switch (this.f41990a) {
            case 0:
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((tr.e) this.f41991b).A(fVar);
                return;
            default:
                synchronized (g.f41996c) {
                    try {
                        j0 j0Var = g.f41997d;
                        ArrayList arrayList = (ArrayList) j0Var.get((String) this.f41991b);
                        if (arrayList != null) {
                            j0Var.remove((String) this.f41991b);
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ((c4.a) arrayList.get(i10)).b(fVar);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // c4.a
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f41990a) {
            case 0:
                a((f) obj);
                return;
            default:
                a((f) obj);
                return;
        }
    }
}
