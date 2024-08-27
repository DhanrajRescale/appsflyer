package in.juspay.hypersdk.utils.network;

import androidx.annotation.NonNull;
import in.juspay.hypersdk.data.SessionInfo;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class SessionizedNetUtils extends NetUtils {

    @NonNull
    private final SessionInfo sessionInfo;

    public SessionizedNetUtils(@NonNull SessionInfo sessionInfo, int i10, int i11, boolean z10) {
        super(i10, i11, z10);
        this.sessionInfo = sessionInfo;
    }

    private String trimClientId(@NonNull String str) {
        Matcher matcher = Pattern.compile("^(.*)_android$", 2).matcher(str);
        return (!matcher.matches() || matcher.groupCount() <= 0) ? str : matcher.group(1);
    }

    @Override // in.juspay.hypersdk.utils.network.NetUtils
    public Map<String, String> getDefaultSDKHeaders() {
        Map<String, String> defaultSDKHeaders = super.getDefaultSDKHeaders();
        defaultSDKHeaders.put("x-merchant-id", this.sessionInfo.tryGetMerchantId());
        String tryGetClientId = this.sessionInfo.tryGetClientId();
        if (tryGetClientId != null) {
            tryGetClientId = trimClientId(tryGetClientId);
        }
        defaultSDKHeaders.put("x-client-id", tryGetClientId);
        defaultSDKHeaders.put("Referer", this.sessionInfo.getPackageName());
        return defaultSDKHeaders;
    }
}
