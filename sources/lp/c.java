package lp;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public abstract class c extends r {
    private static final long serialVersionUID = 6588350623831699109L;

    @Override // lp.u
    public final g a() {
        g gVar;
        g gVar2 = this.f25062c;
        if (gVar2 == null) {
            f1 f1Var = (f1) this;
            Map map = f1Var.f25046d;
            if (map instanceof NavigableMap) {
                gVar = new j(f1Var, (NavigableMap) f1Var.f25046d);
            } else if (map instanceof SortedMap) {
                gVar = new m(f1Var, (SortedMap) f1Var.f25046d);
            } else {
                gVar = new g(f1Var, f1Var.f25046d);
            }
            gVar2 = gVar;
            this.f25062c = gVar2;
        }
        return gVar2;
    }

    public final boolean c(Double d10, Integer num) {
        Collection collection = (Collection) this.f25046d.get(d10);
        if (collection == null) {
            List list = (List) ((f1) this).f24977f.get();
            if (list.add(num)) {
                this.f25047e++;
                this.f25046d.put(d10, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(num)) {
            this.f25047e++;
            return true;
        }
        return false;
    }

    @Override // lp.u
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
