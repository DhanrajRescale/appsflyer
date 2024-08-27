package com.appsflyer.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1cSDK implements AFd1bSDK {

    @NotNull
    private final AFd1gSDK values;

    public AFd1cSDK(@NotNull AFd1gSDK aFd1gSDK) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.values = aFd1gSDK;
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void valueOf(@NotNull byte[] bArr, Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1aSDK(bArr, map, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE).AFKeystoreWrapper()) {
            this.values.AFInAppEventType();
        }
    }
}
