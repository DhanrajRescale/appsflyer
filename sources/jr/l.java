package jr;

import android.content.SharedPreferences;
import java.util.Date;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f21624e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f21625f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21626a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21627b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f21628c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f21629d = new Object();

    public l(SharedPreferences sharedPreferences) {
        this.f21626a = sharedPreferences;
    }

    public final k a() {
        k kVar;
        synchronized (this.f21628c) {
            kVar = new k(this.f21626a.getInt("num_failed_fetches", 0), new Date(this.f21626a.getLong("backoff_end_time_in_millis", -1L)), 0);
        }
        return kVar;
    }

    public final k b() {
        k kVar;
        synchronized (this.f21629d) {
            kVar = new k(this.f21626a.getInt("num_failed_realtime_streams", 0), new Date(this.f21626a.getLong("realtime_backoff_end_time_in_millis", -1L)), 1);
        }
        return kVar;
    }

    public final void c(int i10, Date date) {
        synchronized (this.f21628c) {
            this.f21626a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(int i10, Date date) {
        synchronized (this.f21629d) {
            this.f21626a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
