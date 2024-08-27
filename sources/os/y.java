package os;

import android.view.View;

/* loaded from: classes2.dex */
public final class y extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public View.AccessibilityDelegate f30410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f30411b;

    public y(z zVar, View.AccessibilityDelegate accessibilityDelegate) {
        this.f30411b = zVar;
        this.f30410a = accessibilityDelegate;
    }

    public final void a(y yVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f30410a;
        if (accessibilityDelegate == yVar) {
            this.f30410a = yVar.f30410a;
        } else if (accessibilityDelegate instanceof y) {
            ((y) accessibilityDelegate).a(yVar);
        }
    }

    public final boolean b(String str) {
        if (this.f30411b.f30298d == str) {
            return true;
        }
        View.AccessibilityDelegate accessibilityDelegate = this.f30410a;
        if (accessibilityDelegate instanceof y) {
            return ((y) accessibilityDelegate).b(str);
        }
        return false;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i10) {
        z zVar = this.f30411b;
        if (i10 == zVar.f30412f) {
            zVar.d(view);
        }
        View.AccessibilityDelegate accessibilityDelegate = this.f30410a;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.sendAccessibilityEvent(view, i10);
        }
    }
}
