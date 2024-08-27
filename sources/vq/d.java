package vq;

/* loaded from: classes2.dex */
public final class d extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public static d f38255b;

    /* JADX WARN: Type inference failed for: r1v3, types: [vq.d, java.lang.Object] */
    public static synchronized d a0() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f38255b == null) {
                    f38255b = new Object();
                }
                dVar = f38255b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // bl.j
    public final String B() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // bl.j
    public final String G() {
        return "experiment_app_start_ttid";
    }
}
