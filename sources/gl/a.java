package gl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.y;
import yk.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17449c;

    public /* synthetic */ a(int i10, String str, long j10) {
        this.f17447a = i10;
        this.f17448b = j10;
        this.f17449c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i10;
        switch (this.f17447a) {
            case 0:
                long j11 = this.f17448b;
                String activityName = this.f17449c;
                Intrinsics.checkNotNullParameter(activityName, "$activityName");
                if (b.f17455f == null) {
                    b.f17455f = new l(Long.valueOf(j11), null);
                }
                l lVar = b.f17455f;
                if (lVar != null) {
                    lVar.f17479b = Long.valueOf(j11);
                }
                int i11 = 1;
                if (b.f17454e.get() <= 0) {
                    a aVar = new a(i11, activityName, j11);
                    synchronized (b.f17453d) {
                        ScheduledExecutorService scheduledExecutorService = b.f17451b;
                        a0 a0Var = a0.f28827a;
                        y b10 = a0.b(FacebookSdk.getApplicationId());
                        if (b10 == null) {
                            i10 = 60;
                        } else {
                            i10 = b10.f28967b;
                        }
                        b.f17452c = scheduledExecutorService.schedule(aVar, i10, TimeUnit.SECONDS);
                        Unit unit = Unit.f23355a;
                    }
                }
                long j12 = b.f17458i;
                if (j12 > 0) {
                    j10 = (j11 - j12) / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                } else {
                    j10 = 0;
                }
                r rVar = g.f17468a;
                Context applicationContext = FacebookSdk.getApplicationContext();
                y h10 = a0.h(FacebookSdk.getApplicationId(), false);
                if (h10 != null && h10.f28969d && j10 > 0) {
                    yk.m loggerImpl = new yk.m(applicationContext, (String) null);
                    Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", activityName);
                    double d10 = j10;
                    if (FacebookSdk.getAutoLogAppEventsEnabled() && !sl.a.b(loggerImpl)) {
                        try {
                            loggerImpl.e("fb_aa_time_spent_on_view", Double.valueOf(d10), bundle, false, b.b());
                        } catch (Throwable th2) {
                            sl.a.a(loggerImpl, th2);
                        }
                    }
                }
                l lVar2 = b.f17455f;
                if (lVar2 != null) {
                    lVar2.a();
                    return;
                }
                return;
            default:
                long j13 = this.f17448b;
                String activityName2 = this.f17449c;
                Intrinsics.checkNotNullParameter(activityName2, "$activityName");
                if (b.f17455f == null) {
                    b.f17455f = new l(Long.valueOf(j13), null);
                }
                if (b.f17454e.get() <= 0) {
                    m.d(activityName2, b.f17455f, b.f17457h);
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    edit.apply();
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    edit2.apply();
                    b.f17455f = null;
                }
                synchronized (b.f17453d) {
                    b.f17452c = null;
                    Unit unit2 = Unit.f23355a;
                }
                return;
        }
    }
}
