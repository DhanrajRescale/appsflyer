package jr;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f21616e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f21617f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f21618a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f21619b;

    /* renamed from: c, reason: collision with root package name */
    public final d f21620c;

    /* renamed from: d, reason: collision with root package name */
    public final d f21621d;

    static {
        Charset.forName("UTF-8");
        f21616e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f21617f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public j(ScheduledExecutorService scheduledExecutorService, d dVar, d dVar2) {
        this.f21619b = scheduledExecutorService;
        this.f21620c = dVar;
        this.f21621d = dVar2;
    }

    public static e b(d dVar) {
        synchronized (dVar) {
            try {
                Task task = dVar.f21589c;
                if (task != null && task.isSuccessful()) {
                    return (e) dVar.f21589c.getResult();
                }
                try {
                    return (e) d.a(dVar.b(), TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } finally {
            }
        }
    }

    public static HashSet c(d dVar) {
        HashSet hashSet = new HashSet();
        e b10 = b(dVar);
        if (b10 == null) {
            return hashSet;
        }
        Iterator<String> keys = b10.f21592b.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public static String d(d dVar, String str) {
        e b10 = b(dVar);
        if (b10 == null) {
            return null;
        }
        try {
            return b10.f21592b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(e eVar, String str) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f21618a) {
            try {
                Iterator it = this.f21618a.iterator();
                while (it.hasNext()) {
                    this.f21619b.execute(new androidx.fragment.app.e(20, (BiConsumer) it.next(), str, eVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
