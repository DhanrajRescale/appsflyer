package k8;

import androidx.work.impl.WorkDatabase;
import androidx.work.u;

/* loaded from: classes.dex */
public final class o implements androidx.work.n {

    /* renamed from: a, reason: collision with root package name */
    public final m8.a f22698a;

    /* renamed from: b, reason: collision with root package name */
    public final i8.a f22699b;

    /* renamed from: c, reason: collision with root package name */
    public final j8.m f22700c;

    static {
        u.C("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, i8.a aVar, m8.a aVar2) {
        this.f22699b = aVar;
        this.f22698a = aVar2;
        this.f22700c = workDatabase.n();
    }
}
