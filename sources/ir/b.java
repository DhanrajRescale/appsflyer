package ir;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import cq.h;
import ie.n;
import j8.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import jr.i;
import jr.j;
import jr.l;
import jr.q;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20498a;

    /* renamed from: b, reason: collision with root package name */
    public final qp.b f20499b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f20500c;

    /* renamed from: d, reason: collision with root package name */
    public final jr.d f20501d;

    /* renamed from: e, reason: collision with root package name */
    public final jr.d f20502e;

    /* renamed from: f, reason: collision with root package name */
    public final jr.d f20503f;

    /* renamed from: g, reason: collision with root package name */
    public final i f20504g;

    /* renamed from: h, reason: collision with root package name */
    public final j f20505h;

    /* renamed from: i, reason: collision with root package name */
    public final l f20506i;

    /* renamed from: j, reason: collision with root package name */
    public final m f20507j;

    public b(Context context, qp.b bVar, ScheduledExecutorService scheduledExecutorService, jr.d dVar, jr.d dVar2, jr.d dVar3, i iVar, j jVar, l lVar, m mVar) {
        this.f20498a = context;
        this.f20499b = bVar;
        this.f20500c = scheduledExecutorService;
        this.f20501d = dVar;
        this.f20502e = dVar2;
        this.f20503f = dVar3;
        this.f20504g = iVar;
        this.f20505h = jVar;
        this.f20506i = lVar;
        this.f20507j = mVar;
    }

    public static ArrayList e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final Task a() {
        Task b10 = this.f20501d.b();
        Task b11 = this.f20502e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{b10, b11}).continueWithTask(this.f20500c, new n(8, this, b10, b11));
    }

    public final Task b() {
        i iVar = this.f20504g;
        l lVar = iVar.f21614h;
        lVar.getClass();
        long j10 = lVar.f21626a.getLong("minimum_fetch_interval_in_seconds", i.f21605j);
        HashMap hashMap = new HashMap(iVar.f21615i);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return iVar.f21612f.b().continueWithTask(iVar.f21609c, new j5.l(iVar, j10, hashMap)).onSuccessTask(h.f13057a, new Object());
    }

    public final HashMap c() {
        q qVar;
        j jVar = this.f20505h;
        jVar.getClass();
        HashSet hashSet = new HashSet();
        jr.d dVar = jVar.f21620c;
        hashSet.addAll(j.c(dVar));
        jr.d dVar2 = jVar.f21621d;
        hashSet.addAll(j.c(dVar2));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String d10 = j.d(dVar, str);
            if (d10 != null) {
                jVar.a(j.b(dVar), str);
                qVar = new q(d10, 2);
            } else {
                String d11 = j.d(dVar2, str);
                if (d11 != null) {
                    qVar = new q(d11, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", "FirebaseRemoteConfigValue", str));
                    qVar = new q(HttpUrl.FRAGMENT_ENCODE_SET, 0);
                }
            }
            hashMap.put(str, qVar);
        }
        return hashMap;
    }

    public final void d(boolean z10) {
        m mVar = this.f20507j;
        synchronized (mVar) {
            ((jr.n) mVar.f21094b).f21637e = z10;
            if (!z10) {
                synchronized (mVar) {
                    if (!((Set) mVar.f21093a).isEmpty()) {
                        ((jr.n) mVar.f21094b).e(0L);
                    }
                }
            }
        }
    }
}
