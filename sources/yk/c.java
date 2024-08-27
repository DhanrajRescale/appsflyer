package yk;

import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ReentrantReadWriteLock f41677a = new ReentrantReadWriteLock();

    /* renamed from: b, reason: collision with root package name */
    public static String f41678b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f41679c;

    public static void a() {
        if (f41679c) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f41677a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f41679c) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f41678b = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f41679c = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f41677a.writeLock().unlock();
            throw th2;
        }
    }
}
