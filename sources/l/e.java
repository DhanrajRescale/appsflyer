package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import d4.n1;
import d4.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.j0;
import m.o0;
import m.o2;
import m.r0;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23563b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f23562a = i10;
        this.f23563b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        boolean z11;
        boolean z12;
        Activity activity;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        int i11 = this.f23562a;
        boolean z16 = false;
        Object obj = this.f23563b;
        switch (i11) {
            case 0:
                i iVar = (i) obj;
                if (iVar.a()) {
                    ArrayList arrayList = iVar.f23602i;
                    if (arrayList.size() > 0 && !((h) arrayList.get(0)).f23572a.f25582y) {
                        View view = iVar.f23609p;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((h) it.next()).f23572a.f();
                            }
                            return;
                        }
                        iVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h0 h0Var = (h0) obj;
                if (h0Var.a()) {
                    o2 o2Var = h0Var.f23582i;
                    if (!o2Var.f25582y) {
                        View view2 = h0Var.f23587n;
                        if (view2 != null && view2.isShown()) {
                            o2Var.f();
                            return;
                        } else {
                            h0Var.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                r0 r0Var = (r0) obj;
                if (!r0Var.getInternalPopup().a()) {
                    r0Var.f25696f.l(j0.b(r0Var), j0.a(r0Var));
                }
                ViewTreeObserver viewTreeObserver = r0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    m.i0.a(viewTreeObserver, this);
                    return;
                }
                return;
            case 3:
                o0 o0Var = (o0) obj;
                r0 r0Var2 = o0Var.G;
                WeakHashMap weakHashMap = n1.f13788a;
                if (y0.b(r0Var2) && r0Var2.getGlobalVisibleRect(o0Var.E)) {
                    o0Var.r();
                    o0Var.f();
                    return;
                } else {
                    o0Var.dismiss();
                    return;
                }
            default:
                NavigationView navigationView = (NavigationView) obj;
                navigationView.getLocationOnScreen(navigationView.f11400k);
                int[] iArr = navigationView.f11400k;
                if (iArr[1] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mo.s sVar = navigationView.f11398i;
                if (sVar.f27951w != z10) {
                    sVar.f27951w = z10;
                    if (sVar.f27930b.getChildCount() == 0 && sVar.f27951w) {
                        i10 = sVar.f27953y;
                    } else {
                        i10 = 0;
                    }
                    NavigationMenuView navigationMenuView = sVar.f27929a;
                    navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
                }
                if (z10 && navigationView.f11403n) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                navigationView.setDrawTopInsetForeground(z11);
                int i12 = iArr[0];
                if (i12 != 0 && navigationView.getWidth() + i12 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                navigationView.setDrawLeftInsetForeground(z12);
                Context context = navigationView.getContext();
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        activity = null;
                    }
                }
                if (activity != null) {
                    Rect d10 = mo.c0.d(activity);
                    if (d10.height() - navigationView.getHeight() == iArr[1]) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z13 && z14 && navigationView.f11404o) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    navigationView.setDrawBottomInsetForeground(z15);
                    if (d10.width() == iArr[0] || d10.width() - navigationView.getWidth() == iArr[0]) {
                        z16 = true;
                    }
                    navigationView.setDrawRightInsetForeground(z16);
                    return;
                }
                return;
        }
    }
}
