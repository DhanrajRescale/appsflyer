package in.juspay.hyper.bridge;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class BridgeList implements HBridge {
    private final Map<String, HyperBridge> bridgeList = new HashMap();

    public void addHyperBridge(HyperBridge hyperBridge) {
        this.bridgeList.put(hyperBridge.getInterfaceName(), hyperBridge);
    }

    @JavascriptInterface
    public String getBridgeKeys() {
        return new JSONArray((Collection) this.bridgeList.keySet()).toString();
    }

    public Map<String, HyperBridge> getBridgeList() {
        return this.bridgeList;
    }

    @Override // in.juspay.hyper.bridge.HBridge
    @NonNull
    public String getInterfaceName() {
        return getClass().getSimpleName();
    }
}
