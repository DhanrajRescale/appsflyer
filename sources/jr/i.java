package jr;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final long f21605j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f21606k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final nq.d f21607a;

    /* renamed from: b, reason: collision with root package name */
    public final mq.c f21608b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f21609c;

    /* renamed from: d, reason: collision with root package name */
    public final Clock f21610d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f21611e;

    /* renamed from: f, reason: collision with root package name */
    public final d f21612f;

    /* renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f21613g;

    /* renamed from: h, reason: collision with root package name */
    public final l f21614h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f21615i;

    public i(nq.d dVar, mq.c cVar, ScheduledExecutorService scheduledExecutorService, Clock clock, Random random, d dVar2, ConfigFetchHttpClient configFetchHttpClient, l lVar, HashMap hashMap) {
        this.f21607a = dVar;
        this.f21608b = cVar;
        this.f21609c = scheduledExecutorService;
        this.f21610d = clock;
        this.f21611e = random;
        this.f21612f = dVar2;
        this.f21613g = configFetchHttpClient;
        this.f21614h = lVar;
        this.f21615i = hashMap;
    }

    public final g a(String str, String str2, Date date, Map map) {
        String str3;
        Long l10;
        try {
            ConfigFetchHttpClient configFetchHttpClient = this.f21613g;
            configFetchHttpClient.getClass();
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", configFetchHttpClient.f11856d, configFetchHttpClient.f11857e)).openConnection();
                ConfigFetchHttpClient configFetchHttpClient2 = this.f21613g;
                HashMap d10 = d();
                String string = this.f21614h.f21626a.getString("last_fetch_etag", null);
                tp.d dVar = (tp.d) this.f21608b.get();
                if (dVar == null) {
                    l10 = null;
                } else {
                    l10 = (Long) ((tp.e) dVar).f36346a.getUserProperties(null, null, true).get("_fot");
                }
                g fetch = configFetchHttpClient2.fetch(httpURLConnection, str, str2, d10, string, map, l10, date);
                e eVar = fetch.f21603b;
                if (eVar != null) {
                    l lVar = this.f21614h;
                    long j10 = eVar.f21596f;
                    synchronized (lVar.f21627b) {
                        lVar.f21626a.edit().putLong("last_template_version", j10).apply();
                    }
                }
                String str4 = fetch.f21604c;
                if (str4 != null) {
                    l lVar2 = this.f21614h;
                    synchronized (lVar2.f21627b) {
                        lVar2.f21626a.edit().putString("last_fetch_etag", str4).apply();
                    }
                }
                this.f21614h.c(0, l.f21625f);
                return fetch;
            } catch (IOException e10) {
                throw new FirebaseException(e10.getMessage());
            }
        } catch (FirebaseRemoteConfigServerException e11) {
            int i10 = e11.f11851a;
            l lVar3 = this.f21614h;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = lVar3.a().f21622a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f21606k;
                lVar3.c(i11, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]) / 2) + this.f21611e.nextInt((int) r2)));
            }
            k a10 = lVar3.a();
            int i12 = e11.f11851a;
            if (a10.f21622a <= 1 && i12 != 429) {
                if (i12 != 401) {
                    if (i12 != 403) {
                        if (i12 != 429) {
                            if (i12 != 500) {
                                switch (i12) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        str3 = "The server is unavailable. Please try again later.";
                                        break;
                                    default:
                                        str3 = "The server returned an unexpected error.";
                                        break;
                                }
                            } else {
                                str3 = "There was an internal server error.";
                            }
                        } else {
                            throw new FirebaseException("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new FirebaseRemoteConfigServerException(e11.f11851a, "Fetch failed: ".concat(str3), e11);
            }
            a10.f21623b.getTime();
            throw new FirebaseException("Fetch was throttled.");
        }
    }

    public final Task b(long j10, Task task, final Map map) {
        Task continueWithTask;
        final Date date = new Date(this.f21610d.currentTimeMillis());
        boolean isSuccessful = task.isSuccessful();
        Date date2 = null;
        l lVar = this.f21614h;
        if (isSuccessful) {
            lVar.getClass();
            Date date3 = new Date(lVar.f21626a.getLong("last_fetch_time_in_millis", -1L));
            if (!date3.equals(l.f21624e) && date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date3.getTime()))) {
                return Tasks.forResult(new g(2, null, null));
            }
        }
        Date date4 = lVar.a().f21623b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.f21609c;
        if (date2 != null) {
            String format = String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime())));
            date2.getTime();
            continueWithTask = Tasks.forException(new FirebaseException(format));
        } else {
            nq.c cVar = (nq.c) this.f21607a;
            final Task c10 = cVar.c();
            final Task d10 = cVar.d();
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{c10, d10}).continueWithTask(executor, new Continuation() { // from class: jr.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task onSuccessTask;
                    Date date5 = date;
                    Map map2 = map;
                    i iVar = i.this;
                    iVar.getClass();
                    Task task3 = c10;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new FirebaseException("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = d10;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new FirebaseException("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        g a10 = iVar.a((String) task3.getResult(), ((nq.a) task4.getResult()).f29073a, date5, map2);
                        if (a10.f21602a != 0) {
                            onSuccessTask = Tasks.forResult(a10);
                        } else {
                            onSuccessTask = iVar.f21612f.c(a10.f21603b).onSuccessTask(iVar.f21609c, new dj.e(a10, 25));
                        }
                        return onSuccessTask;
                    } catch (FirebaseRemoteConfigException e10) {
                        return Tasks.forException(e10);
                    }
                }
            });
        }
        return continueWithTask.continueWithTask(executor, new bm.c(17, this, date));
    }

    public final Task c(int i10) {
        HashMap hashMap = new HashMap(this.f21615i);
        hashMap.put("X-Firebase-RC-Fetch-Type", h.c(2) + "/" + i10);
        return this.f21612f.b().continueWithTask(this.f21609c, new bm.c(16, this, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        tp.d dVar = (tp.d) this.f21608b.get();
        if (dVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : ((tp.e) dVar).f36346a.getUserProperties(null, null, false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
