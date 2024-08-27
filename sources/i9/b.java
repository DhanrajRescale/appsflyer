package i9;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public Integer f19743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f19744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f19745c;

    public b(View view, Function1 function1) {
        this.f19744b = view;
        this.f19745c = function1;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Integer num = this.f19743a;
        View view = this.f19744b;
        if (num != null) {
            int measuredWidth = view.getMeasuredWidth();
            if (num != null && num.intValue() == measuredWidth) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
        }
        if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            Integer num2 = this.f19743a;
            int measuredWidth2 = view.getMeasuredWidth();
            if (num2 == null || num2.intValue() != measuredWidth2) {
                this.f19743a = Integer.valueOf(view.getMeasuredWidth());
                this.f19745c.invoke(view);
            }
        }
    }
}
