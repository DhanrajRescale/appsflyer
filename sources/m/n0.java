package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class n0 implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f25656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f25657b;

    public n0(o0 o0Var, l.e eVar) {
        this.f25657b = o0Var;
        this.f25656a = eVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f25657b.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f25656a);
        }
    }
}
