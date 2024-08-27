package in.juspay.hyper.bridge;

import android.content.Intent;
import androidx.annotation.NonNull;
import in.juspay.hyper.core.BridgeComponents;

/* loaded from: classes2.dex */
public abstract class HyperBridge implements HBridge {
    protected BridgeComponents bridgeComponents;

    public HyperBridge(BridgeComponents bridgeComponents) {
        this.bridgeComponents = bridgeComponents;
    }

    @Override // in.juspay.hyper.bridge.HBridge
    @NonNull
    public String getInterfaceName() {
        return getClass().getSimpleName();
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public boolean onRequestPermissionResult(int i10, String[] strArr, int[] iArr) {
        return false;
    }

    public void reset() {
    }

    public void terminate() {
    }
}
