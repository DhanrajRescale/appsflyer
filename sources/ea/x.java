package ea;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import nv.x0;

/* loaded from: classes.dex */
public final class x implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15292a;

    /* renamed from: b, reason: collision with root package name */
    public final w f15293b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f15294c;

    public /* synthetic */ x(w wVar, xs.b bVar, int i10) {
        this.f15292a = i10;
        this.f15293b = wVar;
        this.f15294c = bVar;
    }

    public final NetworkService a() {
        int i10 = this.f15292a;
        w wVar = this.f15293b;
        Provider provider = this.f15294c;
        switch (i10) {
            case 2:
                x0 retrofit = (x0) provider.get();
                wVar.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object b10 = retrofit.b();
                Intrinsics.checkNotNullExpressionValue(b10, "create(...)");
                NetworkService networkService = (NetworkService) b10;
                yk.g.j(networkService);
                return networkService;
            default:
                x0 retrofit3 = (x0) provider.get();
                wVar.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object b11 = retrofit3.b();
                Intrinsics.checkNotNullExpressionValue(b11, "create(...)");
                NetworkService networkService2 = (NetworkService) b11;
                yk.g.j(networkService2);
                return networkService2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [jj.a, java.lang.Object] */
    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f15292a;
        w wVar = this.f15293b;
        Provider provider = this.f15294c;
        switch (i10) {
            case 0:
                Context context = (Context) provider.get();
                wVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                ?? obj = new Object();
                obj.f21410g = context;
                AppsFlyerLib appsFlyerLib = jj.c.f21413a;
                if (appsFlyerLib != null) {
                    obj.f21411h = appsFlyerLib;
                    return obj;
                }
                Intrinsics.k("appsFlyerLib");
                throw null;
            case 1:
                Context context2 = (Context) provider.get();
                wVar.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                ls.n0 h10 = ls.n0.h(context2, "7b00af6896e06c38edb652f917d70768");
                Intrinsics.checkNotNullExpressionValue(h10, "getInstance(...)");
                yk.g.j(h10);
                return h10;
            case 2:
                return a();
            case 3:
                return a();
            default:
                Context context3 = (Context) provider.get();
                wVar.getClass();
                Intrinsics.checkNotNullParameter(context3, "context");
                b8.l c10 = b8.l.c(context3);
                Intrinsics.checkNotNullExpressionValue(c10, "getInstance(...)");
                yk.g.j(c10);
                return c10;
        }
    }
}
