package wl;

import android.content.Context;
import com.facebook.FacebookSdk;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f39156a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static x f39157b;

    public final synchronized x a(Context context) {
        if (context == null) {
            context = FacebookSdk.getApplicationContext();
        }
        if (context == null) {
            return null;
        }
        if (f39157b == null) {
            f39157b = new x(context, FacebookSdk.getApplicationId());
        }
        return f39157b;
    }
}
