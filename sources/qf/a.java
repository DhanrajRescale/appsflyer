package qf;

import com.assetgro.stockgro.data.remote.response.SectionMaintenanceConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final tt.b f31925a;

    /* renamed from: b, reason: collision with root package name */
    public Map f31926b;

    public a() {
        tt.b bVar = new tt.b();
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        this.f31925a = bVar;
        this.f31926b = new LinkedHashMap();
    }

    public final String a(b section) {
        String message;
        Intrinsics.checkNotNullParameter(section, "section");
        SectionMaintenanceConfig sectionMaintenanceConfig = (SectionMaintenanceConfig) this.f31926b.get(section.f31943a);
        if (sectionMaintenanceConfig == null || (message = sectionMaintenanceConfig.getMessage()) == null) {
            return "App is under maintenance,\\nwe will be back shortly";
        }
        return message;
    }

    public final boolean b(b section) {
        Boolean isMaintenanceOn;
        Intrinsics.checkNotNullParameter(section, "section");
        SectionMaintenanceConfig sectionMaintenanceConfig = (SectionMaintenanceConfig) this.f31926b.get(section.f31943a);
        if (sectionMaintenanceConfig != null && (isMaintenanceOn = sectionMaintenanceConfig.isMaintenanceOn()) != null) {
            return isMaintenanceOn.booleanValue();
        }
        return false;
    }
}
