package com.airbnb.deeplinkdispatch;

import com.airbnb.deeplinkdispatch.base.MatchIndex;
import com.airbnb.deeplinkdispatch.base.Utils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.p0;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bJ*\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015H\u0007J&\u0010\u0016\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/airbnb/deeplinkdispatch/BaseRegistry;", HttpUrl.FRAGMENT_ENCODE_SET, "matchIndexArray", HttpUrl.FRAGMENT_ENCODE_SET, "pathSegmentReplacementKeys", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "([B[Ljava/lang/String;)V", "matchIndex", "Lcom/airbnb/deeplinkdispatch/base/MatchIndex;", "pathSegmentReplacementKeysInRegistry", HttpUrl.FRAGMENT_ENCODE_SET, "getPathSegmentReplacementKeysInRegistry", "()Ljava/util/List;", "getAllEntries", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "idxMatch", "Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;", "deepLinkUri", "Lcom/airbnb/deeplinkdispatch/DeepLinkUri;", "pathSegmentReplacements", HttpUrl.FRAGMENT_ENCODE_SET, "supports", HttpUrl.FRAGMENT_ENCODE_SET, "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseRegistry {

    @NotNull
    private final MatchIndex matchIndex;

    @NotNull
    private final List<byte[]> pathSegmentReplacementKeysInRegistry;

    public BaseRegistry(@NotNull byte[] matchIndexArray, @NotNull String[] pathSegmentReplacementKeys) {
        Intrinsics.checkNotNullParameter(matchIndexArray, "matchIndexArray");
        Intrinsics.checkNotNullParameter(pathSegmentReplacementKeys, "pathSegmentReplacementKeys");
        this.pathSegmentReplacementKeysInRegistry = Utils.toByteArraysList(pathSegmentReplacementKeys);
        this.matchIndex = new MatchIndex(matchIndexArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeepLinkMatchResult idxMatch$default(BaseRegistry baseRegistry, DeepLinkUri deepLinkUri, Map map, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                map = p0.d();
            }
            return baseRegistry.idxMatch(deepLinkUri, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: idxMatch");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean supports$default(BaseRegistry baseRegistry, DeepLinkUri deepLinkUri, Map map, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                map = p0.d();
            }
            return baseRegistry.supports(deepLinkUri, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: supports");
    }

    @NotNull
    public final List<DeepLinkEntry> getAllEntries() {
        MatchIndex matchIndex = this.matchIndex;
        List<DeepLinkEntry> allEntries = matchIndex.getAllEntries(0, matchIndex.length());
        Intrinsics.checkNotNullExpressionValue(allEntries, "matchIndex.getAllEntries(0, matchIndex.length())");
        return allEntries;
    }

    @NotNull
    public final List<byte[]> getPathSegmentReplacementKeysInRegistry() {
        return this.pathSegmentReplacementKeysInRegistry;
    }

    public final DeepLinkMatchResult idxMatch(DeepLinkUri deepLinkUri) {
        return idxMatch$default(this, deepLinkUri, null, 2, null);
    }

    public final boolean supports(DeepLinkUri deepLinkUri, @NotNull Map<byte[], byte[]> pathSegmentReplacements) {
        Intrinsics.checkNotNullParameter(pathSegmentReplacements, "pathSegmentReplacements");
        if (idxMatch(deepLinkUri, pathSegmentReplacements) != null) {
            return true;
        }
        return false;
    }

    public final DeepLinkMatchResult idxMatch(DeepLinkUri deepLinkUri, @NotNull Map<byte[], byte[]> pathSegmentReplacements) {
        Intrinsics.checkNotNullParameter(pathSegmentReplacements, "pathSegmentReplacements");
        if (deepLinkUri == null) {
            return null;
        }
        return this.matchIndex.matchUri(deepLinkUri, new SchemeHostAndPath(deepLinkUri).getMatchList(), p0.d(), 0, 0, this.matchIndex.length(), pathSegmentReplacements);
    }
}
