package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.facebook.applinks.AppLinkData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt.p0;

/* loaded from: classes.dex */
public final class AFi1tSDK implements AFi1sSDK {

    @NotNull
    private PluginInfo valueOf = new PluginInfo(Plugin.NATIVE, "6.14.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1sSDK
    public final void AFKeystoreWrapper(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.valueOf = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1sSDK
    @NotNull
    public final Map<String, Object> values() {
        LinkedHashMap h10 = p0.h(new Pair("platform", this.valueOf.getPlugin().getPluginName()), new Pair("version", this.valueOf.getVersion()));
        if (!this.valueOf.getAdditionalParams().isEmpty()) {
            h10.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, this.valueOf.getAdditionalParams());
        }
        return h10;
    }
}
