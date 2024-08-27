package zu;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
public abstract class c extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f42833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42834b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42835c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42836d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42837e;

    /* renamed from: f, reason: collision with root package name */
    public final Animator f42838f;

    /* renamed from: g, reason: collision with root package name */
    public final Animator f42839g;

    /* renamed from: h, reason: collision with root package name */
    public final Animator f42840h;

    /* renamed from: i, reason: collision with root package name */
    public final Animator f42841i;

    /* renamed from: j, reason: collision with root package name */
    public int f42842j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.animation.TimeInterpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.animation.TimeInterpolator, java.lang.Object] */
    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int i10;
        int i11;
        Animator animator;
        Animator animator2;
        int i12 = -1;
        this.f42833a = -1;
        this.f42834b = -1;
        this.f42835c = -1;
        this.f42842j = -1;
        int i13 = R.drawable.white_radius;
        int i14 = R.animator.scale_with_alpha;
        if (attributeSet == null) {
            dimensionPixelSize = -1;
            dimensionPixelSize2 = -1;
            i11 = 17;
            resourceId2 = R.drawable.white_radius;
            resourceId = 0;
            resourceId3 = 0;
            i10 = 0;
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f42843a);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            i14 = obtainStyledAttributes.getResourceId(0, R.animator.scale_with_alpha);
            resourceId = obtainStyledAttributes.getResourceId(1, 0);
            resourceId2 = obtainStyledAttributes.getResourceId(2, R.drawable.white_radius);
            resourceId3 = obtainStyledAttributes.getResourceId(3, resourceId2);
            i10 = obtainStyledAttributes.getInt(7, -1);
            int i15 = obtainStyledAttributes.getInt(4, -1);
            obtainStyledAttributes.recycle();
            i11 = i15;
            i12 = dimensionPixelSize3;
        }
        int applyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        this.f42834b = i12 < 0 ? applyDimension : i12;
        this.f42835c = dimensionPixelSize < 0 ? applyDimension : dimensionPixelSize;
        this.f42833a = dimensionPixelSize2 < 0 ? applyDimension : dimensionPixelSize2;
        this.f42838f = AnimatorInflater.loadAnimator(getContext(), i14);
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), i14);
        this.f42840h = loadAnimator;
        loadAnimator.setDuration(0L);
        if (resourceId == 0) {
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), i14);
            loadAnimator2.setInterpolator(new Object());
            animator = loadAnimator2;
        } else {
            animator = AnimatorInflater.loadAnimator(getContext(), resourceId);
        }
        this.f42839g = animator;
        if (resourceId == 0) {
            Animator loadAnimator3 = AnimatorInflater.loadAnimator(getContext(), i14);
            loadAnimator3.setInterpolator(new Object());
            animator2 = loadAnimator3;
        } else {
            animator2 = AnimatorInflater.loadAnimator(getContext(), resourceId);
        }
        this.f42841i = animator2;
        animator2.setDuration(0L);
        this.f42836d = resourceId2 != 0 ? resourceId2 : i13;
        this.f42837e = resourceId3 != 0 ? resourceId3 : resourceId2;
        setOrientation(i10 != 1 ? 0 : 1);
        setGravity(i11 >= 0 ? i11 : 17);
    }

    public final void a(int i10) {
        View childAt;
        if (this.f42842j == i10) {
            return;
        }
        if (this.f42839g.isRunning()) {
            this.f42839g.end();
            this.f42839g.cancel();
        }
        if (this.f42838f.isRunning()) {
            this.f42838f.end();
            this.f42838f.cancel();
        }
        int i11 = this.f42842j;
        if (i11 >= 0 && (childAt = getChildAt(i11)) != null) {
            childAt.setBackgroundResource(this.f42837e);
            this.f42839g.setTarget(childAt);
            this.f42839g.start();
        }
        View childAt2 = getChildAt(i10);
        if (childAt2 != null) {
            childAt2.setBackgroundResource(this.f42836d);
            this.f42838f.setTarget(childAt2);
            this.f42838f.start();
        }
        this.f42842j = i10;
    }

    public final void b(int i10, int i11) {
        if (this.f42840h.isRunning()) {
            this.f42840h.end();
            this.f42840h.cancel();
        }
        if (this.f42841i.isRunning()) {
            this.f42841i.end();
            this.f42841i.cancel();
        }
        int childCount = getChildCount();
        if (i10 < childCount) {
            removeViews(i10, childCount - i10);
        } else if (i10 > childCount) {
            int i12 = i10 - childCount;
            int orientation = getOrientation();
            for (int i13 = 0; i13 < i12; i13++) {
                View view = new View(getContext());
                LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
                generateDefaultLayoutParams.width = this.f42834b;
                generateDefaultLayoutParams.height = this.f42835c;
                if (orientation == 0) {
                    int i14 = this.f42833a;
                    generateDefaultLayoutParams.leftMargin = i14;
                    generateDefaultLayoutParams.rightMargin = i14;
                } else {
                    int i15 = this.f42833a;
                    generateDefaultLayoutParams.topMargin = i15;
                    generateDefaultLayoutParams.bottomMargin = i15;
                }
                addView(view, generateDefaultLayoutParams);
            }
        }
        for (int i16 = 0; i16 < i10; i16++) {
            View childAt = getChildAt(i16);
            if (i11 == i16) {
                childAt.setBackgroundResource(this.f42836d);
                this.f42840h.setTarget(childAt);
                this.f42840h.start();
                this.f42840h.end();
            } else {
                childAt.setBackgroundResource(this.f42837e);
                this.f42841i.setTarget(childAt);
                this.f42841i.start();
                this.f42841i.end();
            }
        }
        this.f42842j = i11;
    }
}
