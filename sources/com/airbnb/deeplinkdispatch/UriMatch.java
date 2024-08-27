package com.airbnb.deeplinkdispatch;

import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/airbnb/deeplinkdispatch/UriMatch;", HttpUrl.FRAGMENT_ENCODE_SET, "uriTemplate", HttpUrl.FRAGMENT_ENCODE_SET, "annotatedClassFullyQualifiedName", "annotatedMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnnotatedClassFullyQualifiedName", "()Ljava/lang/String;", "getAnnotatedMethod", "getUriTemplate", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UriMatch {

    @NotNull
    private final String annotatedClassFullyQualifiedName;
    private final String annotatedMethod;

    @NotNull
    private final String uriTemplate;

    public UriMatch(@NotNull String uriTemplate, @NotNull String annotatedClassFullyQualifiedName, String str) {
        Intrinsics.checkNotNullParameter(uriTemplate, "uriTemplate");
        Intrinsics.checkNotNullParameter(annotatedClassFullyQualifiedName, "annotatedClassFullyQualifiedName");
        this.uriTemplate = uriTemplate;
        this.annotatedClassFullyQualifiedName = annotatedClassFullyQualifiedName;
        this.annotatedMethod = str;
    }

    public static /* synthetic */ UriMatch copy$default(UriMatch uriMatch, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uriMatch.uriTemplate;
        }
        if ((i10 & 2) != 0) {
            str2 = uriMatch.annotatedClassFullyQualifiedName;
        }
        if ((i10 & 4) != 0) {
            str3 = uriMatch.annotatedMethod;
        }
        return uriMatch.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUriTemplate() {
        return this.uriTemplate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAnnotatedClassFullyQualifiedName() {
        return this.annotatedClassFullyQualifiedName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAnnotatedMethod() {
        return this.annotatedMethod;
    }

    @NotNull
    public final UriMatch copy(@NotNull String uriTemplate, @NotNull String annotatedClassFullyQualifiedName, String annotatedMethod) {
        Intrinsics.checkNotNullParameter(uriTemplate, "uriTemplate");
        Intrinsics.checkNotNullParameter(annotatedClassFullyQualifiedName, "annotatedClassFullyQualifiedName");
        return new UriMatch(uriTemplate, annotatedClassFullyQualifiedName, annotatedMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UriMatch)) {
            return false;
        }
        UriMatch uriMatch = (UriMatch) other;
        return Intrinsics.a(this.uriTemplate, uriMatch.uriTemplate) && Intrinsics.a(this.annotatedClassFullyQualifiedName, uriMatch.annotatedClassFullyQualifiedName) && Intrinsics.a(this.annotatedMethod, uriMatch.annotatedMethod);
    }

    @NotNull
    public final String getAnnotatedClassFullyQualifiedName() {
        return this.annotatedClassFullyQualifiedName;
    }

    public final String getAnnotatedMethod() {
        return this.annotatedMethod;
    }

    @NotNull
    public final String getUriTemplate() {
        return this.uriTemplate;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.annotatedClassFullyQualifiedName, this.uriTemplate.hashCode() * 31, 31);
        String str = this.annotatedMethod;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return g10 + hashCode;
    }

    @NotNull
    public String toString() {
        return "UriMatch(uriTemplate=" + this.uriTemplate + ", annotatedClassFullyQualifiedName=" + this.annotatedClassFullyQualifiedName + ", annotatedMethod=" + ((Object) this.annotatedMethod) + ')';
    }
}
