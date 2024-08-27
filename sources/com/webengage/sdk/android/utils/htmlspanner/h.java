package com.webengage.sdk.android.utils.htmlspanner;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f12757a = Pattern.compile("(&[a-z]*;|&#x?([a-f]|[A-F]|[0-9])*;|[\\s\n]+)");

    /* renamed from: b, reason: collision with root package name */
    private static Pattern f12758b = Pattern.compile("(&[a-z]*;|&#x?([a-f]|[A-F]|[0-9])*;)");

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, String> f12759c;

    static {
        HashMap hashMap = new HashMap();
        f12759c = hashMap;
        hashMap.put("&nbsp;", " ");
        f12759c.put("&amp;", "&");
        f12759c.put("&quot;", "\"");
        f12759c.put("&cent;", "¢");
        f12759c.put("&lt;", UrlTreeKt.configurablePathSegmentPrefix);
        f12759c.put("&gt;", UrlTreeKt.configurablePathSegmentSuffix);
        f12759c.put("&sect;", "§");
        f12759c.put("&ldquo;", "“");
        f12759c.put("&rdquo;", "”");
        f12759c.put("&lsquo;", "‘");
        f12759c.put("&rsquo;", "’");
        f12759c.put("&ndash;", "–");
        f12759c.put("&mdash;", "—");
        f12759c.put("&horbar;", "―");
    }

    public static String a(String str, boolean z10) {
        Matcher matcher;
        StringBuffer stringBuffer = new StringBuffer();
        HashMap hashMap = new HashMap(f12759c);
        if (z10) {
            matcher = f12758b.matcher(str);
        } else {
            matcher = f12757a.matcher(str);
            hashMap.put(HttpUrl.FRAGMENT_ENCODE_SET, " ");
            hashMap.put("\n", " ");
        }
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, a(matcher, hashMap));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static String a(Matcher matcher, Map<String, String> map) {
        Integer valueOf;
        String trim = matcher.group(0).trim();
        String str = map.get(trim);
        if (str != null) {
            return str;
        }
        if (trim.startsWith("&#")) {
            try {
                if (trim.startsWith("&#x")) {
                    valueOf = Integer.decode("0x" + trim.substring(3, trim.length() - 1));
                } else {
                    valueOf = Integer.valueOf(Integer.parseInt(trim.substring(2, trim.length() - 1)));
                }
                return HttpUrl.FRAGMENT_ENCODE_SET + ((char) valueOf.intValue());
            } catch (NumberFormatException unused) {
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
