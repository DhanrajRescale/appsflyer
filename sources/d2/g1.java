package d2;

import android.view.Choreographer;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class g1 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f13420a;

    public g1(h1 h1Var) {
        this.f13420a = h1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f13420a.f13430d.removeCallbacks(this);
        h1.f0(this.f13420a);
        h1 h1Var = this.f13420a;
        synchronized (h1Var.f13431e) {
            if (h1Var.f13436j) {
                h1Var.f13436j = false;
                List list = h1Var.f13433g;
                h1Var.f13433g = h1Var.f13434h;
                h1Var.f13434h = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) list.get(i10)).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1.f0(this.f13420a);
        h1 h1Var = this.f13420a;
        synchronized (h1Var.f13431e) {
            try {
                if (h1Var.f13433g.isEmpty()) {
                    h1Var.f13429c.removeFrameCallback(this);
                    h1Var.f13436j = false;
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
