package ql;

import al.d;
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import bl.j;
import com.appsflyer.internal.l;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f32083a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f32084b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    public static String f32085c = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: d, reason: collision with root package name */
    public static final l f32086d = new l(16);

    public static final void a(ActivityManager activityManager) {
        if (sl.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f32083a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                        Intrinsics.checkNotNullParameter(thread, "thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
                        int length = stackTrace.length;
                        int i10 = 0;
                        while (i10 < length) {
                            StackTraceElement stackTraceElement = stackTrace[i10];
                            i10++;
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String jSONArray2 = jSONArray.toString();
                        if (!Intrinsics.a(jSONArray2, f32085c) && j.J(thread)) {
                            f32085c = jSONArray2;
                            d.Q(processErrorStateInfo.shortMsg, jSONArray2).b();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            sl.a.a(a.class, th2);
        }
    }
}
