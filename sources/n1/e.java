package n1;

import android.graphics.Bitmap;
import android.os.Build;

/* loaded from: classes.dex */
public final class e implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f28128a;

    public e(Bitmap bitmap) {
        this.f28128a = bitmap;
    }

    public final int a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.f28128a.getConfig();
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 != Bitmap.Config.ARGB_4444) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                config2 = Bitmap.Config.RGBA_F16;
                if (config3 == config2) {
                    return 3;
                }
            }
            if (i10 >= 26) {
                config = Bitmap.Config.HARDWARE;
                if (config3 == config) {
                    return 4;
                }
            }
        }
        return 0;
    }
}
