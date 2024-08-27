package ir;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import jr.o;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20497a;

    public /* synthetic */ a(b bVar) {
        this.f20497a = bVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return this.f20497a.a();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z10;
        b bVar = this.f20497a;
        bVar.getClass();
        if (task.isSuccessful()) {
            jr.d dVar = bVar.f20501d;
            synchronized (dVar) {
                dVar.f21589c = Tasks.forResult(null);
            }
            o oVar = dVar.f21588b;
            synchronized (oVar) {
                oVar.f21649a.deleteFile(oVar.f21650b);
            }
            if (task.getResult() != null) {
                JSONArray jSONArray = ((jr.e) task.getResult()).f21594d;
                qp.b bVar2 = bVar.f20499b;
                if (bVar2 != null) {
                    try {
                        bVar2.c(b.e(jSONArray));
                    } catch (AbtException e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    } catch (JSONException e11) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
