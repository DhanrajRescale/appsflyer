package d4;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public class k0 extends x2.c {

    /* renamed from: c, reason: collision with root package name */
    public final View f13772c;

    public k0(View view) {
        this.f13772c = view;
    }

    @Override // x2.c
    public void q() {
        View view = this.f13772c;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // x2.c
    public void s() {
        View view;
        View view2 = this.f13772c;
        if (view2 == null) {
            return;
        }
        if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
            view = view2.getRootView().findFocus();
        } else {
            view2.requestFocus();
            view = view2;
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view != null && view.hasWindowFocus()) {
            view.post(new j0(view, 0));
        }
    }
}
