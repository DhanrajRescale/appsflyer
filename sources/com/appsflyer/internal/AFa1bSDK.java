package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFa1bSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "(Landroid/content/Context;)Ljava/util/Map;", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AFa1bSDK {

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.AFInAppEventParameterName;

    /* renamed from: com.appsflyer.internal.AFa1bSDK$AFa1vSDK, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion AFInAppEventParameterName = new Companion();

        private Companion() {
        }
    }

    @NotNull
    Map<String, String> valueOf(@NotNull Context p02);
}
