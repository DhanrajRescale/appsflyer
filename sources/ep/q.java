package ep;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f15802n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f15803a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.o f15804b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15809g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f15810h;

    /* renamed from: l, reason: collision with root package name */
    public l7.m f15814l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f15815m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15806d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f15807e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f15808f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final n f15812j = new n(this, 0);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f15813k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f15805c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f15811i = new WeakReference(null);

    public q(Context context, ll.o oVar, Intent intent) {
        this.f15803a = context;
        this.f15804b = oVar;
        this.f15810h = intent;
    }

    public static void b(q qVar, l lVar) {
        IInterface iInterface = qVar.f15815m;
        ArrayList arrayList = qVar.f15806d;
        ll.o oVar = qVar.f15804b;
        if (iInterface == null && !qVar.f15809g) {
            oVar.k("Initiate binding to the service.", new Object[0]);
            arrayList.add(lVar);
            l7.m mVar = new l7.m(1, qVar);
            qVar.f15814l = mVar;
            qVar.f15809g = true;
            if (!qVar.f15803a.bindService(qVar.f15810h, mVar, 1)) {
                oVar.k("Failed to bind to the service.", new Object[0]);
                qVar.f15809g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l lVar2 = (l) it.next();
                    zzy zzyVar = new zzy();
                    TaskCompletionSource taskCompletionSource = lVar2.f15792a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(zzyVar);
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (qVar.f15809g) {
            oVar.k("Waiting to bind to the service.", new Object[0]);
            arrayList.add(lVar);
        } else {
            lVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f15802n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f15805c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f15805c, 10);
                    handlerThread.start();
                    hashMap.put(this.f15805c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f15805c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f15808f) {
            this.f15807e.remove(taskCompletionSource);
        }
        a().post(new o(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.f15807e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f15805c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
