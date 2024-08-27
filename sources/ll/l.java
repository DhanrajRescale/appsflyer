package ll;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f24921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f24922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f24923d;

    public /* synthetic */ l(n nVar, i iVar, m mVar, int i10) {
        this.f24920a = i10;
        this.f24921b = nVar;
        this.f24922c = iVar;
        this.f24923d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24920a;
        m task = this.f24923d;
        i continuation = this.f24922c;
        n tcs = this.f24921b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(tcs, "$tcs");
                Intrinsics.checkNotNullParameter(continuation, "$continuation");
                Intrinsics.checkNotNullParameter(task, "$task");
                try {
                    tcs.c(continuation.then(task));
                    return;
                } catch (CancellationException unused) {
                    tcs.a();
                    return;
                } catch (Exception e10) {
                    tcs.b(e10);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(tcs, "$tcs");
                Intrinsics.checkNotNullParameter(continuation, "$continuation");
                Intrinsics.checkNotNullParameter(task, "$task");
                try {
                    m mVar = (m) continuation.then(task);
                    if (mVar == null) {
                        tcs.c(null);
                    } else {
                        mVar.a(new j(tcs, 1));
                    }
                    return;
                } catch (CancellationException unused2) {
                    tcs.a();
                    return;
                } catch (Exception e11) {
                    tcs.b(e11);
                    return;
                }
        }
    }
}
