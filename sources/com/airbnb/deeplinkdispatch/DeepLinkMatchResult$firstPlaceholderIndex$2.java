package com.airbnb.deeplinkdispatch;

import iu.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.w;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class DeepLinkMatchResult$firstPlaceholderIndex$2 extends k implements Function0<Integer> {
    final /* synthetic */ DeepLinkMatchResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkMatchResult$firstPlaceholderIndex$2(DeepLinkMatchResult deepLinkMatchResult) {
        super(0);
        this.this$0 = deepLinkMatchResult;
    }

    public final int invoke() {
        return w.z(this.this$0.getDeeplinkEntry().getUriTemplate(), UrlTreeKt.componentParamPrefixChar, 0, false, 6);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke() {
        return Integer.valueOf(invoke());
    }
}
