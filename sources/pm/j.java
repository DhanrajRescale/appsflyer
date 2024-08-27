package pm;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class j extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f31201a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f31202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f31203c;

    public j(k kVar) {
        this.f31203c = kVar;
        Paint paint = new Paint(1);
        this.f31201a = paint;
        Paint paint2 = new Paint(1);
        this.f31202b = paint2;
        kVar.setLayerType(1, null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(kVar.f31213i);
        paint2.setXfermode(k.f31204s);
        if (!kVar.isInEditMode()) {
            paint.setShadowLayer(kVar.f31205a, kVar.f31206b, kVar.f31207c, kVar.f31208d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        k kVar = this.f31203c;
        RectF rectF = new RectF(Math.abs(kVar.f31206b) + kVar.f31205a, Math.abs(kVar.f31207c) + kVar.f31205a, kVar.f31211g, kVar.f31212h);
        int i10 = kVar.f31216l;
        canvas.drawRoundRect(rectF, i10, i10, this.f31201a);
        int i11 = kVar.f31216l;
        canvas.drawRoundRect(rectF, i11, i11, this.f31202b);
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
