package zo;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f42697b;

    public /* synthetic */ u(TextInputLayout textInputLayout, int i10) {
        this.f42696a = i10;
        this.f42697b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f42696a;
        TextInputLayout textInputLayout = this.f42697b;
        switch (i10) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.f11481c.f42621g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                textInputLayout.f11482d.requestLayout();
                return;
        }
    }
}
