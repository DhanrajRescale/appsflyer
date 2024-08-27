package to;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class q extends u {

    /* renamed from: c, reason: collision with root package name */
    public final s f36307c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36308d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36309e;

    public q(s sVar, float f10, float f11) {
        this.f36307c = sVar;
        this.f36308d = f10;
        this.f36309e = f11;
    }

    @Override // to.u
    public final void a(Matrix matrix, so.a aVar, int i10, Canvas canvas) {
        s sVar = this.f36307c;
        float f10 = sVar.f36318c;
        float f11 = this.f36309e;
        float f12 = sVar.f36317b;
        float f13 = this.f36308d;
        RectF rectF = new RectF(s0.g.f34069a, s0.g.f34069a, (float) Math.hypot(f10 - f11, f12 - f13), s0.g.f34069a);
        Matrix matrix2 = this.f36321a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(s0.g.f34069a, -i10);
        int[] iArr = so.a.f34723i;
        iArr[0] = aVar.f34732f;
        iArr[1] = aVar.f34731e;
        iArr[2] = aVar.f34730d;
        Paint paint = aVar.f34729c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, so.a.f34724j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        s sVar = this.f36307c;
        return (float) Math.toDegrees(Math.atan((sVar.f36318c - this.f36309e) / (sVar.f36317b - this.f36308d)));
    }
}
