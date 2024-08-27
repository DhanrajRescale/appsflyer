package d2;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f13292a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f13293b;

    /* renamed from: c, reason: collision with root package name */
    public i4 f13294c;

    /* renamed from: d, reason: collision with root package name */
    public t0.v f13295d;

    /* renamed from: e, reason: collision with root package name */
    public c0.s f13296e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13297f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13298g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13299h;

    public /* synthetic */ a(Context context) {
        this(context, null, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(t0.v vVar) {
        if (this.f13295d != vVar) {
            this.f13295d = vVar;
            if (vVar != null) {
                this.f13292a = null;
            }
            i4 i4Var = this.f13294c;
            if (i4Var != null) {
                i4Var.a();
                this.f13294c = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f13293b != iBinder) {
            this.f13293b = iBinder;
            this.f13292a = null;
        }
    }

    public abstract void a(t0.n nVar, int i10);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f13298g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        i4 i4Var = this.f13294c;
        if (i4Var != null) {
            i4Var.a();
        }
        this.f13294c = null;
        requestLayout();
    }

    public final void d() {
        if (this.f13294c == null) {
            try {
                this.f13298g = true;
                t0.v g10 = g();
                androidx.compose.foundation.layout.e eVar = new androidx.compose.foundation.layout.e(this, 8);
                Object obj = b1.d.f3079a;
                this.f13294c = k4.a(this, g10, new b1.c(eVar, true, -656146368));
            } finally {
                this.f13298g = false;
            }
        }
    }

    public void e(int i10, int i11, int i12, int i13, boolean z10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void f(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r2 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Type inference failed for: r0v0, types: [t0.v] */
    /* JADX WARN: Type inference failed for: r0v1, types: [t0.v] */
    /* JADX WARN: Type inference failed for: r0v17, types: [t0.f2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [t0.v] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [t0.p1] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t0.v g() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.a.g():t0.v");
    }

    public final boolean getHasComposition() {
        return this.f13294c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f13297f;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.f13299h && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        e(i10, i11, i12, i13, z10);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d();
        f(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(t0.v vVar) {
        setParentContext(vVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f13297f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((a0) ((c2.r1) childAt)).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f13299h = true;
    }

    public final void setViewCompositionStrategy(@NotNull i3 i3Var) {
        c0.s sVar = this.f13296e;
        if (sVar != null) {
            sVar.mo2invoke();
        }
        ((w0) i3Var).getClass();
        l.f fVar = new l.f(this, 3);
        addOnAttachStateChangeListener(fVar);
        h3 listener = new h3(this);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        j4.a n0 = hl.f.n0(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        n0.f20936a.add(listener);
        this.f13296e = new c0.s(6, this, fVar, listener);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        l.f fVar = new l.f(this, 3);
        addOnAttachStateChangeListener(fVar);
        h3 listener = new h3(this);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        j4.a n0 = hl.f.n0(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        n0.f20936a.add(listener);
        this.f13296e = new c0.s(6, this, fVar, listener);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }
}
