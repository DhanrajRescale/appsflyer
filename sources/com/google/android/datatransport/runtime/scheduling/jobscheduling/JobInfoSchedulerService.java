package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.facebook.applinks.AppLinkData;
import jn.i;
import jn.r;
import on.g;
import on.h;
import sn.a;
import x9.c;

/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11071a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(AppLinkData.ARGUMENTS_EXTRAS_KEY);
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        r.b(getApplicationContext());
        c a10 = i.a();
        a10.q(string);
        a10.r(a.b(i10));
        if (string2 != null) {
            a10.f40139c = Base64.decode(string2, 0);
        }
        h hVar = r.a().f21525d;
        i e10 = a10.e();
        yk.h hVar2 = new yk.h(11, this, jobParameters);
        hVar.getClass();
        hVar.f30142e.execute(new g(hVar, e10, i11, hVar2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
