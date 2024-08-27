package com.airbnb.deeplinkdispatch;

import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lcom/airbnb/deeplinkdispatch/ErrorHandler;", HttpUrl.FRAGMENT_ENCODE_SET, "duplicateMatch", HttpUrl.FRAGMENT_ENCODE_SET, "uriString", HttpUrl.FRAGMENT_ENCODE_SET, "duplicatedMatches", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ErrorHandler {
    void duplicateMatch(@NotNull String uriString, @NotNull List<DeepLinkMatchResult> duplicatedMatches);
}
