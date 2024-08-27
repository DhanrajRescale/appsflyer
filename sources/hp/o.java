package hp;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f18649n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f18650a;

    /* renamed from: b, reason: collision with root package name */
    public final k f18651b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18656g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f18657h;

    /* renamed from: l, reason: collision with root package name */
    public l7.m f18661l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f18662m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18653d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f18654e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f18655f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final ep.n f18659j = new ep.n(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f18660k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f18652c = "IntegrityService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f18658i = new WeakReference(null);

    public o(Context context, k kVar, Intent intent) {
        this.f18650a = context;
        this.f18651b = kVar;
        this.f18657h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f18649n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f18652c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f18652c, 10);
                    handlerThread.start();
                    hashMap.put(this.f18652c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f18652c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f18655f) {
            try {
                Iterator it = this.f18654e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f18652c).concat(" : Binder has died.")));
                }
                this.f18654e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
