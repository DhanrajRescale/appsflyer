package mj;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public b f27809a;

    public final String a(String remoteConfigKey, String substring, String defaultValue) {
        Intrinsics.checkNotNullParameter(remoteConfigKey, "remoteConfigKey");
        Intrinsics.checkNotNullParameter(substring, "substring");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        try {
            if (b(remoteConfigKey)) {
                this.f27809a.getClass();
                String optString = new JSONObject(b.a(remoteConfigKey)).optString(substring);
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                return optString;
            }
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return defaultValue;
    }

    public final boolean b(String remoteConfigKey) {
        Intrinsics.checkNotNullParameter(remoteConfigKey, "remoteConfigKey");
        try {
            this.f27809a.getClass();
            return new JSONObject(b.a(remoteConfigKey)).optBoolean("enabled", false);
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
            return false;
        }
    }
}
