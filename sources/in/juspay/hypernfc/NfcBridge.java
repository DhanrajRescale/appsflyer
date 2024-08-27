package in.juspay.hypernfc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import com.cardreader.card_reader_lib.CardTask;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.core.BridgeComponents;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NfcBridge extends HyperBridge {
    private final int NFC_CARD_REQUEST;
    private final int SETTINGS_REQUEST;
    private String callback;

    @NonNull
    private final CardTask cardTask;
    private int waitingTime;

    public NfcBridge(BridgeComponents bridgeComponents) {
        super(bridgeComponents);
        this.cardTask = new CardTask();
        this.NFC_CARD_REQUEST = 121;
        this.SETTINGS_REQUEST = 144;
    }

    private void showLoadingScreen(String str, int i10) {
        this.callback = str;
        this.waitingTime = i10;
        Intent intent = new Intent(this.bridgeComponents.getContext(), (Class<?>) NfcActivity.class);
        intent.putExtra("waitingTime", i10);
        this.bridgeComponents.getFragmentHooks().startActivityForResult(intent, 121, null);
    }

    @JavascriptInterface
    public boolean isNFCEnabled() {
        return this.cardTask.isNFCEnabled(this.bridgeComponents.getContext());
    }

    @JavascriptInterface
    public boolean isNFCSupportPresent() {
        return this.cardTask.isNFCSupported(this.bridgeComponents.getContext());
    }

    @Override // in.juspay.hyper.bridge.HyperBridge
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        Bundle extras;
        if (i10 != 144 && i10 != 121) {
            return false;
        }
        String str = null;
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception unused) {
                this.bridgeComponents.getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, "{\"error\":\"Couldn't read the card! Try again or type your card number\"}");
            }
        } else {
            extras = null;
        }
        if (i10 == 121 && (i11 == -1 || i11 == 0)) {
            if (intent != null && intent.hasExtra("result_data")) {
                if (extras != null) {
                    str = extras.getString("result_data");
                }
                this.bridgeComponents.getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, str);
                return true;
            }
            this.bridgeComponents.getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, "{\"error\":\"Couldn't read the card! Try again or type your card number\"}");
        } else {
            if (i10 == 144 && isNFCEnabled()) {
                openNFCReader(this.callback, this.waitingTime);
                return true;
            }
            if (i10 == 144 && !isNFCEnabled()) {
                this.bridgeComponents.getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, "{\"error\":\"Permission denied !!\"}");
                return true;
            }
        }
        return false;
    }

    @JavascriptInterface
    public void openNFCReader(String str, int i10) {
        this.callback = str;
        this.waitingTime = i10;
        try {
            if (isNFCSupportPresent() && isNFCEnabled()) {
                showLoadingScreen(str, i10);
            } else if (isNFCSupportPresent()) {
                this.bridgeComponents.getFragmentHooks().startActivityForResult(new Intent("android.settings.NFC_SETTINGS"), 144, null);
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", "Does not support");
                jSONObject.put("data", (Object) null);
                this.bridgeComponents.getCallbackInvoker().invokeCallbackInDUIWebview(this.callback, jSONObject.toString());
            }
        } catch (Exception e10) {
            this.bridgeComponents.getCallbackInvoker().invokeCallbackInDUIWebview(str, String.format("{\"error\":\"true\",\"data\":\"%s\"}", Base64.encodeToString(e10.toString().getBytes(), 2)));
        }
    }
}
