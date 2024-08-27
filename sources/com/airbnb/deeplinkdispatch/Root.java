package com.airbnb.deeplinkdispatch;

import com.airbnb.deeplinkdispatch.base.MatchIndex;
import com.airbnb.deeplinkdispatch.base.Utils;
import com.airbnb.deeplinkdispatch.base.UtilsKt;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/airbnb/deeplinkdispatch/Root;", "Lcom/airbnb/deeplinkdispatch/TreeNode;", "id", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "addToTrie", HttpUrl.FRAGMENT_ENCODE_SET, "deepLinkUriTemplate", "annotatedClassFullyQualifiedName", "annotatedMethod", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "getStrings", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "writeToOutoutStream", "openOutputStream", "Ljava/io/OutputStream;", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Root extends TreeNode {

    @NotNull
    private final String id;

    public Root() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Root copy$default(Root root, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = root.getId();
        }
        return root.copy(str);
    }

    public final void addToTrie(@NotNull String deepLinkUriTemplate, @NotNull String annotatedClassFullyQualifiedName, String annotatedMethod) {
        Intrinsics.checkNotNullParameter(deepLinkUriTemplate, "deepLinkUriTemplate");
        Intrinsics.checkNotNullParameter(annotatedClassFullyQualifiedName, "annotatedClassFullyQualifiedName");
        DeepLinkUri parseTemplate = DeepLinkUri.parseTemplate(deepLinkUriTemplate);
        String it = parseTemplate.scheme();
        Utils utils = Utils.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        utils.validateIfComponentParam(it);
        Unit unit = Unit.f23355a;
        Intrinsics.checkNotNullExpressionValue(it, "deepLinkUri.scheme().also { validateIfComponentParam(it) }");
        TreeNode addNode = addNode(new Scheme(it));
        String host = parseTemplate.host();
        if (host != null && host.length() != 0) {
            String host2 = parseTemplate.host();
            Intrinsics.checkNotNullExpressionValue(host2, "deepLinkUri.host()");
            utils.validateIfComponentParam(host2);
            String host3 = parseTemplate.host();
            Intrinsics.checkNotNullExpressionValue(host3, "deepLinkUri.host()");
            addNode = addNode.addNode(new Host(host3));
            List<String> pathSegments = parseTemplate.pathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                addNode.setMatch(new UriMatch(deepLinkUriTemplate, annotatedClassFullyQualifiedName, annotatedMethod));
            }
        }
        List<String> pathSegments2 = parseTemplate.pathSegments();
        if (pathSegments2 != null && !pathSegments2.isEmpty()) {
            for (String pathSegment : parseTemplate.pathSegments()) {
                Utils utils2 = Utils.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(pathSegment, "pathSegment");
                utils2.validateIfComponentParam(pathSegment);
                utils2.validateIfConfigurablePathSegment(pathSegment);
                addNode = addNode.addNode(new PathSegment(pathSegment));
            }
            addNode.setMatch(new UriMatch(deepLinkUriTemplate, annotatedClassFullyQualifiedName, annotatedMethod));
        }
    }

    @NotNull
    public final String component1() {
        return getId();
    }

    @NotNull
    public final Root copy(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new Root(id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Root) && Intrinsics.a(getId(), ((Root) other).getId());
    }

    @Override // com.airbnb.deeplinkdispatch.TreeNode
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final List<CharSequence> getStrings() {
        byte[] m7toUByteArrayTcUX1vc = m7toUByteArrayTcUX1vc();
        byte[] copyOf = Arrays.copyOf(m7toUByteArrayTcUX1vc, m7toUByteArrayTcUX1vc.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        Charset forName = Charset.forName(MatchIndex.MATCH_INDEX_ENCODING);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(MATCH_INDEX_ENCODING)");
        return UtilsKt.chunkOnModifiedUtf8ByteSize(new String(copyOf, forName), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @NotNull
    public String toString() {
        return "Root(id=" + getId() + ')';
    }

    public final void writeToOutoutStream(@NotNull OutputStream openOutputStream) {
        Intrinsics.checkNotNullParameter(openOutputStream, "openOutputStream");
        byte[] m7toUByteArrayTcUX1vc = m7toUByteArrayTcUX1vc();
        byte[] copyOf = Arrays.copyOf(m7toUByteArrayTcUX1vc, m7toUByteArrayTcUX1vc.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        openOutputStream.write(copyOf);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Root(@NotNull String id2) {
        super(MatchIndex.ROOT_VALUE, new NodeMetadata((byte) 1, id2));
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
    }

    public /* synthetic */ Root(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MatchIndex.ROOT_VALUE : str);
    }
}
