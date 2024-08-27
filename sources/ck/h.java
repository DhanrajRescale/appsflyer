package ck;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final int f8196e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8197a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f8198b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.c f8199c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8200d;

    static {
        f8196e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public h(Context context) {
        this.f8200d = f8196e;
        this.f8197a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f8198b = activityManager;
        this.f8199c = new t9.c(context.getResources().getDisplayMetrics(), 27);
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.f8200d = s0.g.f34069a;
        }
    }
}
