package com.appsflyer.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u000bX\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1wSDK;", "Lcom/appsflyer/internal/AFd1mSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1uSDK;", "d", "Lcom/appsflyer/internal/AFe1uSDK;", "values", "()Lcom/appsflyer/internal/AFe1uSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Z", "()Z", "AFInAppEventParameterName", "()Ljava/lang/String;", "valueOf", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, "p2", HttpUrl.FRAGMENT_ENCODE_SET, "p3", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;[BLjava/util/Map;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1wSDK extends AFd1mSDK {

    @NotNull
    public AFd1sSDK AFInAppEventType;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    private final boolean AFInAppEventParameterName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFe1uSDK AFKeystoreWrapper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1wSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull byte[] bArr) {
        this(aFd1sSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NotNull
    public final String AFInAppEventParameterName() {
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType, null, 2, 0 == true ? 1 : 0);
        StringBuilder p10 = da.e.p(aFj1xSDK.values.AFInAppEventParameterName(AFj1xSDK.f8523d));
        p10.append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName());
        return p10.toString();
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    /* renamed from: AFInAppEventType, reason: from getter */
    public final boolean getAFInAppEventParameterName() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NotNull
    /* renamed from: values, reason: from getter */
    public final AFe1uSDK getAFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    public /* synthetic */ AFe1wSDK(AFd1sSDK aFd1sSDK, byte[] bArr, Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, bArr, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE : i10);
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NotNull
    public final String AFInAppEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: ".concat(String.valueOf(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1wSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull byte[] bArr, Map<String, String> map, int i10) {
        super(bArr, map, i10);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = aFd1sSDK;
        this.AFKeystoreWrapper = AFe1uSDK.OCTET_STREAM;
    }
}
