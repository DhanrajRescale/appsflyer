package com.airbnb.deeplinkdispatch;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.g;
import ut.h;
import vt.p0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0004¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J!\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0003J5\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000b2 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010%\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e¨\u0006("}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/airbnb/deeplinkdispatch/DeepLinkUri;", "inputUri", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getParameters", "toString", "other", HttpUrl.FRAGMENT_ENCODE_SET, "compareTo", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "component1", "component2", "deeplinkEntry", "parameterMap", "copy", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "getDeeplinkEntry", "()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "Ljava/util/Map;", "getParameterMap", "()Ljava/util/Map;", "firstConfigurablePathSegmentIndex$delegate", "Lut/g;", "getFirstConfigurablePathSegmentIndex", "()I", "firstConfigurablePathSegmentIndex", "firstPlaceholderIndex$delegate", "getFirstPlaceholderIndex", "firstPlaceholderIndex", "firstNonConcreteIndex$delegate", "getFirstNonConcreteIndex", "firstNonConcreteIndex", "<init>", "(Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;Ljava/util/Map;)V", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final /* data */ class DeepLinkMatchResult implements Comparable<DeepLinkMatchResult> {

    @NotNull
    private final DeepLinkEntry deeplinkEntry;

    /* renamed from: firstConfigurablePathSegmentIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final g firstConfigurablePathSegmentIndex;

    /* renamed from: firstNonConcreteIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final g firstNonConcreteIndex;

    /* renamed from: firstPlaceholderIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final g firstPlaceholderIndex;

    @NotNull
    private final Map<DeepLinkUri, Map<String, String>> parameterMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DeepLinkMatchResult(@NotNull DeepLinkEntry deeplinkEntry, @NotNull Map<DeepLinkUri, ? extends Map<String, String>> parameterMap) {
        Intrinsics.checkNotNullParameter(deeplinkEntry, "deeplinkEntry");
        Intrinsics.checkNotNullParameter(parameterMap, "parameterMap");
        this.deeplinkEntry = deeplinkEntry;
        this.parameterMap = parameterMap;
        this.firstConfigurablePathSegmentIndex = h.a(new DeepLinkMatchResult$firstConfigurablePathSegmentIndex$2(this));
        this.firstPlaceholderIndex = h.a(new DeepLinkMatchResult$firstPlaceholderIndex$2(this));
        this.firstNonConcreteIndex = h.a(new DeepLinkMatchResult$firstNonConcreteIndex$2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeepLinkMatchResult copy$default(DeepLinkMatchResult deepLinkMatchResult, DeepLinkEntry deepLinkEntry, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deepLinkEntry = deepLinkMatchResult.deeplinkEntry;
        }
        if ((i10 & 2) != 0) {
            map = deepLinkMatchResult.parameterMap;
        }
        return deepLinkMatchResult.copy(deepLinkEntry, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFirstConfigurablePathSegmentIndex() {
        return ((Number) this.firstConfigurablePathSegmentIndex.getValue()).intValue();
    }

    private final int getFirstNonConcreteIndex() {
        return ((Number) this.firstNonConcreteIndex.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFirstPlaceholderIndex() {
        return ((Number) this.firstPlaceholderIndex.getValue()).intValue();
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DeepLinkEntry getDeeplinkEntry() {
        return this.deeplinkEntry;
    }

    @NotNull
    public final Map<DeepLinkUri, Map<String, String>> component2() {
        return this.parameterMap;
    }

    @NotNull
    public final DeepLinkMatchResult copy(@NotNull DeepLinkEntry deeplinkEntry, @NotNull Map<DeepLinkUri, ? extends Map<String, String>> parameterMap) {
        Intrinsics.checkNotNullParameter(deeplinkEntry, "deeplinkEntry");
        Intrinsics.checkNotNullParameter(parameterMap, "parameterMap");
        return new DeepLinkMatchResult(deeplinkEntry, parameterMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinkMatchResult)) {
            return false;
        }
        DeepLinkMatchResult deepLinkMatchResult = (DeepLinkMatchResult) other;
        return Intrinsics.a(this.deeplinkEntry, deepLinkMatchResult.deeplinkEntry) && Intrinsics.a(this.parameterMap, deepLinkMatchResult.parameterMap);
    }

    @NotNull
    public final DeepLinkEntry getDeeplinkEntry() {
        return this.deeplinkEntry;
    }

    @NotNull
    public final Map<DeepLinkUri, Map<String, String>> getParameterMap() {
        return this.parameterMap;
    }

    @NotNull
    public final Map<String, String> getParameters(@NotNull DeepLinkUri inputUri) {
        Intrinsics.checkNotNullParameter(inputUri, "inputUri");
        Map<String, String> map = this.parameterMap.get(inputUri);
        if (map == null) {
            return p0.d();
        }
        return map;
    }

    public int hashCode() {
        return this.parameterMap.hashCode() + (this.deeplinkEntry.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "uriTemplate: " + this.deeplinkEntry.getUriTemplate() + " activity: " + ((Object) this.deeplinkEntry.getActivityClass().getName()) + " method: " + ((Object) this.deeplinkEntry.getMethod()) + " parameters: " + this.parameterMap;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DeepLinkMatchResult other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (getFirstNonConcreteIndex() < other.getFirstNonConcreteIndex()) {
            return -1;
        }
        if (getFirstNonConcreteIndex() == other.getFirstNonConcreteIndex()) {
            if (getFirstNonConcreteIndex() == -1 || this.deeplinkEntry.getUriTemplate().charAt(getFirstNonConcreteIndex()) == other.deeplinkEntry.getUriTemplate().charAt(getFirstNonConcreteIndex())) {
                return 0;
            }
            if (this.deeplinkEntry.getUriTemplate().charAt(getFirstNonConcreteIndex()) == '<') {
                return -1;
            }
        }
        return 1;
    }
}
