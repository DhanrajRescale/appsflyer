package bl;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.work.u;
import com.facebook.FacebookException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final u f7101f = new u(24, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f7102g = h.class.getCanonicalName();

    /* renamed from: h, reason: collision with root package name */
    public static h f7103h;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7104a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final Set f7105b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f7106c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f7107d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f7108e;

    public h() {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f7105b = newSetFromMap;
        this.f7106c = new LinkedHashSet();
        this.f7107d = new HashSet();
        this.f7108e = new HashMap();
    }

    public final void a(Activity activity) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Intrinsics.a(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f7105b.add(activity);
                this.f7107d.clear();
                HashSet hashSet = (HashSet) this.f7108e.get(Integer.valueOf(activity.hashCode()));
                if (hashSet != null) {
                    this.f7107d = hashSet;
                }
                if (!sl.a.b(this)) {
                    try {
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            b();
                        } else {
                            this.f7104a.post(new d(this, 1));
                        }
                        return;
                    } catch (Throwable th2) {
                        sl.a.a(this, th2);
                        return;
                    }
                }
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }

    public final void b() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.f7105b) {
                if (activity != null) {
                    View b10 = gl.c.b(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f7104a;
                    HashSet hashSet = this.f7107d;
                    Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                    this.f7106c.add(new g(b10, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void c(Activity activity) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Intrinsics.a(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f7105b.remove(activity);
                this.f7106c.clear();
                this.f7108e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f7107d.clone());
                this.f7107d.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
