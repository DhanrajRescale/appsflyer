package on;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.applinks.AppLinkData;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import i5.w;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes2.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30119a;

    /* renamed from: b, reason: collision with root package name */
    public final pn.d f30120b;

    /* renamed from: c, reason: collision with root package name */
    public final a f30121c;

    public c(Context context, pn.d dVar, a aVar) {
        this.f30119a = context;
        this.f30120b = dVar;
        this.f30121c = aVar;
    }

    public final void a(jn.i iVar, int i10, boolean z10) {
        Context context = this.f30119a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f21499a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        gn.c cVar = iVar.f21501c;
        adler32.update(allocate.putInt(sn.a.a(cVar)).array());
        byte[] bArr = iVar.f21500b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        al.d.b0("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a10 = ((pn.j) this.f30120b).a();
        String valueOf = String.valueOf(sn.a.a(cVar));
        String str = iVar.f21499a;
        long longValue = ((Long) pn.j.l(a10.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf}), new w(10))).longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        a aVar = this.f30121c;
        builder.setMinimumLatency(aVar.a(cVar, longValue, i10));
        Set set = ((b) aVar.f30115b.get(cVar)).f30118c;
        if (set.contains(d.f30122a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(d.f30124c)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(d.f30123b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", sn.a.a(cVar));
        if (bArr != null) {
            persistableBundle.putString(AppLinkData.ARGUMENTS_EXTRAS_KEY, Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(cVar, longValue, i10)), Long.valueOf(longValue), Integer.valueOf(i10)};
        String q02 = al.d.q0("JobInfoScheduler");
        if (Log.isLoggable(q02, 3)) {
            Log.d(q02, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
