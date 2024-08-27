package w9;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import d2.f1;
import java.io.Closeable;
import kp.j;
import s0.g;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f38892a = new f1(1);

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f38893b = new f1(2);

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f38894c = new f1(3);

    /* renamed from: d, reason: collision with root package name */
    public static final f1 f38895d = new f1(4);

    /* renamed from: e, reason: collision with root package name */
    public static final float f38896e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = (PathMeasure) f38892a.get();
        Path path2 = (Path) f38893b.get();
        Path path3 = (Path) f38894c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == g.f34069a) {
            j.M();
            return;
        }
        if (length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = e.c(min, length);
                max = e.c(max, length);
            }
            if (min < g.f34069a) {
                min = e.c(min, length);
            }
            if (max < g.f34069a) {
                max = e.c(max, length);
            }
            if (min == max) {
                path.reset();
                j.M();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(g.f34069a, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < g.f34069a) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            j.M();
            return;
        }
        j.M();
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) f38895d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f38896e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap e(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
