package com.webengage.sdk.android.utils.htmlspanner;

import android.graphics.Color;
import android.text.Spannable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class WEHtmlParserInterface {
    private String a(String str) {
        StringBuilder sb2 = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
        for (String str2 : str.split(UrlTreeKt.configurablePathSegmentSuffix)) {
            if (str2.contains(UrlTreeKt.configurablePathSegmentPrefix) && str2.contains(" ") && !str2.contains("</")) {
                str2 = b(str2);
            } else if ((!str2.contains(UrlTreeKt.configurablePathSegmentPrefix) || str2.contains("</")) && !str2.contains("</")) {
                sb2.append(str2);
            }
            sb2.append(str2);
            sb2.append(UrlTreeKt.configurablePathSegmentSuffix);
        }
        return sb2.toString();
    }

    private String b(String str) {
        int i10;
        StringBuilder sb2 = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
        int length = str.length();
        boolean z10 = false;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt == ' ') {
                i10 = z10 ? i10 + 1 : 0;
            } else if (str.charAt(i10) == '=') {
                z10 = true;
            } else {
                str.charAt(i10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public Spannable fromHtml(String str) {
        return fromHtml(str, Color.parseColor("#000000"), Color.parseColor("#00000000"), 12.0f);
    }

    public Spannable fromHtml(String str, float f10) {
        return fromHtml(str, Color.parseColor("#000000"), Color.parseColor("#00000000"), f10);
    }

    public Spannable fromHtml(String str, int i10, int i11, float f10) {
        c cVar = new c(i10, f10);
        cVar.a(i11);
        return cVar.a(a(str));
    }
}
