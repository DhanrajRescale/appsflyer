package com.airbnb.deeplinkdispatch;

import com.airbnb.deeplinkdispatch.base.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/airbnb/deeplinkdispatch/NodeMetadata;", HttpUrl.FRAGMENT_ENCODE_SET, "uriComponentType", HttpUrl.FRAGMENT_ENCODE_SET, "uriComponentValue", HttpUrl.FRAGMENT_ENCODE_SET, "(BLjava/lang/String;)V", "metadata", "(B)V", "isComponentParam", HttpUrl.FRAGMENT_ENCODE_SET, "isConfigurablePathSegment", "isValueLiteralValue", "getMetadata", "()B", "setMetadata", "isComponentTypeMismatch", "comparisonType", "Companion", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NodeMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final byte zero = 0;
    public final boolean isComponentParam;
    public final boolean isConfigurablePathSegment;
    public final boolean isValueLiteralValue;
    private byte metadata;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\n\u0010\u000e\u001a\u00020\u0004*\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/airbnb/deeplinkdispatch/NodeMetadata$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "zero", HttpUrl.FRAGMENT_ENCODE_SET, "isComponentParam", HttpUrl.FRAGMENT_ENCODE_SET, "nodeMetadata", "isComponentTypeHost", "metadata", "isComponentTypePathSegment", "isComponentTypeRoot", "isComponentTypeScheme", "isConfigurablePathSegment", "transformationType", HttpUrl.FRAGMENT_ENCODE_SET, "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isComponentParam(byte nodeMetadata) {
            return ((byte) (nodeMetadata & MetadataMasks.ComponentParamMask)) != 0;
        }

        public final boolean isComponentTypeHost(byte metadata) {
            return ((byte) (metadata & 4)) != 0;
        }

        public final boolean isComponentTypePathSegment(byte metadata) {
            return ((byte) (metadata & 8)) != 0;
        }

        public final boolean isComponentTypeRoot(byte metadata) {
            return ((byte) (metadata & 1)) != 0;
        }

        public final boolean isComponentTypeScheme(byte metadata) {
            return ((byte) (metadata & 2)) != 0;
        }

        public final boolean isConfigurablePathSegment(byte nodeMetadata) {
            return ((byte) (nodeMetadata & MetadataMasks.ConfigurablePathSegmentMask)) != 0;
        }

        public final byte transformationType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Utils utils = Utils.INSTANCE;
            if (utils.validateIfConfigurablePathSegment(str)) {
                return MetadataMasks.ConfigurablePathSegmentMask;
            }
            if (utils.validateIfComponentParam(str)) {
                return MetadataMasks.ComponentParamMask;
            }
            return (byte) 0;
        }
    }

    public NodeMetadata(byte b10) {
        this.metadata = b10;
        boolean z10 = ((byte) (b10 & MetadataMasks.ComponentParamMask)) != 0;
        this.isComponentParam = z10;
        boolean z11 = ((byte) (b10 & MetadataMasks.ConfigurablePathSegmentMask)) != 0;
        this.isConfigurablePathSegment = z11;
        this.isValueLiteralValue = (z10 || z11) ? false : true;
    }

    public static final boolean isComponentParam(byte b10) {
        return INSTANCE.isComponentParam(b10);
    }

    public static final boolean isComponentTypeHost(byte b10) {
        return INSTANCE.isComponentTypeHost(b10);
    }

    public static final boolean isComponentTypePathSegment(byte b10) {
        return INSTANCE.isComponentTypePathSegment(b10);
    }

    public static final boolean isComponentTypeRoot(byte b10) {
        return INSTANCE.isComponentTypeRoot(b10);
    }

    public static final boolean isComponentTypeScheme(byte b10) {
        return INSTANCE.isComponentTypeScheme(b10);
    }

    public static final boolean isConfigurablePathSegment(byte b10) {
        return INSTANCE.isConfigurablePathSegment(b10);
    }

    public final byte getMetadata() {
        return this.metadata;
    }

    public final boolean isComponentTypeMismatch(byte comparisonType) {
        return ((byte) (comparisonType & this.metadata)) == 0;
    }

    public final void setMetadata(byte b10) {
        this.metadata = b10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NodeMetadata(byte b10, @NotNull String uriComponentValue) {
        this((byte) (b10 | INSTANCE.transformationType(uriComponentValue)));
        Intrinsics.checkNotNullParameter(uriComponentValue, "uriComponentValue");
    }
}
