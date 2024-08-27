package h2;

import c2.e1;
import c2.i1;
import d2.w0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;
import vt.g0;
import vt.i0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final g1.n f17859a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17860b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.node.a f17861c;

    /* renamed from: d, reason: collision with root package name */
    public final j f17862d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17863e;

    /* renamed from: f, reason: collision with root package name */
    public o f17864f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17865g;

    public o(g1.n nVar, boolean z10, androidx.compose.ui.node.a aVar, j jVar) {
        this.f17859a = nVar;
        this.f17860b = z10;
        this.f17861c = aVar;
        this.f17862d = jVar;
        this.f17865g = aVar.f1401b;
    }

    public static List g(o oVar, boolean z10, int i10) {
        boolean z11;
        if ((i10 & 1) != 0) {
            z11 = !oVar.f17860b;
        } else {
            z11 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if (!z11 && oVar.f17862d.f17852c) {
            return i0.f38321a;
        }
        if (oVar.l()) {
            ArrayList arrayList = new ArrayList();
            oVar.d(arrayList);
            return arrayList;
        }
        return oVar.n(z10, false);
    }

    public final o a(g gVar, Function1 function1) {
        int i10;
        j jVar = new j();
        jVar.f17851b = false;
        jVar.f17852c = false;
        function1.invoke(jVar);
        m mVar = new m(function1);
        int i11 = this.f17865g;
        if (gVar != null) {
            i10 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        } else {
            i10 = 2000000000;
        }
        o oVar = new o(mVar, false, new androidx.compose.ui.node.a(i11 + i10, true), jVar);
        oVar.f17863e = true;
        oVar.f17864f = this;
        return oVar;
    }

    public final void b(androidx.compose.ui.node.a aVar, ArrayList arrayList, boolean z10) {
        v0.h t10 = aVar.t();
        int i10 = t10.f37655c;
        if (i10 > 0) {
            Object[] objArr = t10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.C() && (z10 || !aVar2.F)) {
                    if (aVar2.f1422w.d(8)) {
                        arrayList.add(w0.a(aVar2, this.f17860b));
                    } else {
                        b(aVar2, arrayList, z10);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final i1 c() {
        if (this.f17863e) {
            o i10 = i();
            if (i10 != null) {
                return i10.c();
            }
            return null;
        }
        c2.n o10 = w0.o(this.f17861c);
        if (o10 == null) {
            o10 = this.f17859a;
        }
        return c2.g.x(o10, 8);
    }

    public final void d(List list) {
        List n10 = n(false, false);
        int size = n10.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) n10.get(i10);
            if (oVar.l()) {
                list.add(oVar);
            } else if (!oVar.f17862d.f17852c) {
                oVar.d(list);
            }
        }
    }

    public final m1.d e() {
        m1.d i10;
        i1 c10 = c();
        if (c10 != null) {
            if (!c10.W0().f16417m) {
                c10 = null;
            }
            if (c10 != null && (i10 = androidx.compose.ui.layout.a.e(c10).i(c10, true)) != null) {
                return i10;
            }
        }
        return m1.d.f27238e;
    }

    public final m1.d f() {
        i1 c10 = c();
        if (c10 != null) {
            if (!c10.W0().f16417m) {
                c10 = null;
            }
            if (c10 != null) {
                return androidx.compose.ui.layout.a.d(c10);
            }
        }
        return m1.d.f27238e;
    }

    public final j h() {
        boolean l10 = l();
        j jVar = this.f17862d;
        if (l10) {
            jVar.getClass();
            j jVar2 = new j();
            jVar2.f17851b = jVar.f17851b;
            jVar2.f17852c = jVar.f17852c;
            jVar2.f17850a.putAll(jVar.f17850a);
            m(jVar2);
            return jVar2;
        }
        return jVar;
    }

    public final o i() {
        androidx.compose.ui.node.a aVar;
        o oVar = this.f17864f;
        if (oVar != null) {
            return oVar;
        }
        androidx.compose.ui.node.a aVar2 = this.f17861c;
        boolean z10 = this.f17860b;
        if (z10) {
            aVar = w0.k(aVar2, n.f17856c);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = w0.k(aVar2, n.f17857d);
        }
        if (aVar == null) {
            return null;
        }
        return w0.a(aVar, z10);
    }

    public final List j() {
        return g(this, true, 4);
    }

    public final j k() {
        return this.f17862d;
    }

    public final boolean l() {
        if (this.f17860b && this.f17862d.f17851b) {
            return true;
        }
        return false;
    }

    public final void m(j jVar) {
        if (!this.f17862d.f17852c) {
            List n10 = n(false, false);
            int size = n10.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) n10.get(i10);
                if (!oVar.l()) {
                    for (Map.Entry entry : oVar.f17862d.f17850a.entrySet()) {
                        u uVar = (u) entry.getKey();
                        Object value = entry.getValue();
                        LinkedHashMap linkedHashMap = jVar.f17850a;
                        Object obj = linkedHashMap.get(uVar);
                        Intrinsics.d(uVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = uVar.f17910b.invoke(obj, value);
                        if (invoke != null) {
                            linkedHashMap.put(uVar, invoke);
                        }
                    }
                    oVar.m(jVar);
                }
            }
        }
    }

    public final List n(boolean z10, boolean z11) {
        String str;
        if (this.f17863e) {
            return i0.f38321a;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f17861c, arrayList, z11);
        if (z10) {
            u uVar = r.f17901u;
            j jVar = this.f17862d;
            g gVar = (g) hl.f.m0(jVar, uVar);
            int i10 = 1;
            if (gVar != null && jVar.f17851b && (!arrayList.isEmpty())) {
                arrayList.add(a(gVar, new e1(gVar, 5)));
            }
            u uVar2 = r.f17882b;
            LinkedHashMap linkedHashMap = jVar.f17850a;
            if (linkedHashMap.containsKey(uVar2) && (!arrayList.isEmpty()) && jVar.f17851b) {
                Object obj = linkedHashMap.get(uVar2);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null) {
                    str = (String) g0.w(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, a(null, new x.i1(str, i10)));
                }
            }
        }
        return arrayList;
    }
}
