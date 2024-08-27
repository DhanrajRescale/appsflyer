package mo;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public abstract class v extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f27955a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f27956b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f27957c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27958d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27960f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27961g;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f27956b != null && this.f27955a != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            boolean z10 = this.f27958d;
            Rect rect = this.f27957c;
            if (z10) {
                rect.set(0, 0, width, this.f27956b.top);
                this.f27955a.setBounds(rect);
                this.f27955a.draw(canvas);
            }
            if (this.f27959e) {
                rect.set(0, height - this.f27956b.bottom, width, height);
                this.f27955a.setBounds(rect);
                this.f27955a.draw(canvas);
            }
            if (this.f27960f) {
                Rect rect2 = this.f27956b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f27955a.setBounds(rect);
                this.f27955a.draw(canvas);
            }
            if (this.f27961g) {
                Rect rect3 = this.f27956b;
                rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
                this.f27955a.setBounds(rect);
                this.f27955a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f27955a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f27955a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f27959e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f27960f = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f27961g = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f27958d = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f27955a = drawable;
    }
}
