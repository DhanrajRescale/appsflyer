package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f25516b;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f25515a = i10;
        this.f25516b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25515a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f25516b;
        switch (i10) {
            case 0:
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f973w = actionBarOverlayLayout.f954d.animate().translationY(s0.g.f34069a).setListener(actionBarOverlayLayout.f974x);
                return;
            default:
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f973w = actionBarOverlayLayout.f954d.animate().translationY(-actionBarOverlayLayout.f954d.getHeight()).setListener(actionBarOverlayLayout.f974x);
                return;
        }
    }
}
