package com.assetgro.stockgro.data.repository;

import com.jakewharton.retrofit2.adapter.rxjava2.HttpException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DefaultErrorMessage", HttpUrl.FRAGMENT_ENCODE_SET, "EmptyJsonObject", "NetworkError", "extractMessage", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApiExceptionUtilitiesKt {

    @NotNull
    private static final String DefaultErrorMessage = "Unknown Error";

    @NotNull
    private static final String EmptyJsonObject = "{}";

    @NotNull
    private static final String NetworkError = "A network error occurred";

    @NotNull
    public static final String extractMessage(@NotNull Throwable th2) {
        String str;
        Intrinsics.checkNotNullParameter(th2, "<this>");
        boolean z10 = th2 instanceof HttpException;
        String str2 = DefaultErrorMessage;
        if (z10) {
            ResponseBody responseBody = ((HttpException) th2).f12014a.f29304c;
            if (responseBody == null || (str = responseBody.string()) == null) {
                str = EmptyJsonObject;
            }
            try {
                str2 = new JSONObject(str).getString("message");
            } catch (JSONException unused) {
            }
            Intrinsics.c(str2);
            return str2;
        }
        if (th2 instanceof IOException) {
            return NetworkError;
        }
        if (!(th2 instanceof StockgroApiException)) {
            return DefaultErrorMessage;
        }
        return ((StockgroApiException) th2).getMessage();
    }
}
