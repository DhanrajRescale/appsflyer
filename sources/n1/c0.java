package n1;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class c0 {
    /* JADX WARN: Type inference failed for: r6v0, types: [n1.a0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [n1.a0] */
    @NotNull
    public static final ColorSpace a(@NotNull o1.d dVar) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        float[] fArr;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb k10;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace.Named named3;
        ColorSpace colorSpace3;
        ColorSpace.Named named4;
        ColorSpace colorSpace4;
        ColorSpace.Named named5;
        ColorSpace colorSpace5;
        ColorSpace.Named named6;
        ColorSpace colorSpace6;
        ColorSpace.Named named7;
        ColorSpace colorSpace7;
        ColorSpace.Named named8;
        ColorSpace colorSpace8;
        ColorSpace.Named named9;
        ColorSpace colorSpace9;
        ColorSpace.Named named10;
        ColorSpace colorSpace10;
        ColorSpace.Named named11;
        ColorSpace colorSpace11;
        ColorSpace.Named named12;
        ColorSpace colorSpace12;
        ColorSpace.Named named13;
        ColorSpace colorSpace13;
        ColorSpace.Named named14;
        ColorSpace colorSpace14;
        ColorSpace.Named named15;
        ColorSpace colorSpace15;
        ColorSpace.Named named16;
        ColorSpace colorSpace16;
        ColorSpace.Named named17;
        ColorSpace colorSpace17;
        if (Intrinsics.a(dVar, o1.e.f29380c)) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace17 = ColorSpace.get(named17);
            return colorSpace17;
        }
        if (Intrinsics.a(dVar, o1.e.f29392o)) {
            named16 = ColorSpace.Named.ACES;
            colorSpace16 = ColorSpace.get(named16);
            return colorSpace16;
        }
        if (Intrinsics.a(dVar, o1.e.f29393p)) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace15 = ColorSpace.get(named15);
            return colorSpace15;
        }
        if (Intrinsics.a(dVar, o1.e.f29390m)) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace14 = ColorSpace.get(named14);
            return colorSpace14;
        }
        if (Intrinsics.a(dVar, o1.e.f29385h)) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace13 = ColorSpace.get(named13);
            return colorSpace13;
        }
        if (Intrinsics.a(dVar, o1.e.f29384g)) {
            named12 = ColorSpace.Named.BT709;
            colorSpace12 = ColorSpace.get(named12);
            return colorSpace12;
        }
        if (Intrinsics.a(dVar, o1.e.f29395r)) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace11 = ColorSpace.get(named11);
            return colorSpace11;
        }
        if (Intrinsics.a(dVar, o1.e.f29394q)) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace10 = ColorSpace.get(named10);
            return colorSpace10;
        }
        if (Intrinsics.a(dVar, o1.e.f29386i)) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace9 = ColorSpace.get(named9);
            return colorSpace9;
        }
        if (Intrinsics.a(dVar, o1.e.f29387j)) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace8 = ColorSpace.get(named8);
            return colorSpace8;
        }
        if (Intrinsics.a(dVar, o1.e.f29382e)) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named7);
            return colorSpace7;
        }
        if (Intrinsics.a(dVar, o1.e.f29383f)) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace6 = ColorSpace.get(named6);
            return colorSpace6;
        }
        if (Intrinsics.a(dVar, o1.e.f29381d)) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace5 = ColorSpace.get(named5);
            return colorSpace5;
        }
        if (Intrinsics.a(dVar, o1.e.f29388k)) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace4 = ColorSpace.get(named4);
            return colorSpace4;
        }
        if (Intrinsics.a(dVar, o1.e.f29391n)) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace3 = ColorSpace.get(named3);
            return colorSpace3;
        }
        if (Intrinsics.a(dVar, o1.e.f29389l)) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace2 = ColorSpace.get(named2);
            return colorSpace2;
        }
        if (!(dVar instanceof o1.r)) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            return colorSpace;
        }
        o1.r rVar = (o1.r) dVar;
        float[] a10 = rVar.f29425d.a();
        o1.s sVar = rVar.f29428g;
        if (sVar != null) {
            y.o();
            fArr = a10;
            transferParameters = y.g(sVar.f29440b, sVar.f29441c, sVar.f29442d, sVar.f29443e, sVar.f29444f, sVar.f29445g, sVar.f29439a);
        } else {
            fArr = a10;
            transferParameters = null;
        }
        if (transferParameters != null) {
            y.u();
            k10 = y.j(dVar.f29375a, ((o1.r) dVar).f29429h, fArr, transferParameters);
        } else {
            y.u();
            String str = dVar.f29375a;
            o1.r rVar2 = (o1.r) dVar;
            float[] fArr2 = rVar2.f29429h;
            final int i10 = 0;
            final o1.q qVar = rVar2.f29433l;
            ?? r62 = new DoubleUnaryOperator() { // from class: n1.a0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    int i11 = i10;
                    Function1 function1 = qVar;
                    switch (i11) {
                        case 0:
                            return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
                        default:
                            return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
                    }
                }
            };
            final int i11 = 1;
            final o1.q qVar2 = rVar2.f29436o;
            k10 = y.k(str, fArr2, fArr, r62, new DoubleUnaryOperator() { // from class: n1.a0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    int i112 = i11;
                    Function1 function1 = qVar2;
                    switch (i112) {
                        case 0:
                            return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
                        default:
                            return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
                    }
                }
            }, dVar.b(0), dVar.a(0));
        }
        return in.juspay.hypersdk.mystique.a.f(k10);
    }

    @NotNull
    public static final o1.d b(@NotNull final ColorSpace colorSpace) {
        int id2;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        o1.t tVar;
        float[] whitePoint2;
        float[] whitePoint3;
        o1.s sVar;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id3;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        float[] whitePoint4;
        float[] whitePoint5;
        float[] whitePoint6;
        id2 = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id2 != ordinal) {
            named2 = ColorSpace.Named.ACES;
            ordinal2 = named2.ordinal();
            if (id2 != ordinal2) {
                named3 = ColorSpace.Named.ACESCG;
                ordinal3 = named3.ordinal();
                if (id2 != ordinal3) {
                    named4 = ColorSpace.Named.ADOBE_RGB;
                    ordinal4 = named4.ordinal();
                    if (id2 != ordinal4) {
                        named5 = ColorSpace.Named.BT2020;
                        ordinal5 = named5.ordinal();
                        if (id2 != ordinal5) {
                            named6 = ColorSpace.Named.BT709;
                            ordinal6 = named6.ordinal();
                            if (id2 != ordinal6) {
                                named7 = ColorSpace.Named.CIE_LAB;
                                ordinal7 = named7.ordinal();
                                if (id2 != ordinal7) {
                                    named8 = ColorSpace.Named.CIE_XYZ;
                                    ordinal8 = named8.ordinal();
                                    if (id2 != ordinal8) {
                                        named9 = ColorSpace.Named.DCI_P3;
                                        ordinal9 = named9.ordinal();
                                        if (id2 != ordinal9) {
                                            named10 = ColorSpace.Named.DISPLAY_P3;
                                            ordinal10 = named10.ordinal();
                                            if (id2 != ordinal10) {
                                                named11 = ColorSpace.Named.EXTENDED_SRGB;
                                                ordinal11 = named11.ordinal();
                                                if (id2 != ordinal11) {
                                                    named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                                                    ordinal12 = named12.ordinal();
                                                    if (id2 != ordinal12) {
                                                        named13 = ColorSpace.Named.LINEAR_SRGB;
                                                        ordinal13 = named13.ordinal();
                                                        if (id2 != ordinal13) {
                                                            named14 = ColorSpace.Named.NTSC_1953;
                                                            ordinal14 = named14.ordinal();
                                                            if (id2 != ordinal14) {
                                                                named15 = ColorSpace.Named.PRO_PHOTO_RGB;
                                                                ordinal15 = named15.ordinal();
                                                                if (id2 != ordinal15) {
                                                                    named16 = ColorSpace.Named.SMPTE_C;
                                                                    ordinal16 = named16.ordinal();
                                                                    if (id2 == ordinal16) {
                                                                        return o1.e.f29389l;
                                                                    }
                                                                    if (y.p(colorSpace)) {
                                                                        transferParameters = y.i(colorSpace).getTransferParameters();
                                                                        whitePoint = y.i(colorSpace).getWhitePoint();
                                                                        final int i10 = 1;
                                                                        final int i11 = 0;
                                                                        if (whitePoint.length == 3) {
                                                                            whitePoint4 = y.i(colorSpace).getWhitePoint();
                                                                            float f10 = whitePoint4[0];
                                                                            whitePoint5 = y.i(colorSpace).getWhitePoint();
                                                                            float f11 = whitePoint5[1];
                                                                            whitePoint6 = y.i(colorSpace).getWhitePoint();
                                                                            float f12 = f10 + f11 + whitePoint6[2];
                                                                            tVar = new o1.t(f10 / f12, f11 / f12);
                                                                        } else {
                                                                            whitePoint2 = y.i(colorSpace).getWhitePoint();
                                                                            float f13 = whitePoint2[0];
                                                                            whitePoint3 = y.i(colorSpace).getWhitePoint();
                                                                            tVar = new o1.t(f13, whitePoint3[1]);
                                                                        }
                                                                        o1.t tVar2 = tVar;
                                                                        if (transferParameters != null) {
                                                                            d10 = transferParameters.g;
                                                                            d11 = transferParameters.a;
                                                                            d12 = transferParameters.b;
                                                                            d13 = transferParameters.c;
                                                                            d14 = transferParameters.d;
                                                                            d15 = transferParameters.e;
                                                                            d16 = transferParameters.f;
                                                                            sVar = new o1.s(d10, d11, d12, d13, d14, d15, d16);
                                                                        } else {
                                                                            sVar = null;
                                                                        }
                                                                        name = y.i(colorSpace).getName();
                                                                        primaries = y.i(colorSpace).getPrimaries();
                                                                        transform = y.i(colorSpace).getTransform();
                                                                        o1.j jVar = new o1.j() { // from class: n1.b0
                                                                            @Override // o1.j
                                                                            public final double h(double d17) {
                                                                                DoubleUnaryOperator oetf;
                                                                                DoubleUnaryOperator eotf;
                                                                                int i12 = i11;
                                                                                ColorSpace colorSpace2 = colorSpace;
                                                                                switch (i12) {
                                                                                    case 0:
                                                                                        oetf = y.i(colorSpace2).getOetf();
                                                                                        return oetf.applyAsDouble(d17);
                                                                                    default:
                                                                                        eotf = y.i(colorSpace2).getEotf();
                                                                                        return eotf.applyAsDouble(d17);
                                                                                }
                                                                            }
                                                                        };
                                                                        o1.j jVar2 = new o1.j() { // from class: n1.b0
                                                                            @Override // o1.j
                                                                            public final double h(double d17) {
                                                                                DoubleUnaryOperator oetf;
                                                                                DoubleUnaryOperator eotf;
                                                                                int i12 = i10;
                                                                                ColorSpace colorSpace2 = colorSpace;
                                                                                switch (i12) {
                                                                                    case 0:
                                                                                        oetf = y.i(colorSpace2).getOetf();
                                                                                        return oetf.applyAsDouble(d17);
                                                                                    default:
                                                                                        eotf = y.i(colorSpace2).getEotf();
                                                                                        return eotf.applyAsDouble(d17);
                                                                                }
                                                                            }
                                                                        };
                                                                        minValue = colorSpace.getMinValue(0);
                                                                        maxValue = colorSpace.getMaxValue(0);
                                                                        id3 = y.i(colorSpace).getId();
                                                                        return new o1.r(name, primaries, tVar2, transform, jVar, jVar2, minValue, maxValue, sVar, id3);
                                                                    }
                                                                    return o1.e.f29380c;
                                                                }
                                                                return o1.e.f29391n;
                                                            }
                                                            return o1.e.f29388k;
                                                        }
                                                        return o1.e.f29381d;
                                                    }
                                                    return o1.e.f29383f;
                                                }
                                                return o1.e.f29382e;
                                            }
                                            return o1.e.f29387j;
                                        }
                                        return o1.e.f29386i;
                                    }
                                    return o1.e.f29394q;
                                }
                                return o1.e.f29395r;
                            }
                            return o1.e.f29384g;
                        }
                        return o1.e.f29385h;
                    }
                    return o1.e.f29390m;
                }
                return o1.e.f29393p;
            }
            return o1.e.f29392o;
        }
        return o1.e.f29380c;
    }
}
