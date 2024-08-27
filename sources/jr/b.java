package jr;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f21576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f21577c;

    public b(c cVar, int i10, long j10) {
        this.f21577c = cVar;
        this.f21575a = i10;
        this.f21576b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.f21577c;
        int i10 = this.f21575a;
        final long j10 = this.f21576b;
        synchronized (cVar) {
            final int i11 = i10 - 1;
            final Task c10 = cVar.f21580c.c(3 - i11);
            final Task b10 = cVar.f21581d.b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{c10, b10}).continueWithTask(cVar.f21583f, new Continuation() { // from class: jr.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Boolean valueOf;
                    JSONObject jSONObject;
                    c cVar2 = c.this;
                    Task task2 = c10;
                    Task task3 = b10;
                    long j11 = j10;
                    int i12 = i11;
                    cVar2.getClass();
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new FirebaseException("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new FirebaseException("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    g gVar = (g) task2.getResult();
                    e eVar = (e) task3.getResult();
                    e eVar2 = gVar.f21603b;
                    boolean z10 = false;
                    if (eVar2 != null) {
                        if (eVar2.f21596f >= j11) {
                            z10 = true;
                        }
                        valueOf = Boolean.valueOf(z10);
                    } else {
                        if (gVar.f21602a == 1) {
                            z10 = true;
                        }
                        valueOf = Boolean.valueOf(z10);
                    }
                    if (!valueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        cVar2.a(i12, j11);
                        return Tasks.forResult(null);
                    }
                    if (gVar.f21603b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (eVar == null) {
                        eVar = e.b().c();
                    }
                    e eVar3 = gVar.f21603b;
                    e a10 = e.a(new JSONObject(eVar3.f21591a.toString()));
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = eVar.f21592b;
                    Iterator<String> keys = jSONObject2.keys();
                    while (true) {
                        boolean hasNext = keys.hasNext();
                        jSONObject = a10.f21592b;
                        if (!hasNext) {
                            break;
                        }
                        String next = keys.next();
                        JSONObject jSONObject3 = eVar3.f21592b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else {
                            JSONObject jSONObject4 = eVar.f21595e;
                            boolean has = jSONObject4.has(next);
                            JSONObject jSONObject5 = eVar3.f21595e;
                            if ((has && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        }
                    }
                    Iterator<String> keys2 = jSONObject.keys();
                    while (keys2.hasNext()) {
                        hashSet.add(keys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.forResult(null);
                    }
                    synchronized (cVar2) {
                        Iterator it = cVar2.f21578a.iterator();
                        while (it.hasNext()) {
                            ((m) it.next()).getClass();
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
