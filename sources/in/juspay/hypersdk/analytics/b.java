package in.juspay.hypersdk.analytics;

import java.util.Queue;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterable f20192b;

    public /* synthetic */ b(Iterable iterable, int i10) {
        this.f20191a = i10;
        this.f20192b = iterable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20191a;
        Iterable iterable = this.f20192b;
        switch (i10) {
            case 0:
                LogPusher.a(iterable);
                return;
            default:
                LogPusher.g((Queue) iterable);
                return;
        }
    }
}
