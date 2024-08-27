package wq;

import com.google.firebase.perf.session.SessionManager;
import nq.d;
import xs.b;
import yk.g;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39412a;

    /* renamed from: b, reason: collision with root package name */
    public final xq.a f39413b;

    public /* synthetic */ a(xq.a aVar, int i10) {
        this.f39412a = i10;
        this.f39413b = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f39412a) {
            case 1:
                d dVar = this.f39413b.f40539b;
                g.h(dVar);
                return dVar;
            default:
                this.f39413b.getClass();
                SessionManager sessionManager = SessionManager.getInstance();
                g.h(sessionManager);
                return sessionManager;
        }
    }
}
