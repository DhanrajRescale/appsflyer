package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f1881a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1882b;

    /* renamed from: c, reason: collision with root package name */
    public int f1883c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LiveData f1884d;

    public b0(LiveData liveData, f0 f0Var) {
        this.f1884d = liveData;
        this.f1881a = f0Var;
    }

    public final void a(boolean z10) {
        int i10;
        if (z10 == this.f1882b) {
            return;
        }
        this.f1882b = z10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        LiveData liveData = this.f1884d;
        liveData.changeActiveCounter(i10);
        if (this.f1882b) {
            liveData.dispatchingValue(this);
        }
    }

    public void e() {
    }

    public boolean h(t tVar) {
        return false;
    }

    public abstract boolean i();
}
