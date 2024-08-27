package k3;

import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: m, reason: collision with root package name */
    public int f22011m;

    public h(q qVar) {
        super(qVar);
        if (qVar instanceof l) {
            this.f22003e = 2;
        } else {
            this.f22003e = 3;
        }
    }

    @Override // k3.g
    public final void d(int i10) {
        if (this.f22008j) {
            return;
        }
        this.f22008j = true;
        this.f22005g = i10;
        Iterator it = this.f22009k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.a(eVar);
        }
    }
}
