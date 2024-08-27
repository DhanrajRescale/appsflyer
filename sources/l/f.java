package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.assetgro.stockgro.prod.R;
import d2.r0;
import d4.n1;
import d4.w1;
import d4.y0;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import qu.o1;

/* loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23565b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f23564a = i10;
        this.f23565b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i10 = this.f23564a;
        Object obj = this.f23565b;
        switch (i10) {
            case 0:
            case 1:
                return;
            case 2:
                r0 r0Var = (r0) obj;
                AccessibilityManager accessibilityManager2 = r0Var.f13581g;
                accessibilityManager2.addAccessibilityStateChangeListener(r0Var.f13583i);
                accessibilityManager2.addTouchExplorationStateChangeListener(r0Var.f13584j);
                return;
            case 3:
            case 4:
                return;
            case 5:
                zo.l lVar = (zo.l) obj;
                int i11 = zo.l.f42614w;
                if (lVar.f42635u != null && (accessibilityManager = lVar.f42634t) != null) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (y0.b(lVar)) {
                        e4.c.a(accessibilityManager, lVar.f42635u);
                        return;
                    }
                    return;
                }
                return;
            default:
                view.getViewTreeObserver().addOnDrawListener((fr.b) obj);
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Boolean bool;
        AccessibilityManager accessibilityManager;
        int i10 = this.f23564a;
        Object obj = this.f23565b;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                ViewTreeObserver viewTreeObserver = iVar.f23618y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.f23618y = view.getViewTreeObserver();
                    }
                    iVar.f23618y.removeGlobalOnLayoutListener(iVar.f23603j);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                h0 h0Var = (h0) obj;
                ViewTreeObserver viewTreeObserver2 = h0Var.f23589p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        h0Var.f23589p = view.getViewTreeObserver();
                    }
                    h0Var.f23589p.removeGlobalOnLayoutListener(h0Var.f23583j);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                r0 r0Var = (r0) obj;
                r0Var.f13586l.removeCallbacks(r0Var.K);
                AccessibilityManager accessibilityManager2 = r0Var.f13581g;
                accessibilityManager2.removeAccessibilityStateChangeListener(r0Var.f13583i);
                accessibilityManager2.removeTouchExplorationStateChangeListener(r0Var.f13584j);
                return;
            case 3:
                d2.a aVar = (d2.a) obj;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                for (Object obj2 : pu.m.d(w1.f13860i, aVar.getParent())) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        Intrinsics.checkNotNullParameter(view2, "<this>");
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if (tag instanceof Boolean) {
                            bool = (Boolean) tag;
                        } else {
                            bool = null;
                        }
                        if (bool != null && bool.booleanValue()) {
                            return;
                        }
                    }
                }
                aVar.c();
                return;
            case 4:
                view.removeOnAttachStateChangeListener(this);
                ((o1) obj).a(null);
                return;
            case 5:
                zo.l lVar = (zo.l) obj;
                int i11 = zo.l.f42614w;
                e4.d dVar = lVar.f42635u;
                if (dVar != null && (accessibilityManager = lVar.f42634t) != null) {
                    e4.c.b(accessibilityManager, dVar);
                    return;
                }
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
