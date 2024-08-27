package wn;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import d4.d3;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class l extends m {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f39342c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f39343d;

    /* renamed from: e, reason: collision with root package name */
    public int f39344e;

    /* renamed from: f, reason: collision with root package name */
    public int f39345f;

    public l() {
        this.f39342c = new Rect();
        this.f39343d = new Rect();
        this.f39344e = 0;
    }

    @Override // o3.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout v10;
        int i13;
        d3 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (v10 = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.k(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                WeakHashMap weakHashMap = n1.f13788a;
                if (v0.b(v10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.a() + lastWindowInsets.d();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int totalScrollRange = v10.getTotalScrollRange() + size;
            int measuredHeight = v10.getMeasuredHeight();
            if (this instanceof SearchBar$ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(s0.g.f34069a);
                totalScrollRange -= measuredHeight;
            }
            if (i14 == -1) {
                i13 = 1073741824;
            } else {
                i13 = Integer.MIN_VALUE;
            }
            coordinatorLayout.s(view, i10, i11, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i13));
            return true;
        }
        return false;
    }

    @Override // wn.m
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout v10 = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.k(view));
        if (v10 != null) {
            o3.e eVar = (o3.e) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int bottom = v10.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int bottom2 = ((v10.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            Rect rect = this.f39342c;
            rect.set(paddingLeft, bottom, width, bottom2);
            d3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap weakHashMap = n1.f13788a;
                if (v0.b(coordinatorLayout) && !v0.b(view)) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.f39343d;
            int i11 = eVar.f29546c;
            if (i11 == 0) {
                i11 = 8388659;
            }
            d4.o.b(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int u10 = u(v10);
            view.layout(rect2.left, rect2.top - u10, rect2.right, rect2.bottom - u10);
            this.f39344e = rect2.top - v10.getBottom();
            return;
        }
        coordinatorLayout.r(view, i10);
        this.f39344e = 0;
    }

    public final int u(View view) {
        int i10;
        int i11;
        if (this.f39345f == 0) {
            return 0;
        }
        boolean z10 = view instanceof AppBarLayout;
        float f10 = s0.g.f34069a;
        if (z10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            o3.b bVar = ((o3.e) appBarLayout.getLayoutParams()).f29544a;
            if (bVar instanceof AppBarLayout.BaseBehavior) {
                i10 = ((AppBarLayout.BaseBehavior) bVar).u();
            } else {
                i10 = 0;
            }
            if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f10 = (i10 / i11) + 1.0f;
            }
        }
        int i12 = this.f39345f;
        return hl.f.F((int) (f10 * i12), 0, i12);
    }

    public l(int i10) {
        super(0);
        this.f39342c = new Rect();
        this.f39343d = new Rect();
        this.f39344e = 0;
    }
}
