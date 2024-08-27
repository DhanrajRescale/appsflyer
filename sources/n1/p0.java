package n1;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface p0 {
    static void a(p0 p0Var, m1.d dVar) {
        h hVar = (h) p0Var;
        float f10 = dVar.f27239a;
        if (!Float.isNaN(f10)) {
            float f11 = dVar.f27240b;
            if (!Float.isNaN(f11)) {
                float f12 = dVar.f27241c;
                if (!Float.isNaN(f12)) {
                    float f13 = dVar.f27242d;
                    if (!Float.isNaN(f13)) {
                        if (hVar.f28139b == null) {
                            hVar.f28139b = new RectF();
                        }
                        RectF rectF = hVar.f28139b;
                        Intrinsics.c(rectF);
                        rectF.set(f10, f11, f12, f13);
                        RectF rectF2 = hVar.f28139b;
                        Intrinsics.c(rectF2);
                        hVar.f28138a.addRect(rectF2, androidx.compose.ui.graphics.a.l(1));
                        return;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    static void b(p0 p0Var, m1.e eVar) {
        h hVar = (h) p0Var;
        if (hVar.f28139b == null) {
            hVar.f28139b = new RectF();
        }
        RectF rectF = hVar.f28139b;
        Intrinsics.c(rectF);
        rectF.set(eVar.f27243a, eVar.f27244b, eVar.f27245c, eVar.f27246d);
        if (hVar.f28140c == null) {
            hVar.f28140c = new float[8];
        }
        float[] fArr = hVar.f28140c;
        Intrinsics.c(fArr);
        long j10 = eVar.f27247e;
        fArr[0] = m1.a.b(j10);
        fArr[1] = m1.a.c(j10);
        long j11 = eVar.f27248f;
        fArr[2] = m1.a.b(j11);
        fArr[3] = m1.a.c(j11);
        long j12 = eVar.f27249g;
        fArr[4] = m1.a.b(j12);
        fArr[5] = m1.a.c(j12);
        long j13 = eVar.f27250h;
        fArr[6] = m1.a.b(j13);
        fArr[7] = m1.a.c(j13);
        RectF rectF2 = hVar.f28139b;
        Intrinsics.c(rectF2);
        float[] fArr2 = hVar.f28140c;
        Intrinsics.c(fArr2);
        hVar.f28138a.addRoundRect(rectF2, fArr2, androidx.compose.ui.graphics.a.l(1));
    }
}
