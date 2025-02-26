package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @NonNull
    @KeepForSdk
    public static <T> T[] concat(@NonNull T[]... tArr) {
        if (tArr.length != 0) {
            int i10 = 0;
            for (T[] tArr2 : tArr) {
                i10 += tArr2.length;
            }
            T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i10);
            int length = tArr[0].length;
            for (int i11 = 1; i11 < tArr.length; i11++) {
                T[] tArr4 = tArr[i11];
                int length2 = tArr4.length;
                System.arraycopy(tArr4, 0, tArr3, length, length2);
                length += length2;
            }
            return tArr3;
        }
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
    }

    @NonNull
    @KeepForSdk
    public static byte[] concatByteArrays(@NonNull byte[]... bArr) {
        if (bArr.length != 0) {
            int i10 = 0;
            for (byte[] bArr2 : bArr) {
                i10 += bArr2.length;
            }
            byte[] copyOf = Arrays.copyOf(bArr[0], i10);
            int length = bArr[0].length;
            for (int i11 = 1; i11 < bArr.length; i11++) {
                byte[] bArr3 = bArr[i11];
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, copyOf, length, length2);
                length += length2;
            }
            return copyOf;
        }
        return new byte[0];
    }

    @KeepForSdk
    public static boolean contains(@NonNull int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @KeepForSdk
    public static <T> T[] removeAll(@NonNull T[] tArr, @NonNull T... tArr2) {
        int length;
        int i10;
        if (tArr == null) {
            return null;
        }
        if (tArr2 != null && (length = tArr2.length) != 0) {
            T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length));
            if (length == 1) {
                i10 = 0;
                for (T t10 : tArr) {
                    if (!Objects.equal(tArr2[0], t10)) {
                        tArr3[i10] = t10;
                        i10++;
                    }
                }
            } else {
                int i11 = 0;
                for (T t11 : tArr) {
                    if (!contains(tArr2, t11)) {
                        tArr3[i11] = t11;
                        i11++;
                    }
                }
                i10 = i11;
            }
            if (tArr3 == null) {
                return null;
            }
            if (i10 == tArr3.length) {
                return tArr3;
            }
            return (T[]) Arrays.copyOf(tArr3, i10);
        }
        return (T[]) Arrays.copyOf(tArr, tArr.length);
    }

    @NonNull
    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(@NonNull T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    @NonNull
    @KeepForSdk
    public static int[] toPrimitiveArray(@NonNull Collection<Integer> collection) {
        int i10 = 0;
        if (collection != null && !collection.isEmpty()) {
            int[] iArr = new int[collection.size()];
            Iterator<Integer> it = collection.iterator();
            while (it.hasNext()) {
                iArr[i10] = it.next().intValue();
                i10++;
            }
            return iArr;
        }
        return new int[0];
    }

    @KeepForSdk
    public static Integer[] toWrapperArray(@NonNull int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull double[] dArr) {
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Double.toString(dArr[i10]));
        }
    }

    @KeepForSdk
    public static void writeStringArray(@NonNull StringBuilder sb2, @NonNull String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(strArr[i10]);
            sb2.append("\"");
        }
    }

    @KeepForSdk
    public static <T> boolean contains(@NonNull T[] tArr, @NonNull T t10) {
        int length = tArr != null ? tArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!Objects.equal(tArr[i10], t10)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull float[] fArr) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Float.toString(fArr[i10]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Integer.toString(iArr[i10]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull long[] jArr) {
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Long.toString(jArr[i10]));
        }
    }

    @KeepForSdk
    public static <T> void writeArray(@NonNull StringBuilder sb2, @NonNull T[] tArr) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(tArr[i10]);
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder sb2, @NonNull boolean[] zArr) {
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Boolean.toString(zArr[i10]));
        }
    }
}
