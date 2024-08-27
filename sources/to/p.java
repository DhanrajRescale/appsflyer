package to;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class p extends u {

    /* renamed from: c, reason: collision with root package name */
    public final r f36306c;

    public p(r rVar) {
        this.f36306c = rVar;
    }

    @Override // to.u
    public final void a(Matrix matrix, so.a aVar, int i10, Canvas canvas) {
        boolean z10;
        r rVar = this.f36306c;
        float f10 = rVar.f36315f;
        float f11 = rVar.f36316g;
        RectF rectF = new RectF(rVar.f36311b, rVar.f36312c, rVar.f36313d, rVar.f36314e);
        aVar.getClass();
        if (f11 < s0.g.f34069a) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = aVar.f34733g;
        int[] iArr = so.a.f34725k;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = aVar.f34732f;
            iArr[2] = aVar.f34731e;
            iArr[3] = aVar.f34730d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f34730d;
            iArr[2] = aVar.f34731e;
            iArr[3] = aVar.f34732f;
        }
        float width = rectF.width() / 2.0f;
        if (width > s0.g.f34069a) {
            float f13 = 1.0f - (i10 / width);
            float[] fArr = so.a.f34726l;
            fArr[1] = f13;
            fArr[2] = ((1.0f - f13) / 2.0f) + f13;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar.f34728b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f34734h);
            }
            canvas.drawArc(rectF, f10, f11, true, paint);
            canvas.restore();
        }
    }
}
