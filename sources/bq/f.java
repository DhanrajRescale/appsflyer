package bq;

import android.os.Build;
import android.os.StrictMode;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements mq.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7247a;

    public /* synthetic */ f(int i10) {
        this.f7247a = i10;
    }

    @Override // mq.c
    public final Object get() {
        dr.b lambda$new$0;
        dr.f lambda$new$1;
        switch (this.f7247a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                l lVar = ExecutorsRegistrar.f11661a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new cq.e(Executors.newFixedThreadPool(4, new cq.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f11664d.get());
            case 3:
                l lVar2 = ExecutorsRegistrar.f11661a;
                return new cq.e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new cq.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f11664d.get());
            case 4:
                l lVar3 = ExecutorsRegistrar.f11661a;
                return new cq.e(Executors.newCachedThreadPool(new cq.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f11664d.get());
            case 5:
                l lVar4 = ExecutorsRegistrar.f11661a;
                return Executors.newSingleThreadScheduledExecutor(new cq.a("Firebase Scheduler", 0, null));
            case 6:
                return Executors.newSingleThreadScheduledExecutor();
            case 7:
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            case 8:
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            default:
                Clock clock = ir.f.f20510j;
                return null;
        }
    }
}
