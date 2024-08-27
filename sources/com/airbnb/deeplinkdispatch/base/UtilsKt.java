package com.airbnb.deeplinkdispatch.base;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"chunkOnModifiedUtf8ByteSize", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "chunkSize", HttpUrl.FRAGMENT_ENCODE_SET, "deeplinkdispatch-base"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    @NotNull
    public static final List<CharSequence> chunkOnModifiedUtf8ByteSize(@NotNull CharSequence charSequence, int i10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int i11 = 0;
        if (i10 >= 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            if (length > 0) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = i12 + 1;
                    String obj = charSequence.subSequence(i13, i14).toString();
                    Charset charset = Charsets.UTF_8;
                    if (obj != null) {
                        byte[] bytes = obj.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                        int length2 = bytes.length;
                        int i15 = 0;
                        for (int i16 = 0; i16 < obj.length(); i16++) {
                            if (obj.charAt(i16) == 0) {
                                i15++;
                            }
                        }
                        if (length2 + i15 > i10) {
                            arrayList.add(charSequence.subSequence(i13, i12));
                            i13 = i12;
                        }
                        if (i14 >= length) {
                            i11 = i13;
                            break;
                        }
                        i12 = i14;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            if (i11 != charSequence.length()) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("UTF-8 chars can be up to 3 bytes wide. Minumum chunk size is 3 bytes.".toString());
    }
}
