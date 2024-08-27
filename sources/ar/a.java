package ar;

import gr.g;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final yq.a f2770b = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final g f2771a;

    public a(g gVar) {
        this.f2771a = gVar;
    }

    @Override // ar.e
    public final boolean a() {
        yq.a aVar = f2770b;
        g gVar = this.f2771a;
        if (gVar == null) {
            aVar.f("ApplicationInfo is null");
        } else if (!gVar.F()) {
            aVar.f("GoogleAppId is null");
        } else if (!gVar.D()) {
            aVar.f("AppInstanceId is null");
        } else if (!gVar.E()) {
            aVar.f("ApplicationProcessState is null");
        } else if (gVar.C()) {
            if (!gVar.A().z()) {
                aVar.f("AndroidAppInfo.packageName is null");
            } else if (!gVar.A().A()) {
                aVar.f("AndroidAppInfo.sdkVersion is null");
            } else {
                return true;
            }
        } else {
            return true;
        }
        aVar.f("ApplicationInfo is invalid");
        return false;
    }
}
