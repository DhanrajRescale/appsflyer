package xq;

import com.google.firebase.perf.config.RemoteConfigManager;
import pp.g;

/* loaded from: classes2.dex */
public final class c implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40544a;

    /* renamed from: b, reason: collision with root package name */
    public final a f40545b;

    public /* synthetic */ c(a aVar, int i10) {
        this.f40544a = i10;
        this.f40545b = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f40544a;
        a aVar = this.f40545b;
        switch (i10) {
            case 0:
                g gVar = aVar.f40538a;
                yk.g.h(gVar);
                return gVar;
            default:
                aVar.getClass();
                RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
                yk.g.h(remoteConfigManager);
                return remoteConfigManager;
        }
    }
}
