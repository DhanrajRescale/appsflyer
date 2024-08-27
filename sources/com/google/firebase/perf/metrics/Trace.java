package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import cr.b;
import ek.h0;
import er.f;
import fr.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import jr.h;
import ll.e;
import uq.c;
import w.k;
import yq.a;
import zq.d;

/* loaded from: classes2.dex */
public class Trace extends c implements Parcelable, b {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* renamed from: m, reason: collision with root package name */
    public static final a f11836m = a.d();

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f11837a;

    /* renamed from: b, reason: collision with root package name */
    public final Trace f11838b;

    /* renamed from: c, reason: collision with root package name */
    public final GaugeManager f11839c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11840d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f11841e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f11842f;

    /* renamed from: g, reason: collision with root package name */
    public final List f11843g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f11844h;

    /* renamed from: i, reason: collision with root package name */
    public final f f11845i;

    /* renamed from: j, reason: collision with root package name */
    public final e f11846j;

    /* renamed from: k, reason: collision with root package name */
    public i f11847k;

    /* renamed from: l, reason: collision with root package name */
    public i f11848l;

    static {
        new ConcurrentHashMap();
        CREATOR = new zq.c(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, f fVar, e eVar, uq.b bVar) {
        super(bVar);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.f11837a = new WeakReference(this);
        this.f11838b = null;
        this.f11840d = str.trim();
        this.f11844h = new ArrayList();
        this.f11841e = new ConcurrentHashMap();
        this.f11842f = new ConcurrentHashMap();
        this.f11846j = eVar;
        this.f11845i = fVar;
        this.f11843g = Collections.synchronizedList(new ArrayList());
        this.f11839c = gaugeManager;
    }

    @Override // cr.b
    public final void a(cr.a aVar) {
        if (aVar == null) {
            f11836m.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (this.f11847k != null && !c()) {
            this.f11843g.add(aVar);
        }
    }

    public final void b(String str, String str2) {
        if (!c()) {
            ConcurrentHashMap concurrentHashMap = this.f11842f;
            if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            ar.e.b(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f11840d));
    }

    public final boolean c() {
        return this.f11848l != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() {
        try {
            if (this.f11847k != null && !c()) {
                f11836m.g("Trace '%s' is started but not stopped when it is destructed!", this.f11840d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f11842f.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f11842f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        d dVar;
        if (str != null) {
            dVar = (d) this.f11841e.get(str.trim());
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return 0L;
        }
        return dVar.f42799b.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j10) {
        boolean z10;
        String c10 = ar.e.c(str);
        a aVar = f11836m;
        if (c10 != null) {
            aVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c10);
            return;
        }
        if (this.f11847k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.f11840d;
        if (!z10) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f11841e;
        d dVar = (d) concurrentHashMap.get(trim);
        if (dVar == null) {
            dVar = new d(trim);
            concurrentHashMap.put(trim, dVar);
        }
        AtomicLong atomicLong = dVar.f42799b;
        atomicLong.addAndGet(j10);
        aVar.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        a aVar = f11836m;
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            aVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f11840d);
            z10 = true;
        } catch (Exception e10) {
            aVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f11842f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j10) {
        boolean z10;
        String c10 = ar.e.c(str);
        a aVar = f11836m;
        if (c10 != null) {
            aVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c10);
            return;
        }
        if (this.f11847k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.f11840d;
        if (!z10) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f11841e;
        d dVar = (d) concurrentHashMap.get(trim);
        if (dVar == null) {
            dVar = new d(trim);
            concurrentHashMap.put(trim, dVar);
        }
        dVar.f42799b.set(j10);
        aVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (c()) {
            a aVar = f11836m;
            if (aVar.f41802b) {
                aVar.f41801a.getClass();
                Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
                return;
            }
            return;
        }
        this.f11842f.remove(str);
    }

    @Keep
    public void start() {
        String str;
        boolean o10 = vq.a.e().o();
        a aVar = f11836m;
        if (!o10) {
            aVar.a("Trace feature is disabled.");
            return;
        }
        String str2 = this.f11840d;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        } else {
            if (str2.startsWith("_")) {
                int[] g10 = k.g(6);
                int length = g10.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (da.e.c(g10[i10]).equals(str2)) {
                            break;
                        } else {
                            i10++;
                        }
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            aVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.f11847k != null) {
            aVar.c("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.f11846j.getClass();
        this.f11847k = new i();
        registerForAppState();
        cr.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f11837a);
        a(perfSession);
        if (perfSession.f13073c) {
            this.f11839c.collectGaugeMetricOnce(perfSession.f13072b);
        }
    }

    @Keep
    public void stop() {
        boolean z10;
        if (this.f11847k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str = this.f11840d;
        a aVar = f11836m;
        if (!z10) {
            aVar.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (c()) {
            aVar.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f11837a);
        unregisterForAppState();
        this.f11846j.getClass();
        i iVar = new i();
        this.f11848l = iVar;
        if (this.f11838b == null) {
            ArrayList arrayList = this.f11844h;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) h.l(arrayList, 1);
                if (trace.f11848l == null) {
                    trace.f11848l = iVar;
                }
            }
            if (!str.isEmpty()) {
                this.f11845i.c(new h0(this, 21).b(), getAppState());
                if (SessionManager.getInstance().perfSession().f13073c) {
                    this.f11839c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f13072b);
                    return;
                }
                return;
            }
            if (aVar.f41802b) {
                aVar.f41801a.getClass();
                Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11838b, 0);
        parcel.writeString(this.f11840d);
        parcel.writeList(this.f11844h);
        parcel.writeMap(this.f11841e);
        parcel.writeParcelable(this.f11847k, 0);
        parcel.writeParcelable(this.f11848l, 0);
        synchronized (this.f11843g) {
            parcel.writeList(this.f11843g);
        }
    }

    public Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : uq.b.a());
        this.f11837a = new WeakReference(this);
        this.f11838b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f11840d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f11844h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f11841e = concurrentHashMap;
        this.f11842f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, d.class.getClassLoader());
        this.f11847k = (i) parcel.readParcelable(i.class.getClassLoader());
        this.f11848l = (i) parcel.readParcelable(i.class.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f11843g = synchronizedList;
        parcel.readList(synchronizedList, cr.a.class.getClassLoader());
        if (z10) {
            this.f11845i = null;
            this.f11846j = null;
            this.f11839c = null;
        } else {
            this.f11845i = f.f15842s;
            this.f11846j = new e(18);
            this.f11839c = GaugeManager.getInstance();
        }
    }
}
