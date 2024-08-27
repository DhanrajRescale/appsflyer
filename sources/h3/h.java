package h3;

import g3.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends c {
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
                kVar.b(it.next()).h();
            }
        }
        Iterator it2 = arrayList.iterator();
        g3.b bVar = null;
        g3.b bVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            g3.b b10 = kVar.b(next);
            if (bVar2 == null) {
                Object obj = this.N;
                if (obj != null) {
                    b10.p(obj);
                    b10.l(this.f16457l).n(this.f16463r);
                } else {
                    Object obj2 = this.O;
                    if (obj2 != null) {
                        b10.f16455j0 = 6;
                        b10.O = obj2;
                        b10.l(this.f16457l).n(this.f16463r);
                    } else {
                        Object obj3 = this.J;
                        if (obj3 != null) {
                            b10.p(obj3);
                            b10.l(this.f16454j).n(this.f16461p);
                        } else {
                            Object obj4 = this.K;
                            if (obj4 != null) {
                                b10.f16455j0 = 6;
                                b10.O = obj4;
                                b10.l(this.f16454j).n(this.f16461p);
                            } else {
                                String obj5 = b10.f16436a.toString();
                                b10.p(k.f16503k);
                                b10.m(Float.valueOf(x(obj5))).o(Float.valueOf(w(obj5)));
                            }
                        }
                    }
                }
                bVar2 = b10;
            }
            if (bVar != null) {
                String obj6 = bVar.f16436a.toString();
                String obj7 = b10.f16436a.toString();
                Object obj8 = b10.f16436a;
                bVar.f16455j0 = 7;
                bVar.P = obj8;
                bVar.m(Float.valueOf(v(obj6))).o(Float.valueOf(u(obj6)));
                Object obj9 = bVar.f16436a;
                b10.f16455j0 = 6;
                b10.O = obj9;
                b10.m(Float.valueOf(x(obj7))).o(Float.valueOf(w(obj7)));
            }
            String obj10 = next.toString();
            HashMap hashMap = this.f17915o0;
            if (hashMap.containsKey(obj10)) {
                f10 = ((Float) hashMap.get(obj10)).floatValue();
            } else {
                f10 = -1.0f;
            }
            if (f10 != -1.0f) {
                b10.f16446f = f10;
            }
            bVar = b10;
        }
        if (bVar != null) {
            Object obj11 = this.P;
            if (obj11 != null) {
                bVar.f16455j0 = 7;
                bVar.P = obj11;
                bVar.l(this.f16458m).n(this.f16464s);
            } else {
                Object obj12 = this.Q;
                if (obj12 != null) {
                    bVar.j(obj12);
                    bVar.l(this.f16458m).n(this.f16464s);
                } else {
                    Object obj13 = this.L;
                    if (obj13 != null) {
                        bVar.f16455j0 = 7;
                        bVar.P = obj13;
                        bVar.l(this.f16456k).n(this.f16462q);
                    } else {
                        Object obj14 = this.M;
                        if (obj14 != null) {
                            bVar.j(obj14);
                            bVar.l(this.f16456k).n(this.f16462q);
                        } else {
                            String obj15 = bVar.f16436a.toString();
                            bVar.j(k.f16503k);
                            bVar.m(Float.valueOf(v(obj15))).o(Float.valueOf(u(obj15)));
                        }
                    }
                }
            }
        }
        if (bVar2 == null) {
            return;
        }
        float f11 = this.n0;
        if (f11 != 0.5f) {
            bVar2.f16450h = f11;
        }
        int ordinal = this.f17920t0.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    bVar2.f16442d = 2;
                    return;
                }
                return;
            }
            bVar2.f16442d = 1;
            return;
        }
        bVar2.f16442d = 0;
    }
}
