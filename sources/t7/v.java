package t7;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f35532a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f35533b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f35534c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f35532a = true;
        f35533b = true;
        f35534c = i10 >= 28;
    }
}
