package pm;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.TextView;
import com.github.clans.fab.FloatingActionButton;

/* loaded from: classes.dex */
public final class k extends TextView {

    /* renamed from: s, reason: collision with root package name */
    public static final PorterDuffXfermode f31204s = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: a, reason: collision with root package name */
    public int f31205a;

    /* renamed from: b, reason: collision with root package name */
    public int f31206b;

    /* renamed from: c, reason: collision with root package name */
    public int f31207c;

    /* renamed from: d, reason: collision with root package name */
    public int f31208d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f31209e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31210f;

    /* renamed from: g, reason: collision with root package name */
    public int f31211g;

    /* renamed from: h, reason: collision with root package name */
    public int f31212h;

    /* renamed from: i, reason: collision with root package name */
    public int f31213i;

    /* renamed from: j, reason: collision with root package name */
    public int f31214j;

    /* renamed from: k, reason: collision with root package name */
    public int f31215k;

    /* renamed from: l, reason: collision with root package name */
    public int f31216l;

    /* renamed from: m, reason: collision with root package name */
    public FloatingActionButton f31217m;

    /* renamed from: n, reason: collision with root package name */
    public Animation f31218n;

    /* renamed from: o, reason: collision with root package name */
    public Animation f31219o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31220p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31221q;

    /* renamed from: r, reason: collision with root package name */
    public GestureDetector f31222r;

    @TargetApi(21)
    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    private void setShadow(FloatingActionButton floatingActionButton) {
        this.f31208d = floatingActionButton.getShadowColor();
        this.f31205a = floatingActionButton.getShadowRadius();
        this.f31206b = floatingActionButton.getShadowXOffset();
        this.f31207c = floatingActionButton.getShadowYOffset();
        this.f31210f = floatingActionButton.f();
    }

    public final RippleDrawable a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, b(this.f31214j));
        stateListDrawable.addState(new int[0], b(this.f31213i));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f31215k}), stateListDrawable, null);
        setOutlineProvider(new a(this, 1));
        setClipToOutline(true);
        this.f31209e = rippleDrawable;
        return rippleDrawable;
    }

    public final ShapeDrawable b(int i10) {
        float f10 = this.f31216l;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }

    public final void c() {
        if (this.f31220p) {
            this.f31209e = getBackground();
        }
        Drawable drawable = this.f31209e;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{R.attr.state_pressed});
        } else if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            rippleDrawable.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
            rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            rippleDrawable.setVisible(true, true);
        }
    }

    public final void d() {
        if (this.f31220p) {
            this.f31209e = getBackground();
        }
        Drawable drawable = this.f31209e;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[0]);
        } else if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            rippleDrawable.setState(new int[0]);
            rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            rippleDrawable.setVisible(true, true);
        }
    }

    public final void e() {
        LayerDrawable layerDrawable;
        if (this.f31210f) {
            layerDrawable = new LayerDrawable(new Drawable[]{new j(this), a()});
            layerDrawable.setLayerInset(1, Math.abs(this.f31206b) + this.f31205a, Math.abs(this.f31207c) + this.f31205a, Math.abs(this.f31206b) + this.f31205a, Math.abs(this.f31207c) + this.f31205a);
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{a()});
        }
        setBackgroundCompat(layerDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        if (this.f31211g == 0) {
            this.f31211g = getMeasuredWidth();
        }
        int measuredWidth = getMeasuredWidth();
        int i13 = 0;
        if (this.f31210f) {
            i12 = Math.abs(this.f31206b) + this.f31205a;
        } else {
            i12 = 0;
        }
        int i14 = i12 + measuredWidth;
        if (this.f31212h == 0) {
            this.f31212h = getMeasuredHeight();
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f31210f) {
            i13 = Math.abs(this.f31207c) + this.f31205a;
        }
        setMeasuredDimension(i14, measuredHeight + i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FloatingActionButton floatingActionButton = this.f31217m;
        if (floatingActionButton != null && floatingActionButton.getOnClickListener() != null && this.f31217m.isEnabled()) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 3) {
                    d();
                    this.f31217m.i();
                }
            } else {
                d();
                this.f31217m.i();
            }
            this.f31222r.onTouchEvent(motionEvent);
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCornerRadius(int i10) {
        this.f31216l = i10;
    }

    public void setFab(FloatingActionButton floatingActionButton) {
        this.f31217m = floatingActionButton;
        setShadow(floatingActionButton);
    }

    public void setHandleVisibilityChanges(boolean z10) {
        this.f31221q = z10;
    }

    public void setHideAnimation(Animation animation) {
        this.f31219o = animation;
    }

    public void setShowAnimation(Animation animation) {
        this.f31218n = animation;
    }

    public void setShowShadow(boolean z10) {
        this.f31210f = z10;
    }

    public void setUsingStyle(boolean z10) {
        this.f31220p = z10;
    }
}
