package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFd1aSDK;", "Lcom/appsflyer/internal/AFd1mSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1uSDK;", "Lcom/appsflyer/internal/AFe1uSDK;", "values", "()Lcom/appsflyer/internal/AFe1uSDK;", "AFInAppEventParameterName", "()Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, "p2", "<init>", "([BLjava/util/Map;I)V", "AFa1uSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1aSDK extends AFd1mSDK {

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    private final AFe1uSDK AFInAppEventParameterName;

    @NotNull
    public static String AFKeystoreWrapper = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1aSDK(@NotNull byte[] bArr, Map<String, String> map, int i10) {
        super(bArr, map, i10);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventParameterName = AFe1uSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NotNull
    public final String AFInAppEventParameterName() {
        String format = String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NotNull
    public final String AFInAppEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: ".concat(String.valueOf(str));
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NotNull
    /* renamed from: values, reason: from getter */
    public final AFe1uSDK getAFInAppEventParameterName() {
        return this.AFInAppEventParameterName;
    }
}
