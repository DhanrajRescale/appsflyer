package ea;

import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.remote.BaseInterceptor;
import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0 implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15260a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f15261b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f15262c;

    public /* synthetic */ q0(p0 p0Var, xs.b bVar, int i10) {
        this.f15260a = i10;
        this.f15261b = p0Var;
        this.f15262c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f15260a;
        p0 p0Var = this.f15261b;
        Provider provider = this.f15262c;
        switch (i10) {
            case 0:
                UserPreferences userPreferences = (UserPreferences) provider.get();
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
                return new BaseInterceptor(p0Var.f15254a, userPreferences);
            default:
                Gson gson = (Gson) provider.get();
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(gson, "gson");
                if (gson != null) {
                    ov.a aVar = new ov.a(gson);
                    Intrinsics.checkNotNullExpressionValue(aVar, "create(...)");
                    return aVar;
                }
                throw new NullPointerException("gson == null");
        }
    }
}
