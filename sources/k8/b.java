package k8;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b8.l f22658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22659c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22660d = false;

    public b(b8.l lVar) {
        this.f22658b = lVar;
    }

    @Override // k8.c
    public final void b() {
        b8.l lVar = this.f22658b;
        WorkDatabase workDatabase = lVar.f4110c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.n().n(this.f22659c).iterator();
            while (it.hasNext()) {
                c.a(lVar, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f22660d) {
                b8.d.a(lVar.f4109b, lVar.f4110c, lVar.f4112e);
            }
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
