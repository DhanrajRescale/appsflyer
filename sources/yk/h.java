package yk;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.FacebookSdk;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.AppStartTrace;
import in.juspay.hypernfc.NfcActivity;
import in.juspay.hypersdk.analytics.LogChannelExp;
import in.juspay.hypersdk.analytics.LogPusherExp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import nl.a0;
import nl.n0;
import vt.g0;
import vt.x;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41693c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f41691a = i10;
        this.f41692b = obj;
        this.f41693c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mq.a aVar;
        int i10 = 0;
        switch (this.f41691a) {
            case 0:
                b accessTokenAppId = (b) this.f41692b;
                u appEvents = (u) this.f41693c;
                if (!sl.a.b(i.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
                        Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
                        j.q1(accessTokenAppId, appEvents);
                        return;
                    } catch (Throwable th2) {
                        sl.a.a(i.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                Context context = (Context) this.f41692b;
                m logger = (m) this.f41693c;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(logger, "$logger");
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    String str = strArr[i11];
                    String str2 = strArr2[i11];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i12 |= 1 << i11;
                    } catch (ClassNotFoundException unused) {
                    }
                    if (i13 > 10) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
                        if (sharedPreferences.getInt("kitsBitmask", 0) != i12) {
                            sharedPreferences.edit().putInt("kitsBitmask", i12).apply();
                            logger.f("fb_sdk_initialize", bundle);
                            return;
                        }
                        return;
                    }
                    i11 = i13;
                }
            case 2:
                View view = (View) this.f41692b;
                zk.d this$0 = (zk.d) this.f41693c;
                ek.e eVar = zk.d.f42546e;
                if (!sl.a.b(zk.d.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(view, "$view");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (view instanceof EditText) {
                            this$0.b(view);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        sl.a.a(zk.d.class, th3);
                        return;
                    }
                }
                return;
            case 3:
                Integer num = (Integer) this.f41692b;
                List processedEvents = (List) this.f41693c;
                Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
                if (!g0.q(al.k.f657a, num)) {
                    Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
                    if (g0.q(al.k.f658b, num)) {
                        if (al.k.f661e >= 5) {
                            al.k.b().clear();
                            al.k.f661e = 0;
                            return;
                        } else {
                            al.k.b().addAll(0, processedEvents);
                            al.k.f661e++;
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                String eventName = (String) this.f41692b;
                Bundle parameters = (Bundle) this.f41693c;
                if (!sl.a.b(bl.c.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(eventName, "$eventName");
                        Intrinsics.checkNotNullParameter(parameters, "$parameters");
                        Context context2 = FacebookSdk.getApplicationContext();
                        ek.h hVar = l.f41701b;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        new l(context2).f41702a.d(eventName, parameters);
                        return;
                    } catch (Throwable th4) {
                        sl.a.a(bl.c.class, th4);
                        return;
                    }
                }
                return;
            case 5:
                bl.l this$02 = (bl.l) this.f41692b;
                TimerTask indexingTask = (TimerTask) this.f41693c;
                String str3 = bl.l.f7117e;
                if (!sl.a.b(bl.l.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
                        try {
                            Timer timer = this$02.f7120c;
                            if (timer != null) {
                                timer.cancel();
                            }
                            this$02.f7121d = null;
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                            this$02.f7120c = timer2;
                            return;
                        } catch (Exception e10) {
                            Log.e(bl.l.f7117e, "Error scheduling indexing job", e10);
                            return;
                        }
                    } catch (Throwable th5) {
                        sl.a.a(bl.l.class, th5);
                        return;
                    }
                }
                return;
            case 6:
                String key = (String) this.f41692b;
                bl.l this$03 = (bl.l) this.f41693c;
                String str4 = bl.l.f7117e;
                if (!sl.a.b(bl.l.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(key, "$tree");
                        Intrinsics.checkNotNullParameter(this$03, "this$0");
                        Intrinsics.checkNotNullParameter(key, "key");
                        Charset charset = Charsets.UTF_8;
                        if (key != null) {
                            byte[] bytes = key.getBytes(charset);
                            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                            String u10 = n0.u("MD5", bytes);
                            Date date = xk.a.f40309l;
                            xk.a q10 = ek.h.q();
                            if (u10 == null || !Intrinsics.a(u10, this$03.f7121d)) {
                                this$03.b(ek.e.m(key, q10, FacebookSdk.getApplicationId()), u10);
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    } catch (Throwable th6) {
                        sl.a.a(bl.l.class, th6);
                        return;
                    }
                }
                return;
            case 7:
                el.g this$04 = (el.g) this.f41692b;
                Runnable queryPurchaseHistoryRunnable = (Runnable) this.f41693c;
                ek.h hVar2 = el.g.f15652s;
                if (!sl.a.b(el.g.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$04, "this$0");
                        Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
                        this$04.d(new ArrayList(this$04.f15675r), queryPurchaseHistoryRunnable);
                        return;
                    } catch (Throwable th7) {
                        sl.a.a(el.g.class, th7);
                        return;
                    }
                }
                return;
            case 8:
                String applicationId = (String) this.f41692b;
                e event = (e) this.f41693c;
                il.b bVar = il.b.f20096a;
                if (!sl.a.b(il.b.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                        Intrinsics.checkNotNullParameter(event, "$event");
                        List appEvents2 = x.a(event);
                        if (!sl.a.b(il.g.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                                Intrinsics.checkNotNullParameter(appEvents2, "appEvents");
                                il.g.f20110a.b(il.d.CUSTOM_APP_EVENTS, applicationId, appEvents2);
                                return;
                            } catch (Throwable th8) {
                                sl.a.a(il.g.class, th8);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th9) {
                        sl.a.a(il.b.class, th9);
                        return;
                    }
                }
                return;
            case 9:
                n nVar = (n) this.f41692b;
                a0 a0Var = a0.f28827a;
                nVar.getClass();
                nl.v vVar = nl.v.f28944a;
                nl.v.a(new j5.d(23), nl.t.AAM);
                nl.v.a(new j5.d(24), nl.t.RestrictiveDataFiltering);
                nl.v.a(new j5.d(25), nl.t.PrivacyProtection);
                nl.v.a(new j5.d(26), nl.t.EventDeactivation);
                nl.v.a(new j5.d(27), nl.t.IapLogging);
                nl.v.a(new j5.d(28), nl.t.ProtectedMode);
                nl.v.a(new j5.d(29), nl.t.MACARuleMatching);
                nl.v.a(new i5.w(i10), nl.t.CloudBridge);
                return;
            case 10:
                wl.x this$05 = (wl.x) this.f41692b;
                Bundle bundle2 = (Bundle) this.f41693c;
                ScheduledExecutorService scheduledExecutorService = wl.x.f39298d;
                if (!sl.a.b(wl.x.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$05, "this$0");
                        Intrinsics.checkNotNullParameter(bundle2, "$bundle");
                        this$05.f39300b.a(bundle2, "fb_mobile_login_heartbeat");
                        return;
                    } catch (Throwable th10) {
                        sl.a.a(wl.x.class, th10);
                        return;
                    }
                }
                return;
            case 11:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f41692b;
                JobParameters jobParameters = (JobParameters) this.f41693c;
                int i14 = JobInfoSchedulerService.f11071a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 12:
                bq.n nVar2 = (bq.n) this.f41692b;
                mq.c cVar = (mq.c) this.f41693c;
                if (nVar2.f7274b == bq.n.f7272d) {
                    synchronized (nVar2) {
                        aVar = nVar2.f7273a;
                        nVar2.f7273a = null;
                        nVar2.f7274b = cVar;
                    }
                    aVar.e(cVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 13:
                bq.m mVar = (bq.m) this.f41692b;
                mq.c cVar2 = (mq.c) this.f41693c;
                synchronized (mVar) {
                    try {
                        if (mVar.f7270b == null) {
                            mVar.f7269a.add(cVar2);
                        } else {
                            mVar.f7270b.add(cVar2.get());
                        }
                    } catch (Throwable th11) {
                        throw th11;
                    }
                }
                return;
            case 14:
            default:
                LogPusherExp.lambda$static$0((String) this.f41692b, (LogChannelExp) this.f41693c);
                return;
            case 15:
                cq.a aVar2 = (cq.a) this.f41692b;
                Runnable runnable = (Runnable) this.f41693c;
                Process.setThreadPriority(aVar2.f13038c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f13039d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 16:
                Callable callable = (Callable) this.f41692b;
                ek.u uVar = (ek.u) this.f41693c;
                try {
                    Object call = callable.call();
                    cq.g gVar = (cq.g) uVar.f15627b;
                    int i15 = cq.g.f13055i;
                    gVar.getClass();
                    if (call == null) {
                        call = a3.i.f155g;
                    }
                    if (a3.i.f154f.r(gVar, null, call)) {
                        a3.i.d(gVar);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    uVar.E(e11);
                    return;
                }
            case 17:
                com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.f41692b;
                Intent intent = (Intent) this.f41693c;
                iVar.getClass();
                com.google.firebase.messaging.i.a(intent);
                return;
            case 18:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f41692b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f41693c;
                ll.o oVar = FirebaseMessaging.f11684k;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource.setException(e12);
                    return;
                }
            case 19:
                com.google.firebase.messaging.n nVar3 = (com.google.firebase.messaging.n) this.f41692b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f41693c;
                nVar3.getClass();
                try {
                    taskCompletionSource2.setResult(nVar3.a());
                    return;
                } catch (Exception e13) {
                    taskCompletionSource2.setException(e13);
                    return;
                }
            case 20:
                vq.w wVar = (vq.w) this.f41692b;
                Context context3 = (Context) this.f41693c;
                if (wVar.f38276a == null && context3 != null) {
                    wVar.f38276a = context3.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    return;
                }
                return;
            case 21:
                AppStartTrace appStartTrace = (AppStartTrace) this.f41692b;
                gr.x xVar = (gr.x) this.f41693c;
                fr.i iVar2 = AppStartTrace.f11810w;
                appStartTrace.getClass();
                appStartTrace.f11815b.c((gr.a0) xVar.g(), gr.i.FOREGROUND_BACKGROUND);
                return;
            case 22:
                er.f fVar = (er.f) this.f41692b;
                er.b bVar2 = (er.b) this.f41693c;
                yq.a aVar3 = er.f.f15841r;
                fVar.getClass();
                fVar.d(bVar2.f15820a, bVar2.f15821b);
                return;
            case 23:
                qs.i this$06 = (qs.i) this.f41692b;
                qs.a playbackQuality = (qs.a) this.f41693c;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(playbackQuality, "$playbackQuality");
                for (rs.a aVar4 : ((us.f) this$06.f32171a).getListeners()) {
                    qs.e youTubePlayer = ((us.f) this$06.f32171a).getInstance();
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                    Intrinsics.checkNotNullParameter(playbackQuality, "playbackQuality");
                }
                return;
            case 24:
                qs.i this$07 = (qs.i) this.f41692b;
                String videoId = (String) this.f41693c;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(videoId, "$videoId");
                Iterator<T> it = ((us.f) this$07.f32171a).getListeners().iterator();
                while (it.hasNext()) {
                    ((rs.a) it.next()).e(((us.f) this$07.f32171a).getInstance(), videoId);
                }
                return;
            case 25:
                qs.i this$08 = (qs.i) this.f41692b;
                qs.b playbackRate = (qs.b) this.f41693c;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(playbackRate, "$playbackRate");
                for (rs.a aVar5 : ((us.f) this$08.f32171a).getListeners()) {
                    qs.e youTubePlayer2 = ((us.f) this$08.f32171a).getInstance();
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(youTubePlayer2, "youTubePlayer");
                    Intrinsics.checkNotNullParameter(playbackRate, "playbackRate");
                }
                return;
            case 26:
                qs.i this$09 = (qs.i) this.f41692b;
                qs.d playerState = (qs.d) this.f41693c;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(playerState, "$playerState");
                Iterator<T> it2 = ((us.f) this$09.f32171a).getListeners().iterator();
                while (it2.hasNext()) {
                    ((rs.a) it2.next()).d(((us.f) this$09.f32171a).getInstance(), playerState);
                }
                return;
            case 27:
                qs.i this$010 = (qs.i) this.f41692b;
                qs.c playerError = (qs.c) this.f41693c;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(playerError, "$playerError");
                Iterator<T> it3 = ((us.f) this$010.f32171a).getListeners().iterator();
                while (it3.hasNext()) {
                    ((rs.a) it3.next()).b(((us.f) this$010.f32171a).getInstance(), playerError);
                }
                return;
            case 28:
                ((NfcActivity) this.f41692b).lambda$onCreate$0((ImageView) this.f41693c);
                return;
        }
    }
}
