package com.airbnb.deeplinkdispatch.base;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.s;
import kotlin.text.w;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.g0;
import vt.o0;
import vt.z;
import zq.f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0007J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u0018"}, d2 = {"Lcom/airbnb/deeplinkdispatch/base/Utils;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "getBytes", HttpUrl.FRAGMENT_ENCODE_SET, "inputStream", "Ljava/io/InputStream;", "isConfigurablePathSegment", HttpUrl.FRAGMENT_ENCODE_SET, "pathSegment", HttpUrl.FRAGMENT_ENCODE_SET, "readMatchIndexFromStrings", "strings", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/String;)[B", "toByteArrayMap", HttpUrl.FRAGMENT_ENCODE_SET, "input", "toByteArraysList", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/String;)Ljava/util/List;", "validateIfComponentParam", "uriComponent", "validateIfConfigurablePathSegment", "deeplinkdispatch-base"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    private final byte[] getBytes(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(UserMetadata.MAX_INTERNAL_KEY_SIZE, inputStream.available()));
        f.C(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final boolean isConfigurablePathSegment(@NotNull String pathSegment) {
        Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
        if (!s.r(pathSegment, UrlTreeKt.configurablePathSegmentPrefix, false) || !s.i(pathSegment, UrlTreeKt.configurablePathSegmentSuffix, false)) {
            return false;
        }
        return true;
    }

    public static final byte[] readMatchIndexFromStrings(@NotNull String[] strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        if (strings.length == 0) {
            return new byte[0];
        }
        if (strings.length == 1) {
            String str = strings[0];
            Charset forName = Charset.forName(MatchIndex.MATCH_INDEX_ENCODING);
            Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
            if (str != null) {
                byte[] bytes = str.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                return bytes;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        int i10 = 0;
        for (String str2 : strings) {
            i10 += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(i10);
        for (String str3 : strings) {
            sb2.append(str3);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "fullString.toString()");
        Charset forName2 = Charset.forName(MatchIndex.MATCH_INDEX_ENCODING);
        Intrinsics.checkNotNullExpressionValue(forName2, "Charset.forName(charsetName)");
        byte[] bytes2 = sb3.getBytes(forName2);
        Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
        return bytes2;
    }

    @NotNull
    public static final Map<byte[], byte[]> toByteArrayMap(@NotNull Map<String, String> input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Set<Map.Entry<String, String>> entrySet = input.entrySet();
        int a10 = o0.a(z.k(entrySet));
        if (a10 < 16) {
            a10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    byte[] bytes2 = str2.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    linkedHashMap.put(bytes, bytes2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<byte[]> toByteArraysList(@NotNull String[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        ArrayList arrayList = new ArrayList(input.length);
        for (String str : input) {
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                arrayList.add(bytes);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return g0.R(arrayList);
    }

    public final boolean validateIfComponentParam(@NotNull String uriComponent) {
        Intrinsics.checkNotNullParameter(uriComponent, "uriComponent");
        boolean z10 = false;
        int A = w.A(uriComponent, UrlTreeKt.componentParamPrefix, 0, false, 6);
        int A2 = w.A(uriComponent, UrlTreeKt.componentParamSuffix, 0, false, 6);
        if (A == -1 && A2 == -1) {
            return false;
        }
        if (A < A2) {
            z10 = true;
        }
        if (z10) {
            if (A != -1 && A2 != -1) {
                return true;
            }
            throw new IllegalArgumentException(d.k("Invalid URI component: ", uriComponent, ". If either{ or } is present, then they must both be present and { must occur before }.").toString());
        }
        throw new IllegalArgumentException(d.k("Invalid URI component: ", uriComponent, ". { must come before }.").toString());
    }

    public final boolean validateIfConfigurablePathSegment(@NotNull String pathSegment) {
        Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
        Regex regex = new Regex("<|>");
        Intrinsics.checkNotNullParameter(pathSegment, "input");
        if (regex.f23392a.matcher(pathSegment).find()) {
            if (isConfigurablePathSegment(pathSegment)) {
                return true;
            }
            throw new IllegalArgumentException(d.k("Malformed path segment: ", pathSegment, "! If it contains < or >, it must start with < and end with >.").toString());
        }
        return false;
    }
}
