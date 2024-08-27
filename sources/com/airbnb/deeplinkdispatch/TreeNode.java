package com.airbnb.deeplinkdispatch;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d2.b0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.q;
import ut.r;
import ut.s;
import ut.v;
import vt.g0;
import vt.t;
import vt.z;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J)\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002ø\u0001\u0000J?\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010 \u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000(8\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+R.\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0014\u001a\u0004\u0018\u00010,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Lcom/airbnb/deeplinkdispatch/TreeNode;", HttpUrl.FRAGMENT_ENCODE_SET, "Lut/r;", "targetByteArray", HttpUrl.FRAGMENT_ENCODE_SET, "position", "copyIntoPosition-wl1WTbA", "([B[BI)I", "copyIntoPosition", HttpUrl.FRAGMENT_ENCODE_SET, "childArrays", "valueArray", "matchArray", "headerArray", "arrayLength-7fH4Lao", "(Ljava/util/List;[B[B[B)I", "arrayLength", "generateChildrenByteArrays", "Lcom/airbnb/deeplinkdispatch/NodeMetadata;", "metadata", AppMeasurementSdk.ConditionalUserProperty.VALUE, "matchByteArray", "children", "generateHeader-WWbRO58", "(Lcom/airbnb/deeplinkdispatch/NodeMetadata;[B[BLjava/util/List;)[B", "generateHeader", "node", "addNode", HttpUrl.FRAGMENT_ENCODE_SET, "serializedId", "toUByteArray-TcUX1vc", "()[B", "toUByteArray", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/airbnb/deeplinkdispatch/NodeMetadata;", "getMetadata$deeplinkdispatch_base", "()Lcom/airbnb/deeplinkdispatch/NodeMetadata;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/Set;", "getChildren", "()Ljava/util/Set;", "Lcom/airbnb/deeplinkdispatch/UriMatch;", "match", "Lcom/airbnb/deeplinkdispatch/UriMatch;", "getMatch", "()Lcom/airbnb/deeplinkdispatch/UriMatch;", "setMatch", "(Lcom/airbnb/deeplinkdispatch/UriMatch;)V", "<init>", "(Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/NodeMetadata;)V", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class TreeNode {

    @NotNull
    private final Set<TreeNode> children;

    @NotNull
    private final String id;
    private UriMatch match;

    @NotNull
    private final NodeMetadata metadata;

    public TreeNode(@NotNull String id2, @NotNull NodeMetadata metadata) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.id = id2;
        this.metadata = metadata;
        this.children = new LinkedHashSet();
    }

    /* renamed from: arrayLength-7fH4Lao, reason: not valid java name */
    private final int m3arrayLength7fH4Lao(List<r> childArrays, byte[] valueArray, byte[] matchArray, byte[] headerArray) {
        int length = headerArray.length + valueArray.length + matchArray.length;
        Iterator<T> it = childArrays.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((r) it.next()).f37405a.length;
        }
        return length + i10;
    }

    /* renamed from: copyIntoPosition-wl1WTbA, reason: not valid java name */
    private final int m4copyIntoPositionwl1WTbA(byte[] bArr, byte[] bArr2, int i10) {
        t.d(bArr, i10, bArr2, 0, bArr.length);
        return i10 + bArr.length;
    }

    private final List<r> generateChildrenByteArrays() {
        Set<TreeNode> set = this.children;
        Function1[] selectors = {TreeNode$generateChildrenByteArrays$1.INSTANCE, TreeNode$generateChildrenByteArrays$2.INSTANCE, TreeNode$generateChildrenByteArrays$3.INSTANCE};
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        List M = g0.M(set, new b0(selectors, 2));
        ArrayList arrayList = new ArrayList(z.k(M));
        Iterator it = M.iterator();
        while (it.hasNext()) {
            arrayList.add(new r(((TreeNode) it.next()).m7toUByteArrayTcUX1vc()));
        }
        return arrayList;
    }

    /* renamed from: generateHeader-WWbRO58, reason: not valid java name */
    private final byte[] m5generateHeaderWWbRO58(NodeMetadata metadata, byte[] value, byte[] matchByteArray, List<r> children) {
        int i10;
        if (children == null) {
            i10 = 0;
        } else {
            Iterator<T> it = children.iterator();
            i10 = 0;
            while (it.hasNext()) {
                i10 += ((r) it.next()).f37405a.length;
            }
        }
        byte[] storage = new byte[8];
        Intrinsics.checkNotNullParameter(storage, "storage");
        byte metadata2 = metadata.getMetadata();
        q.Companion companion = q.INSTANCE;
        storage[0] = metadata2;
        storage[1] = (byte) value.length;
        short length = (short) matchByteArray.length;
        v.Companion companion2 = v.INSTANCE;
        UrlTreeKt.m9writeUShortAtHFnTLD8(storage, 2, length);
        s.Companion companion3 = s.INSTANCE;
        UrlTreeKt.m8writeUIntAtGxOs86I(storage, 4, i10);
        return storage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: generateHeader-WWbRO58$default, reason: not valid java name */
    public static /* synthetic */ byte[] m6generateHeaderWWbRO58$default(TreeNode treeNode, NodeMetadata nodeMetadata, byte[] bArr, byte[] bArr2, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                list = null;
            }
            return treeNode.m5generateHeaderWWbRO58(nodeMetadata, bArr, bArr2, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateHeader-WWbRO58");
    }

    @NotNull
    public final TreeNode addNode(@NotNull TreeNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!this.children.add(node)) {
            for (TreeNode treeNode : this.children) {
                if (Intrinsics.a(treeNode, node)) {
                    return treeNode;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return node;
    }

    @NotNull
    public final Set<TreeNode> getChildren() {
        return this.children;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    public final UriMatch getMatch() {
        return this.match;
    }

    @NotNull
    /* renamed from: getMetadata$deeplinkdispatch_base, reason: from getter */
    public final NodeMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String serializedId() {
        if (this.metadata.isConfigurablePathSegment) {
            return w.V(w.S(getId(), UrlTreeKt.configurablePathSegmentPrefix), UrlTreeKt.configurablePathSegmentSuffix);
        }
        return getId();
    }

    public final void setMatch(UriMatch uriMatch) {
        if (this.match == null) {
            this.match = uriMatch;
            return;
        }
        throw new IllegalStateException(("Ambiguous URI. Same match for two URIs (" + this.match + " vs " + uriMatch + ')').toString());
    }

    @NotNull
    /* renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m7toUByteArrayTcUX1vc() {
        List<r> generateChildrenByteArrays = generateChildrenByteArrays();
        String serializedId = serializedId();
        Charset charset = Charsets.UTF_8;
        if (serializedId != null) {
            byte[] bytes = serializedId.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] storage = Arrays.copyOf(bytes, bytes.length);
            Intrinsics.checkNotNullExpressionValue(storage, "java.util.Arrays.copyOf(this, size)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            byte[] matchByteArray = UrlTreeKt.matchByteArray(this.match);
            byte[] m5generateHeaderWWbRO58 = m5generateHeaderWWbRO58(this.metadata, storage, matchByteArray, generateChildrenByteArrays);
            byte[] storage2 = new byte[m3arrayLength7fH4Lao(generateChildrenByteArrays, storage, matchByteArray, m5generateHeaderWWbRO58)];
            Intrinsics.checkNotNullParameter(storage2, "storage");
            t.d(m5generateHeaderWWbRO58, 0, storage2, 0, m5generateHeaderWWbRO58.length);
            int m4copyIntoPositionwl1WTbA = m4copyIntoPositionwl1WTbA(matchByteArray, storage2, m4copyIntoPositionwl1WTbA(storage, storage2, m5generateHeaderWWbRO58.length));
            Iterator<r> it = generateChildrenByteArrays.iterator();
            while (it.hasNext()) {
                m4copyIntoPositionwl1WTbA = m4copyIntoPositionwl1WTbA(it.next().f37405a, storage2, m4copyIntoPositionwl1WTbA);
            }
            return storage2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
