package nq;

import android.net.TrafficStats;
import android.util.Log;
import bq.l;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import cq.j;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import m.a4;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f29079m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final pp.g f29080a;

    /* renamed from: b, reason: collision with root package name */
    public final pq.c f29081b;

    /* renamed from: c, reason: collision with root package name */
    public final wn.e f29082c;

    /* renamed from: d, reason: collision with root package name */
    public final i f29083d;

    /* renamed from: e, reason: collision with root package name */
    public final l f29084e;

    /* renamed from: f, reason: collision with root package name */
    public final g f29085f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f29086g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f29087h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f29088i;

    /* renamed from: j, reason: collision with root package name */
    public String f29089j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f29090k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f29091l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, nq.g] */
    public c(pp.g gVar, mq.c cVar, ExecutorService executorService, j jVar) {
        gVar.a();
        pq.c cVar2 = new pq.c(gVar.f31271a, cVar);
        wn.e eVar = new wn.e(gVar);
        i a10 = i.a();
        l lVar = new l(new bq.c(gVar, 2));
        ?? obj = new Object();
        this.f29086g = new Object();
        this.f29090k = new HashSet();
        this.f29091l = new ArrayList();
        this.f29080a = gVar;
        this.f29081b = cVar2;
        this.f29082c = eVar;
        this.f29083d = a10;
        this.f29084e = lVar;
        this.f29085f = obj;
        this.f29087h = executorService;
        this.f29088i = jVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z10) {
        oq.a q10;
        synchronized (f29079m) {
            try {
                pp.g gVar = this.f29080a;
                gVar.a();
                wn.e k10 = wn.e.k(gVar.f31271a);
                try {
                    q10 = this.f29082c.q();
                    oq.c cVar = oq.c.f30258b;
                    oq.c cVar2 = q10.f30248b;
                    if (cVar2 == cVar || cVar2 == oq.c.f30257a) {
                        String f10 = f(q10);
                        wn.e eVar = this.f29082c;
                        a4 a10 = q10.a();
                        a10.f25481b = f10;
                        a10.j(oq.c.f30259c);
                        q10 = a10.i();
                        eVar.o(q10);
                    }
                    if (k10 != null) {
                        k10.r();
                    }
                } catch (Throwable th2) {
                    if (k10 != null) {
                        k10.r();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            a4 a11 = q10.a();
            a11.f25483d = null;
            q10 = a11.i();
        }
        i(q10);
        this.f29088i.execute(new b(this, z10, 0));
    }

    public final oq.a b(oq.a aVar) {
        int responseCode;
        boolean z10;
        pq.b f10;
        pp.g gVar = this.f29080a;
        gVar.a();
        String str = gVar.f31273c.f31280a;
        String str2 = aVar.f30247a;
        pp.g gVar2 = this.f29080a;
        gVar2.a();
        String str3 = gVar2.f31273c.f31286g;
        String str4 = aVar.f30250d;
        pq.c cVar = this.f29081b;
        pq.e eVar = cVar.f31299c;
        if (eVar.a()) {
            URL a10 = pq.c.a(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, str);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        c10.setDoOutput(true);
                        pq.c.h(c10);
                        responseCode = c10.getResponseCode();
                        eVar.b(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                    if (z10) {
                        f10 = pq.c.f(c10);
                    } else {
                        pq.c.b(c10, null, str, str3);
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode != 429) {
                                if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    x9.c a11 = pq.b.a();
                                    a11.f40140d = pq.f.f31309b;
                                    f10 = a11.g();
                                }
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            } else {
                                throw new FirebaseException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                        } else {
                            x9.c a12 = pq.b.a();
                            a12.f40140d = pq.f.f31310c;
                            f10 = a12.g();
                        }
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int ordinal = f10.f31294c.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                synchronized (this) {
                                    this.f29089j = null;
                                }
                                a4 a13 = aVar.a();
                                a13.j(oq.c.f30258b);
                                return a13.i();
                            }
                            throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        a4 a14 = aVar.a();
                        a14.f25487h = "BAD CONFIG";
                        a14.j(oq.c.f30261e);
                        return a14.i();
                    }
                    i iVar = this.f29083d;
                    iVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    iVar.f29100a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    a4 a15 = aVar.a();
                    a15.f25483d = f10.f31292a;
                    a15.f25485f = Long.valueOf(f10.f31293b);
                    a15.f25486g = Long.valueOf(seconds);
                    return a15.i();
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.f29089j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f fVar = new f(taskCompletionSource);
        synchronized (this.f29086g) {
            this.f29091l.add(fVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f29087h.execute(new bl.d(this, 15));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        e eVar = new e(this.f29083d, taskCompletionSource);
        synchronized (this.f29086g) {
            this.f29091l.add(eVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f29087h.execute(new b(this, false, 1));
        return task;
    }

    public final void e() {
        pp.g gVar = this.f29080a;
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f31273c.f31281b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f31273c.f31286g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f31273c.f31280a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f31273c.f31281b;
        Pattern pattern = i.f29098c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkArgument(i.f29098c.matcher(gVar.f31273c.f31280a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f31272b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(oq.a r6) {
        /*
            r5 = this;
            pp.g r0 = r5.f29080a
            r0.a()
            java.lang.String r0 = r0.f31272b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            pp.g r0 = r5.f29080a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f31272b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            oq.c r0 = oq.c.f30257a
            oq.c r6 = r6.f30248b
            if (r6 != r0) goto L5c
            bq.l r6 = r5.f29084e
            java.lang.Object r6 = r6.get()
            oq.b r6 = (oq.b) r6
            android.content.SharedPreferences r0 = r6.f30255a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f30255a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r2 = r6.f30255a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r6 = move-exception
            goto L5a
        L42:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
        L47:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            nq.g r6 = r5.f29085f
            r6.getClass()
            java.lang.String r2 = nq.g.a()
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L40
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r6
        L5c:
            nq.g r6 = r5.f29085f
            r6.getClass()
            java.lang.String r6 = nq.g.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nq.c.f(oq.a):java.lang.String");
    }

    public final oq.a g(oq.a aVar) {
        int responseCode;
        pq.a aVar2;
        String str = aVar.f30247a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            oq.b bVar = (oq.b) this.f29084e.get();
            synchronized (bVar.f30255a) {
                try {
                    String[] strArr = oq.b.f30254c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = bVar.f30255a.getString("|T|" + bVar.f30256b + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith(UrlTreeKt.componentParamPrefix)) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        pq.c cVar = this.f29081b;
        pp.g gVar = this.f29080a;
        gVar.a();
        String str4 = gVar.f31273c.f31280a;
        String str5 = aVar.f30247a;
        pp.g gVar2 = this.f29080a;
        gVar2.a();
        String str6 = gVar2.f31273c.f31286g;
        pp.g gVar3 = this.f29080a;
        gVar3.a();
        String str7 = gVar3.f31273c.f31281b;
        pq.e eVar = cVar.f31299c;
        if (eVar.a()) {
            URL a10 = pq.c.a(String.format("projects/%s/installations", str6));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = cVar.c(a10, str4);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        pq.c.g(c10, str5, str7);
                        responseCode = c10.getResponseCode();
                        eVar.b(responseCode);
                    } finally {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    aVar2 = pq.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    pq.c.b(c10, str7, str4, str6);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            pq.a aVar3 = new pq.a(null, null, null, null, pq.d.f31301b);
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            aVar2 = aVar3;
                        }
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        throw new FirebaseException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                }
                int ordinal = aVar2.f31291e.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        a4 a11 = aVar.a();
                        a11.f25487h = "BAD CONFIG";
                        a11.j(oq.c.f30261e);
                        return a11.i();
                    }
                    throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str8 = aVar2.f31288b;
                String str9 = aVar2.f31289c;
                i iVar = this.f29083d;
                iVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.f29100a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                pq.b bVar2 = aVar2.f31290d;
                String str10 = bVar2.f31292a;
                long j10 = bVar2.f31293b;
                a4 a12 = aVar.a();
                a12.f25481b = str8;
                a12.j(oq.c.f30260d);
                a12.f25483d = str10;
                a12.f25484e = str9;
                a12.f25485f = Long.valueOf(j10);
                a12.f25486g = Long.valueOf(seconds);
                return a12.i();
            }
            throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new FirebaseException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f29086g) {
            try {
                Iterator it = this.f29091l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(oq.a aVar) {
        synchronized (this.f29086g) {
            try {
                Iterator it = this.f29091l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
