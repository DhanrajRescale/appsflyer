package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import in.juspay.hyper.constants.LogSubCategory;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static z3 f25835k;

    /* renamed from: l, reason: collision with root package name */
    public static z3 f25836l;

    /* renamed from: a, reason: collision with root package name */
    public final View f25837a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f25838b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25839c;

    /* renamed from: d, reason: collision with root package name */
    public final y3 f25840d;

    /* renamed from: e, reason: collision with root package name */
    public final y3 f25841e;

    /* renamed from: f, reason: collision with root package name */
    public int f25842f;

    /* renamed from: g, reason: collision with root package name */
    public int f25843g;

    /* renamed from: h, reason: collision with root package name */
    public a4 f25844h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25845i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25846j;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.y3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.y3] */
    public z3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i10 = 0;
        this.f25840d = new Runnable(this) { // from class: m.y3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3 f25805b;

            {
                this.f25805b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                z3 z3Var = this.f25805b;
                switch (i11) {
                    case 0:
                        z3Var.c(false);
                        return;
                    default:
                        z3Var.a();
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f25841e = new Runnable(this) { // from class: m.y3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3 f25805b;

            {
                this.f25805b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                z3 z3Var = this.f25805b;
                switch (i112) {
                    case 0:
                        z3Var.c(false);
                        return;
                    default:
                        z3Var.a();
                        return;
                }
            }
        };
        this.f25837a = view;
        this.f25838b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = d4.r1.f13811a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = d4.p1.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f25839c = scaledTouchSlop;
        this.f25846j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(z3 z3Var) {
        z3 z3Var2 = f25835k;
        if (z3Var2 != null) {
            z3Var2.f25837a.removeCallbacks(z3Var2.f25840d);
        }
        f25835k = z3Var;
        if (z3Var != null) {
            z3Var.f25837a.postDelayed(z3Var.f25840d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        z3 z3Var = f25836l;
        View view = this.f25837a;
        if (z3Var == this) {
            f25836l = null;
            a4 a4Var = this.f25844h;
            if (a4Var != null) {
                if (((View) a4Var.f25482c).getParent() != null) {
                    ((WindowManager) ((Context) a4Var.f25481b).getSystemService("window")).removeView((View) a4Var.f25482c);
                }
                this.f25844h = null;
                this.f25846j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f25835k == this) {
            b(null);
        }
        view.removeCallbacks(this.f25841e);
    }

    public final void c(boolean z10) {
        int height;
        int i10;
        int i11;
        int i12;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = d4.n1.f13788a;
        View view = this.f25837a;
        if (!d4.y0.b(view)) {
            return;
        }
        b(null);
        z3 z3Var = f25836l;
        if (z3Var != null) {
            z3Var.a();
        }
        f25836l = this;
        this.f25845i = z10;
        a4 a4Var = new a4(view.getContext());
        this.f25844h = a4Var;
        int i13 = this.f25842f;
        int i14 = this.f25843g;
        boolean z11 = this.f25845i;
        if (((View) a4Var.f25482c).getParent() != null && ((View) a4Var.f25482c).getParent() != null) {
            ((WindowManager) ((Context) a4Var.f25481b).getSystemService("window")).removeView((View) a4Var.f25482c);
        }
        ((TextView) a4Var.f25483d).setText(this.f25838b);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) a4Var.f25484e;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = ((Context) a4Var.f25481b).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i13 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = ((Context) a4Var.f25481b).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i14 + dimensionPixelOffset2;
            i10 = i14 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = ((Context) a4Var.f25481b).getResources();
        if (z11) {
            i11 = R.dimen.tooltip_y_offset_touch;
        } else {
            i11 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame((Rect) a4Var.f25485f);
            Rect rect = (Rect) a4Var.f25485f;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = ((Context) a4Var.f25481b).getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", LogSubCategory.LifeCycle.ANDROID);
                if (identifier != 0) {
                    i12 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i12 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                ((Rect) a4Var.f25485f).set(0, i12, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen((int[]) a4Var.f25487h);
            view.getLocationOnScreen((int[]) a4Var.f25486g);
            int[] iArr = (int[]) a4Var.f25486g;
            int i15 = iArr[0];
            int[] iArr2 = (int[]) a4Var.f25487h;
            int i16 = i15 - iArr2[0];
            iArr[0] = i16;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i16 + i13) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((View) a4Var.f25482c).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = ((View) a4Var.f25482c).getMeasuredHeight();
            int i17 = ((int[]) a4Var.f25486g)[1];
            int i18 = ((i10 + i17) - dimensionPixelOffset3) - measuredHeight;
            int i19 = i17 + height + dimensionPixelOffset3;
            if (z11) {
                if (i18 >= 0) {
                    layoutParams.y = i18;
                } else {
                    layoutParams.y = i19;
                }
            } else if (measuredHeight + i19 <= ((Rect) a4Var.f25485f).height()) {
                layoutParams.y = i19;
            } else {
                layoutParams.y = i18;
            }
        }
        ((WindowManager) ((Context) a4Var.f25481b).getSystemService("window")).addView((View) a4Var.f25482c, (WindowManager.LayoutParams) a4Var.f25484e);
        view.addOnAttachStateChangeListener(this);
        if (this.f25845i) {
            j11 = 2500;
        } else {
            if ((d4.v0.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        y3 y3Var = this.f25841e;
        view.removeCallbacks(y3Var);
        view.postDelayed(y3Var, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f25843g) <= r2) goto L29;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            m.a4 r4 = r3.f25844h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f25845i
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f25837a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f25846j = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            m.a4 r4 = r3.f25844h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f25846j
            if (r1 != 0) goto L66
            int r1 = r3.f25842f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f25839c
            if (r1 > r2) goto L66
            int r1 = r3.f25843g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f25842f = r4
            r3.f25843g = r5
            r3.f25846j = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.z3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f25842f = view.getWidth() / 2;
        this.f25843g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
