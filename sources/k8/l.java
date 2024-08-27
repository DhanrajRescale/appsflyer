package k8;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.u;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22686a = u.C("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f22687b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String f10 = a3.a.f("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, f10);
        WeakHashMap weakHashMap = f22687b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, f10);
        }
        return newWakeLock;
    }
}
