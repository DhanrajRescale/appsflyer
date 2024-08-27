package yo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class f extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f41749c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f41750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f41751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabLayout tabLayout, Context context) {
        super(context);
        this.f41751b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        TabLayout tabLayout = this.f41751b;
        if (tabLayout.f11464o0 != 0 && (tabLayout.getTabSelectedIndicator().getBounds().left != -1 || tabLayout.getTabSelectedIndicator().getBounds().right != -1)) {
            return;
        }
        View childAt = getChildAt(i10);
        ll.a aVar = tabLayout.I;
        Drawable drawable = tabLayout.f11463o;
        aVar.getClass();
        RectF a10 = ll.a.a(tabLayout, childAt);
        drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        tabLayout.f11440a = i10;
    }

    public final void b(int i10) {
        TabLayout tabLayout = this.f41751b;
        Rect bounds = tabLayout.f11463o.getBounds();
        tabLayout.f11463o.setBounds(bounds.left, 0, bounds.right, i10);
        requestLayout();
    }

    public final void c(View view, View view2, float f10) {
        if (view != null && view.getWidth() > 0) {
            TabLayout tabLayout = this.f41751b;
            tabLayout.I.j(tabLayout, view, view2, f10, tabLayout.f11463o);
        } else {
            TabLayout tabLayout2 = this.f41751b;
            Drawable drawable = tabLayout2.f11463o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.f11463o.getBounds().bottom);
        }
        WeakHashMap weakHashMap = n1.f13788a;
        v0.k(this);
    }

    public final void d(int i10, int i11, boolean z10) {
        TabLayout tabLayout = this.f41751b;
        if (tabLayout.f11440a == i10) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i10);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f11440a = i10;
        e eVar = new e(this, childAt, childAt2);
        if (z10) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f41750a = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.J);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(s0.g.f34069a, 1.0f);
            valueAnimator.addUpdateListener(eVar);
            valueAnimator.start();
            return;
        }
        this.f41750a.removeAllUpdateListeners();
        this.f41750a.addUpdateListener(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f41751b;
        int height2 = tabLayout.f11463o.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.f11463o.getIntrinsicHeight();
        }
        int i10 = tabLayout.B;
        if (i10 != 0) {
            if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    if (i10 != 3) {
                        height2 = 0;
                    } else {
                        height2 = getHeight();
                    }
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
        } else {
            height = getHeight() - height2;
            height2 = getHeight();
        }
        if (tabLayout.f11463o.getBounds().width() > 0) {
            Rect bounds = tabLayout.f11463o.getBounds();
            tabLayout.f11463o.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.f11463o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ValueAnimator valueAnimator = this.f41750a;
        TabLayout tabLayout = this.f41751b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f11440a == -1) {
            tabLayout.f11440a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f11440a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f41751b;
        if (tabLayout.f11476z == 1 || tabLayout.C == 2) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0) {
                    i12 = Math.max(i12, childAt.getMeasuredWidth());
                }
            }
            if (i12 <= 0) {
                return;
            }
            if (i12 * childCount <= getMeasuredWidth() - (((int) pn.e.f(16, getContext())) * 2)) {
                boolean z10 = false;
                for (int i14 = 0; i14 < childCount; i14++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                    if (layoutParams.width != i12 || layoutParams.weight != s0.g.f34069a) {
                        layoutParams.width = i12;
                        layoutParams.weight = s0.g.f34069a;
                        z10 = true;
                    }
                }
                if (!z10) {
                    return;
                }
            } else {
                tabLayout.f11476z = 0;
                tabLayout.q(false);
            }
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
    }
}
