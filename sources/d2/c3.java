package d2;

import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1.d f13389a = new m1.d(s0.g.f34069a, s0.g.f34069a, 10.0f, 10.0f);

    public static final t.t a(h2.p pVar) {
        h2.o a10 = pVar.a();
        t.t tVar = t.k.f34874a;
        t.t tVar2 = new t.t();
        androidx.compose.ui.node.a aVar = a10.f17861c;
        if (aVar.D() && aVar.C()) {
            m1.d e10 = a10.e();
            b(new Region(Math.round(e10.f27239a), Math.round(e10.f27240b), Math.round(e10.f27241c), Math.round(e10.f27242d)), a10, tVar2, a10, new Region());
        }
        return tVar2;
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, m1.b] */
    public static final void b(Region region, h2.o oVar, t.t tVar, h2.o oVar2, Region region2) {
        boolean z10;
        boolean z11;
        m1.d dVar;
        androidx.compose.ui.node.a aVar;
        c2.n o10;
        boolean D = oVar2.f17861c.D();
        androidx.compose.ui.node.a aVar2 = oVar2.f17861c;
        if (D && aVar2.C()) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isEmpty = region.isEmpty();
        int i10 = oVar.f17865g;
        int i11 = oVar2.f17865g;
        if (!isEmpty || i11 == i10) {
            if (z10 && !oVar2.f17863e) {
                return;
            }
            h2.j jVar = oVar2.f17862d;
            boolean z12 = jVar.f17851b;
            c2.n nVar = oVar2.f17859a;
            if (z12 && (o10 = w0.o(aVar2)) != null) {
                nVar = o10;
            }
            g1.n nVar2 = ((g1.n) nVar).f16405a;
            Object obj = jVar.f17850a.get(h2.i.f17826b);
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = nVar2.f16405a.f16417m;
            m1.d dVar2 = m1.d.f27238e;
            if (z13) {
                if (!z11) {
                    c2.i1 x10 = c2.g.x(nVar2, 8);
                    dVar2 = androidx.compose.ui.layout.a.e(x10).i(x10, true);
                } else {
                    c2.i1 x11 = c2.g.x(nVar2, 8);
                    if (x11.W0().f16417m) {
                        a2.u e10 = androidx.compose.ui.layout.a.e(x11);
                        m1.b bVar = x11.f7734x;
                        m1.b bVar2 = bVar;
                        if (bVar == null) {
                            ?? obj2 = new Object();
                            obj2.f27229a = s0.g.f34069a;
                            obj2.f27230b = s0.g.f34069a;
                            obj2.f27231c = s0.g.f34069a;
                            obj2.f27232d = s0.g.f34069a;
                            x11.f7734x = obj2;
                            bVar2 = obj2;
                        }
                        long M0 = x11.M0(x11.V0());
                        bVar2.f27229a = -m1.f.e(M0);
                        bVar2.f27230b = -m1.f.c(M0);
                        bVar2.f27231c = m1.f.e(M0) + x11.d0();
                        bVar2.f27232d = m1.f.c(M0) + x11.b0();
                        c2.i1 i1Var = x11;
                        while (true) {
                            if (i1Var != e10) {
                                i1Var.i1(bVar2, false, true);
                                if (bVar2.b()) {
                                    break;
                                }
                                c2.i1 i1Var2 = i1Var.f7723m;
                                Intrinsics.c(i1Var2);
                                i1Var = i1Var2;
                            } else {
                                dVar2 = new m1.d(bVar2.f27229a, bVar2.f27230b, bVar2.f27231c, bVar2.f27232d);
                                break;
                            }
                        }
                    }
                }
            }
            int round = Math.round(dVar2.f27239a);
            int round2 = Math.round(dVar2.f27240b);
            int round3 = Math.round(dVar2.f27241c);
            int round4 = Math.round(dVar2.f27242d);
            region2.set(round, round2, round3, round4);
            if (i11 == i10) {
                i11 = -1;
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                tVar.k(i11, new b3(oVar2, region2.getBounds()));
                List g10 = h2.o.g(oVar2, true, 4);
                for (int size = g10.size() - 1; -1 < size; size--) {
                    b(region, oVar, tVar, (h2.o) g10.get(size), region2);
                }
                if (e(oVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                    return;
                }
                return;
            }
            if (oVar2.f17863e) {
                h2.o i12 = oVar2.i();
                if (i12 != null && (aVar = i12.f17861c) != null && aVar.D()) {
                    dVar = i12.e();
                } else {
                    dVar = f13389a;
                }
                tVar.k(i11, new b3(oVar2, new Rect(Math.round(dVar.f27239a), Math.round(dVar.f27240b), Math.round(dVar.f27241c), Math.round(dVar.f27242d))));
                return;
            }
            if (i11 == -1) {
                tVar.k(i11, new b3(oVar2, region2.getBounds()));
            }
        }
    }

    public static final j2.e0 c(h2.j jVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        h2.u uVar = h2.i.f17825a;
        h2.a aVar = (h2.a) hl.f.m0(jVar, h2.i.f17825a);
        if (aVar == null || (function1 = (Function1) aVar.f17810b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (j2.e0) arrayList.get(0);
    }

    public static final boolean d(androidx.compose.ui.node.a aVar, androidx.compose.ui.node.a aVar2) {
        androidx.compose.ui.node.a q10 = aVar2.q();
        if (q10 == null) {
            return false;
        }
        if (!Intrinsics.a(q10, aVar) && !d(aVar, q10)) {
            return false;
        }
        return true;
    }

    public static final boolean e(h2.o oVar) {
        if (f(oVar)) {
            h2.j jVar = oVar.f17862d;
            if (!jVar.f17851b) {
                Set keySet = jVar.f17850a.keySet();
                if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        if (((h2.u) it.next()).f17911c) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean f(h2.o oVar) {
        c2.i1 c10 = oVar.c();
        if (c10 == null || !c10.c1()) {
            if (!oVar.f17862d.f17850a.containsKey(h2.r.f17895o)) {
                return true;
            }
        }
        return false;
    }

    public static final y2.k g(m1 m1Var, int i10) {
        Object obj;
        Iterator<T> it = m1Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((androidx.compose.ui.node.a) ((Map.Entry) obj).getKey()).f1401b == i10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (y2.k) entry.getValue();
    }

    public static final String h(int i10) {
        if (h2.g.a(i10, 0)) {
            return "android.widget.Button";
        }
        if (h2.g.a(i10, 1)) {
            return "android.widget.CheckBox";
        }
        if (h2.g.a(i10, 3)) {
            return "android.widget.RadioButton";
        }
        if (h2.g.a(i10, 5)) {
            return "android.widget.ImageView";
        }
        if (h2.g.a(i10, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
