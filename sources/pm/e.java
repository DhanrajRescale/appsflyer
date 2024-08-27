package pm;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import com.github.clans.fab.FloatingActionButton;

/* loaded from: classes.dex */
public final class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f31186a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f31187b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31188c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f31189d;

    public e(FloatingActionButton floatingActionButton) {
        int circleSize;
        this.f31189d = floatingActionButton;
        Paint paint = new Paint(1);
        this.f31186a = paint;
        Paint paint2 = new Paint(1);
        this.f31187b = paint2;
        floatingActionButton.setLayerType(1, null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(floatingActionButton.f10984g);
        paint2.setXfermode(FloatingActionButton.f10975p0);
        if (!floatingActionButton.isInEditMode()) {
            paint.setShadowLayer(floatingActionButton.f10979d, floatingActionButton.f10980e, floatingActionButton.f10982f, floatingActionButton.f10978c);
        }
        circleSize = floatingActionButton.getCircleSize();
        float f10 = circleSize / 2;
        this.f31188c = f10;
        if (floatingActionButton.f11005t && floatingActionButton.n0) {
            this.f31188c = f10 + floatingActionButton.f11006u;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        PorterDuffXfermode porterDuffXfermode = FloatingActionButton.f10975p0;
        FloatingActionButton floatingActionButton = this.f31189d;
        canvas.drawCircle(floatingActionButton.getMeasuredWidth() / 2, floatingActionButton.getMeasuredHeight() / 2, this.f31188c, this.f31186a);
        canvas.drawCircle(floatingActionButton.getMeasuredWidth() / 2, floatingActionButton.getMeasuredHeight() / 2, this.f31188c, this.f31187b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
