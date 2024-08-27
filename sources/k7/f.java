package k7;

import java.util.List;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f22341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f22342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f22344d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f22345e;

    public f(h hVar, List list, List list2, int i10) {
        this.f22345e = hVar;
        this.f22341a = list;
        this.f22342b = list2;
        this.f22343c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22345e.f22371c.execute(new k(3, this, w.e(new e(this))));
    }
}
