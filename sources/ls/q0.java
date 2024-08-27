package ls;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;

/* loaded from: classes2.dex */
public final class q0 implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (task.isSuccessful()) {
            s0.c(((InstanceIdResult) task.getResult()).getToken());
        }
    }
}
