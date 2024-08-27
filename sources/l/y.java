package l;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class y implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23701b;

    public /* synthetic */ y(Object obj, int i10) {
        this.f23700a = i10;
        this.f23701b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i10 = this.f23700a;
        Object obj = this.f23701b;
        switch (i10) {
            case 0:
                ((a0) obj).c();
                return;
            default:
                a3.a.u(((m.w) obj).f25765f);
                return;
        }
    }
}
