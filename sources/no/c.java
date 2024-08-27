package no;

import a8.o;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import d4.d1;
import d4.h0;
import d4.n1;
import d4.v0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.d0;
import l.q;
import m.y2;
import qu.i0;

/* loaded from: classes2.dex */
public abstract class c extends FrameLayout implements d0 {
    public static final int[] E = {R.attr.state_checked};
    public static final ll.f F = new ll.f();
    public static final b G = new ll.f();
    public int A;
    public boolean B;
    public int C;
    public xn.a D;

    /* renamed from: a, reason: collision with root package name */
    public boolean f29004a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f29005b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f29006c;

    /* renamed from: d, reason: collision with root package name */
    public int f29007d;

    /* renamed from: e, reason: collision with root package name */
    public int f29008e;

    /* renamed from: f, reason: collision with root package name */
    public float f29009f;

    /* renamed from: g, reason: collision with root package name */
    public float f29010g;

    /* renamed from: h, reason: collision with root package name */
    public float f29011h;

    /* renamed from: i, reason: collision with root package name */
    public int f29012i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29013j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f29014k;

    /* renamed from: l, reason: collision with root package name */
    public final View f29015l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f29016m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewGroup f29017n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f29018o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f29019p;

    /* renamed from: q, reason: collision with root package name */
    public int f29020q;

    /* renamed from: r, reason: collision with root package name */
    public q f29021r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f29022s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f29023t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f29024u;

    /* renamed from: v, reason: collision with root package name */
    public ValueAnimator f29025v;

    /* renamed from: w, reason: collision with root package name */
    public ll.f f29026w;

    /* renamed from: x, reason: collision with root package name */
    public float f29027x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29028y;

    /* renamed from: z, reason: collision with root package name */
    public int f29029z;

    public c(Context context) {
        super(context);
        this.f29004a = false;
        this.f29020q = -1;
        this.f29026w = F;
        this.f29027x = s0.g.f34069a;
        this.f29028y = false;
        this.f29029z = 0;
        this.A = 0;
        this.B = false;
        this.C = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f29014k = (FrameLayout) findViewById(com.assetgro.stockgro.prod.R.id.navigation_bar_item_icon_container);
        this.f29015l = findViewById(com.assetgro.stockgro.prod.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.assetgro.stockgro.prod.R.id.navigation_bar_item_icon_view);
        this.f29016m = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.assetgro.stockgro.prod.R.id.navigation_bar_item_labels_group);
        this.f29017n = viewGroup;
        TextView textView = (TextView) findViewById(com.assetgro.stockgro.prod.R.id.navigation_bar_item_small_label_view);
        this.f29018o = textView;
        TextView textView2 = (TextView) findViewById(com.assetgro.stockgro.prod.R.id.navigation_bar_item_large_label_view);
        this.f29019p = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f29007d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f29008e = viewGroup.getPaddingBottom();
        WeakHashMap weakHashMap = n1.f13788a;
        v0.s(textView, 2);
        v0.s(textView2, 2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new y2(this, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4c
        Lc:
            int[] r2 = un.a.U
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: no.c.e(android.widget.TextView, int):void");
    }

    public static void f(float f10, float f11, int i10, TextView textView) {
        textView.setScaleX(f10);
        textView.setScaleY(f11);
        textView.setVisibility(i10);
    }

    public static void g(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f29014k;
        return frameLayout != null ? frameLayout : this.f29016m;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof c) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        int i10;
        xn.a aVar = this.D;
        if (aVar != null) {
            i10 = aVar.getMinimumHeight() / 2;
        } else {
            i10 = 0;
        }
        return this.f29016m.getMeasuredWidth() + Math.max(i10, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + i10;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        xn.a aVar = this.D;
        if (aVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = aVar.getMinimumWidth() - this.D.f40493e.f40526b.f40519r.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f29016m.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(ViewGroup viewGroup, int i10) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i10);
    }

    public final void a(float f10, float f11) {
        this.f29009f = f10 - f11;
        this.f29010g = (f11 * 1.0f) / f10;
        this.f29011h = (f10 * 1.0f) / f11;
    }

    @Override // l.d0
    public final void b(q qVar) {
        CharSequence charSequence;
        int i10;
        this.f29021r = qVar;
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setIcon(qVar.getIcon());
        setTitle(qVar.f23667e);
        setId(qVar.f23663a);
        if (!TextUtils.isEmpty(qVar.f23679q)) {
            setContentDescription(qVar.f23679q);
        }
        if (!TextUtils.isEmpty(qVar.f23680r)) {
            charSequence = qVar.f23680r;
        } else {
            charSequence = qVar.f23667e;
        }
        i0.L(this, charSequence);
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        this.f29004a = true;
    }

    public final void c() {
        Drawable drawable = this.f29006c;
        ColorStateList colorStateList = this.f29005b;
        FrameLayout frameLayout = this.f29014k;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f29028y && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(ro.a.c(this.f29005b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(ro.a.a(this.f29005b), null, null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            v0.q(frameLayout, rippleDrawable);
        }
        WeakHashMap weakHashMap2 = n1.f13788a;
        v0.q(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    public final void d(float f10, float f11) {
        float f12;
        float f13;
        View view = this.f29015l;
        if (view != null) {
            ll.f fVar = this.f29026w;
            fVar.getClass();
            view.setScaleX(vn.a.a(0.4f, 1.0f, f10));
            view.setScaleY(fVar.g(f10, f11));
            if (f11 == s0.g.f34069a) {
                f12 = 0.8f;
            } else {
                f12 = 0.0f;
            }
            if (f11 == s0.g.f34069a) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            view.setAlpha(vn.a.b(s0.g.f34069a, 1.0f, f12, f13, f10));
        }
        this.f29027x = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f29014k;
        if (frameLayout != null && this.f29028y) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f29015l;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public xn.a getBadge() {
        return this.D;
    }

    public int getItemBackgroundResId() {
        return com.assetgro.stockgro.prod.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // l.d0
    public q getItemData() {
        return this.f29021r;
    }

    public int getItemDefaultMarginResId() {
        return com.assetgro.stockgro.prod.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f29020q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f29017n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f29017n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void h(int i10) {
        int i11;
        View view = this.f29015l;
        if (view == null) {
            return;
        }
        int min = Math.min(this.f29029z, i10 - (this.C * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (this.B && this.f29012i == 2) {
            i11 = min;
        } else {
            i11 = this.A;
        }
        layoutParams.height = i11;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        q qVar = this.f29021r;
        if (qVar != null && qVar.isCheckable() && this.f29021r.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        xn.a aVar = this.D;
        if (aVar != null && aVar.isVisible()) {
            q qVar = this.f29021r;
            CharSequence charSequence = qVar.f23667e;
            if (!TextUtils.isEmpty(qVar.f23679q)) {
                charSequence = this.f29021r.f23679q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.D.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) e4.l.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f14994a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) e4.f.f14974g.f14989a);
        }
        e4.g.c(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.assetgro.stockgro.prod.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new o(i10, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f29015l;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        int i10;
        this.f29028y = z10;
        c();
        View view = this.f29015l;
        if (view != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.A = i10;
        h(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.C = i10;
        h(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.B = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f29029z = i10;
        h(getWidth());
    }

    public void setBadge(@NonNull xn.a aVar) {
        boolean z10;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        xn.a aVar2 = this.D;
        if (aVar2 == aVar) {
            return;
        }
        if (aVar2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        FrameLayout frameLayout4 = null;
        ImageView imageView = this.f29016m;
        if (z10 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.D != null) {
                setClipChildren(true);
                setClipToPadding(true);
                xn.a aVar3 = this.D;
                if (aVar3 != null) {
                    WeakReference weakReference = aVar3.f40501m;
                    if (weakReference != null) {
                        frameLayout2 = (FrameLayout) weakReference.get();
                    } else {
                        frameLayout2 = null;
                    }
                    if (frameLayout2 != null) {
                        WeakReference weakReference2 = aVar3.f40501m;
                        if (weakReference2 != null) {
                            frameLayout3 = (FrameLayout) weakReference2.get();
                        } else {
                            frameLayout3 = null;
                        }
                        frameLayout3.setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.D = null;
            }
        }
        this.D = aVar;
        if (imageView != null && aVar != null) {
            setClipChildren(false);
            setClipToPadding(false);
            xn.a aVar4 = this.D;
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            aVar4.setBounds(rect);
            aVar4.f(imageView, null);
            WeakReference weakReference3 = aVar4.f40501m;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            if (frameLayout != null) {
                WeakReference weakReference4 = aVar4.f40501m;
                if (weakReference4 != null) {
                    frameLayout4 = (FrameLayout) weakReference4.get();
                }
                frameLayout4.setForeground(aVar4);
                return;
            }
            imageView.getOverlay().add(aVar4);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: no.c.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f29018o.setEnabled(z10);
        this.f29019p.setEnabled(z10);
        this.f29016m.setEnabled(z10);
        if (z10) {
            PointerIcon b10 = h0.b(getContext(), CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);
            WeakHashMap weakHashMap = n1.f13788a;
            d1.d(this, b10);
        } else {
            WeakHashMap weakHashMap2 = n1.f13788a;
            d1.d(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f29023t) {
            return;
        }
        this.f29023t = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f29024u = drawable;
            ColorStateList colorStateList = this.f29022s;
            if (colorStateList != null) {
                v3.b.h(drawable, colorStateList);
            }
        }
        this.f29016m.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.f29016m;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f29022s = colorStateList;
        if (this.f29021r != null && (drawable = this.f29024u) != null) {
            v3.b.h(drawable, colorStateList);
            this.f29024u.invalidateSelf();
        }
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : r3.k.getDrawable(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f29008e != i10) {
            this.f29008e = i10;
            q qVar = this.f29021r;
            if (qVar != null) {
                setChecked(qVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f29007d != i10) {
            this.f29007d = i10;
            q qVar = this.f29021r;
            if (qVar != null) {
                setChecked(qVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i10) {
        this.f29020q = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f29005b = colorStateList;
        c();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f29012i != i10) {
            this.f29012i = i10;
            if (this.B && i10 == 2) {
                this.f29026w = G;
            } else {
                this.f29026w = F;
            }
            h(getWidth());
            q qVar = this.f29021r;
            if (qVar != null) {
                setChecked(qVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z10) {
        if (this.f29013j != z10) {
            this.f29013j = z10;
            q qVar = this.f29021r;
            if (qVar != null) {
                setChecked(qVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i10) {
        TextView textView = this.f29019p;
        e(textView, i10);
        a(this.f29018o.getTextSize(), textView.getTextSize());
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i10) {
        TextView textView = this.f29018o;
        e(textView, i10);
        a(textView.getTextSize(), this.f29019p.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f29018o.setTextColor(colorStateList);
            this.f29019p.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f29018o.setText(charSequence);
        this.f29019p.setText(charSequence);
        q qVar = this.f29021r;
        if (qVar == null || TextUtils.isEmpty(qVar.f23679q)) {
            setContentDescription(charSequence);
        }
        q qVar2 = this.f29021r;
        if (qVar2 != null && !TextUtils.isEmpty(qVar2.f23680r)) {
            charSequence = this.f29021r.f23680r;
        }
        i0.L(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f29006c = drawable;
        c();
    }
}
