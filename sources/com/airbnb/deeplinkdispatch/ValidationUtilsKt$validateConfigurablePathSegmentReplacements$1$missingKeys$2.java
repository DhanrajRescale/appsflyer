package com.airbnb.deeplinkdispatch;

import iu.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "it", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ValidationUtilsKt$validateConfigurablePathSegmentReplacements$1$missingKeys$2 extends k implements Function1<byte[], CharSequence> {
    public static final ValidationUtilsKt$validateConfigurablePathSegmentReplacements$1$missingKeys$2 INSTANCE = new ValidationUtilsKt$validateConfigurablePathSegmentReplacements$1$missingKeys$2();

    public ValidationUtilsKt$validateConfigurablePathSegmentReplacements$1$missingKeys$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull byte[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new String(it, Charsets.UTF_8);
    }
}
