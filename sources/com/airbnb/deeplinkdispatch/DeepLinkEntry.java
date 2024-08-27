package com.airbnb.deeplinkdispatch;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.g;
import ut.h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001f\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "toString", "component1", "component2", "component3", "uriTemplate", "className", "method", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/lang/String;", "getUriTemplate", "()Ljava/lang/String;", "getClassName", "getMethod", "Ljava/lang/Class;", "activityClass$delegate", "Lut/g;", "getActivityClass", "()Ljava/lang/Class;", "activityClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Type", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final /* data */ class DeepLinkEntry {

    /* renamed from: activityClass$delegate, reason: from kotlin metadata */
    @NotNull
    private final g activityClass;

    @NotNull
    private final String className;
    private final String method;

    @NotNull
    private final String uriTemplate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkEntry$Type;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "CLASS", "METHOD", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public enum Type {
        CLASS,
        METHOD;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            return (Type[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public DeepLinkEntry(@NotNull String uriTemplate, @NotNull String className, String str) {
        Intrinsics.checkNotNullParameter(uriTemplate, "uriTemplate");
        Intrinsics.checkNotNullParameter(className, "className");
        this.uriTemplate = uriTemplate;
        this.className = className;
        this.method = str;
        this.activityClass = h.a(new DeepLinkEntry$activityClass$2(this));
    }

    public static /* synthetic */ DeepLinkEntry copy$default(DeepLinkEntry deepLinkEntry, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deepLinkEntry.uriTemplate;
        }
        if ((i10 & 2) != 0) {
            str2 = deepLinkEntry.className;
        }
        if ((i10 & 4) != 0) {
            str3 = deepLinkEntry.method;
        }
        return deepLinkEntry.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUriTemplate() {
        return this.uriTemplate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final DeepLinkEntry copy(@NotNull String uriTemplate, @NotNull String className, String method) {
        Intrinsics.checkNotNullParameter(uriTemplate, "uriTemplate");
        Intrinsics.checkNotNullParameter(className, "className");
        return new DeepLinkEntry(uriTemplate, className, method);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinkEntry)) {
            return false;
        }
        DeepLinkEntry deepLinkEntry = (DeepLinkEntry) other;
        return Intrinsics.a(this.uriTemplate, deepLinkEntry.uriTemplate) && Intrinsics.a(this.className, deepLinkEntry.className) && Intrinsics.a(this.method, deepLinkEntry.method);
    }

    @NotNull
    public final Class<?> getActivityClass() {
        Object value = this.activityClass.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-activityClass>(...)");
        return (Class) value;
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getUriTemplate() {
        return this.uriTemplate;
    }

    public int hashCode() {
        int hashCode;
        int g10 = jr.h.g(this.className, this.uriTemplate.hashCode() * 31, 31);
        String str = this.method;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return g10 + hashCode;
    }

    @NotNull
    public String toString() {
        return "uriTemplate: " + this.uriTemplate + " activity: " + ((Object) getActivityClass().getName()) + " method: " + ((Object) this.method);
    }
}
