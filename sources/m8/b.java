package m8;

import android.os.Handler;
import h.c;
import h.q0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27631a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27632b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f27631a = i10;
        this.f27632b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f27631a;
        Object obj = this.f27632b;
        switch (i10) {
            case 0:
                ((Handler) ((c) obj).f17584c).post(runnable);
                return;
            default:
                ((Executor) obj).execute(new q0(runnable, 22));
                return;
        }
    }
}
