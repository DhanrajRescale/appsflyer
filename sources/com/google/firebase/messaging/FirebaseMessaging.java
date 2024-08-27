package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: j, reason: collision with root package name */
    public static final long f11683j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k, reason: collision with root package name */
    public static ll.o f11684k;

    /* renamed from: l, reason: collision with root package name */
    public static gn.f f11685l;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f11686m;

    /* renamed from: a, reason: collision with root package name */
    public final pp.g f11687a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11688b;

    /* renamed from: c, reason: collision with root package name */
    public final m.w f11689c;

    /* renamed from: d, reason: collision with root package name */
    public final s f11690d;

    /* renamed from: e, reason: collision with root package name */
    public final q0.g0 f11691e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f11692f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f11693g;

    /* renamed from: h, reason: collision with root package name */
    public final xk.f f11694h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11695i;

    /* JADX WARN: Type inference failed for: r5v2, types: [q0.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [xk.f, java.lang.Object] */
    public FirebaseMessaging(pp.g gVar, mq.c cVar, mq.c cVar2, nq.d dVar, gn.f fVar, jq.c cVar3) {
        gVar.a();
        final ?? obj = new Object();
        final int i10 = 0;
        obj.f40359d = 0;
        Context context = gVar.f31271a;
        obj.f40360e = context;
        gVar.a();
        final m.w wVar = new m.w(gVar, obj, new Rpc(context), cVar, cVar2, dVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f11695i = false;
        f11685l = fVar;
        this.f11687a = gVar;
        ?? obj2 = new Object();
        obj2.f31495e = this;
        obj2.f31492b = cVar3;
        this.f11691e = obj2;
        gVar.a();
        final Context context2 = gVar.f31271a;
        this.f11688b = context2;
        i iVar = new i();
        this.f11694h = obj;
        this.f11689c = wVar;
        this.f11690d = new s(newSingleThreadExecutor);
        this.f11692f = scheduledThreadPoolExecutor;
        this.f11693g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(iVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f11760b;

            {
                this.f11760b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r5 = this;
                    int r0 = r2
                    com.google.firebase.messaging.FirebaseMessaging r1 = r5.f11760b
                    switch(r0) {
                        case 0: goto L66;
                        default: goto L7;
                    }
                L7:
                    android.content.Context r0 = r1.f11688b
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 != 0) goto L10
                    r1 = r0
                L10:
                    java.lang.String r2 = "com.google.firebase.messaging"
                    r3 = 0
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
                    java.lang.String r2 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r2, r3)
                    if (r1 == 0) goto L20
                    goto L65
                L20:
                    java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
                    android.content.Context r2 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    r4 = 128(0x80, float:1.8E-43)
                    android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r2 == 0) goto L49
                    android.os.Bundle r3 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    boolean r3 = r3.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    boolean r1 = r2.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    goto L4a
                L49:
                    r1 = 1
                L4a:
                    boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
                    if (r2 != 0) goto L55
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.forResult(r0)
                    goto L65
                L55:
                    com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
                    r2.<init>()
                    com.google.firebase.messaging.p r3 = new com.google.firebase.messaging.p
                    r3.<init>(r0, r1, r2)
                    r3.run()
                    r2.getTask()
                L65:
                    return
                L66:
                    q0.g0 r0 = r1.f11691e
                    boolean r0 = r0.f()
                    if (r0 == 0) goto L89
                    com.google.firebase.messaging.v r0 = r1.d()
                    boolean r0 = r1.f(r0)
                    if (r0 == 0) goto L89
                    monitor-enter(r1)
                    boolean r0 = r1.f11695i     // Catch: java.lang.Throwable -> L83
                    if (r0 != 0) goto L85
                    r2 = 0
                    r1.e(r2)     // Catch: java.lang.Throwable -> L83
                    goto L85
                L83:
                    r0 = move-exception
                    goto L87
                L85:
                    monitor-exit(r1)
                    goto L89
                L87:
                    monitor-exit(r1)
                    throw r0
                L89:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.k.run():void");
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i12 = a0.f11713j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.z
            /* JADX WARN: Type inference failed for: r7v2, types: [com.google.firebase.messaging.y, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y yVar;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                xk.f fVar2 = obj;
                m.w wVar2 = wVar;
                synchronized (y.class) {
                    try {
                        WeakReference weakReference = y.f11803b;
                        if (weakReference != null) {
                            yVar = (y) weakReference.get();
                        } else {
                            yVar = null;
                        }
                        if (yVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            ?? obj3 = new Object();
                            synchronized (obj3) {
                                obj3.f11804a = u.a(sharedPreferences, scheduledExecutorService);
                            }
                            y.f11803b = new WeakReference(obj3);
                            yVar = obj3;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new a0(firebaseMessaging, fVar2, yVar, wVar2, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new OnSuccessListener() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj3) {
                boolean z10;
                a0 a0Var = (a0) obj3;
                if (FirebaseMessaging.this.f11691e.f() && a0Var.f11721h.a() != null) {
                    synchronized (a0Var) {
                        z10 = a0Var.f11720g;
                    }
                    if (!z10) {
                        a0Var.e(0L);
                    }
                }
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f11760b;

            {
                this.f11760b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    this = this;
                    int r0 = r2
                    com.google.firebase.messaging.FirebaseMessaging r1 = r5.f11760b
                    switch(r0) {
                        case 0: goto L66;
                        default: goto L7;
                    }
                L7:
                    android.content.Context r0 = r1.f11688b
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 != 0) goto L10
                    r1 = r0
                L10:
                    java.lang.String r2 = "com.google.firebase.messaging"
                    r3 = 0
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
                    java.lang.String r2 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r2, r3)
                    if (r1 == 0) goto L20
                    goto L65
                L20:
                    java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
                    android.content.Context r2 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    r4 = 128(0x80, float:1.8E-43)
                    android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r2 == 0) goto L49
                    android.os.Bundle r3 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    boolean r3 = r3.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r3 == 0) goto L49
                    android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    boolean r1 = r2.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    goto L4a
                L49:
                    r1 = 1
                L4a:
                    boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
                    if (r2 != 0) goto L55
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.forResult(r0)
                    goto L65
                L55:
                    com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
                    r2.<init>()
                    com.google.firebase.messaging.p r3 = new com.google.firebase.messaging.p
                    r3.<init>(r0, r1, r2)
                    r3.run()
                    r2.getTask()
                L65:
                    return
                L66:
                    q0.g0 r0 = r1.f11691e
                    boolean r0 = r0.f()
                    if (r0 == 0) goto L89
                    com.google.firebase.messaging.v r0 = r1.d()
                    boolean r0 = r1.f(r0)
                    if (r0 == 0) goto L89
                    monitor-enter(r1)
                    boolean r0 = r1.f11695i     // Catch: java.lang.Throwable -> L83
                    if (r0 != 0) goto L85
                    r2 = 0
                    r1.e(r2)     // Catch: java.lang.Throwable -> L83
                    goto L85
                L83:
                    r0 = move-exception
                    goto L87
                L85:
                    monitor-exit(r1)
                    goto L89
                L87:
                    monitor-exit(r1)
                    throw r0
                L89:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.k.run():void");
            }
        });
    }

    public static void b(w wVar, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f11686m == null) {
                    f11686m = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f11686m.schedule(wVar, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized ll.o c(Context context) {
        ll.o oVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f11684k == null) {
                    f11684k = new ll.o(context);
                }
                oVar = f11684k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull pp.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        v d10 = d();
        if (!f(d10)) {
            return d10.f11793a;
        }
        String b10 = xk.f.b(this.f11687a);
        s sVar = this.f11690d;
        l lVar = new l(this, b10, d10);
        synchronized (sVar) {
            task = (Task) sVar.f11779b.get(b10);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + b10);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b10);
                }
                task = lVar.a().continueWithTask(sVar.f11778a, new bm.c(15, sVar, b10));
                sVar.f11779b.put(b10, task);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final v d() {
        String f10;
        v b10;
        ll.o c10 = c(this.f11688b);
        pp.g gVar = this.f11687a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f31272b)) {
            f10 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            f10 = gVar.f();
        }
        String b11 = xk.f.b(this.f11687a);
        synchronized (c10) {
            b10 = v.b(((SharedPreferences) c10.f24937b).getString(f10 + "|T|" + b11 + "|*", null));
        }
        return b10;
    }

    public final synchronized void e(long j10) {
        b(new w(this, Math.min(Math.max(30L, 2 * j10), f11683j)), j10);
        this.f11695i = true;
    }

    public final boolean f(v vVar) {
        if (vVar != null) {
            String a10 = this.f11694h.a();
            if (System.currentTimeMillis() <= vVar.f11795c + v.f11792d && a10.equals(vVar.f11794b)) {
                return false;
            }
        }
        return true;
    }
}
