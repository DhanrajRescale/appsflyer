package com.airbnb.deeplinkdispatch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/airbnb/deeplinkdispatch/PathSegment;", "Lcom/airbnb/deeplinkdispatch/TreeNode;", "id", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PathSegment extends TreeNode {

    @NotNull
    private final String id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathSegment(@NotNull String id2) {
        super(id2, new NodeMetadata((byte) 8, id2));
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
    }

    public static /* synthetic */ PathSegment copy$default(PathSegment pathSegment, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pathSegment.getId();
        }
        return pathSegment.copy(str);
    }

    @NotNull
    public final String component1() {
        return getId();
    }

    @NotNull
    public final PathSegment copy(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new PathSegment(id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PathSegment) && Intrinsics.a(getId(), ((PathSegment) other).getId());
    }

    @Override // com.airbnb.deeplinkdispatch.TreeNode
    @NotNull
    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @NotNull
    public String toString() {
        return "PathSegment(id=" + getId() + ')';
    }
}
