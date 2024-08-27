package com.webengage.sdk.android;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class d0 {

    /* renamed from: a, reason: collision with root package name */
    Context f12544a;

    public d0(Context context) {
        this.f12544a = null;
        this.f12544a = context.getApplicationContext();
    }

    private int c() {
        return (this.f12544a.getPackageName() + WebEngage.get().getWebEngageConfig().getWebEngageKey()).hashCode();
    }

    public void a() {
        ((AlarmManager) this.f12544a.getSystemService("alarm")).cancel(PendingIntentFactory.e(this.f12544a));
    }

    public void b() {
        ((AlarmManager) this.f12544a.getSystemService("alarm")).cancel(PendingIntentFactory.f(this.f12544a));
    }

    public void d(long j10) {
        ((AlarmManager) this.f12544a.getSystemService("alarm")).setAndAllowWhileIdle(0, j10, PendingIntentFactory.e(this.f12544a));
    }

    public void e(long j10) {
        ((AlarmManager) this.f12544a.getSystemService("alarm")).set(1, j10, PendingIntentFactory.f(this.f12544a));
    }

    @SuppressLint({"MissingPermission"})
    public void a(long j10) {
        int c10 = c();
        int i10 = Build.VERSION.SDK_INT;
        JobScheduler jobScheduler = (JobScheduler) this.f12544a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            JobInfo.Builder builder = new JobInfo.Builder(c10, new ComponentName(this.f12544a, (Class<?>) WebEngageJobService.class));
            builder.setMinimumLatency(j10);
            builder.setRequiredNetworkType(1);
            builder.setRequiresCharging(false);
            if (i10 >= 26) {
                builder.setRequiresBatteryNotLow(true);
            }
            if (i10 >= 28) {
                builder.setPrefetch(true);
            }
            if (com.webengage.sdk.android.utils.f.a("android.permission.RECEIVE_BOOT_COMPLETED", this.f12544a)) {
                builder.setPersisted(true);
            } else {
                Logger.d("WebEngage", "For WebEngage push amplification to work even after boot-up, add RECEIVE_BOOT_COMPLETED permission in the AndroidManifest.");
            }
            jobScheduler.schedule(builder.build());
        }
    }

    public void b(long j10) {
        ((AlarmManager) this.f12544a.getSystemService("alarm")).set(1, j10, PendingIntentFactory.a(this.f12544a));
    }

    public void c(long j10) {
        ((AlarmManager) this.f12544a.getSystemService("alarm")).setAndAllowWhileIdle(1, j10, PendingIntentFactory.d(this.f12544a));
    }

    public void d(List<Object> list) {
        b("we_wk_session_delay", list);
    }

    private void a(String str, List<Object> list) {
        PendingIntent a10;
        if (list != null) {
            AlarmManager alarmManager = (AlarmManager) this.f12544a.getSystemService("alarm");
            for (int i10 = 0; i10 < list.size(); i10++) {
                Long l10 = (Long) list.get(i10);
                if (l10 != null && (a10 = PendingIntentFactory.a(str, l10.longValue(), this.f12544a)) != null) {
                    alarmManager.cancel(a10);
                }
            }
        }
    }

    private void b(String str, List<Object> list) {
        PendingIntent a10;
        if (list != null) {
            AlarmManager alarmManager = (AlarmManager) this.f12544a.getSystemService("alarm");
            for (int i10 = 0; i10 < list.size(); i10++) {
                Long l10 = (Long) list.get(i10);
                if (l10 != null && (a10 = PendingIntentFactory.a(str, l10.longValue(), this.f12544a)) != null) {
                    alarmManager.setAndAllowWhileIdle(0, l10.longValue() + System.currentTimeMillis(), a10);
                }
            }
        }
    }

    public void c(List<Object> list) {
        b("we_wk_page_delay", list);
    }

    public boolean d() {
        int c10 = c();
        JobScheduler jobScheduler = (JobScheduler) this.f12544a.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return false;
        }
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == c10) {
                return true;
            }
        }
        return false;
    }

    public void a(List<Object> list) {
        a("we_wk_page_delay", list);
    }

    public void b(List<Object> list) {
        a("we_wk_session_delay", list);
    }
}
