package e4;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final d f14971a;

    public e(d dVar) {
        this.f14971a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f14971a.equals(((e) obj).f14971a);
    }

    public final int hashCode() {
        return this.f14971a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        int i10;
        zo.i iVar = (zo.i) ((dj.e) this.f14971a).f14394b;
        AutoCompleteTextView autoCompleteTextView = iVar.f42601h;
        if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            WeakHashMap weakHashMap = n1.f13788a;
            v0.s(iVar.f42640d, i10);
        }
    }
}
