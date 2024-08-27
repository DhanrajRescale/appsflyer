package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import nu.g;

/* loaded from: classes2.dex */
public class d extends g {
    public static float a(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static long b(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        return j10;
    }

    public static float c(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static double d(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            if (d10 > d12) {
                return d12;
            }
            return d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float e(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            if (f10 > f12) {
                return f12;
            }
            return f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int f(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            if (i10 > i12) {
                return i12;
            }
            return i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long g(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            if (j10 > j12) {
                return j12;
            }
            return j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static Comparable h(Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(num, "<this>");
        if (num2 != null && num3 != null) {
            if (num2.compareTo(num3) <= 0) {
                if (num.compareTo(num2) < 0) {
                    return num2;
                }
                if (num.compareTo(num3) > 0) {
                    return num3;
                }
            } else {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + num3 + " is less than minimum " + num2 + '.');
            }
        } else {
            if (num2 != null && num.compareTo(num2) < 0) {
                return num2;
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                return num3;
            }
        }
        return num;
    }

    public static boolean i(nu.b bVar, float f10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.a(Double.valueOf(f10));
    }

    public static c j(IntRange intRange, int i10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer step = Integer.valueOf(i10);
        Intrinsics.checkNotNullParameter(step, "step");
        if (z10) {
            c.Companion companion = c.INSTANCE;
            int i11 = intRange.f23381a;
            if (intRange.f23383c <= 0) {
                i10 = -i10;
            }
            companion.getClass();
            return new c(i11, intRange.f23382b, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.ranges.c, kotlin.ranges.IntRange] */
    public static IntRange k(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            IntRange.INSTANCE.getClass();
            return IntRange.f23374f;
        }
        return new c(i10, i11 - 1, 1);
    }
}
