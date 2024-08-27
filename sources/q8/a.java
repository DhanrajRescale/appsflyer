package q8;

import android.os.StatFs;
import bv.b0;
import bv.q;
import bv.x;
import java.io.File;
import qu.r0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public b0 f31823a;

    /* renamed from: f, reason: collision with root package name */
    public long f31828f;

    /* renamed from: b, reason: collision with root package name */
    public final x f31824b = q.f7389a;

    /* renamed from: c, reason: collision with root package name */
    public double f31825c = 0.02d;

    /* renamed from: d, reason: collision with root package name */
    public final long f31826d = 10485760;

    /* renamed from: e, reason: collision with root package name */
    public final long f31827e = 262144000;

    /* renamed from: g, reason: collision with root package name */
    public final xu.d f31829g = r0.f32256b;

    public final l a() {
        long j10;
        b0 b0Var = this.f31823a;
        if (b0Var != null) {
            if (this.f31825c > 0.0d) {
                try {
                    File e10 = b0Var.e();
                    e10.mkdir();
                    StatFs statFs = new StatFs(e10.getAbsolutePath());
                    j10 = kotlin.ranges.d.g((long) (this.f31825c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f31826d, this.f31827e);
                } catch (Exception unused) {
                    j10 = this.f31826d;
                }
            } else {
                j10 = this.f31828f;
            }
            return new l(j10, b0Var, this.f31824b, this.f31829g);
        }
        throw new IllegalStateException("directory == null".toString());
    }
}
