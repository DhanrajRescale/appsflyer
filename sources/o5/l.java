package o5;

import android.media.MediaCodecInfo;
import e5.x;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        List supportedPerformancePoints;
        boolean covers;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = x.f15051b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = x.f15053d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    n1.a.y();
                    MediaCodecInfo.VideoCapabilities.PerformancePoint f10 = n1.a.f(i10, i11, (int) d10);
                    for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                        covers = n1.a.g(supportedPerformancePoints.get(i12)).covers(f10);
                        if (covers) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
