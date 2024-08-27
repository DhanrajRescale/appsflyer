package androidx.lifecycle;

/* loaded from: classes.dex */
public final class c0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final LiveData f1893a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1894b;

    /* renamed from: c, reason: collision with root package name */
    public int f1895c = -1;

    public c0(LiveData liveData, f0 f0Var) {
        this.f1893a = liveData;
        this.f1894b = f0Var;
    }

    @Override // androidx.lifecycle.f0
    public final void d(Object obj) {
        int i10 = this.f1895c;
        LiveData liveData = this.f1893a;
        if (i10 != liveData.getVersion()) {
            this.f1895c = liveData.getVersion();
            this.f1894b.d(obj);
        }
    }
}
