package dr;

import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f14481a = Runtime.getRuntime();

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f14482b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f14483c;

    static {
        yq.a.d();
    }

    public d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f14482b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f14483c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
