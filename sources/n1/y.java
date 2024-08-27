package n1;

import android.graphics.ColorSpace;

/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
    public static /* synthetic */ ColorSpace.Rgb.TransferParameters g(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        return new ColorSpace.Rgb.TransferParameters(d10, d11, d12, d13, d14, d15, d16);
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Rgb i(Object obj) {
        return (ColorSpace.Rgb) obj;
    }

    public static /* synthetic */ ColorSpace.Rgb j(String str, float[] fArr, float[] fArr2, ColorSpace.Rgb.TransferParameters transferParameters) {
        return new ColorSpace.Rgb(str, fArr, fArr2, transferParameters);
    }

    public static /* synthetic */ ColorSpace.Rgb k(String str, float[] fArr, float[] fArr2, a0 a0Var, a0 a0Var2, float f10, float f11) {
        return new ColorSpace.Rgb(str, fArr, fArr2, a0Var, a0Var2, f10, f11);
    }

    public static /* synthetic */ void o() {
    }

    public static /* bridge */ /* synthetic */ boolean p(Object obj) {
        return obj instanceof ColorSpace.Rgb;
    }

    public static /* synthetic */ void u() {
    }
}
