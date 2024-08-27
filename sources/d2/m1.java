package d2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m1 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13546a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13547b;

    public m1(Context context) {
        super(context);
        setClipChildren(false);
        this.f13546a = new HashMap();
        this.f13547b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @NotNull
    public final HashMap<y2.k, androidx.compose.ui.node.a> getHolderToLayoutNode() {
        return this.f13546a;
    }

    @NotNull
    public final HashMap<androidx.compose.ui.node.a, y2.k> getLayoutNodeToHolder() {
        return this.f13547b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (y2.k kVar : this.f13546a.keySet()) {
            kVar.layout(kVar.getLeft(), kVar.getTop(), kVar.getRight(), kVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11 = false;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (View.MeasureSpec.getMode(i11) == 1073741824) {
                z11 = true;
            }
            if (z11) {
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                for (y2.k kVar : this.f13546a.keySet()) {
                    int i13 = kVar.f41109r;
                    if (i13 != Integer.MIN_VALUE && (i12 = kVar.f41110s) != Integer.MIN_VALUE) {
                        kVar.measure(i13, i12);
                    }
                }
                return;
            }
            t0.t.A0("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        t0.t.A0("widthMeasureSpec should be EXACTLY");
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) this.f13546a.get(childAt);
            if (childAt.isLayoutRequested() && aVar != null) {
                androidx.compose.ui.node.a.S(aVar, false, 3);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
