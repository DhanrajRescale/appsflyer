package in.juspay.services;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import in.juspay.hyper.bridge.HyperBridge;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface TenantParams {
    @NonNull
    String getBaseContent();

    @NonNull
    String getBootLoaderEndpoint();

    @NonNull
    List<Class<? extends HyperBridge>> getBridgeClasses();

    @NonNull
    String getNamespace();
}
