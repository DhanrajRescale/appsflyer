package k8;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b8.l f22656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f22657c;

    public a(b8.l lVar, UUID uuid) {
        this.f22656b = lVar;
        this.f22657c = uuid;
    }

    @Override // k8.c
    public final void b() {
        b8.l lVar = this.f22656b;
        WorkDatabase workDatabase = lVar.f4110c;
        workDatabase.c();
        try {
            c.a(lVar, this.f22657c.toString());
            workDatabase.h();
            workDatabase.f();
            b8.d.a(lVar.f4109b, lVar.f4110c, lVar.f4112e);
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
