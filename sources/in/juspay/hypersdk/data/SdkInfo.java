package in.juspay.hypersdk.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public final class SdkInfo {
    private final boolean sdkDebuggable;
    private final String sdkName;
    private final String sdkVersion;
    private final boolean usesLocalAssets;

    public SdkInfo(@NonNull String str, @NonNull String str2, boolean z10, boolean z11) {
        this.sdkName = str;
        this.sdkVersion = str2;
        this.sdkDebuggable = z10;
        this.usesLocalAssets = z11;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public boolean isSdkDebuggable() {
        return this.sdkDebuggable;
    }

    public boolean usesLocalAssets() {
        return this.usesLocalAssets;
    }
}
