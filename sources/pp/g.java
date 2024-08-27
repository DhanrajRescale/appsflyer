package pp;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import bq.l;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import cq.k;
import ek.h0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import t.j0;
import y3.q;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f31269j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final t.f f31270k = new j0(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f31271a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31272b;

    /* renamed from: c, reason: collision with root package name */
    public final h f31273c;

    /* renamed from: d, reason: collision with root package name */
    public final bq.g f31274d;

    /* renamed from: g, reason: collision with root package name */
    public final l f31277g;

    /* renamed from: h, reason: collision with root package name */
    public final mq.c f31278h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f31275e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f31276f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f31279i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public g(Context context, h hVar, String str) {
        ?? arrayList;
        int i10 = 0;
        new CopyOnWriteArrayList();
        this.f31271a = (Context) Preconditions.checkNotNull(context);
        this.f31272b = Preconditions.checkNotEmpty(str);
        this.f31273c = (h) Preconditions.checkNotNull(hVar);
        a aVar = FirebaseInitProvider.f11849a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        h0 h0Var = new h0();
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) h0Var.f15593b), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ((Class) h0Var.f15593b) + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bq.c((String) it.next(), i10));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f13068a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i11 = 1;
        arrayList3.add(new bq.c(new FirebaseCommonRegistrar(), i11));
        arrayList3.add(new bq.c(new ExecutorsRegistrar(), i11));
        arrayList4.add(bq.a.b(context, Context.class, new Class[0]));
        arrayList4.add(bq.a.b(this, g.class, new Class[0]));
        arrayList4.add(bq.a.b(hVar, h.class, new Class[0]));
        ll.f fVar = new ll.f(20);
        if (q.a(context) && FirebaseInitProvider.f11850b.get()) {
            arrayList4.add(bq.a.b(aVar, a.class, new Class[0]));
        }
        bq.g gVar = new bq.g(kVar, arrayList3, arrayList4, fVar);
        this.f31274d = gVar;
        Trace.endSection();
        this.f31277g = new l(new c(i10, this, context));
        this.f31278h = gVar.b(kq.d.class);
        d dVar = new d(this);
        a();
        if (this.f31275e.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        this.f31279i.add(dVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f31269j) {
            try {
                Iterator it = ((t.e) f31270k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.a();
                    arrayList.add(gVar.f31272b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g d() {
        g gVar;
        synchronized (f31269j) {
            try {
                gVar = (g) f31270k.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g e(String str) {
        g gVar;
        String str2;
        synchronized (f31269j) {
            try {
                gVar = (g) f31270k.get(str.trim());
                if (gVar != null) {
                    ((kq.d) gVar.f31278h.get()).a();
                } else {
                    ArrayList c10 = c();
                    if (c10.isEmpty()) {
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", c10);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
            } finally {
            }
        }
        return gVar;
    }

    public static g h(Context context) {
        synchronized (f31269j) {
            try {
                if (f31270k.containsKey("[DEFAULT]")) {
                    return d();
                }
                h a10 = h.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, a10, "[DEFAULT]");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener, java.lang.Object] */
    public static g i(Context context, h hVar, String str) {
        g gVar;
        AtomicReference atomicReference = e.f31266a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f31266a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f31269j) {
            t.f fVar = f31270k;
            Preconditions.checkState(!fVar.containsKey(trim), "FirebaseApp name " + trim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            gVar = new g(context, hVar, trim);
            fVar.put(trim, gVar);
        }
        gVar.g();
        return gVar;
    }

    public final void a() {
        Preconditions.checkState(!this.f31276f.get(), "FirebaseApp was deleted");
    }

    public final Object b(Class cls) {
        a();
        return this.f31274d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f31272b.equals(gVar.f31272b);
    }

    public final String f() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f31272b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f31273c.f31281b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void g() {
        HashMap hashMap;
        if (!q.a(this.f31271a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f31272b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f31271a;
            AtomicReference atomicReference = f.f31267b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f31272b);
        Log.i("FirebaseApp", sb3.toString());
        bq.g gVar = this.f31274d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f31272b);
        AtomicReference atomicReference2 = gVar.f7253e;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (gVar) {
                    hashMap = new HashMap(gVar.f7249a);
                }
                gVar.i(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((kq.d) this.f31278h.get()).a();
    }

    public final int hashCode() {
        return this.f31272b.hashCode();
    }

    public final boolean j() {
        boolean z10;
        a();
        qq.a aVar = (qq.a) this.f31277g.get();
        synchronized (aVar) {
            z10 = aVar.f32127a;
        }
        return z10;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f31272b).add("options", this.f31273c).toString();
    }
}
