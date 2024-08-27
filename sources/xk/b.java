package xk;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f40326a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.u f40327b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f40328c;

    public b() {
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        androidx.work.u tokenCachingStrategyFactory = new androidx.work.u(10);
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f40326a = sharedPreferences;
        this.f40327b = tokenCachingStrategyFactory;
    }

    public final f0 a() {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            if (this.f40328c == null) {
                synchronized (this) {
                    try {
                        if (this.f40328c == null) {
                            this.f40327b.getClass();
                            this.f40328c = new f0(FacebookSdk.getApplicationContext());
                        }
                        Unit unit = Unit.f23355a;
                    } finally {
                    }
                }
            }
            f0 f0Var = this.f40328c;
            if (f0Var != null) {
                return f0Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void b(a accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        try {
            this.f40326a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.a().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
