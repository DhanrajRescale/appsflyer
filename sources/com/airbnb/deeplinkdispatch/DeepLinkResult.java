package com.airbnb.deeplinkdispatch;

import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkResult;", HttpUrl.FRAGMENT_ENCODE_SET, "isSuccessful", HttpUrl.FRAGMENT_ENCODE_SET, "uriString", HttpUrl.FRAGMENT_ENCODE_SET, "error", "deepLinkEntry", "Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;", "methodResult", "Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;", "(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V", "getDeepLinkEntry", "()Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;", "getError", "()Ljava/lang/String;", "()Z", "getMethodResult", "()Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;", "getUriString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "deeplinkdispatch_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DeepLinkResult {
    private final DeepLinkMatchResult deepLinkEntry;

    @NotNull
    private final String error;
    private final boolean isSuccessful;

    @NotNull
    private final DeepLinkMethodResult methodResult;
    private final String uriString;

    public DeepLinkResult(boolean z10, String str, @NotNull String error, DeepLinkMatchResult deepLinkMatchResult, @NotNull DeepLinkMethodResult methodResult) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(methodResult, "methodResult");
        this.isSuccessful = z10;
        this.uriString = str;
        this.error = error;
        this.deepLinkEntry = deepLinkMatchResult;
        this.methodResult = methodResult;
    }

    public static /* synthetic */ DeepLinkResult copy$default(DeepLinkResult deepLinkResult, boolean z10, String str, String str2, DeepLinkMatchResult deepLinkMatchResult, DeepLinkMethodResult deepLinkMethodResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = deepLinkResult.isSuccessful;
        }
        if ((i10 & 2) != 0) {
            str = deepLinkResult.uriString;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = deepLinkResult.error;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            deepLinkMatchResult = deepLinkResult.deepLinkEntry;
        }
        DeepLinkMatchResult deepLinkMatchResult2 = deepLinkMatchResult;
        if ((i10 & 16) != 0) {
            deepLinkMethodResult = deepLinkResult.methodResult;
        }
        return deepLinkResult.copy(z10, str3, str4, deepLinkMatchResult2, deepLinkMethodResult);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUriString() {
        return this.uriString;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final DeepLinkMatchResult getDeepLinkEntry() {
        return this.deepLinkEntry;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final DeepLinkMethodResult getMethodResult() {
        return this.methodResult;
    }

    @NotNull
    public final DeepLinkResult copy(boolean isSuccessful, String uriString, @NotNull String error, DeepLinkMatchResult deepLinkEntry, @NotNull DeepLinkMethodResult methodResult) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(methodResult, "methodResult");
        return new DeepLinkResult(isSuccessful, uriString, error, deepLinkEntry, methodResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinkResult)) {
            return false;
        }
        DeepLinkResult deepLinkResult = (DeepLinkResult) other;
        return this.isSuccessful == deepLinkResult.isSuccessful && Intrinsics.a(this.uriString, deepLinkResult.uriString) && Intrinsics.a(this.error, deepLinkResult.error) && Intrinsics.a(this.deepLinkEntry, deepLinkResult.deepLinkEntry) && Intrinsics.a(this.methodResult, deepLinkResult.methodResult);
    }

    public final String error() {
        return this.error;
    }

    public final DeepLinkMatchResult getDeepLinkEntry() {
        return this.deepLinkEntry;
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final DeepLinkMethodResult getMethodResult() {
        return this.methodResult;
    }

    public final String getUriString() {
        return this.uriString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        int hashCode;
        boolean z10 = this.isSuccessful;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        String str = this.uriString;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = h.g(this.error, (i10 + hashCode) * 31, 31);
        DeepLinkMatchResult deepLinkMatchResult = this.deepLinkEntry;
        if (deepLinkMatchResult != null) {
            i11 = deepLinkMatchResult.hashCode();
        }
        return this.methodResult.hashCode() + ((g10 + i11) * 31);
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeepLinkResult{successful=");
        sb2.append(this.isSuccessful);
        sb2.append(", uriString=");
        sb2.append((Object) this.uriString);
        sb2.append(", error='");
        return d.o(sb2, this.error, "'}");
    }
}
