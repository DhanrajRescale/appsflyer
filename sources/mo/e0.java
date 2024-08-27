package mo;

import android.widget.ImageButton;

/* loaded from: classes2.dex */
public abstract class e0 extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public int f27916a;

    public final void a(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f27916a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f27916a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        a(i10, true);
    }
}
