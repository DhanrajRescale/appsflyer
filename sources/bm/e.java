package bm;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zp.e f7133b;

    public /* synthetic */ e(zp.e eVar, int i10) {
        this.f7132a = i10;
        this.f7133b = eVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f7132a;
        zp.e eVar = this.f7133b;
        switch (i10) {
            case 0:
                return Tasks.forResult(eVar);
            default:
                if (task.isSuccessful()) {
                    return (zp.e) task.getResult();
                }
                return eVar;
        }
    }
}
