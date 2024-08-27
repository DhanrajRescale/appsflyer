package wo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.assetgro.stockgro.prod.R;
import d4.b1;
import d4.n1;
import d4.v0;
import d4.z0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class j extends FrameLayout {

    /* renamed from: l */
    public static final i f39366l = new Object();

    /* renamed from: a */
    public k f39367a;

    /* renamed from: b */
    public final to.l f39368b;

    /* renamed from: c */
    public int f39369c;

    /* renamed from: d */
    public final float f39370d;

    /* renamed from: e */
    public final float f39371e;

    /* renamed from: f */
    public final int f39372f;

    /* renamed from: g */
    public final int f39373g;

    /* renamed from: h */
    public ColorStateList f39374h;

    /* renamed from: i */
    public PorterDuff.Mode f39375i;

    /* renamed from: j */
    public Rect f39376j;

    /* renamed from: k */
    public boolean f39377k;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, un.a.R);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = n1.f13788a;
            b1.s(this, dimensionPixelSize);
        }
        this.f39369c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f39368b = to.l.c(context2, attributeSet, 0, 0).a();
        }
        this.f39370d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(dp.b.l1(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(pn.e.s(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f39371e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f39372f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f39373g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f39366l);
        setFocusable(true);
        if (getBackground() == null) {
            int p10 = pn.e.p(pn.e.k(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), pn.e.k(this, R.attr.colorOnSurface));
            to.l lVar = this.f39368b;
            if (lVar != null) {
                v4.b bVar = k.f39378w;
                to.h hVar = new to.h(lVar);
                hVar.n(ColorStateList.valueOf(p10));
                gradientDrawable = hVar;
            } else {
                Resources resources = getResources();
                v4.b bVar2 = k.f39378w;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(p10);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f39374h;
            if (colorStateList != null) {
                v3.b.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = n1.f13788a;
            v0.q(this, gradientDrawable);
        }
    }

    public static /* synthetic */ void a(j jVar, k kVar) {
        jVar.setBaseTransientBottomBar(kVar);
    }

    public void setBaseTransientBottomBar(k kVar) {
        this.f39367a = kVar;
    }

    public float getActionTextColorAlpha() {
        return this.f39371e;
    }

    public int getAnimationMode() {
        return this.f39369c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f39370d;
    }

    public int getMaxInlineActionWidth() {
        return this.f39373g;
    }

    public int getMaxWidth() {
        return this.f39372f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Insets mandatorySystemGestureInsets;
        int i10;
        super.onAttachedToWindow();
        k kVar = this.f39367a;
        if (kVar != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                WindowInsets rootWindowInsets = kVar.f39390i.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                    i10 = mandatorySystemGestureInsets.bottom;
                    kVar.f39399r = i10;
                    kVar.f();
                }
            } else {
                kVar.getClass();
            }
        }
        WeakHashMap weakHashMap = n1.f13788a;
        z0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z10;
        n nVar;
        super.onDetachedFromWindow();
        k kVar = this.f39367a;
        if (kVar != null) {
            o b10 = o.b();
            g gVar = kVar.f39403v;
            synchronized (b10.f39408a) {
                if (!b10.c(gVar) && ((nVar = b10.f39411d) == null || gVar == null || nVar.f39404a.get() != gVar)) {
                    z10 = false;
                }
                z10 = true;
            }
            if (z10) {
                k.f39381z.post(new f(kVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k kVar = this.f39367a;
        if (kVar != null && kVar.f39401t) {
            kVar.e();
            kVar.f39401t = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f39372f;
        if (i12 > 0 && getMeasuredWidth() > i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
    }

    public void setAnimationMode(int i10) {
        this.f39369c = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f39374h != null) {
            drawable = drawable.mutate();
            v3.b.h(drawable, this.f39374h);
            v3.b.i(drawable, this.f39375i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f39374h = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            v3.b.h(mutate, colorStateList);
            v3.b.i(mutate, this.f39375i);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f39375i = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            v3.b.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.f39377k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f39376j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            k kVar = this.f39367a;
            if (kVar != null) {
                v4.b bVar = k.f39378w;
                kVar.f();
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        i iVar;
        if (onClickListener != null) {
            iVar = null;
        } else {
            iVar = f39366l;
        }
        setOnTouchListener(iVar);
        super.setOnClickListener(onClickListener);
    }
}
