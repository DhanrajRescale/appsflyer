package h3;

import g3.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends c {
    @Override // g3.g, g3.b, g3.h
    public final void a() {
        k kVar;
        float f10;
        ArrayList arrayList = this.f16495m0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            kVar = this.f16493k0;
            if (!hasNext) {
                break;
            } else {
                kVar.b(it.next()).i();
            }
        }
        Iterator it2 = arrayList.iterator();
        g3.b bVar = null;
        g3.b bVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            g3.b b10 = kVar.b(next);
            if (bVar2 == null) {
                Object obj = this.R;
                if (obj != null) {
                    b10.q(obj);
                    b10.l(this.f16459n).n(this.f16465t);
                } else {
                    Object obj2 = this.S;
                    if (obj2 != null) {
                        b10.f16455j0 = 10;
                        b10.S = obj2;
                        b10.l(this.f16459n).n(this.f16465t);
                    } else {
                        String obj3 = b10.f16436a.toString();
                        b10.q(k.f16503k);
                        b10.m(Float.valueOf(x(obj3))).o(Float.valueOf(w(obj3)));
                    }
                }
                bVar2 = b10;
            }
            if (bVar != null) {
                String obj4 = bVar.f16436a.toString();
                String obj5 = b10.f16436a.toString();
                Object obj6 = b10.f16436a;
                bVar.f16455j0 = 12;
                bVar.U = obj6;
                bVar.m(Float.valueOf(v(obj4))).o(Float.valueOf(u(obj4)));
                Object obj7 = bVar.f16436a;
                b10.f16455j0 = 10;
                b10.S = obj7;
                b10.m(Float.valueOf(x(obj5))).o(Float.valueOf(w(obj5)));
            }
            String obj8 = next.toString();
            HashMap hashMap = this.f17915o0;
            if (hashMap.containsKey(obj8)) {
                f10 = ((Float) hashMap.get(obj8)).floatValue();
            } else {
                f10 = -1.0f;
            }
            if (f10 != -1.0f) {
                b10.f16448g = f10;
            }
            bVar = b10;
        }
        if (bVar != null) {
            Object obj9 = this.U;
            if (obj9 != null) {
                bVar.f16455j0 = 12;
                bVar.U = obj9;
                bVar.l(this.f16460o).n(this.f16466u);
            } else {
                Object obj10 = this.V;
                if (obj10 != null) {
                    bVar.f(obj10);
                    bVar.l(this.f16460o).n(this.f16466u);
                } else {
                    String obj11 = bVar.f16436a.toString();
                    bVar.f(k.f16503k);
                    bVar.m(Float.valueOf(v(obj11))).o(Float.valueOf(u(obj11)));
                }
            }
        }
        if (bVar2 == null) {
            return;
        }
        float f11 = this.n0;
        if (f11 != 0.5f) {
            bVar2.f16452i = f11;
        }
        int ordinal = this.f17920t0.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    bVar2.f16444e = 2;
                    return;
                }
                return;
            }
            bVar2.f16444e = 1;
            return;
        }
        bVar2.f16444e = 0;
    }
}
