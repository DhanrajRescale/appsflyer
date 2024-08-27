package com.webengage.sdk.android;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import com.webengage.sdk.android.actions.database.r;

@TargetApi(21)
/* loaded from: classes2.dex */
public class WebEngageJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        r.b(true);
        WebEngage.get().a((BroadcastReceiver) null);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return r.c();
    }
}
