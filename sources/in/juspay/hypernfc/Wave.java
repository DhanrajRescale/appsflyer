package in.juspay.hypernfc;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import d4.y1;
import s0.g;

/* loaded from: classes2.dex */
public class Wave extends View {
    private final int[] alphas;
    private int offSet;
    private final Paint[] paints;
    private final float[] radii;

    public Wave(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paints = new Paint[3];
        this.radii = new float[]{g.f34069a, g.f34069a, g.f34069a};
        this.alphas = new int[]{200, 200, 200};
        this.offSet = 0;
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.animation.TimeInterpolator, java.lang.Object] */
    private ValueAnimator createRingAnimator(Paint paint) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g.f34069a, 1.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(4000L);
        ofFloat.setInterpolator(new Object());
        ofFloat.addUpdateListener(new y1(1, this, paint));
        return ofFloat;
    }

    private void init() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.paints[i10] = new Paint();
            this.paints[i10].setColor(Color.parseColor("#D9D9D9"));
            this.paints[i10].setStyle(Paint.Style.STROKE);
            this.paints[i10].setStrokeWidth(25.0f);
            this.paints[i10].setAlpha(this.alphas[i10]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$createRingAnimator$0(float f10) {
        if (f10 < 0.5f) {
            return 2.0f * f10 * f10;
        }
        float f11 = 1.0f - f10;
        return 1.0f - ((2.0f * f11) * f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createRingAnimator$1(Paint paint, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float width = ((1.5f * floatValue) * getWidth()) / 2.0f;
        paint.setAlpha((int) ((1.0f - floatValue) * 150.0f));
        for (int i10 = 0; i10 < 3; i10++) {
            if (paint == this.paints[i10]) {
                this.radii[i10] = width;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int i10 = this.offSet;
        for (int i11 = 0; i11 < 3; i11++) {
            canvas.drawCircle(width, i10, this.radii[i11], this.paints[i11]);
        }
    }

    public void startRippleAnimation(int i10) {
        this.offSet = i10;
        final ValueAnimator[] valueAnimatorArr = new ValueAnimator[3];
        for (int i11 = 0; i11 < 3; i11++) {
            valueAnimatorArr[i11] = createRingAnimator(this.paints[i11]);
        }
        for (final int i12 = 0; i12 < 2; i12++) {
            valueAnimatorArr[i12].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: in.juspay.hypernfc.Wave.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    if (valueAnimator.getCurrentPlayTime() >= 500) {
                        valueAnimatorArr[i12 + 1].start();
                        valueAnimatorArr[i12].removeUpdateListener(this);
                    }
                }
            });
        }
        valueAnimatorArr[0].start();
    }
}
