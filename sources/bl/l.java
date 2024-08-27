package bl;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;
import nl.e0;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import xk.d0;
import xk.g0;
import xk.z;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final String f7117e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7118a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f7119b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f7120c;

    /* renamed from: d, reason: collision with root package name */
    public String f7121d;

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        f7117e = canonicalName;
    }

    public l(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7119b = new WeakReference(activity);
        this.f7121d = null;
        this.f7118a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a() {
        if (sl.a.b(l.class)) {
            return null;
        }
        try {
            return f7117e;
        } catch (Throwable th2) {
            sl.a.a(l.class, th2);
            return null;
        }
    }

    public final void b(z zVar, String str) {
        String str2 = f7117e;
        if (sl.a.b(this) || zVar == null) {
            return;
        }
        try {
            d0 c10 = zVar.c();
            try {
                JSONObject jSONObject = c10.f40343b;
                if (jSONObject != null) {
                    if (Intrinsics.a("true", jSONObject.optString("success"))) {
                        e0.f28850c.r(g0.f40374e, str2, "Successfully send UI component tree to server");
                        this.f7121d = str;
                    }
                    if (jSONObject.has("is_app_indexing_enabled")) {
                        boolean z10 = jSONObject.getBoolean("is_app_indexing_enabled");
                        e eVar = e.f7087a;
                        if (!sl.a.b(e.class)) {
                            try {
                                e.f7093g.set(z10);
                                return;
                            } catch (Throwable th2) {
                                sl.a.a(e.class, th2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Log.e(str2, Intrinsics.i(c10.f40344c, "Error sending UI component tree to Facebook: "));
            } catch (JSONException e10) {
                Log.e(str2, "Error decoding server response.", e10);
            }
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }

    public final void c() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            try {
                FacebookSdk.getExecutor().execute(new yk.h(5, this, new k(this, 0)));
            } catch (RejectedExecutionException e10) {
                Log.e(f7117e, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
