package com.airbnb.deeplinkdispatch;

import iu.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class DeepLinkMatchResult$firstNonConcreteIndex$2 extends k implements Function0<Integer> {
    final /* synthetic */ DeepLinkMatchResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkMatchResult$firstNonConcreteIndex$2(DeepLinkMatchResult deepLinkMatchResult) {
        super(0);
        this.this$0 = deepLinkMatchResult;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke() {
        return Integer.valueOf(invoke());
    }

    public final int invoke() {
        int firstPlaceholderIndex;
        int firstConfigurablePathSegmentIndex;
        int firstPlaceholderIndex2;
        int firstConfigurablePathSegmentIndex2;
        int firstPlaceholderIndex3;
        int firstConfigurablePathSegmentIndex3;
        int firstPlaceholderIndex4;
        int firstConfigurablePathSegmentIndex4;
        firstPlaceholderIndex = this.this$0.getFirstPlaceholderIndex();
        if (firstPlaceholderIndex == -1) {
            firstConfigurablePathSegmentIndex4 = this.this$0.getFirstConfigurablePathSegmentIndex();
            if (firstConfigurablePathSegmentIndex4 == -1) {
                return -1;
            }
        }
        firstConfigurablePathSegmentIndex = this.this$0.getFirstConfigurablePathSegmentIndex();
        if (firstConfigurablePathSegmentIndex == -1) {
            firstPlaceholderIndex4 = this.this$0.getFirstPlaceholderIndex();
            return firstPlaceholderIndex4;
        }
        firstPlaceholderIndex2 = this.this$0.getFirstPlaceholderIndex();
        if (firstPlaceholderIndex2 == -1) {
            firstConfigurablePathSegmentIndex3 = this.this$0.getFirstConfigurablePathSegmentIndex();
            return firstConfigurablePathSegmentIndex3;
        }
        firstConfigurablePathSegmentIndex2 = this.this$0.getFirstConfigurablePathSegmentIndex();
        firstPlaceholderIndex3 = this.this$0.getFirstPlaceholderIndex();
        return Math.min(firstConfigurablePathSegmentIndex2, firstPlaceholderIndex3);
    }
}
