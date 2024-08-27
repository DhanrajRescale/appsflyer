package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import c2.e1;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import d1.p;
import d2.k1;
import d2.m0;
import d2.q;
import d2.s;
import d2.w1;
import d2.x0;
import d2.y0;
import d2.z0;
import dp.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.o0;
import o7.d;
import o7.f;
import org.jetbrains.annotations.NotNull;
import t0.a0;
import t0.g1;
import t0.m;
import t0.m3;
import t0.n;
import t0.o3;
import t0.p0;
import t0.r;
import t0.t;
import t0.u1;
import t0.v1;
import t0.x1;
import v.e;
import w.t1;
import x.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lt0/u1;", "Landroidx/lifecycle/t;", "e", "Lt0/u1;", "getLocalLifecycleOwner", "()Lt0/u1;", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f1427a = new p0(o3.f35116a, m0.f13523e);

    /* renamed from: b, reason: collision with root package name */
    public static final m3 f1428b = new a0(m0.f13524f);

    /* renamed from: c, reason: collision with root package name */
    public static final m3 f1429c = new a0(m0.f13525g);

    /* renamed from: d, reason: collision with root package name */
    public static final m3 f1430d = new a0(m0.f13527i);

    /* renamed from: e, reason: collision with root package name */
    public static final m3 f1431e = new a0(m0.f13526h);

    /* renamed from: f, reason: collision with root package name */
    public static final m3 f1432f = new a0(m0.f13528j);

    /* renamed from: g, reason: collision with root package name */
    public static final m3 f1433g = new a0(m0.f13529k);

    public static final void a(d2.a0 a0Var, Function2 function2, n nVar, int i10) {
        int i11;
        boolean z10;
        Object obj;
        String str;
        boolean z11;
        int i12;
        int i13;
        r rVar = (r) nVar;
        rVar.c0(1396852028);
        if ((i10 & 6) == 0) {
            if (rVar.j(a0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && rVar.G()) {
            rVar.V();
        } else {
            Context context = a0Var.getContext();
            rVar.b0(-340662705);
            Object Q = rVar.Q();
            Object obj2 = m.f35080a;
            Object obj3 = Q;
            if (Q == obj2) {
                Object n0 = t.n0(new Configuration(context.getResources().getConfiguration()), o3.f35116a);
                rVar.k0(n0);
                obj3 = n0;
            }
            g1 g1Var = (g1) obj3;
            Object h10 = e.h(rVar, false, -340662576);
            Object obj4 = h10;
            if (h10 == obj2) {
                obj4 = a.i(g1Var, 2, rVar);
            }
            rVar.s(false);
            a0Var.setConfigurationChangeObserver((Function1) obj4);
            rVar.b0(-340662516);
            Object Q2 = rVar.Q();
            Object obj5 = Q2;
            if (Q2 == obj2) {
                Object k1Var = new k1(context);
                rVar.k0(k1Var);
                obj5 = k1Var;
            }
            k1 k1Var2 = (k1) obj5;
            rVar.s(false);
            q viewTreeOwners = a0Var.getViewTreeOwners();
            if (viewTreeOwners != null) {
                rVar.b0(-340662276);
                Object Q3 = rVar.Q();
                f fVar = viewTreeOwners.f13570b;
                if (Q3 == obj2) {
                    Object parent = a0Var.getParent();
                    Intrinsics.d(parent, "null cannot be cast to non-null type android.view.View");
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    LinkedHashMap linkedHashMap = null;
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    String str2 = d1.n.class.getSimpleName() + ':' + str;
                    d savedStateRegistry = fVar.getSavedStateRegistry();
                    Bundle a10 = savedStateRegistry.a(str2);
                    if (a10 != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String str3 : a10.keySet()) {
                            ArrayList parcelableArrayList = a10.getParcelableArrayList(str3);
                            Intrinsics.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                            linkedHashMap.put(str3, parcelableArrayList);
                            a10 = a10;
                        }
                    }
                    s sVar = s.f13611i;
                    m3 m3Var = d1.q.f13288a;
                    p pVar = new p(linkedHashMap, sVar);
                    try {
                        z11 = true;
                        savedStateRegistry.c(str2, new androidx.activity.d(pVar, true ? 1 : 0));
                    } catch (IllegalArgumentException unused) {
                        z11 = false;
                    }
                    Object w1Var = new w1(pVar, new i0.p0(z11, savedStateRegistry, str2, 2));
                    rVar.k0(w1Var);
                    Q3 = w1Var;
                }
                w1 w1Var2 = (w1) Q3;
                rVar.s(false);
                Unit unit = Unit.f23355a;
                rVar.b0(-340662146);
                boolean j10 = rVar.j(w1Var2);
                Object Q4 = rVar.Q();
                Object obj6 = Q4;
                if (j10 || Q4 == obj2) {
                    Object e1Var = new e1(w1Var2, 2);
                    rVar.k0(e1Var);
                    obj6 = e1Var;
                }
                rVar.s(false);
                t.c(unit, (Function1) obj6, rVar);
                Configuration configuration = (Configuration) g1Var.getValue();
                Object g10 = e.g(rVar, -485908294, 2099959633);
                Object obj7 = g10;
                if (g10 == obj2) {
                    Object dVar = new g2.d();
                    rVar.k0(dVar);
                    obj7 = dVar;
                }
                g2.d dVar2 = (g2.d) obj7;
                Object h11 = e.h(rVar, false, 2099959711);
                Object obj8 = h11;
                if (h11 == obj2) {
                    Configuration configuration2 = new Configuration();
                    if (configuration != null) {
                        configuration2.setTo(configuration);
                    }
                    rVar.k0(configuration2);
                    obj8 = configuration2;
                }
                Configuration configuration3 = (Configuration) obj8;
                Object h12 = e.h(rVar, false, 2099959820);
                Object obj9 = h12;
                if (h12 == obj2) {
                    Object x0Var = new x0(configuration3, dVar2);
                    rVar.k0(x0Var);
                    obj9 = x0Var;
                }
                x0 x0Var2 = (x0) obj9;
                rVar.s(false);
                rVar.b0(2099960417);
                boolean j11 = rVar.j(context);
                Object Q5 = rVar.Q();
                Object obj10 = Q5;
                if (j11 || Q5 == obj2) {
                    Object zVar = new z(29, context, x0Var2);
                    rVar.k0(zVar);
                    obj10 = zVar;
                }
                rVar.s(false);
                t.c(dVar2, (Function1) obj10, rVar);
                rVar.s(false);
                rVar.b0(-1348507246);
                rVar.b0(36924069);
                Object Q6 = rVar.Q();
                Object obj11 = Q6;
                if (Q6 == obj2) {
                    Object eVar = new g2.e();
                    rVar.k0(eVar);
                    obj11 = eVar;
                }
                g2.e eVar2 = (g2.e) obj11;
                Object h13 = e.h(rVar, false, 36924120);
                Object obj12 = h13;
                if (h13 == obj2) {
                    Object z0Var = new z0(eVar2);
                    rVar.k0(z0Var);
                    obj12 = z0Var;
                }
                z0 z0Var2 = (z0) obj12;
                rVar.s(false);
                rVar.b0(36924557);
                boolean j12 = rVar.j(context);
                Object Q7 = rVar.Q();
                if (!j12 && Q7 != obj2) {
                    z10 = false;
                    obj = Q7;
                } else {
                    z10 = false;
                    Object y0Var = new y0(false ? 1 : 0, context, z0Var2);
                    rVar.k0(y0Var);
                    obj = y0Var;
                }
                rVar.s(z10);
                t.c(eVar2, (Function1) obj, rVar);
                rVar.s(z10);
                b.q(new v1[]{f1427a.b((Configuration) g1Var.getValue()), f1428b.b(context), f1431e.b(viewTreeOwners.f13569a), f1432f.b(fVar), d1.q.f13288a.b(w1Var2), f1433g.b(a0Var.getView()), f1429c.b(dVar2), f1430d.b(eVar2)}, b1.d.b(rVar, 1471621628, new o0(3, a0Var, k1Var2, function2)), rVar, 48);
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(a0Var, function2, i10, 8);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final m3 c() {
        return f1428b;
    }

    @NotNull
    public static final u1 getLocalLifecycleOwner() {
        return f1431e;
    }
}
