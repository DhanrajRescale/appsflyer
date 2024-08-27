package x7;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import e4.l;
import e4.m;
import wo.k;

/* loaded from: classes.dex */
public final class e extends d4.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40086e;

    public /* synthetic */ e(Object obj, int i10) {
        this.f40085d = i10;
        this.f40086e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3.c() > 1) goto L14;
     */
    @Override // d4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.f40085d
            java.lang.Object r1 = r2.f40086e
            switch(r0) {
                case 0: goto L18;
                case 3: goto Lb;
                default: goto L7;
            }
        L7:
            super.c(r3, r4)
            return
        Lb:
            super.c(r3, r4)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r3 = r1.isChecked()
            r4.setChecked(r3)
            return
        L18:
            super.c(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            r3 = r1
            androidx.viewpager.widget.ViewPager r3 = (androidx.viewpager.widget.ViewPager) r3
            x7.a r3 = r3.f2476e
            if (r3 == 0) goto L33
            int r3 = r3.c()
            r0 = 1
            if (r3 <= r0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            r4.setScrollable(r0)
            int r3 = r4.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r3 != r0) goto L56
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            x7.a r3 = r1.f2476e
            if (r3 == 0) goto L56
            int r3 = r3.c()
            r4.setItemCount(r3)
            int r3 = r1.f2478f
            r4.setFromIndex(r3)
            int r3 = r1.f2478f
            r4.setToIndex(r3)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.e.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // d4.c
    public final void d(View view, m mVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        int i10 = this.f40085d;
        boolean z10 = false;
        int i11 = 0;
        z10 = false;
        int i12 = -1;
        Object obj = this.f40086e;
        View.AccessibilityDelegate accessibilityDelegate = this.f13725a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                mVar.j(ViewPager.class.getName());
                a aVar = ((ViewPager) obj).f2476e;
                if (aVar != null && aVar.c() > 1) {
                    z10 = true;
                }
                mVar.r(z10);
                ViewPager viewPager = (ViewPager) obj;
                if (viewPager.canScrollHorizontally(1)) {
                    mVar.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    mVar.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    return;
                }
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((ao.f) obj).f2665j) {
                    mVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    return;
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                    return;
                }
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i13 = MaterialButtonToggleGroup.f11214k;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i14 = 0;
                    while (true) {
                        if (i11 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i11) == view) {
                                i12 = i14;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.c(i11)) {
                                    i14++;
                                }
                                i11++;
                            }
                        }
                    }
                }
                mVar.l(l.a(0, 1, i12, 1, false, ((MaterialButton) view).isChecked()));
                return;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f11387e);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).f11391x);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                mVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                return;
        }
    }

    @Override // d4.c
    public final boolean g(View view, int i10, Bundle bundle) {
        int i11 = this.f40085d;
        Object obj = this.f40086e;
        switch (i11) {
            case 0:
                if (super.g(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192) {
                        ViewPager viewPager = (ViewPager) obj;
                        if (viewPager.canScrollHorizontally(-1)) {
                            viewPager.setCurrentItem(viewPager.f2478f - 1);
                            return true;
                        }
                    }
                } else {
                    ViewPager viewPager2 = (ViewPager) obj;
                    if (viewPager2.canScrollHorizontally(1)) {
                        viewPager2.setCurrentItem(viewPager2.f2478f + 1);
                        return true;
                    }
                }
                return false;
            case 1:
                if (i10 == 1048576) {
                    ao.f fVar = (ao.f) obj;
                    if (fVar.f2665j) {
                        fVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i10, bundle);
            case 5:
                if (i10 == 1048576) {
                    ((wo.m) ((k) obj)).a(3);
                    return true;
                }
                return super.g(view, i10, bundle);
            default:
                return super.g(view, i10, bundle);
        }
    }
}
