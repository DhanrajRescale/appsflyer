package o4;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import d4.n1;
import d4.v0;
import d4.w0;
import e4.m;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f29566d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f29567e;

    public b(DrawerLayout drawerLayout) {
        this.f29567e = drawerLayout;
    }

    @Override // d4.c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = this.f29567e;
            View g10 = drawerLayout.g();
            if (g10 != null) {
                int i10 = drawerLayout.i(g10);
                drawerLayout.getClass();
                WeakHashMap weakHashMap = n1.f13788a;
                Gravity.getAbsoluteGravity(i10, w0.d(drawerLayout));
                return true;
            }
            return true;
        }
        return this.f13725a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // d4.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // d4.c
    public final void d(View view, m mVar) {
        boolean z10 = DrawerLayout.F;
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        View.AccessibilityDelegate accessibilityDelegate = this.f13725a;
        if (z10) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
            mVar.f14998c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = n1.f13788a;
            Object f10 = v0.f(view);
            if (f10 instanceof View) {
                mVar.f14997b = -1;
                accessibilityNodeInfo.setParent((View) f10);
            }
            Rect rect = this.f29566d;
            obtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(obtain.getPackageName());
            mVar.j(obtain.getClassName());
            mVar.m(obtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(obtain.isEnabled());
            accessibilityNodeInfo.setFocused(obtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(obtain.isSelected());
            mVar.a(obtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.k(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        mVar.j("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) e4.f.f14972e.f14989a);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) e4.f.f14973f.f14989a);
    }

    @Override // d4.c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (!DrawerLayout.F && !DrawerLayout.k(view)) {
            return false;
        }
        return this.f13725a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
