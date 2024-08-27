package l7;

import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class v extends LiveData {

    /* renamed from: a, reason: collision with root package name */
    public final s f24180a;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f24182c;

    /* renamed from: d, reason: collision with root package name */
    public final tr.e f24183d;

    /* renamed from: e, reason: collision with root package name */
    public final n f24184e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24185f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f24186g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f24187h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final u f24188i = new u(this, 0);

    /* renamed from: j, reason: collision with root package name */
    public final u f24189j = new u(this, 1);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24181b = true;

    public v(s sVar, tr.e eVar, androidx.loader.content.g gVar, String[] strArr) {
        this.f24180a = sVar;
        this.f24182c = gVar;
        this.f24183d = eVar;
        this.f24184e = new n(this, strArr, 1);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        Executor executor;
        super.onActive();
        ((Set) this.f24183d.f36361b).add(this);
        boolean z10 = this.f24181b;
        s sVar = this.f24180a;
        if (z10) {
            executor = sVar.f24161c;
        } else {
            executor = sVar.f24160b;
        }
        executor.execute(this.f24188i);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        super.onInactive();
        ((Set) this.f24183d.f36361b).remove(this);
    }
}
