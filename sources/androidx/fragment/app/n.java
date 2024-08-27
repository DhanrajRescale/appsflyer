package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1769a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1770b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1771c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1772d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1773e;

    public n(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f1769a = container;
        this.f1770b = new ArrayList();
        this.f1771c = new ArrayList();
    }

    public static void a(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (d4.s1.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    a(arrayList, child);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void i(t.f fVar, View view) {
        WeakHashMap weakHashMap = d4.n1.f13788a;
        String k10 = d4.b1.k(view);
        if (k10 != null) {
            fVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    i(fVar, child);
                }
            }
        }
    }

    public static final n l(ViewGroup container, d1 fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        z factory = fragmentManager.H();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof n) {
            return (n) tag;
        }
        factory.getClass();
        n nVar = new n(container);
        Intrinsics.checkNotNullExpressionValue(nVar, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, nVar);
        return nVar;
    }

    public static void n(t.f fVar, Collection collection) {
        Set entries = fVar.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        x0.b predicate = new x0.b(3, collection);
        Intrinsics.checkNotNullParameter(entries, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        vt.d0.o(entries, predicate, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [y3.g, java.lang.Object] */
    public final void b(e2 e2Var, d2 d2Var, l1 l1Var) {
        synchronized (this.f1770b) {
            ?? obj = new Object();
            g0 g0Var = l1Var.f1754c;
            Intrinsics.checkNotNullExpressionValue(g0Var, "fragmentStateManager.fragment");
            f2 j10 = j(g0Var);
            if (j10 != null) {
                j10.c(e2Var, d2Var);
                return;
            }
            final c2 c2Var = new c2(e2Var, d2Var, l1Var, obj);
            this.f1770b.add(c2Var);
            final int i10 = 0;
            Runnable listener = new Runnable(this) { // from class: androidx.fragment.app.b2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f1603b;

                {
                    this.f1603b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    c2 operation = c2Var;
                    n this$0 = this.f1603b;
                    switch (i11) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            if (this$0.f1770b.contains(operation)) {
                                e2 e2Var2 = operation.f1696a;
                                View view = operation.f1698c.mView;
                                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                e2Var2.a(view);
                                return;
                            }
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            this$0.f1770b.remove(operation);
                            this$0.f1771c.remove(operation);
                            return;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener, "listener");
            c2Var.f1699d.add(listener);
            final int i11 = 1;
            Runnable listener2 = new Runnable(this) { // from class: androidx.fragment.app.b2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f1603b;

                {
                    this.f1603b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i11;
                    c2 operation = c2Var;
                    n this$0 = this.f1603b;
                    switch (i112) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            if (this$0.f1770b.contains(operation)) {
                                e2 e2Var2 = operation.f1696a;
                                View view = operation.f1698c.mView;
                                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                e2Var2.a(view);
                                return;
                            }
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            this$0.f1770b.remove(operation);
                            this$0.f1771c.remove(operation);
                            return;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener2, "listener");
            c2Var.f1699d.add(listener2);
            Unit unit = Unit.f23355a;
        }
    }

    public final void c(e2 finalState, l1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f1754c);
        }
        b(finalState, d2.f1671b, fragmentStateManager);
    }

    public final void d(l1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.f1754c);
        }
        b(e2.f1680c, d2.f1670a, fragmentStateManager);
    }

    public final void e(l1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.f1754c);
        }
        b(e2.f1678a, d2.f1672c, fragmentStateManager);
    }

    public final void f(l1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.f1754c);
        }
        b(e2.f1679b, d2.f1670a, fragmentStateManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75, types: [y3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24, types: [t.j0, java.lang.Object, t.f] */
    /* JADX WARN: Type inference failed for: r15v9, types: [y3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [t.j0, java.lang.Object, t.f] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r5v16, types: [t.j0, java.lang.Object, t.f] */
    public final void g(ArrayList operations, final boolean z10) {
        e2 e2Var;
        String str;
        Object obj;
        f2 f2Var;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        e2 e2Var2;
        LinkedHashMap linkedHashMap;
        f2 f2Var2;
        String str3;
        f2 f2Var3;
        f2 f2Var4;
        f2 f2Var5;
        boolean z11;
        String str4;
        String str5;
        boolean z12;
        View view;
        View view2;
        ArrayList arrayList3;
        String str6;
        LinkedHashMap linkedHashMap2;
        Rect rect;
        Pair pair;
        Object obj2;
        View view3;
        boolean z13;
        f2 f2Var6;
        boolean z14;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            e2Var = e2.f1679b;
            str = "operation.fragment.mView";
            if (hasNext) {
                obj = it.next();
                f2 f2Var7 = (f2) obj;
                View view4 = f2Var7.f1698c.mView;
                Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                if (el.l.r(view4) == e2Var && f2Var7.f1696a != e2Var) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        final f2 f2Var8 = (f2) obj;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                f2Var = listIterator.previous();
                f2 f2Var9 = (f2) f2Var;
                View view5 = f2Var9.f1698c.mView;
                Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
                if (el.l.r(view5) != e2Var && f2Var9.f1696a == e2Var) {
                    break;
                }
            } else {
                f2Var = 0;
                break;
            }
        }
        final f2 f2Var10 = f2Var;
        String str7 = "FragmentManager";
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + f2Var8 + " to " + f2Var10);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList S = vt.g0.S(operations);
        g0 g0Var = ((f2) vt.g0.C(operations)).f1698c;
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            c0 c0Var = ((f2) it2.next()).f1698c.mAnimationInfo;
            c0 c0Var2 = g0Var.mAnimationInfo;
            c0Var.f1620b = c0Var2.f1620b;
            c0Var.f1621c = c0Var2.f1621c;
            c0Var.f1622d = c0Var2.f1622d;
            c0Var.f1623e = c0Var2.f1623e;
        }
        Iterator it3 = operations.iterator();
        while (it3.hasNext()) {
            f2 f2Var11 = (f2) it3.next();
            ?? signal = new Object();
            f2Var11.getClass();
            Intrinsics.checkNotNullParameter(signal, "signal");
            f2Var11.d();
            LinkedHashSet linkedHashSet = f2Var11.f1700e;
            linkedHashSet.add(signal);
            Iterator it4 = it3;
            arrayList4.add(new i(f2Var11, signal, z10));
            ?? signal2 = new Object();
            Intrinsics.checkNotNullParameter(signal2, "signal");
            f2Var11.d();
            linkedHashSet.add(signal2);
            if (!z10 ? f2Var11 == f2Var10 : f2Var11 == f2Var8) {
                z14 = true;
            } else {
                z14 = false;
            }
            arrayList5.add(new k(f2Var11, signal2, z10, z14));
            e listener = new e(0, S, f2Var11, this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            f2Var11.f1699d.add(listener);
            it3 = it4;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next = it5.next();
            if (!((k) next).b()) {
                arrayList6.add(next);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            Object next2 = it6.next();
            if (((k) next2).c() != null) {
                arrayList7.add(next2);
            }
        }
        Iterator it7 = arrayList7.iterator();
        x1 x1Var = null;
        while (it7.hasNext()) {
            k kVar = (k) it7.next();
            x1 c10 = kVar.c();
            if (x1Var != null && c10 != x1Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + kVar.f1723a.f1698c + " returned Transition " + kVar.f1725c + " which uses a different Transition type than other Fragments.").toString());
            }
            x1Var = c10;
        }
        e2 e2Var3 = e2.f1680c;
        ViewGroup viewGroup = this.f1769a;
        if (x1Var != null) {
            str2 = " to ";
            View view6 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList arrayList8 = new ArrayList();
            arrayList = arrayList4;
            ArrayList arrayList9 = new ArrayList();
            e2 e2Var4 = e2Var;
            arrayList2 = S;
            ?? j0Var = new t.j0(0);
            Iterator it8 = arrayList5.iterator();
            e2Var2 = e2Var3;
            Object obj3 = null;
            View view7 = null;
            boolean z15 = false;
            while (it8.hasNext()) {
                Iterator it9 = it8;
                Object obj4 = ((k) it8.next()).f1727e;
                if (obj4 != null && f2Var8 != null && f2Var10 != null) {
                    Object r10 = x1Var.r(x1Var.f(obj4));
                    g0 inFragment = f2Var10.f1698c;
                    str6 = str;
                    ArrayList<String> sharedElementSourceNames = inFragment.getSharedElementSourceNames();
                    arrayList3 = arrayList5;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    g0 outFragment = f2Var8.f1698c;
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    ArrayList<String> sharedElementSourceNames2 = outFragment.getSharedElementSourceNames();
                    View view8 = view6;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = outFragment.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    x1 x1Var2 = x1Var;
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                        }
                        i10++;
                        size = i11;
                    }
                    ArrayList<String> sharedElementTargetNames2 = inFragment.getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    if (!z10) {
                        outFragment.getExitTransitionCallback();
                        inFragment.getEnterTransitionCallback();
                        pair = new Pair(null, null);
                    } else {
                        outFragment.getEnterTransitionCallback();
                        inFragment.getExitTransitionCallback();
                        pair = new Pair(null, null);
                    }
                    a3.a.u(pair.f23353a);
                    a3.a.u(pair.f23354b);
                    int size2 = sharedElementSourceNames.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        j0Var.put(sharedElementSourceNames.get(i12), sharedElementTargetNames2.get(i12));
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        Iterator<String> it10 = sharedElementTargetNames2.iterator();
                        while (it10.hasNext()) {
                            Log.v("FragmentManager", "Name: " + it10.next());
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        Iterator<String> it11 = sharedElementSourceNames.iterator();
                        while (it11.hasNext()) {
                            Log.v("FragmentManager", "Name: " + it11.next());
                        }
                    }
                    ?? sharedElements = new t.j0(0);
                    View view9 = outFragment.mView;
                    Intrinsics.checkNotNullExpressionValue(view9, "firstOut.fragment.mView");
                    i(sharedElements, view9);
                    sharedElements.m(sharedElementSourceNames);
                    j0Var.m(sharedElements.keySet());
                    final ?? namedViews = new t.j0(0);
                    View view10 = inFragment.mView;
                    Intrinsics.checkNotNullExpressionValue(view10, "lastIn.fragment.mView");
                    i(namedViews, view10);
                    namedViews.m(sharedElementTargetNames2);
                    namedViews.m(j0Var.values());
                    v1 v1Var = q1.f1817a;
                    Intrinsics.checkNotNullParameter(j0Var, "<this>");
                    Intrinsics.checkNotNullParameter(namedViews, "namedViews");
                    for (int i13 = j0Var.f34873c - 1; -1 < i13; i13--) {
                        if (!namedViews.containsKey((String) j0Var.j(i13))) {
                            j0Var.h(i13);
                        }
                    }
                    Set keySet = j0Var.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                    n(sharedElements, keySet);
                    Collection values = j0Var.values();
                    Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                    n(namedViews, values);
                    if (j0Var.isEmpty()) {
                        arrayList8.clear();
                        arrayList9.clear();
                        it8 = it9;
                        str = str6;
                        arrayList5 = arrayList3;
                        linkedHashMap3 = linkedHashMap4;
                        view6 = view8;
                        rect2 = rect3;
                        x1Var = x1Var2;
                        obj3 = null;
                    } else {
                        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                        if (z10) {
                            outFragment.getEnterTransitionCallback();
                        } else {
                            inFragment.getEnterTransitionCallback();
                        }
                        d4.g0.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                t.f sharedElements2 = namedViews;
                                Intrinsics.checkNotNullParameter(sharedElements2, "$lastInViews");
                                g0 inFragment2 = f2.this.f1698c;
                                g0 outFragment2 = f2Var8.f1698c;
                                v1 v1Var2 = q1.f1817a;
                                Intrinsics.checkNotNullParameter(inFragment2, "inFragment");
                                Intrinsics.checkNotNullParameter(outFragment2, "outFragment");
                                Intrinsics.checkNotNullParameter(sharedElements2, "sharedElements");
                                if (z10) {
                                    outFragment2.getEnterTransitionCallback();
                                } else {
                                    inFragment2.getEnterTransitionCallback();
                                }
                            }
                        });
                        arrayList8.addAll(sharedElements.values());
                        if (!sharedElementSourceNames.isEmpty()) {
                            View view11 = (View) sharedElements.get(sharedElementSourceNames.get(0));
                            x1Var = x1Var2;
                            obj2 = r10;
                            x1Var.m(view11, obj2);
                            view7 = view11;
                        } else {
                            x1Var = x1Var2;
                            obj2 = r10;
                        }
                        arrayList9.addAll(namedViews.values());
                        int i14 = 1;
                        if ((!sharedElementTargetNames2.isEmpty()) && (view3 = (View) namedViews.get(sharedElementTargetNames2.get(0))) != null) {
                            rect = rect3;
                            d4.g0.a(viewGroup, new e(i14, x1Var, view3, rect));
                            z15 = true;
                        } else {
                            rect = rect3;
                        }
                        view6 = view8;
                        x1Var.p(obj2, view6, arrayList8);
                        x1Var.l(obj2, null, null, obj2, arrayList9);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap2.put(f2Var8, bool);
                        linkedHashMap2.put(f2Var10, bool);
                        obj3 = obj2;
                    }
                } else {
                    arrayList3 = arrayList5;
                    str6 = str;
                    linkedHashMap2 = linkedHashMap3;
                    rect = rect2;
                }
                rect2 = rect;
                linkedHashMap3 = linkedHashMap2;
                it8 = it9;
                str = str6;
                arrayList5 = arrayList3;
            }
            ArrayList arrayList10 = arrayList5;
            String str8 = str;
            linkedHashMap = linkedHashMap3;
            Rect rect4 = rect2;
            ArrayList arrayList11 = new ArrayList();
            Iterator it12 = arrayList10.iterator();
            Object obj5 = null;
            Object obj6 = null;
            while (it12.hasNext()) {
                Iterator it13 = it12;
                k kVar2 = (k) it12.next();
                boolean b10 = kVar2.b();
                Object obj7 = j0Var;
                f2 f2Var12 = kVar2.f1723a;
                if (b10) {
                    str5 = str7;
                    linkedHashMap.put(f2Var12, Boolean.FALSE);
                    kVar2.a();
                } else {
                    str5 = str7;
                    Object f10 = x1Var.f(kVar2.f1725c);
                    if (obj3 != null && (f2Var12 == f2Var8 || f2Var12 == f2Var10)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (f10 == null) {
                        if (!z12) {
                            linkedHashMap.put(f2Var12, Boolean.FALSE);
                            kVar2.a();
                        }
                    } else {
                        f2 f2Var13 = f2Var10;
                        ArrayList arrayList12 = new ArrayList();
                        Object obj8 = obj3;
                        View view12 = f2Var12.f1698c.mView;
                        Object obj9 = obj6;
                        String str9 = str8;
                        Intrinsics.checkNotNullExpressionValue(view12, str9);
                        a(arrayList12, view12);
                        if (z12) {
                            if (f2Var12 == f2Var8) {
                                arrayList12.removeAll(vt.g0.V(arrayList8));
                            } else {
                                arrayList12.removeAll(vt.g0.V(arrayList9));
                            }
                        }
                        if (arrayList12.isEmpty()) {
                            x1Var.a(view6, f10);
                            view = view6;
                            str8 = str9;
                        } else {
                            x1Var.b(f10, arrayList12);
                            x1Var.l(f10, f10, arrayList12, null, null);
                            str8 = str9;
                            e2 e2Var5 = e2Var2;
                            if (f2Var12.f1696a == e2Var5) {
                                arrayList2.remove(f2Var12);
                                view = view6;
                                ArrayList arrayList13 = new ArrayList(arrayList12);
                                g0 g0Var2 = f2Var12.f1698c;
                                e2Var2 = e2Var5;
                                arrayList13.remove(g0Var2.mView);
                                x1Var.k(f10, g0Var2.mView, arrayList13);
                                d4.g0.a(viewGroup, new androidx.activity.b(arrayList12, 11));
                            } else {
                                view = view6;
                                e2Var2 = e2Var5;
                            }
                        }
                        e2 e2Var6 = e2Var4;
                        if (f2Var12.f1696a == e2Var6) {
                            arrayList11.addAll(arrayList12);
                            if (z15) {
                                x1Var.n(f10, rect4);
                            }
                            view2 = view7;
                        } else {
                            view2 = view7;
                            x1Var.m(view2, f10);
                        }
                        linkedHashMap.put(f2Var12, Boolean.TRUE);
                        if (kVar2.f1726d) {
                            obj5 = x1Var.j(obj5, f10);
                            it12 = it13;
                            view7 = view2;
                            e2Var4 = e2Var6;
                            view6 = view;
                            j0Var = obj7;
                            str7 = str5;
                            f2Var10 = f2Var13;
                            obj3 = obj8;
                            obj6 = obj9;
                        } else {
                            Object j10 = x1Var.j(obj9, f10);
                            view7 = view2;
                            e2Var4 = e2Var6;
                            view6 = view;
                            j0Var = obj7;
                            str7 = str5;
                            f2Var10 = f2Var13;
                            obj3 = obj8;
                            obj6 = j10;
                            it12 = it13;
                        }
                    }
                }
                it12 = it13;
                j0Var = obj7;
                str7 = str5;
            }
            t.f fVar = j0Var;
            f2Var2 = f2Var10;
            String str10 = str7;
            Object i15 = x1Var.i(obj5, obj6, obj3);
            if (i15 == null) {
                f2Var3 = f2Var8;
                str3 = str10;
            } else {
                ArrayList arrayList14 = new ArrayList();
                Iterator it14 = arrayList10.iterator();
                while (it14.hasNext()) {
                    Object next3 = it14.next();
                    if (!((k) next3).b()) {
                        arrayList14.add(next3);
                    }
                }
                Iterator it15 = arrayList14.iterator();
                while (true) {
                    int i16 = 4;
                    if (!it15.hasNext()) {
                        break;
                    }
                    k kVar3 = (k) it15.next();
                    Object obj10 = kVar3.f1725c;
                    f2 f2Var14 = kVar3.f1723a;
                    f2 f2Var15 = f2Var2;
                    if (obj3 != null && (f2Var14 == f2Var8 || f2Var14 == f2Var15)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (obj10 == null && !z11) {
                        str4 = str10;
                    } else {
                        WeakHashMap weakHashMap = d4.n1.f13788a;
                        if (!d4.y0.c(viewGroup)) {
                            str4 = str10;
                            if (Log.isLoggable(str4, 2)) {
                                Log.v(str4, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + f2Var14);
                            }
                            kVar3.a();
                        } else {
                            str4 = str10;
                            g0 g0Var3 = f2Var14.f1698c;
                            x1Var.o(i15, kVar3.f1724b, new h.m0(i16, kVar3, f2Var14));
                        }
                    }
                    str10 = str4;
                    f2Var2 = f2Var15;
                }
                str3 = str10;
                f2 f2Var16 = f2Var2;
                WeakHashMap weakHashMap2 = d4.n1.f13788a;
                if (!d4.y0.c(viewGroup)) {
                    f2Var3 = f2Var8;
                    f2Var2 = f2Var16;
                } else {
                    q1.a(4, arrayList11);
                    ArrayList arrayList15 = new ArrayList();
                    int size3 = arrayList9.size();
                    for (int i17 = 0; i17 < size3; i17++) {
                        View view13 = (View) arrayList9.get(i17);
                        WeakHashMap weakHashMap3 = d4.n1.f13788a;
                        arrayList15.add(d4.b1.k(view13));
                        d4.b1.v(view13, null);
                    }
                    if (Log.isLoggable(str3, 2)) {
                        Log.v(str3, ">>>>> Beginning transition <<<<<");
                        Log.v(str3, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator it16 = arrayList8.iterator(); it16.hasNext(); it16 = it16) {
                            Object sharedElementFirstOutViews = it16.next();
                            Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                            View view14 = (View) sharedElementFirstOutViews;
                            Log.v(str3, "View: " + view14 + " Name: " + d4.b1.k(view14));
                        }
                        Log.v(str3, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator it17 = arrayList9.iterator(); it17.hasNext(); it17 = it17) {
                            Object sharedElementLastInViews = it17.next();
                            Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                            View view15 = (View) sharedElementLastInViews;
                            Log.v(str3, "View: " + view15 + " Name: " + d4.b1.k(view15));
                        }
                    }
                    x1Var.c(viewGroup, i15);
                    int size4 = arrayList9.size();
                    ArrayList arrayList16 = new ArrayList();
                    int i18 = 0;
                    while (i18 < size4) {
                        View view16 = (View) arrayList8.get(i18);
                        WeakHashMap weakHashMap4 = d4.n1.f13788a;
                        String k10 = d4.b1.k(view16);
                        arrayList16.add(k10);
                        if (k10 == null) {
                            f2Var5 = f2Var8;
                            f2Var4 = f2Var16;
                        } else {
                            f2Var4 = f2Var16;
                            d4.b1.v(view16, null);
                            t.f fVar2 = fVar;
                            String str11 = (String) fVar2.get(k10);
                            fVar = fVar2;
                            int i19 = 0;
                            while (true) {
                                f2Var5 = f2Var8;
                                if (i19 >= size4) {
                                    break;
                                }
                                if (str11.equals(arrayList15.get(i19))) {
                                    d4.b1.v((View) arrayList9.get(i19), k10);
                                    break;
                                } else {
                                    i19++;
                                    f2Var8 = f2Var5;
                                }
                            }
                        }
                        i18++;
                        f2Var8 = f2Var5;
                        f2Var16 = f2Var4;
                    }
                    f2Var3 = f2Var8;
                    f2Var2 = f2Var16;
                    d4.g0.a(viewGroup, new w1(size4, arrayList9, arrayList15, arrayList8, arrayList16));
                    q1.a(0, arrayList11);
                    x1Var.q(obj3, arrayList8, arrayList9);
                }
            }
        } else {
            Iterator it18 = arrayList5.iterator();
            while (it18.hasNext()) {
                k kVar4 = (k) it18.next();
                linkedHashMap3.put(kVar4.f1723a, Boolean.FALSE);
                kVar4.a();
            }
            arrayList = arrayList4;
            f2Var3 = f2Var8;
            f2Var2 = f2Var10;
            str3 = "FragmentManager";
            str2 = " to ";
            arrayList2 = S;
            e2Var2 = e2Var3;
            linkedHashMap = linkedHashMap3;
        }
        boolean containsValue = linkedHashMap.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList arrayList17 = new ArrayList();
        Iterator it19 = arrayList.iterator();
        boolean z16 = false;
        while (it19.hasNext()) {
            i iVar = (i) it19.next();
            if (iVar.b()) {
                iVar.a();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                a0 c11 = iVar.c(context);
                if (c11 == null) {
                    iVar.a();
                } else {
                    Animator animator = (Animator) c11.f1589b;
                    if (animator == null) {
                        arrayList17.add(iVar);
                    } else {
                        f2 f2Var17 = iVar.f1723a;
                        g0 g0Var4 = f2Var17.f1698c;
                        if (Intrinsics.a(linkedHashMap.get(f2Var17), Boolean.TRUE)) {
                            if (Log.isLoggable(str3, 2)) {
                                Log.v(str3, "Ignoring Animator set on " + g0Var4 + " as this Fragment was involved in a Transition.");
                            }
                            iVar.a();
                        } else {
                            e2 e2Var7 = e2Var2;
                            if (f2Var17.f1696a == e2Var7) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ArrayList arrayList18 = arrayList2;
                            if (z13) {
                                arrayList18.remove(f2Var17);
                            }
                            View view17 = g0Var4.mView;
                            viewGroup.startViewTransition(view17);
                            animator.addListener(new l(this, view17, z13, f2Var17, iVar));
                            animator.setTarget(view17);
                            animator.start();
                            if (Log.isLoggable(str3, 2)) {
                                StringBuilder sb2 = new StringBuilder("Animator from operation ");
                                f2Var6 = f2Var17;
                                sb2.append(f2Var6);
                                sb2.append(" has started.");
                                Log.v(str3, sb2.toString());
                            } else {
                                f2Var6 = f2Var17;
                            }
                            iVar.f1724b.a(new g(0, animator, f2Var6));
                            e2Var2 = e2Var7;
                            arrayList2 = arrayList18;
                            z16 = true;
                        }
                    }
                }
            }
        }
        ArrayList arrayList19 = arrayList2;
        Iterator it20 = arrayList17.iterator();
        while (it20.hasNext()) {
            i iVar2 = (i) it20.next();
            f2 f2Var18 = iVar2.f1723a;
            g0 g0Var5 = f2Var18.f1698c;
            if (containsValue) {
                if (Log.isLoggable(str3, 2)) {
                    Log.v(str3, "Ignoring Animation set on " + g0Var5 + " as Animations cannot run alongside Transitions.");
                }
                iVar2.a();
            } else if (z16) {
                if (Log.isLoggable(str3, 2)) {
                    Log.v(str3, "Ignoring Animation set on " + g0Var5 + " as Animations cannot run alongside Animators.");
                }
                iVar2.a();
            } else {
                View view18 = g0Var5.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                a0 c12 = iVar2.c(context);
                if (c12 != null) {
                    Animation animation = (Animation) c12.f1588a;
                    if (animation != null) {
                        if (f2Var18.f1696a != e2.f1678a) {
                            view18.startAnimation(animation);
                            iVar2.a();
                        } else {
                            viewGroup.startViewTransition(view18);
                            k0 k0Var = new k0(animation, viewGroup, view18);
                            k0Var.setAnimationListener(new m(view18, iVar2, this, f2Var18));
                            view18.startAnimation(k0Var);
                            if (Log.isLoggable(str3, 2)) {
                                Log.v(str3, "Animation from operation " + f2Var18 + " has started.");
                            }
                        }
                        iVar2.f1724b.a(new h(view18, this, iVar2, f2Var18, 0));
                        containsValue = containsValue;
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
        Iterator it21 = arrayList19.iterator();
        while (it21.hasNext()) {
            f2 f2Var19 = (f2) it21.next();
            View view19 = f2Var19.f1698c.mView;
            e2 e2Var8 = f2Var19.f1696a;
            Intrinsics.checkNotNullExpressionValue(view19, "view");
            e2Var8.a(view19);
        }
        arrayList19.clear();
        if (Log.isLoggable(str3, 2)) {
            Log.v(str3, "Completed executing operations from " + f2Var3 + str2 + f2Var2);
        }
    }

    public final void h() {
        if (!this.f1773e) {
            ViewGroup viewGroup = this.f1769a;
            WeakHashMap weakHashMap = d4.n1.f13788a;
            if (!d4.y0.b(viewGroup)) {
                k();
                this.f1772d = false;
                return;
            }
            synchronized (this.f1770b) {
                try {
                    if (!this.f1770b.isEmpty()) {
                        ArrayList S = vt.g0.S(this.f1771c);
                        this.f1771c.clear();
                        Iterator it = S.iterator();
                        while (it.hasNext()) {
                            f2 f2Var = (f2) it.next();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + f2Var);
                            }
                            f2Var.a();
                            if (!f2Var.f1702g) {
                                this.f1771c.add(f2Var);
                            }
                        }
                        o();
                        ArrayList S2 = vt.g0.S(this.f1770b);
                        this.f1770b.clear();
                        this.f1771c.addAll(S2);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                        }
                        Iterator it2 = S2.iterator();
                        while (it2.hasNext()) {
                            ((f2) it2.next()).d();
                        }
                        g(S2, this.f1772d);
                        this.f1772d = false;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                        }
                    }
                    Unit unit = Unit.f23355a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final f2 j(g0 g0Var) {
        Object obj;
        Iterator it = this.f1770b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                f2 f2Var = (f2) obj;
                if (Intrinsics.a(f2Var.f1698c, g0Var) && !f2Var.f1701f) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (f2) obj;
    }

    public final void k() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1769a;
        WeakHashMap weakHashMap = d4.n1.f13788a;
        boolean b10 = d4.y0.b(viewGroup);
        synchronized (this.f1770b) {
            try {
                o();
                Iterator it = this.f1770b.iterator();
                while (it.hasNext()) {
                    ((f2) it.next()).d();
                }
                Iterator it2 = vt.g0.S(this.f1771c).iterator();
                while (it2.hasNext()) {
                    f2 f2Var = (f2) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (b10) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str2 = "Container " + this.f1769a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + f2Var);
                    }
                    f2Var.a();
                }
                Iterator it3 = vt.g0.S(this.f1770b).iterator();
                while (it3.hasNext()) {
                    f2 f2Var2 = (f2) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (b10) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str = "Container " + this.f1769a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + f2Var2);
                    }
                    f2Var2.a();
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        g0 g0Var;
        Object obj;
        boolean z10;
        synchronized (this.f1770b) {
            try {
                o();
                ArrayList arrayList = this.f1770b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    g0Var = null;
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        f2 f2Var = (f2) obj;
                        View view = f2Var.f1698c.mView;
                        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                        e2 r10 = el.l.r(view);
                        e2 e2Var = f2Var.f1696a;
                        e2 e2Var2 = e2.f1679b;
                        if (e2Var == e2Var2 && r10 != e2Var2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                f2 f2Var2 = (f2) obj;
                if (f2Var2 != null) {
                    g0Var = f2Var2.f1698c;
                }
                if (g0Var != null) {
                    z10 = g0Var.isPostponed();
                } else {
                    z10 = false;
                }
                this.f1773e = z10;
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        e2 e2Var;
        Iterator it = this.f1770b.iterator();
        while (it.hasNext()) {
            f2 f2Var = (f2) it.next();
            if (f2Var.f1697b == d2.f1671b) {
                View requireView = f2Var.f1698c.requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                int visibility = requireView.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4) {
                        if (visibility == 8) {
                            e2Var = e2.f1680c;
                        } else {
                            throw new IllegalArgumentException(jr.h.n("Unknown visibility ", visibility));
                        }
                    } else {
                        e2Var = e2.f1681d;
                    }
                } else {
                    e2Var = e2.f1679b;
                }
                f2Var.c(e2Var, d2.f1670a);
            }
        }
    }
}
