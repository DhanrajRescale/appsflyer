package com.airbnb.deeplinkdispatch;

import da.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.d0;
import vt.g0;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"validateConfigurablePathSegmentReplacements", HttpUrl.FRAGMENT_ENCODE_SET, "registries", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/airbnb/deeplinkdispatch/BaseRegistry;", "configurablePathSegmentReplacements", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "deeplinkdispatch_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ValidationUtilsKt {
    public static final void validateConfigurablePathSegmentReplacements(@NotNull List<? extends BaseRegistry> registries, @NotNull Map<byte[], byte[]> configurablePathSegmentReplacements) {
        Intrinsics.checkNotNullParameter(registries, "registries");
        Intrinsics.checkNotNullParameter(configurablePathSegmentReplacements, "configurablePathSegmentReplacements");
        DeepLinkDispatch.getValidationExecutor();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = registries.iterator();
        while (it.hasNext()) {
            d0.m(((BaseRegistry) it.next()).getPathSegmentReplacementKeysInRegistry(), arrayList);
        }
        Set V = g0.V(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : V) {
            byte[] bArr = (byte[]) obj;
            Set<byte[]> keySet = configurablePathSegmentReplacements.keySet();
            boolean z10 = false;
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator<T> it2 = keySet.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Arrays.equals((byte[]) it2.next(), bArr)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z10) {
                arrayList2.add(obj);
            }
        }
        String B = g0.B(arrayList2, ",\n", null, null, ValidationUtilsKt$validateConfigurablePathSegmentReplacements$1$missingKeys$2.INSTANCE, 30);
        if (B.length() != 0) {
            throw new IllegalArgumentException(d.n(e.s("Keys not found in BaseDeepLinkDelegate's mapping of PathVariableReplacementValues. Missing keys are:\n", B, ".\nKeys in mapping are:\n"), g0.B(configurablePathSegmentReplacements.keySet(), ",\n", null, null, ValidationUtilsKt$validateConfigurablePathSegmentReplacements$1$1$1.INSTANCE, 30), '.').toString());
        }
    }
}
