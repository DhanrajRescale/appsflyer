package ko;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes2.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f23307a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f23308b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f23309c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f23310d;

    public f(k kVar) {
        this.f23310d = kVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        this.f23310d.f23343p = f10;
        float[] fArr = this.f23307a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f23308b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr2[i10] = nn.d.b(f11, f12, f10, f12);
        }
        Matrix matrix = this.f23309c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
