package androidx.navigation;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class m0 extends s0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2255m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10) {
        super(true);
        this.f2255m = i10;
    }

    public static float[] h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new float[]{((Number) s0.f2297g.c(value)).floatValue()};
    }

    public static int[] i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new int[]{((Number) s0.f2292b.c(value)).intValue()};
    }

    public static long[] j(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new long[]{((Number) s0.f2295e.c(value)).longValue()};
    }

    public static boolean[] k(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new boolean[]{((Boolean) s0.f2299i.c(value)).booleanValue()};
    }

    @Override // androidx.navigation.s0
    public final Object a(Bundle bundle, String key) {
        switch (this.f2255m) {
            case 0:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (boolean[]) bundle.get(key);
            case 1:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (Boolean) bundle.get(key);
            case 2:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (float[]) bundle.get(key);
            case 3:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj = bundle.get(key);
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return (Float) obj;
            case 4:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (int[]) bundle.get(key);
            case 5:
                return f(bundle, key);
            case 6:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (long[]) bundle.get(key);
            case 7:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = bundle.get(key);
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Long");
                return (Long) obj2;
            case 8:
                return f(bundle, key);
            case 9:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (String[]) bundle.get(key);
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (String) bundle.get(key);
        }
    }

    @Override // androidx.navigation.s0
    public final String b() {
        switch (this.f2255m) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
                return "reference";
            case 9:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // androidx.navigation.s0
    public final Object c(String value) {
        String str;
        long parseLong;
        boolean z10 = true;
        switch (this.f2255m) {
            case 0:
                return k(value);
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.a(value, "true")) {
                    if (Intrinsics.a(value, "false")) {
                        z10 = false;
                    } else {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                }
                return Boolean.valueOf(z10);
            case 2:
                return h(value);
            case 3:
                Intrinsics.checkNotNullParameter(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 4:
                return i(value);
            case 5:
                return g(value);
            case 6:
                return j(value);
            case 7:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.s.i(value, "L", false)) {
                    str = value.substring(0, value.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str = value;
                }
                if (kotlin.text.s.r(value, "0x", false)) {
                    String substring = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    parseLong = Long.parseLong(substring, CharsKt.checkRadix(16));
                } else {
                    parseLong = Long.parseLong(str);
                }
                return Long.valueOf(parseLong);
            case 8:
                return g(value);
            case 9:
                Intrinsics.checkNotNullParameter(value, "value");
                return new String[]{value};
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.a(value, "null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // androidx.navigation.s0
    public final Object d(String value, Object obj) {
        switch (this.f2255m) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (zArr != null) {
                    boolean[] elements = k(value);
                    Intrinsics.checkNotNullParameter(zArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(elements, 0, copyOf, length, 1);
                    Intrinsics.c(copyOf);
                    return copyOf;
                }
                return k(value);
            case 2:
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (fArr != null) {
                    float[] elements2 = h(value);
                    Intrinsics.checkNotNullParameter(fArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(elements2, 0, copyOf2, length2, 1);
                    Intrinsics.c(copyOf2);
                    return copyOf2;
                }
                return h(value);
            case 4:
                int[] iArr = (int[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (iArr != null) {
                    int[] elements3 = i(value);
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(elements3, 0, copyOf3, length3, 1);
                    Intrinsics.c(copyOf3);
                    return copyOf3;
                }
                return i(value);
            case 6:
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (jArr != null) {
                    long[] elements4 = j(value);
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements4, "elements");
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(elements4, 0, copyOf4, length4, 1);
                    Intrinsics.c(copyOf4);
                    return copyOf4;
                }
                return j(value);
            case 9:
                String[] strArr = (String[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (strArr != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    String[] elements5 = {value};
                    Intrinsics.checkNotNullParameter(strArr, "<this>");
                    Intrinsics.checkNotNullParameter(elements5, "elements");
                    int length5 = strArr.length;
                    Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                    System.arraycopy(elements5, 0, copyOf5, length5, 1);
                    Intrinsics.c(copyOf5);
                    return (String[]) copyOf5;
                }
                Intrinsics.checkNotNullParameter(value, "value");
                return new String[]{value};
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                return c(value);
        }
    }

    @Override // androidx.navigation.s0
    public final void e(Bundle bundle, String key, Object obj) {
        int i10 = this.f2255m;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putBooleanArray(key, (boolean[]) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putBoolean(key, booleanValue);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putFloatArray(key, (float[]) obj);
                return;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putFloat(key, floatValue);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putIntArray(key, (int[]) obj);
                return;
            case 5:
                int intValue = ((Number) obj).intValue();
                switch (i10) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        Intrinsics.checkNotNullParameter(key, "key");
                        bundle.putInt(key, intValue);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        Intrinsics.checkNotNullParameter(key, "key");
                        bundle.putInt(key, intValue);
                        return;
                }
            case 6:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putLongArray(key, (long[]) obj);
                return;
            case 7:
                long longValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putLong(key, longValue);
                return;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                switch (i10) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        Intrinsics.checkNotNullParameter(key, "key");
                        bundle.putInt(key, intValue2);
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        Intrinsics.checkNotNullParameter(key, "key");
                        bundle.putInt(key, intValue2);
                        return;
                }
            case 9:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putStringArray(key, (String[]) obj);
                return;
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putString(key, (String) obj);
                return;
        }
    }

    public final Integer f(Bundle bundle, String key) {
        switch (this.f2255m) {
            case 5:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj = bundle.get(key);
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = bundle.get(key);
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj2;
        }
    }

    public final Integer g(String value) {
        int parseInt;
        int parseInt2;
        switch (this.f2255m) {
            case 5:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.s.r(value, "0x", false)) {
                    String substring = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    parseInt = Integer.parseInt(substring, CharsKt.checkRadix(16));
                } else {
                    parseInt = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt);
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.s.r(value, "0x", false)) {
                    String substring2 = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    parseInt2 = Integer.parseInt(substring2, CharsKt.checkRadix(16));
                } else {
                    parseInt2 = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10, int i11) {
        super(false);
        this.f2255m = i10;
    }
}
