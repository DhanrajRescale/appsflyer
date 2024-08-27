package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import bq.l;
import dr.b;
import dr.c;
import dr.d;
import dr.e;
import er.f;
import fr.j;
import gr.i;
import gr.k;
import gr.m;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.RealWebSocket;
import vq.a;
import vq.n;
import vq.o;
import vq.q;
import vq.r;

@Keep
/* loaded from: classes2.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private i applicationProcessState;
    private final a configResolver;
    private final l cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final l gaugeManagerExecutor;
    private d gaugeMetadataManager;
    private final l memoryGaugeCollector;
    private String sessionId;
    private final f transportManager;
    private static final yq.a logger = yq.a.d();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new l(new bq.f(6)), f.f15842s, a.e(), null, new l(new bq.f(7)), new l(new bq.f(8)));
    }

    private static void collectGaugeMetricOnce(b bVar, dr.f fVar, fr.i iVar) {
        synchronized (bVar) {
            try {
                bVar.f14472b.schedule(new dr.a(bVar, iVar, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                b.f14469g.f("Unable to collect Cpu Metric: " + e10.getMessage());
            }
        }
        synchronized (fVar) {
            try {
                fVar.f14488a.schedule(new e(fVar, iVar, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e11) {
                dr.f.f14487f.f("Unable to collect Memory Metric: " + e11.getMessage());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, vq.n] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, vq.o] */
    private long getCpuGaugeCollectionFrequencyMs(i iVar) {
        o oVar;
        long longValue;
        n nVar;
        int ordinal = iVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                longValue = -1;
            } else {
                a aVar = this.configResolver;
                aVar.getClass();
                synchronized (n.class) {
                    try {
                        if (n.f38265b == null) {
                            n.f38265b = new Object();
                        }
                        nVar = n.f38265b;
                    } finally {
                    }
                }
                fr.d j10 = aVar.j(nVar);
                if (j10.b() && a.n(((Long) j10.a()).longValue())) {
                    longValue = ((Long) j10.a()).longValue();
                } else {
                    fr.d dVar = aVar.f38250a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                    if (dVar.b() && a.n(((Long) dVar.a()).longValue())) {
                        aVar.f38252c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                        longValue = ((Long) dVar.a()).longValue();
                    } else {
                        fr.d c10 = aVar.c(nVar);
                        if (c10.b() && a.n(((Long) c10.a()).longValue())) {
                            longValue = ((Long) c10.a()).longValue();
                        } else {
                            Long l10 = 0L;
                            longValue = l10.longValue();
                        }
                    }
                }
            }
        } else {
            a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (o.class) {
                try {
                    if (o.f38266b == null) {
                        o.f38266b = new Object();
                    }
                    oVar = o.f38266b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            fr.d j11 = aVar2.j(oVar);
            if (j11.b() && a.n(((Long) j11.a()).longValue())) {
                longValue = ((Long) j11.a()).longValue();
            } else {
                fr.d dVar2 = aVar2.f38250a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (dVar2.b() && a.n(((Long) dVar2.a()).longValue())) {
                    aVar2.f38252c.d(((Long) dVar2.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    longValue = ((Long) dVar2.a()).longValue();
                } else {
                    fr.d c11 = aVar2.c(oVar);
                    if (c11.b() && a.n(((Long) c11.a()).longValue())) {
                        longValue = ((Long) c11.a()).longValue();
                    } else {
                        Long l11 = 100L;
                        longValue = l11.longValue();
                    }
                }
            }
        }
        yq.a aVar3 = b.f14469g;
        if (longValue <= 0) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return longValue;
    }

    private m getGaugeMetadata() {
        gr.l A = m.A();
        int b10 = j.b((da.e.e(5) * this.gaugeMetadataManager.f14483c.totalMem) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        A.i();
        m.x((m) A.f11975b, b10);
        int b11 = j.b((da.e.e(5) * this.gaugeMetadataManager.f14481a.maxMemory()) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        A.i();
        m.v((m) A.f11975b, b11);
        int b12 = j.b((da.e.e(3) * this.gaugeMetadataManager.f14482b.getMemoryClass()) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        A.i();
        m.w((m) A.f11975b, b12);
        return (m) A.g();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [vq.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [vq.r, java.lang.Object] */
    private long getMemoryGaugeCollectionFrequencyMs(i iVar) {
        r rVar;
        long longValue;
        q qVar;
        int ordinal = iVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                longValue = -1;
            } else {
                a aVar = this.configResolver;
                aVar.getClass();
                synchronized (q.class) {
                    try {
                        if (q.f38268b == null) {
                            q.f38268b = new Object();
                        }
                        qVar = q.f38268b;
                    } finally {
                    }
                }
                fr.d j10 = aVar.j(qVar);
                if (j10.b() && a.n(((Long) j10.a()).longValue())) {
                    longValue = ((Long) j10.a()).longValue();
                } else {
                    fr.d dVar = aVar.f38250a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                    if (dVar.b() && a.n(((Long) dVar.a()).longValue())) {
                        aVar.f38252c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                        longValue = ((Long) dVar.a()).longValue();
                    } else {
                        fr.d c10 = aVar.c(qVar);
                        if (c10.b() && a.n(((Long) c10.a()).longValue())) {
                            longValue = ((Long) c10.a()).longValue();
                        } else {
                            Long l10 = 0L;
                            longValue = l10.longValue();
                        }
                    }
                }
            }
        } else {
            a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (r.class) {
                try {
                    if (r.f38269b == null) {
                        r.f38269b = new Object();
                    }
                    rVar = r.f38269b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            fr.d j11 = aVar2.j(rVar);
            if (j11.b() && a.n(((Long) j11.a()).longValue())) {
                longValue = ((Long) j11.a()).longValue();
            } else {
                fr.d dVar2 = aVar2.f38250a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (dVar2.b() && a.n(((Long) dVar2.a()).longValue())) {
                    aVar2.f38252c.d(((Long) dVar2.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    longValue = ((Long) dVar2.a()).longValue();
                } else {
                    fr.d c11 = aVar2.c(rVar);
                    if (c11.b() && a.n(((Long) c11.a()).longValue())) {
                        longValue = ((Long) c11.a()).longValue();
                    } else {
                        Long l11 = 100L;
                        longValue = l11.longValue();
                    }
                }
            }
        }
        yq.a aVar3 = dr.f.f14487f;
        if (longValue <= 0) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return longValue;
    }

    public static /* synthetic */ b lambda$new$0() {
        return new b();
    }

    public static /* synthetic */ dr.f lambda$new$1() {
        return new dr.f();
    }

    private boolean startCollectingCpuMetrics(long j10, fr.i iVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        b bVar = (b) this.cpuGaugeCollector.get();
        long j11 = bVar.f14474d;
        if (j11 != INVALID_GAUGE_COLLECTION_FREQUENCY && j11 != 0 && j10 > 0) {
            ScheduledFuture scheduledFuture = bVar.f14475e;
            if (scheduledFuture != null) {
                if (bVar.f14476f != j10) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        bVar.f14475e = null;
                        bVar.f14476f = INVALID_GAUGE_COLLECTION_FREQUENCY;
                    }
                    bVar.a(j10, iVar);
                    return true;
                }
                return true;
            }
            bVar.a(j10, iVar);
            return true;
        }
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, fr.i iVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        dr.f fVar = (dr.f) this.memoryGaugeCollector.get();
        yq.a aVar = dr.f.f14487f;
        if (j10 <= 0) {
            fVar.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = fVar.f14491d;
        if (scheduledFuture != null) {
            if (fVar.f14492e != j10) {
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    fVar.f14491d = null;
                    fVar.f14492e = INVALID_GAUGE_COLLECTION_FREQUENCY;
                }
                fVar.a(j10, iVar);
                return true;
            }
            return true;
        }
        fVar.a(j10, iVar);
        return true;
    }

    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, i iVar) {
        gr.n F = gr.o.F();
        while (!((b) this.cpuGaugeCollector.get()).f14471a.isEmpty()) {
            k kVar = (k) ((b) this.cpuGaugeCollector.get()).f14471a.poll();
            F.i();
            gr.o.y((gr.o) F.f11975b, kVar);
        }
        while (!((dr.f) this.memoryGaugeCollector.get()).f14489b.isEmpty()) {
            gr.d dVar = (gr.d) ((dr.f) this.memoryGaugeCollector.get()).f14489b.poll();
            F.i();
            gr.o.w((gr.o) F.f11975b, dVar);
        }
        F.i();
        gr.o.v((gr.o) F.f11975b, str);
        f fVar = this.transportManager;
        fVar.f15851i.execute(new androidx.fragment.app.e(19, fVar, (gr.o) F.g(), iVar));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new d(context);
    }

    public boolean logGaugeMetadata(String str, i iVar) {
        if (this.gaugeMetadataManager != null) {
            gr.n F = gr.o.F();
            F.i();
            gr.o.v((gr.o) F.f11975b, str);
            m gaugeMetadata = getGaugeMetadata();
            F.i();
            gr.o.x((gr.o) F.f11975b, gaugeMetadata);
            gr.o oVar = (gr.o) F.g();
            f fVar = this.transportManager;
            fVar.f15851i.execute(new androidx.fragment.app.e(19, fVar, oVar, iVar));
            return true;
        }
        return false;
    }

    public void startCollectingGauges(cr.a aVar, i iVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(iVar, aVar.f13072b);
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = aVar.f13071a;
        this.sessionId = str;
        this.applicationProcessState = iVar;
        try {
            long j10 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new c(this, str, iVar, 1), j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.f("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        i iVar = this.applicationProcessState;
        b bVar = (b) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = bVar.f14475e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bVar.f14475e = null;
            bVar.f14476f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        dr.f fVar = (dr.f) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = fVar.f14491d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            fVar.f14491d = null;
            fVar.f14492e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new c(this, str, iVar, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(l lVar, f fVar, a aVar, d dVar, l lVar2, l lVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lVar;
        this.transportManager = fVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = dVar;
        this.cpuGaugeCollector = lVar2;
        this.memoryGaugeCollector = lVar3;
    }

    private long startCollectingGauges(i iVar, fr.i iVar2) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(iVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, iVar2)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(iVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, iVar2) ? cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(fr.i iVar) {
        collectGaugeMetricOnce((b) this.cpuGaugeCollector.get(), (dr.f) this.memoryGaugeCollector.get(), iVar);
    }
}
