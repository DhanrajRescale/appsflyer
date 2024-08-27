package v3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* loaded from: classes.dex */
public abstract class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f37679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37680b;

    /* renamed from: e, reason: collision with root package name */
    public final BitmapShader f37683e;

    /* renamed from: g, reason: collision with root package name */
    public float f37685g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37689k;

    /* renamed from: l, reason: collision with root package name */
    public final int f37690l;

    /* renamed from: m, reason: collision with root package name */
    public final int f37691m;

    /* renamed from: c, reason: collision with root package name */
    public final int f37681c = 119;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f37682d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f37684f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    public final Rect f37686h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    public final RectF f37687i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    public boolean f37688j = true;

    public i(Resources resources, Bitmap bitmap) {
        this.f37680b = 160;
        if (resources != null) {
            this.f37680b = resources.getDisplayMetrics().densityDpi;
        }
        this.f37679a = bitmap;
        if (bitmap != null) {
            int i10 = this.f37680b;
            this.f37690l = bitmap.getScaledWidth(i10);
            this.f37691m = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f37683e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f37691m = -1;
        this.f37690l = -1;
        this.f37683e = null;
    }

    public final void a() {
        if (this.f37688j) {
            boolean z10 = this.f37689k;
            Rect rect = this.f37686h;
            if (z10) {
                int min = Math.min(this.f37690l, this.f37691m);
                Gravity.apply(this.f37681c, min, min, getBounds(), this.f37686h, 0);
                int min2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - min2) / 2), Math.max(0, (rect.height() - min2) / 2));
                this.f37685g = min2 * 0.5f;
            } else {
                Gravity.apply(this.f37681c, this.f37690l, this.f37691m, getBounds(), this.f37686h, 0);
            }
            RectF rectF = this.f37687i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f37683e;
            if (bitmapShader != null) {
                Matrix matrix = this.f37684f;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.f37679a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f37682d.setShader(bitmapShader);
            }
            this.f37688j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f37679a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.f37682d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f37686h, paint);
            return;
        }
        RectF rectF = this.f37687i;
        float f10 = this.f37685g;
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f37682d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f37682d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f37691m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f37690l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f37681c != 119 || this.f37689k || (bitmap = this.f37679a) == null || bitmap.hasAlpha() || this.f37682d.getAlpha() < 255 || this.f37685g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f37689k) {
            this.f37685g = Math.min(this.f37691m, this.f37690l) / 2;
        }
        this.f37688j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.f37682d;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37682d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f37682d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f37682d.setFilterBitmap(z10);
        invalidateSelf();
    }
}
