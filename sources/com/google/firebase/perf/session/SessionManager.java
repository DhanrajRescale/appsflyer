package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.fragment.app.e;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.gauges.GaugeManager;
import cr.a;
import fr.d;
import gr.i;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import uq.b;
import uq.c;
import vq.p;

@Keep
/* loaded from: classes2.dex */
public class SessionManager extends c {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final b appStateMonitor;
    private final Set<WeakReference<cr.b>> clients;
    private final GaugeManager gaugeManager;
    private a perfSession;
    private Future syncInitFuture;

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, a aVar, b bVar) {
        super(b.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = bVar;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    public void lambda$setApplicationContext$0(Context context, a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.f13073c) {
            this.gaugeManager.logGaugeMetadata(aVar.f13071a, i.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(i iVar) {
        a aVar = this.perfSession;
        if (aVar.f13073c) {
            this.gaugeManager.logGaugeMetadata(aVar.f13071a, iVar);
        }
    }

    private void startOrStopCollectingGauges(i iVar) {
        a aVar = this.perfSession;
        if (aVar.f13073c) {
            this.gaugeManager.startCollectingGauges(aVar, iVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        i iVar = i.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(iVar);
        startOrStopCollectingGauges(iVar);
    }

    @Override // uq.c, uq.a
    public void onUpdateAppState(i iVar) {
        super.onUpdateAppState(iVar);
        if (this.appStateMonitor.f37348q) {
            return;
        }
        if (iVar == i.FOREGROUND) {
            updatePerfSession(iVar);
        } else if (!updatePerfSessionIfExpired()) {
            startOrStopCollectingGauges(iVar);
        }
    }

    public final a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<cr.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new e(16, this, context, this.perfSession));
    }

    @VisibleForTesting
    public void setPerfSession(a aVar) {
        this.perfSession = aVar;
    }

    public void unregisterForSessionUpdates(WeakReference<cr.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(i iVar) {
        synchronized (this.clients) {
            try {
                this.perfSession = a.c();
                Iterator<WeakReference<cr.b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    cr.b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.a(this.perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logGaugeMetadataIfCollectionEnabled(iVar);
        startOrStopCollectingGauges(iVar);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, vq.p] */
    public boolean updatePerfSessionIfExpired() {
        p pVar;
        long longValue;
        a aVar = this.perfSession;
        aVar.getClass();
        long minutes = TimeUnit.MICROSECONDS.toMinutes(aVar.f13072b.a());
        vq.a e10 = vq.a.e();
        e10.getClass();
        synchronized (p.class) {
            try {
                if (p.f38267b == null) {
                    p.f38267b = new Object();
                }
                pVar = p.f38267b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d j10 = e10.j(pVar);
        if (j10.b() && ((Long) j10.a()).longValue() > 0) {
            longValue = ((Long) j10.a()).longValue();
        } else {
            d dVar = e10.f38250a.getLong("fpr_session_max_duration_min");
            if (dVar.b() && ((Long) dVar.a()).longValue() > 0) {
                e10.f38252c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                longValue = ((Long) dVar.a()).longValue();
            } else {
                d c10 = e10.c(pVar);
                if (c10.b() && ((Long) c10.a()).longValue() > 0) {
                    longValue = ((Long) c10.a()).longValue();
                } else {
                    Long l10 = 240L;
                    longValue = l10.longValue();
                }
            }
        }
        if (minutes > longValue) {
            updatePerfSession(this.appStateMonitor.f37346o);
            return true;
        }
        return false;
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), a.c(), b.a());
    }
}
