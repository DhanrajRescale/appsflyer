package vs;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r3.k;
import s0.g;

/* loaded from: classes2.dex */
public abstract class d extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f38301a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f38302b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f38303c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f38304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        Intrinsics.e(context, "context");
        Paint paint = null;
        float f10 = 0.8f;
        boolean z10 = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f38306b, 0, 0);
            try {
                f10 = obtainStyledAttributes.getFraction(0, 1, 1, 0.8f) * 255.0f;
                z10 = obtainStyledAttributes.getBoolean(1, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setWillNotDraw(false);
        super.setLayerType(2, null);
        Paint paint2 = new Paint();
        paint2.setColor(k.getColor(context, R.color.black));
        paint2.setAlpha((int) (f10 * 255.0f));
        this.f38301a = paint2;
        Paint paint3 = new Paint();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f38302b = paint3;
        if (z10) {
            paint = new Paint();
            paint.setStrokeWidth(5);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(k.getColor(context, com.assetgro.stockgro.prod.R.color.light_white));
        }
        this.f38303c = paint;
    }

    public final RectF getFrame() {
        return this.f38304d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.e(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = this.f38301a;
        a aVar = (a) this;
        int i10 = aVar.f38294e;
        switch (i10) {
            case 1:
                Intrinsics.e(paint, "paint");
                break;
            default:
                Intrinsics.e(paint, "paint");
                canvas.drawRect(g.f34069a, g.f34069a, aVar.getWidth(), aVar.getHeight(), aVar.f38301a);
                break;
        }
        Paint paint2 = this.f38302b;
        switch (i10) {
            case 0:
                Intrinsics.e(paint2, "paint");
                RectF frame = aVar.getFrame();
                if (frame != null) {
                    canvas.drawCircle(aVar.getMeasuredWidth() / 2.0f, aVar.getMeasuredHeight() / 2.0f, Math.max(frame.width(), frame.height()) / 2.0f, paint2);
                    break;
                }
                break;
            case 1:
                Intrinsics.e(paint2, "paint");
                break;
            default:
                Intrinsics.e(paint2, "paint");
                RectF frame2 = aVar.getFrame();
                if (frame2 != null) {
                    float width = frame2.width();
                    float height = frame2.height();
                    canvas.drawRect((aVar.getWidth() - width) / 2.0f, (aVar.getHeight() - height) / 2.0f, (aVar.getWidth() + width) / 2.0f, (aVar.getHeight() + height) / 2.0f, paint2);
                    break;
                }
                break;
        }
        Paint paint3 = this.f38303c;
        if (paint3 != null) {
            switch (i10) {
                case 0:
                    RectF frame3 = aVar.getFrame();
                    if (frame3 != null) {
                        float width2 = frame3.width();
                        float height2 = frame3.height();
                        float width3 = (aVar.getWidth() - width2) / 2.0f;
                        float height3 = (aVar.getHeight() - height2) / 2.0f;
                        float width4 = (aVar.getWidth() + width2) / 2.0f;
                        float height4 = (aVar.getHeight() + height2) / 2.0f;
                        float max = Math.max(width2, height2) / 2.0f;
                        canvas.drawCircle(aVar.getMeasuredWidth() / 2.0f, aVar.getMeasuredHeight() / 2.0f, max, paint3);
                        float f10 = 3;
                        double d10 = 2;
                        float sqrt = max - ((float) Math.sqrt(((float) Math.pow(max, d10)) - ((float) Math.pow(max / f10, d10))));
                        float f11 = height2 / f10;
                        float f12 = width3 + sqrt;
                        float f13 = height3 + f11;
                        float f14 = width4 - sqrt;
                        canvas.drawLine(f12, f13, f14, f13, paint3);
                        float f15 = 2;
                        float f16 = (f11 * f15) + height3;
                        canvas.drawLine(f12, f16, f14, f16, paint3);
                        float f17 = width2 / f10;
                        float f18 = width3 + f17;
                        float f19 = height3 + sqrt;
                        float f20 = height4 - sqrt;
                        canvas.drawLine(f18, f19, f18, f20, paint3);
                        float f21 = (f17 * f15) + width3;
                        canvas.drawLine(f21, f19, f21, f20, paint3);
                        return;
                    }
                    return;
                case 1:
                    return;
                default:
                    RectF frame4 = aVar.getFrame();
                    if (frame4 != null) {
                        float width5 = frame4.width();
                        float height5 = frame4.height();
                        float width6 = (aVar.getWidth() - width5) / 2.0f;
                        float height6 = (aVar.getHeight() - height5) / 2.0f;
                        float width7 = (aVar.getWidth() + width5) / 2.0f;
                        float height7 = (aVar.getHeight() + height5) / 2.0f;
                        float f22 = 3;
                        float f23 = height5 / f22;
                        canvas.drawLine(width6, height6, width7, height6, paint3);
                        float f24 = height6 + f23;
                        canvas.drawLine(width6, f24, width7, f24, paint3);
                        float f25 = 2;
                        float f26 = (f23 * f25) + height6;
                        canvas.drawLine(width6, f26, width7, f26, paint3);
                        canvas.drawLine(width6, height7, width7, height7, paint3);
                        float f27 = width5 / f22;
                        canvas.drawLine(width6, height6, width6, height7, paint3);
                        float f28 = width6 + f27;
                        canvas.drawLine(f28, height6, f28, height7, paint3);
                        float f29 = (f27 * f25) + width6;
                        canvas.drawLine(f29, height6, f29, height7, paint3);
                        canvas.drawLine(width7, height6, width7, height7, paint3);
                        return;
                    }
                    return;
            }
        }
    }

    public final void setFrame(@NotNull RectF frame) {
        Intrinsics.e(frame, "frame");
        this.f38304d = frame;
    }

    @Override // android.view.View
    public final void setLayerType(int i10, Paint paint) {
        super.setLayerType(i10, paint);
    }

    @Override // android.view.View
    public final void setWillNotDraw(boolean z10) {
        super.setWillNotDraw(z10);
    }
}
