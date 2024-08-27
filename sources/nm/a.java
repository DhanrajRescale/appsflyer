package nm;

import aq.d0;
import com.firebase.ui.auth.viewmodel.idp.LinkingSocialProviderResponseHandler;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import zp.e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnFailureListener, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkingSocialProviderResponseHandler f28985a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f28985a.h(am.d.a(exc));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        LinkingSocialProviderResponseHandler linkingSocialProviderResponseHandler = this.f28985a;
        linkingSocialProviderResponseHandler.getClass();
        e eVar = (e) task.getResult();
        zp.d dVar = linkingSocialProviderResponseHandler.f10963h;
        if (dVar == null) {
            return Tasks.forResult(eVar);
        }
        return ((d0) eVar).f2698a.S(dVar).continueWith(new bm.e(eVar, 1));
    }
}
