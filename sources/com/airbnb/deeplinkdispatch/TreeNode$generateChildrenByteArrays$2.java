package com.airbnb.deeplinkdispatch;

import iu.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/airbnb/deeplinkdispatch/TreeNode;", "it", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class TreeNode$generateChildrenByteArrays$2 extends k implements Function1<TreeNode, Comparable<?>> {
    public static final TreeNode$generateChildrenByteArrays$2 INSTANCE = new TreeNode$generateChildrenByteArrays$2();

    public TreeNode$generateChildrenByteArrays$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(@NotNull TreeNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getMetadata().isComponentParam);
    }
}
