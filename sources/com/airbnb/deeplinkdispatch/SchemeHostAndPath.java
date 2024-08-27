package com.airbnb.deeplinkdispatch;

import com.airbnb.deeplinkdispatch.base.MatchIndex;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.g0;
import vt.y;
import vt.z;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/airbnb/deeplinkdispatch/SchemeHostAndPath;", HttpUrl.FRAGMENT_ENCODE_SET, "uri", "Lcom/airbnb/deeplinkdispatch/DeepLinkUri;", "(Lcom/airbnb/deeplinkdispatch/DeepLinkUri;)V", "matchList", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/airbnb/deeplinkdispatch/UrlElement;", "getMatchList", "()Ljava/util/List;", "getUri", "()Lcom/airbnb/deeplinkdispatch/DeepLinkUri;", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SchemeHostAndPath {

    @NotNull
    private final List<UrlElement> matchList;

    @NotNull
    private final DeepLinkUri uri;

    public SchemeHostAndPath(@NotNull DeepLinkUri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = MatchIndex.ROOT_VALUE.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        UrlElement urlElement = new UrlElement((byte) 1, bytes);
        String scheme = uri.scheme();
        Intrinsics.checkNotNullExpressionValue(scheme, "uri.scheme()");
        byte[] bytes2 = scheme.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
        UrlElement urlElement2 = new UrlElement((byte) 2, bytes2);
        String encodedHost = uri.encodedHost();
        Intrinsics.checkNotNullExpressionValue(encodedHost, "uri.encodedHost()");
        byte[] bytes3 = encodedHost.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
        List g10 = y.g(urlElement, urlElement2, new UrlElement((byte) 4, bytes3));
        List<String> encodedPathSegments = uri.encodedPathSegments();
        Intrinsics.checkNotNullExpressionValue(encodedPathSegments, "uri.encodedPathSegments()");
        ArrayList arrayList = new ArrayList(z.k(encodedPathSegments));
        for (String pathSegment : encodedPathSegments) {
            Intrinsics.checkNotNullExpressionValue(pathSegment, "pathSegment");
            byte[] bytes4 = pathSegment.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
            arrayList.add(new UrlElement((byte) 8, bytes4));
        }
        this.matchList = g0.I(arrayList, g10);
    }

    @NotNull
    public final List<UrlElement> getMatchList() {
        return this.matchList;
    }

    @NotNull
    public final DeepLinkUri getUri() {
        return this.uri;
    }
}
