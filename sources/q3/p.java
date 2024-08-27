package q3;

import android.view.FrameMetrics;
import android.view.Window;

/* loaded from: classes.dex */
public final class p implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f31630a;

    public p(q qVar) {
        this.f31630a = qVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        q qVar = this.f31630a;
        if ((qVar.f31633b & 1) != 0) {
            q.u(qVar.f31634c[0], frameMetrics.getMetric(8));
        }
        if ((qVar.f31633b & 2) != 0) {
            q.u(qVar.f31634c[1], frameMetrics.getMetric(1));
        }
        if ((qVar.f31633b & 4) != 0) {
            q.u(qVar.f31634c[2], frameMetrics.getMetric(3));
        }
        if ((qVar.f31633b & 8) != 0) {
            q.u(qVar.f31634c[3], frameMetrics.getMetric(4));
        }
        if ((qVar.f31633b & 16) != 0) {
            q.u(qVar.f31634c[4], frameMetrics.getMetric(5));
        }
        if ((qVar.f31633b & 64) != 0) {
            q.u(qVar.f31634c[6], frameMetrics.getMetric(7));
        }
        if ((qVar.f31633b & 32) != 0) {
            q.u(qVar.f31634c[5], frameMetrics.getMetric(6));
        }
        if ((qVar.f31633b & 128) != 0) {
            q.u(qVar.f31634c[7], frameMetrics.getMetric(0));
        }
        if ((qVar.f31633b & 256) != 0) {
            q.u(qVar.f31634c[8], frameMetrics.getMetric(2));
        }
    }
}
