package dp;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14462a;

    public l(Context context) {
        this.f14462a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j10 += a(file2);
            }
        }
        return j10;
    }
}
