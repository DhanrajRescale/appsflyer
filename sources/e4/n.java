package e4;

import android.view.accessibility.AccessibilityNodeInfo;
import d2.g0;

/* loaded from: classes.dex */
public class n extends g0 {
    @Override // d2.g0, android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        m d10 = ((k) this.f13419b).d(i10);
        if (d10 == null) {
            return null;
        }
        return d10.f14996a;
    }
}
