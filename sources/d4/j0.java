package d4;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13769b;

    public /* synthetic */ j0(View view, int i10) {
        this.f13768a = i10;
        this.f13769b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13768a;
        View view = this.f13769b;
        switch (i10) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                int i11 = em.m.f15726o;
                view.requestFocus();
                return;
        }
    }
}
