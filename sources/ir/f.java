package ir;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import j9.m;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import jr.i;
import jr.j;
import jr.l;
import jr.o;
import org.json.JSONObject;
import pp.g;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: j, reason: collision with root package name */
    public static final Clock f20510j = DefaultClock.getInstance();

    /* renamed from: k, reason: collision with root package name */
    public static final Random f20511k = new Random();

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f20512l = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f20514b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f20515c;

    /* renamed from: d, reason: collision with root package name */
    public final g f20516d;

    /* renamed from: e, reason: collision with root package name */
    public final nq.d f20517e;

    /* renamed from: f, reason: collision with root package name */
    public final qp.b f20518f;

    /* renamed from: g, reason: collision with root package name */
    public final mq.c f20519g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20520h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20513a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f20521i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener, java.lang.Object] */
    public f(Context context, ScheduledExecutorService scheduledExecutorService, g gVar, nq.d dVar, qp.b bVar, mq.c cVar) {
        this.f20514b = context;
        this.f20515c = scheduledExecutorService;
        this.f20516d = gVar;
        this.f20517e = dVar;
        this.f20518f = bVar;
        this.f20519g = cVar;
        gVar.a();
        this.f20520h = gVar.f31273c.f31281b;
        AtomicReference atomicReference = e.f20509a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = e.f20509a;
        if (atomicReference2.get() == null) {
            ?? obj = new Object();
            while (true) {
                if (atomicReference2.compareAndSet(null, obj)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(obj);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new m(this, 4));
    }

    public final synchronized b a(String str) {
        jr.d c10;
        jr.d c11;
        jr.d c12;
        l lVar;
        j jVar;
        final wn.e eVar;
        try {
            c10 = c(str, "fetch");
            c11 = c(str, "activate");
            c12 = c(str, "defaults");
            lVar = new l(this.f20514b.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.f20520h, str, "settings"), 0));
            jVar = new j(this.f20515c, c11, c12);
            g gVar = this.f20516d;
            mq.c cVar = this.f20519g;
            gVar.a();
            if (gVar.f31272b.equals("[DEFAULT]") && str.equals("firebase")) {
                eVar = new wn.e(cVar);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                BiConsumer biConsumer = new BiConsumer() { // from class: ir.d
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        JSONObject optJSONObject;
                        wn.e eVar2 = wn.e.this;
                        String str2 = (String) obj;
                        jr.e eVar3 = (jr.e) obj2;
                        tp.d dVar = (tp.d) ((mq.c) eVar2.f39327b).get();
                        if (dVar != null) {
                            JSONObject jSONObject = eVar3.f21595e;
                            if (jSONObject.length() >= 1) {
                                JSONObject jSONObject2 = eVar3.f21592b;
                                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                    String optString = optJSONObject.optString("choiceId");
                                    if (!optString.isEmpty()) {
                                        synchronized (((Map) eVar2.f39328c)) {
                                            try {
                                                if (!optString.equals(((Map) eVar2.f39328c).get(str2))) {
                                                    ((Map) eVar2.f39328c).put(str2, optString);
                                                    Bundle bundle = new Bundle();
                                                    bundle.putString("arm_key", str2);
                                                    bundle.putString("arm_value", jSONObject2.optString(str2));
                                                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                                    bundle.putString("group", optJSONObject.optString("group"));
                                                    tp.e eVar4 = (tp.e) dVar;
                                                    eVar4.a("fp", "personalization_assignment", bundle);
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("_fpid", optString);
                                                    eVar4.a("fp", "_fpc", bundle2);
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                };
                synchronized (jVar.f21618a) {
                    jVar.f21618a.add(biConsumer);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b(this.f20516d, str, this.f20517e, this.f20518f, this.f20515c, c10, c11, c12, d(str, c10, lVar), jVar, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized ir.b b(pp.g r16, java.lang.String r17, nq.d r18, qp.b r19, java.util.concurrent.ScheduledExecutorService r20, jr.d r21, jr.d r22, jr.d r23, jr.i r24, jr.j r25, jr.l r26) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            monitor-enter(r15)
            java.util.HashMap r2 = r1.f20513a     // Catch: java.lang.Throwable -> L6e
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L6e
            if (r2 != 0) goto L73
            ir.b r14 = new ir.b     // Catch: java.lang.Throwable -> L6e
            android.content.Context r11 = r1.f20514b     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "firebase"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L2a
            r16.a()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "[DEFAULT]"
            r3 = r16
            java.lang.String r4 = r3.f31272b     // Catch: java.lang.Throwable -> L6e
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L2c
            r12 = r19
            goto L2e
        L2a:
            r3 = r16
        L2c:
            r2 = 0
            r12 = r2
        L2e:
            android.content.Context r7 = r1.f20514b     // Catch: java.lang.Throwable -> L6e
            monitor-enter(r15)     // Catch: java.lang.Throwable -> L6e
            j8.m r13 = new j8.m     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.ScheduledExecutorService r10 = r1.f20515c     // Catch: java.lang.Throwable -> L70
            r2 = r13
            r3 = r16
            r4 = r18
            r5 = r24
            r6 = r22
            r8 = r17
            r9 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L6e
            r3 = r14
            r4 = r11
            r5 = r12
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L6e
            r22.b()     // Catch: java.lang.Throwable -> L6e
            r23.b()     // Catch: java.lang.Throwable -> L6e
            r21.b()     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r2 = r1.f20513a     // Catch: java.lang.Throwable -> L6e
            r2.put(r0, r14)     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r2 = ir.f.f20512l     // Catch: java.lang.Throwable -> L6e
            r2.put(r0, r14)     // Catch: java.lang.Throwable -> L6e
            goto L73
        L6e:
            r0 = move-exception
            goto L7d
        L70:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6e
        L73:
            java.util.HashMap r2 = r1.f20513a     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L6e
            ir.b r0 = (ir.b) r0     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r15)
            return r0
        L7d:
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.f.b(pp.g, java.lang.String, nq.d, qp.b, java.util.concurrent.ScheduledExecutorService, jr.d, jr.d, jr.d, jr.i, jr.j, jr.l):ir.b");
    }

    public final jr.d c(String str, String str2) {
        o oVar;
        jr.d dVar;
        String format = String.format("%s_%s_%s_%s.json", "frc", this.f20520h, str, str2);
        ScheduledExecutorService scheduledExecutorService = this.f20515c;
        Context context = this.f20514b;
        HashMap hashMap = o.f21648c;
        synchronized (o.class) {
            try {
                HashMap hashMap2 = o.f21648c;
                if (!hashMap2.containsKey(format)) {
                    hashMap2.put(format, new o(context, format));
                }
                oVar = (o) hashMap2.get(format);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HashMap hashMap3 = jr.d.f21585d;
        synchronized (jr.d.class) {
            try {
                String str3 = oVar.f21650b;
                HashMap hashMap4 = jr.d.f21585d;
                if (!hashMap4.containsKey(str3)) {
                    hashMap4.put(str3, new jr.d(scheduledExecutorService, oVar));
                }
                dVar = (jr.d) hashMap4.get(str3);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVar;
    }

    public final synchronized i d(String str, jr.d dVar, l lVar) {
        nq.d dVar2;
        mq.c fVar;
        mq.c cVar;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str2;
        g gVar;
        try {
            dVar2 = this.f20517e;
            g gVar2 = this.f20516d;
            gVar2.a();
            if (gVar2.f31272b.equals("[DEFAULT]")) {
                fVar = this.f20519g;
            } else {
                fVar = new bq.f(9);
            }
            cVar = fVar;
            scheduledExecutorService = this.f20515c;
            clock = f20510j;
            random = f20511k;
            g gVar3 = this.f20516d;
            gVar3.a();
            str2 = gVar3.f31273c.f31280a;
            gVar = this.f20516d;
            gVar.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new i(dVar2, cVar, scheduledExecutorService, clock, random, dVar, new ConfigFetchHttpClient(this.f20514b, gVar.f31273c.f31281b, str2, lVar.f21626a.getLong("fetch_timeout_in_seconds", 60L), str, lVar.f21626a.getLong("fetch_timeout_in_seconds", 60L)), lVar, this.f20521i);
    }
}
