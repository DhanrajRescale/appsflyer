package hn;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import jn.k;

/* loaded from: classes2.dex */
public final class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f18620c = al.d.C0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d, reason: collision with root package name */
    public static final Set f18621d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f18622e;

    /* renamed from: a, reason: collision with root package name */
    public final String f18623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18624b;

    static {
        String C0 = al.d.C0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String C02 = al.d.C0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f18621d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new gn.b("proto"), new gn.b("json"))));
        f18622e = new a(C0, C02);
    }

    public a(String str, String str2) {
        this.f18623a = str;
        this.f18624b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
