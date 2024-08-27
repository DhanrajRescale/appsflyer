package com.airbnb.deeplinkdispatch;

import com.airbnb.deeplinkdispatch.NodeMetadata;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/airbnb/deeplinkdispatch/UrlElement;", HttpUrl.FRAGMENT_ENCODE_SET, "typeFlag", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "(B[B)V", "getTypeFlag", "()B", "getValue", "()[B", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "typeToString", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UrlElement {
    private final byte typeFlag;

    @NotNull
    private final byte[] value;

    public UrlElement(byte b10, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.typeFlag = b10;
        this.value = value;
    }

    private final String typeToString() {
        NodeMetadata.Companion companion = NodeMetadata.INSTANCE;
        if (companion.isComponentTypeRoot(this.typeFlag)) {
            return "root";
        }
        if (companion.isComponentTypeScheme(this.typeFlag)) {
            return "scheme";
        }
        if (companion.isComponentTypeHost(this.typeFlag)) {
            return "host";
        }
        if (companion.isComponentTypePathSegment(this.typeFlag)) {
            return "path_segment";
        }
        return "unknown";
    }

    public final byte getTypeFlag() {
        return this.typeFlag;
    }

    @NotNull
    public final byte[] getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "Type: " + typeToString() + ", Value: " + new String(this.value, Charsets.UTF_8);
    }
}
