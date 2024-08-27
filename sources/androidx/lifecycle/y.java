package androidx.lifecycle;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveData f1999a;

    public y(LiveData liveData) {
        this.f1999a = liveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f1999a.mDataLock) {
            obj = this.f1999a.mPendingData;
            this.f1999a.mPendingData = LiveData.NOT_SET;
        }
        this.f1999a.setValue(obj);
    }
}
