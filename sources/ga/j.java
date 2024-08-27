package ga;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f17194b;

    public /* synthetic */ j(View view, int i10) {
        this.f17193a = i10;
        this.f17194b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f17193a;
        View view = this.f17194b;
        switch (i10) {
            case 0:
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Object parent = view.getParent();
                Intrinsics.d(parent, "null cannot be cast to non-null type android.view.View");
                BottomSheetBehavior w10 = BottomSheetBehavior.w((View) parent);
                Intrinsics.checkNotNullExpressionValue(w10, "from(...)");
                w10.C(view.getMeasuredHeight());
                return;
            default:
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Object parent2 = view.getParent();
                Intrinsics.d(parent2, "null cannot be cast to non-null type android.view.View");
                BottomSheetBehavior w11 = BottomSheetBehavior.w((View) parent2);
                Intrinsics.checkNotNullExpressionValue(w11, "from(...)");
                w11.C(view.getMeasuredHeight());
                return;
        }
    }
}
