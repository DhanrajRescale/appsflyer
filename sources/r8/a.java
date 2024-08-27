package r8;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import jr.h;
import kotlin.ranges.d;
import u7.c;
import yk.g;
import z8.f;

/* loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final f f33449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33450b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33451c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33452d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f33453e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final int f33454f;

    /* renamed from: g, reason: collision with root package name */
    public final int f33455g;

    /* renamed from: h, reason: collision with root package name */
    public long f33456h;

    /* renamed from: i, reason: collision with root package name */
    public int f33457i;

    /* renamed from: j, reason: collision with root package name */
    public int f33458j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f33459k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f33460l;

    public a(Drawable drawable, f fVar, int i10, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        this.f33449a = fVar;
        this.f33450b = i10;
        this.f33451c = z10;
        this.f33452d = z11;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        this.f33454f = a(null, num);
        if (drawable != null) {
            num2 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num2 = null;
        }
        this.f33455g = a(null, num2);
        this.f33457i = 255;
        this.f33459k = null;
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        this.f33460l = mutate;
        if (i10 > 0) {
            Drawable drawable2 = this.f33459k;
            if (drawable2 != null) {
                drawable2.setCallback(this);
            }
            if (mutate != null) {
                mutate.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    public final int a(Integer num, Integer num2) {
        int i10;
        int i11 = -1;
        if (!this.f33452d && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        if (num2 != null) {
            i11 = num2.intValue();
        }
        return Math.max(i10, i11);
    }

    public final void b() {
        this.f33458j = 2;
        this.f33459k = null;
        ArrayList arrayList = this.f33453e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double o10 = g.o(intrinsicWidth, intrinsicHeight, width, height, this.f33449a);
            double d10 = 2;
            int a10 = ku.c.a((width - (intrinsicWidth * o10)) / d10);
            int a11 = ku.c.a((height - (o10 * intrinsicHeight)) / d10);
            drawable.setBounds(rect.left + a10, rect.top + a11, rect.right - a10, rect.bottom - a11);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        int save;
        Drawable drawable;
        int i10 = this.f33458j;
        if (i10 == 0) {
            Drawable drawable2 = this.f33459k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f33457i);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f33460l;
        if (i10 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f33457i);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.f33456h) / this.f33450b;
        double d10 = d.d(uptimeMillis, 0.0d, 1.0d);
        int i11 = this.f33457i;
        int i12 = (int) (d10 * i11);
        if (this.f33451c) {
            i11 -= i12;
        }
        if (uptimeMillis >= 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (drawable = this.f33459k) != null) {
            drawable.setAlpha(i11);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i12);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z10) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f33457i;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i10 = this.f33458j;
        if (i10 != 0) {
            Drawable drawable = this.f33460l;
            if (i10 != 1) {
                if (i10 != 2 || drawable == null) {
                    return null;
                }
                return drawable.getColorFilter();
            }
            if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable2 = this.f33459k;
            if (drawable2 == null) {
                return null;
            }
            return drawable2.getColorFilter();
        }
        Drawable drawable3 = this.f33459k;
        if (drawable3 == null) {
            return null;
        }
        return drawable3.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f33455g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f33454f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f33459k;
        int i10 = this.f33458j;
        if (i10 == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        }
        Drawable drawable2 = this.f33460l;
        if (i10 == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 == null) {
            return -2;
        }
        return drawable2.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f33458j == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f33459k;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f33460l;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f33459k;
        if (drawable != null) {
            z10 = drawable.setLevel(i10);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f33460l;
        if (drawable2 != null) {
            z11 = drawable2.setLevel(i10);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f33459k;
        if (drawable != null) {
            z10 = drawable.setState(iArr);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f33460l;
        if (drawable2 != null) {
            z11 = drawable2.setState(iArr);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (i10 >= 0 && i10 < 256) {
            this.f33457i = i10;
            return;
        }
        throw new IllegalArgumentException(h.n("Invalid alpha: ", i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f33459k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f33460l;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f33459k;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f33460l;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f33459k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f33460l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f33459k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f33460l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f33459k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f33460l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        Object obj = this.f33459k;
        Animatable animatable2 = null;
        if (obj instanceof Animatable) {
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f33460l;
        if (obj2 instanceof Animatable) {
            animatable2 = (Animatable) obj2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f33458j != 0) {
            return;
        }
        this.f33458j = 1;
        this.f33456h = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f33453e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        Object obj = this.f33459k;
        Animatable animatable2 = null;
        if (obj instanceof Animatable) {
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f33460l;
        if (obj2 instanceof Animatable) {
            animatable2 = (Animatable) obj2;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f33458j != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
