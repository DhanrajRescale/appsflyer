package nl;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f28944a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f28945b = new HashMap();

    public static final void a(s callback, t feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        w.c(new u(callback, feature));
    }

    public static final boolean b(t feature) {
        t g10;
        boolean z10;
        Intrinsics.checkNotNullParameter(feature, "feature");
        boolean z11 = false;
        if (t.Unknown == feature) {
            return false;
        }
        if (t.Core == feature) {
            return true;
        }
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0);
        feature.getClass();
        String string = sharedPreferences.getString(Intrinsics.i(feature, "FBSDKFeature"), null);
        if (string != null && Intrinsics.a(string, FacebookSdk.getSdkVersion())) {
            return false;
        }
        int i10 = feature.f28936a;
        if ((i10 & 255) > 0) {
            g10 = ll.e.g(i10 & (-256));
        } else if ((65280 & i10) > 0) {
            g10 = ll.e.g(i10 & (-65536));
        } else if ((16711680 & i10) > 0) {
            g10 = ll.e.g(i10 & (-16777216));
        } else {
            g10 = ll.e.g(0);
        }
        if (g10 == feature) {
            switch (feature.ordinal()) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 29:
                case 30:
                case 31:
                    break;
                case 25:
                case 26:
                case 27:
                case 28:
                default:
                    z11 = true;
                    break;
            }
            AtomicBoolean atomicBoolean = w.f28946a;
            return w.b(Intrinsics.i(feature, "FBSDKFeature"), FacebookSdk.getApplicationId(), z11);
        }
        if (!b(g10)) {
            return false;
        }
        switch (feature.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 29:
            case 30:
            case 31:
                z10 = false;
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                z10 = true;
                break;
        }
        AtomicBoolean atomicBoolean2 = w.f28946a;
        if (!w.b(Intrinsics.i(feature, "FBSDKFeature"), FacebookSdk.getApplicationId(), z10)) {
            return false;
        }
        return true;
    }
}
