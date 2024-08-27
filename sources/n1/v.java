package n1;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends u {

    /* renamed from: b, reason: collision with root package name */
    public float[] f28200b;

    public final float[] a() {
        float[] fArr = this.f28200b;
        if (fArr == null) {
            ColorFilter colorFilter = this.f28180a;
            if ((colorFilter instanceof ColorMatrixColorFilter) && 26 <= Build.VERSION.SDK_INT) {
                float[] a10 = w.f28203a.a((ColorMatrixColorFilter) colorFilter);
                this.f28200b = a10;
                return a10;
            }
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        return fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v) && Arrays.equals(a(), ((v) obj).a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f28200b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f28200b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
